package chat.controller;

import java.util.ArrayList;

import chat.view.ChatFrame;
import chat.model.Chatbot;
import chat.view.ChatView;

public class ChatController
{

	
	private ChatFrame baseFrame;
	private Chatbot simpleBot;
	private ChatView display;
	
	
	public ChatController()
	{
		display = new ChatView();
		String userName = display.grabAnswer("My name is Cortana, what is your name?");
		simpleBot = new Chatbot(userName);
		baseFrame = new ChatFrame(this);
	}

	public void start()
	{
		display.showResponse("Hello " + simpleBot.getUserName());
		
		//chat();
	}

	private void chat()
	{
		String conversation = display
				.grabAnswer("What would you like to talk about today?");
		while (simpleBot.lengthChecker(conversation))
		{
			conversation = simpleBot.processConversation(conversation);
			conversation = display.grabAnswer(simpleBot.processConversation(conversation));
		}
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

	
	public String userToChatbot(String conversation)
	{
		String response = "";
		response = simpleBot.processConversation(conversation);
		
		return response;
	}
	
	private void shutDown()
	{
		display.showResponse("Good bye have a nice day"); 
	}

}
