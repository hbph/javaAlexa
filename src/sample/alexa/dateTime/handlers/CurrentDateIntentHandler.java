package sample.alexa.dateTime.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class CurrentDateIntentHandler implements RequestHandler {
	
	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("CurrentDateIntent"));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		SimpleDateFormat format = new SimpleDateFormat("EEE, MMM d, yyyy");
		String dateString = format.format(new Date());
		String msg = "<speak>"
				+ "<audio src='https://s3.amazonaws.com/ask-soundlibrary/musical/amzn_sfx_electronic_major_chord_01.mp3'/>"
				+ "Current date is " + dateString + "</speak>";
		return input.getResponseBuilder().withSimpleCard("Current date", "This simple card!!").withSpeech(msg)
				.withReprompt(msg).withShouldEndSession(false).build();
	}

}
