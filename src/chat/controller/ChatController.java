package chat.controller;

import java.util.ArrayList;

import chat.model.Chatbot;
import chat.view.ChatView;

public class ChatController
{

	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;
	private Chatbot simpleBot;
	private ChatView display;

	public ChatController()
	{
		display = new ChatView();
		String userName = display.grabAnswer("My name is Cortana, what is your name?");
		simpleBot = new Chatbot(userName);
	}

	public void start()
	{
		display.showResponse("Hello " + simpleBot.getUserName());

		chat();
	}

	private void chat()
	{
		String conversation = display
				.grabAnswer("What would you like to talk about today?");
		while (simpleBot.lengthChecker(conversation))
		{
			if (simpleBot.contentChecker(conversation))
			{
				display.showResponse("Wow, I had no idea you are interested in "
						+ simpleBot.getContent());
			}
			else if (simpleBot.politicalTopicChecker(conversation))
			{
				display.showResponse("Wow you actually care about " + conversation + "?");
			}
			else if (simpleBot.memeChecker(conversation))
			{
				display.showResponse("Memes are funny");
			}
			

			else
			{
				conversation = display.grabAnswer("That's what you would like to talk about?");
			}
			
			conversation = display.grabAnswer("Well I do not want to talk about that, what else is on your mind?");
			
			
		
			

		}

		// {
		// if(!simpleBot.quitChecker(conversation))
		// {
		// conversation = simpleBot.processInput(conversation);
		// }
		// else
		// {
		// shutDown();
		// }
		//
		// conversation = display.collectUserText(conversation);
		//
		// }
	}

	private void shutDown()
	{

	}

}
