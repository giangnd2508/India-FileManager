package com.rgare.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject{
	
	public static Target username = Target.the("username field").located(By.id("username"));
	public static Target password = Target.the("password field").located(By.id("password"));
	public static Target submitBtn = Target.the("submit button").located(By.id("kc-login"));

}
