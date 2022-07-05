package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Gmailpojo extends Baseclass{
	
	public Gmailpojo() {
		PageFactory.initElements(driver, this); 
	}
	
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement txtemail;
	
	@FindBys({
	@FindBy(xpath="//span[text()='Next']"),
	@FindBy(xpath="(//span[@class='VfPpkd-vQzf8d'])[2]")
	})
	private WebElement btnnext;
	
	@FindBys({
	@FindBy(xpath="//div[text()='Enter your password']"),
	@FindBy(xpath="//input[@type='password']")
	})
	private WebElement txtpass;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement clicknext;
	
	@FindBy(xpath="//a[text()='Google Account']")
	private WebElement clickgoogleaccount;
	
	@FindBy(xpath="//a[@aria-label='Google apps']")
	private WebElement clickgoogleapps;
	
	@FindBy(xpath="//span[@style='background-position: 0 -1104px;']")
	private WebElement clickgmail;
	
	

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getBtnnext() {
		return btnnext;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getClicknext() {
		return clicknext;
	}

	public WebElement getClickgoogleaccount() {
		return clickgoogleaccount;
	}

	public WebElement getClickgoogleapps() {
		return clickgoogleapps;
	}

	public WebElement getClickgmail() {
		return clickgmail;
	}

	
	
	
	
	
	

}
