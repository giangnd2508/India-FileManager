package com.rgare.tasks;

import com.rgare.ui.LoginPage;
import com.rgare.ui.WelcomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheApplication implements Task{

	WelcomePage welcomePage;
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Open.browserOn().the(welcomePage),
				Click.on(WelcomePage.loginBtn),
				Enter.theValue("jame").into(LoginPage.username),
				Enter.theValue("12345678").into(LoginPage.password),
				Click.on(LoginPage.submitBtn)
				);
	}

}
