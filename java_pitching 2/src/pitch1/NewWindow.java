package pitch1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	// Declare textfields for name, age, and color
	private JTextField nameField, ageField, colorField, shapeField, videogField, 
	subjectField, musicgField, sportField, foodField, animeField; 

	// Declare a button for submitting the input
	private JButton submitButton;

	// Constructor for the NewWindow class
	public NewWindow() {
		// Set the title, size, and layout of the window
		setTitle("New Window");
		setSize(1000, 800);
		setLayout(new FlowLayout());
		setLayout(new GridLayout(12, 2));

		// Create labels for the textfields
		JLabel nameLabel = new JLabel("Enter your name:");
		JLabel ageLabel = new JLabel("Enter your age:");
		JLabel colorLabel = new JLabel("Enter your favorite color:");
		JLabel shapeLabel = new JLabel("Enter your favorite shape: ");
		JLabel videogLabel = new JLabel("Enter your favorite videogame: ");
		JLabel subjectLabel = new JLabel("Enter your favorite subject: ");
		JLabel musicgLabel = new JLabel("Enter your favorite music genre: ");
		JLabel sportLabel = new JLabel("Enter your favorite sport: ");
		JLabel foodLabel = new JLabel("Enter your favorite food: ");
		JLabel animeLabel = new JLabel("Enter your favorite anime: ");


		// Create the textfields and set their initial text
		nameField = new JTextField("Name");
		ageField = new JTextField("Age");
		colorField = new JTextField("Color");
		shapeField = new JTextField("shape");
		videogField = new JTextField("video game");
		subjectField = new JTextField("subject");
		musicgField = new JTextField("music genre");
		sportField = new JTextField("sport");
		foodField = new JTextField("food");
		animeField = new JTextField("anime");


		// Create the submit button and add an action listener
		submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Get the input from the textfields
				String name = nameField.getText();
				String age = ageField.getText();
				String color = colorField.getText();
				String shape = shapeField.getText();
				String videog = videogField.getText();
				String subject = subjectField.getText();
				String musicg = musicgField.getText();
				String food = foodField.getText();
				String anime = animeField.getText();
				String sport = sportField.getText();


				// Display a personalized greeting message in a JOptionPane
				ImageIcon icon = new ImageIcon ("src/istockphoto-1303509809-612x612.jpg");
				JOptionPane.showOptionDialog(null, "Hello, " + name + "! You are " + age +
						" years old. Your favorite is shape is " + shape + " that is colored in " + color 
						+ " and you always play " + videog + ".\n You're athletic in " + sport + " but " + subject 
						+ " is what you're good at in school while listening to your " + musicg  
						+ " playlist and often eat a lot of " + food + " while watching " + anime + "." , "final output", JOptionPane.OK_OPTION,
						JOptionPane.INFORMATION_MESSAGE, icon, null, 0);
			}
		});

		add(nameLabel);
		add(nameField);
		add(ageLabel);
		add(ageField);
		add(colorLabel);
		add(colorField);
		add(videogLabel);
		add(videogField);
		add(subjectLabel);
		add(subjectField);
		add(musicgLabel);
		add(musicgField);
		add(foodLabel);
		add(foodField);
		add(animeLabel);
		add(animeField);
		add(shapeLabel);
		add(shapeField);
		add(sportLabel);
		add(sportField);
		add(submitButton);
		setVisible(true);
	}

	// Main method to create an instance of the NewWindow class
	public static void main(String[] args) {
		new NewWindow();
	}
}