package com.rgare.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class CreateANewCase implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
	}

	public static CreateANewCase withDescription(String des) {
		return instrumented(CreateANewCase.class, des);
	}

	public CreateANewCase andFileUpload(String file) {
		return instrumented(CreateANewCase.class, file);
	}

}
