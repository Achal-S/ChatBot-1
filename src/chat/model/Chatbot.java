package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided. Students will complete methods as part
 * of the project.
 * @author Cody Henrichsen
 * @version 1.0 10/14/15
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;
	
	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		this.memesList = new ArrayList<String>();
		this.politicalTopicList = new ArrayList<String>();
		this.userName = userName;
		this.politicalTopicList = new ArrayList<String>();
		this.userName = userName;
		this.content = "food";
		
		buildMemesList();
		buildPoliticalTopicsList();
		
		
	}
	
	private void buildMemesList()
	{
		//me gusta, troll, what if i, spoder, doge, BLB, cute, animals, pepe, aliens, unhelpful teacher
		this.memesList.add("me gusta");
		this.memesList.add("what if I");
		this.memesList.add("spoder");
		this.memesList.add("doge");
		this.memesList.add("BLB");
		this.memesList.add("cute");
		this.memesList.add("animals");
		this.memesList.add("pepe");
		this.memesList.add("aliens");
		this.memesList.add("unhelpful teacher");
		this.memesList.add("memes");
	
		
	}
	
	private void buildPoliticalTopicsList()
	{
		this.politicalTopicList.add("Donald Trump");
		this.politicalTopicList.add("Ben Carson");
		this.politicalTopicList.add("Carly Fiorina");
		this.politicalTopicList.add("Hilary Clinton");
		this.politicalTopicList.add("Jeb Bush");
		this.politicalTopicList.add("Bernie Sanders");
		this.politicalTopicList.add("politics");
		this.politicalTopicList.add("Republican");
		this.politicalTopicList.add("Democrat");
		this.politicalTopicList.add("Obama");
		
		
	}
	
	/**
	 * Checks the length of the supplied string. Returns false if the supplied String is empty or null,
	 * otherwise returns true. 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if(currentInput != null)
		{
			if(currentInput.length() >= 1)
			{
				hasLength = true;
			}
		}
		
		if(currentInput != null && currentInput.length() > 0)
		{
			hasLength = true;
		}
		
		
		
		return hasLength;
	}
	
	public boolean keyboardMashChecker(String currentInput)
	{
		boolean keyboardMashChecker = false;
		if( currentInput.length() > 15 )
		{
			keyboardMashChecker = true;
			
		}
		return keyboardMashChecker;
	}
	
		
		
	
	public boolean quitChecker(String currentInput)
	{
		return quitChecker(null);
	}
	
	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		if(currentInput.toLowerCase().contains(content.toLowerCase()))
		{
			hasContent = true;
		}
		
		
		return hasContent;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns
	 * true if it does find a match and false if it does not match.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		
		for(String currentMeme: memesList)
	
		
		if(currentMeme.equalsIgnoreCase(currentInput))
		{
			hasMeme = true;
		}
		
		return hasMeme;
	}
	
	
	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean hasPT = false;
		
		for(String PT: politicalTopicList)
	
		
		if(PT.equalsIgnoreCase(currentInput))
		{
			hasPT = true;
		}
		
		return hasPT;
		
		
	}
	
	public String processConversation(String currentInput)
	{
		String nextConversation = "oh, what else would you like to talk about?";
		int randomTopic = (int) (Math.random() * 5 ); //Generates a random number between 0 and 4
		
		switch (randomTopic)
		{
		case 0:
			if(memeChecker(currentInput))
			{
				nextConversation = "That is a very popular meme this year. What else are you" + " wanting to talk about?";
			}
			break;
			
		case 1:
			if(politicalTopicChecker(currentInput))
			{
				nextConversation = "some words and a question";
			}
			
			break;
			
		case 2:
			
			if(contentChecker(currentInput))
			{
				
			}
			
			break;
			
		case 3:

			if(currentInput.length() > 20)
			{
				nextConversation = "That is a long response";
			}
			
			
			break;
			
		case 4:

			if(contentChecker(currentInput))
			{
				
			}
			
			
			break;
			default:
				nextConversation = "";
				break;
			
			
			
			
			
		}
		return nextConversation;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * Returns the username of this Chatbot instance.
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}
	
	/**
	 * Returns the content area for this Chatbot instance.
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return content;
	}
	
	/**
	 * Getter method for the memesList object.
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}
	
	/**
	 * Getter method for the politicalTopicList object.
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}
	
	/**
	 * Updates the content area for this Chatbot instance.
	 * @param content The updated value for the content area.
	 */
	public void setContent(String content)
	{
		
	}
}