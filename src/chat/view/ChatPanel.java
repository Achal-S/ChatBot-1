package chat.view;

import chat.controller.ChatController;

import javax.swing.*;

import chat.view.ChatFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatPanel extends JPanel
{
	private ChatController mainController;
	private JButton submitButton;
	private ImageIcon chatPic;
	private JTextField typingField;
	private JLabel pic;
	private JTextArea chatArea;
	private SpringLayout mainLayout;
	
	public ChatPanel(ChatController mainController)
	{
		chatPic = new ImageIcon(getClass().getResource("images/StarWarsBattleDroid.png"));
		setBackground(new Color(0, 204, 255));
	
		this.mainController = mainController;
		
		submitButton = new JButton("Enter");
		typingField = new JTextField("Talk to chatbot");
		typingField.setBackground(Color.LIGHT_GRAY);
		pic = new JLabel();
		
		mainLayout = new SpringLayout();
		mainLayout.putConstraint(SpringLayout.NORTH, submitButton, 720, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, submitButton, 96, SpringLayout.EAST, typingField);
		mainLayout.putConstraint(SpringLayout.EAST, submitButton, -174, SpringLayout.EAST, this);
		mainLayout.putConstraint(SpringLayout.SOUTH, typingField, -31, SpringLayout.SOUTH, this);
		mainLayout.putConstraint(SpringLayout.NORTH, typingField, 719, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.EAST, typingField, -442, SpringLayout.EAST, this);
		
		
	

		
		chatArea = new JTextArea();
		mainLayout.putConstraint(SpringLayout.WEST, typingField, 0, SpringLayout.WEST, chatArea);
		chatArea.setBackground(Color.GRAY);
		mainLayout.putConstraint(SpringLayout.NORTH, chatArea, 10, SpringLayout.NORTH, this);
		mainLayout.putConstraint(SpringLayout.WEST, chatArea, 36, SpringLayout.WEST, this);
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(mainLayout);
		this.add(submitButton);
		this.add(chatArea);
		this.add(typingField);
		this.add(pic);
		
	}
	
	private void setupLayout()
	{

	
		
		
		
	}
	private void setupListeners()
	{
		
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = typingField.getText();
				chatArea.append("\nUser: " + userText);
				typingField.setText("");
				String response = mainController.userToChatbot(userText);
				chatArea.append("\nChatbot: " + response);
				
			}
		});
	}
	
	
	
}
