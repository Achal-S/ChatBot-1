package chat.view;

import javax.swing.*;
import chat.controller.ChatController;

public class ChatFrame extends JFrame

{
	private ChatController mainController;
	private ChatPanel mainPanel;
	
	public ChatFrame(ChatController mainController)
	{
		this.mainController = mainController;
		mainPanel = new ChatPanel(mainController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(mainPanel);
		this.setSize(1000, 800);;
		this.setTitle("Garrett is amazing");
		this.setVisible(true);
		
	}
	
	public ChatController getMainController()
	{
		return mainController;
	}
	
}
