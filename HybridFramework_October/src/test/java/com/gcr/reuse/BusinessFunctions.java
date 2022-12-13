package com.gcr.reuse;

import org.openqa.selenium.WebDriver;
import com.gcr.commands.ActionDriver;
import com.gcr.config.StartBrowser;
import com.gcr.or.WebShopHomepage;
import com.gcr.or.WebShopLoginpage;

public class BusinessFunctions {

	public WebDriver driver;
	public ActionDriver ad;
	
	public  BusinessFunctions()
	{

		driver = StartBrowser.driver;
		ad = new ActionDriver();
	}

	public void loginWebShop(String userName, String password) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to SauceDemo application");
		ad.navigateToApplication("https://demowebshop.tricentis.com/login");
		ad.click(WebShopHomepage.LnkLogin, "Login Link");
		ad.type(WebShopLoginpage.txtEmail, userName,"email text box");
		ad.type(WebShopLoginpage.txtPassword, password, "password text box");
		ad.click(WebShopLoginpage.btnLogin, "login button");
	}
	public void loginWebshop(String userName, String password) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to Webshop application");
		ad.navigateToApplication("https://demowebshop.tricentis.com/");
		ad.click(WebShopHomepage.LnkLogin, "login Text box");
		ad.type(WebShopLoginpage.txtEmail, userName, "UserName textbox");
		ad.type(WebShopLoginpage.txtPassword,password, "Password textbox");
		ad.click(WebShopLoginpage.btnLogin, "Login Button");
	}
	public void logOutWebshop() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("LogOut from Webshop application");
		ad.click(WebShopHomepage.LnkLogOut, "LogOut Link");
	}
}
