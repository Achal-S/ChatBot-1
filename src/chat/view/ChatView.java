package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ChatView
{
	
	private String windowMessage;
	private ImageIcon chatIcon;
	
	public ChatView()
	{
		windowMessage = "Hello from your friendly chatbot :D";
		chatIcon = new ImageIcon(getClass().getResource("images/StarWarsBattleDroid.png"));
	}
	
	public void showResponse(String wordsFromSomewhere) 
	
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
		
	}
	
	
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		answer = JOptionPane.showInputDialog(null, stuff, windowMessage, JOptionPane.PLAIN_MESSAGE, chatIcon, null, "Answer here :)").toString();
		return answer;
	}
	
	public void displayText(String displayText)
	{
		JOptionPane.showMessageDialog(null, displayText, windowMessage, JOptionPane.INFORMATION_MESSAGE, chatIcon);
	}
	
	
	

}
