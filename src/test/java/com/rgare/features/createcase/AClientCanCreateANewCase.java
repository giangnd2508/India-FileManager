package com.rgare.features.createcase;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.rgare.tasks.OpenTheApplication;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class AClientCanCreateANewCase {

	Actor jame = Actor.named("Jame - A Client");

	@Managed(uniqueSession = true)
	public WebDriver hisBrowser;

	@Before
	public void jameCanBrowseTheWeb() {
		jame.can(BrowseTheWeb.with(hisBrowser));
	}

	@Steps
	OpenTheApplication openTheApplication;

	@Test
	public void can_create_a_new_case() {

		givenThat(jame).wasAbleTo(openTheApplication);

//		when(jame).attemptsTo(
//				CreateANewCase.withDescription("Description").andFileUpload("pii-plociy.csv"));

	}

}
