package com.rgare.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://india-filemanager-rga.niteco.se/")
public class WelcomePage extends PageObject{

	public static Target loginBtn = Target.the("login button").located(By.id("btn_login"));

}
