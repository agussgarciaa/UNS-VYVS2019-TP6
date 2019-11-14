package aspectJ;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import Controls.*;
import Pages.BasePage;

public aspect Logging {
	
	after(String url):
		call(void WebDriver.get(String)) && args(url){
		System.out.println("opening: "+url);
	}
	
	after(Button btn):
		call(void Button.Click()) && target(btn){
			System.out.println("a button identified by " + btn.Identifier()+" was clicked");
	}
	
	after(Label label) returning (String text):
	call(String Label.Text()) && target(label) && !within(Logging){
		System.out.println('"'+text +'"'+" text was obtained from label identified by "+label.Identifier());
	}
	
	after(Input input, String text):
		call(void Input.Write(String)) && target(input) && args(text){
			System.out.println('"'+text+'"'+" was written in input identified by "+input.Identifier());
	}
	
	after(long num):
		call(void TimeUnit.sleep(long)) && args(num){
		System.out.println("waiting "+num+" second");
	}
	
	after(BasePage page): 
		initialization(BasePage.new(*)) && target(page){
        System.out.println(page.getClass().toString().substring(12) + " was created");
    }
	
	after(Object text1 ,Object text2):
		call(void *.assertEquals(Object,Object)) && args(text1,text2) && !within(Logging){
		System.out.println("asking if "+'"'+text1.toString()+" is equals to "+'"'+text2.toString()+'"');
	}
	
}
