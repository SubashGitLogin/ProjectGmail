package org.example;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.pojo.Gmailpojo;

public class Sample extends Baseclass{
public static void main(String[] args) {
	
	chromeBrowser();
	launchUrl("https://www.gmail.com/");
	maxWindow();
	
	Gmailpojo g=new Gmailpojo();
	
	implicitWait(10);
	
	WebElement email = g.getTxtemail();
	email.sendKeys("subash007official@gmail.com");
	
	buttonClick(g.getBtnnext());
	
	fillTextBox(g.getTxtpass(), "Subash@123");
	
	buttonClick(g.getClicknext());
	
	buttonClick(g.getClickgoogleaccount());
	
	buttonClick(g.getClickgoogleapps());
	
	buttonClick(g.getClickgmail());



















}
}
