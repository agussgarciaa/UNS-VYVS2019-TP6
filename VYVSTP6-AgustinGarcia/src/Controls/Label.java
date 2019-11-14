package Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Label extends BaseControl {

	public Label(By by) {
		super(by);
	}
	
	public String Text() {
		try {
			return this.Element().getText();
		}catch(NoSuchElementException e) {
			return null;
		}
	}
}
