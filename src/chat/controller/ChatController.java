package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatView;

public class ChatController 
{
	
	private Chatbot simpleBot;
	private ChatView display;
	
	public ChatController()
	{
		display = new ChatView();
		String userName = display.grabAnswer("What is your name?");
		simpleBot = new Chatbot(userName);
	}
	
	
	public void start()
	{
		display.showResponse("Hello " + simpleBot.getUserName());
	}

}
