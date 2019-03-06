package sample.alexa.dateTime.handlers;

import static com.amazon.ask.request.Predicates.requestType;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;

public class LaunchRequestHandler implements RequestHandler {

	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(requestType(LaunchRequest.class));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		String speechText = "Welcome to Simple date and time skill";
		return input.getResponseBuilder()
				.withSimpleCard("Launch Java based Alexa", "Welcome to Simple date and time skill")
				.withSpeech(speechText).withShouldEndSession(false).build();
	}
}
