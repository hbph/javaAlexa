package sample.alexa.dateTime.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class CancelandStopIntentHandler implements RequestHandler {
	
	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("AMAZON.StopIntent").or(intentName("AMAZON.CancelIntent")));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		String speechText = "Thanks for using date and time skill";
		return input.getResponseBuilder().withSpeech(speechText).build();
	}
}
