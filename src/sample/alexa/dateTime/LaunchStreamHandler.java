package sample.alexa.dateTime;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

import sample.alexa.dateTime.handlers.CancelandStopIntentHandler;
import sample.alexa.dateTime.handlers.CurrentDateIntentHandler;
import sample.alexa.dateTime.handlers.HelpIntentHandler;
import sample.alexa.dateTime.handlers.LaunchRequestHandler;
import sample.alexa.dateTime.handlers.SessionEndedRequestHandler;

public class LaunchStreamHandler extends SkillStreamHandler {

	private static Skill getSkill() {
		return Skills.standard()
				.addRequestHandlers(new CancelandStopIntentHandler(), new CurrentDateIntentHandler(),
						new HelpIntentHandler(), new LaunchRequestHandler(), new SessionEndedRequestHandler())
				.withSkillId("amzn1.ask.skill.4f25cb12-ef71-*****************").build();
	}

	public LaunchStreamHandler() {
		super(getSkill());
	}
}