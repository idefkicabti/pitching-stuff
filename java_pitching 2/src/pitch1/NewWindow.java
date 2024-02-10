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
		
		Color myColor = new Color(0, 0, 0); // Create a custom color with red, green, and blue values
		getContentPane().setBackground(myColor); // Set the content pane background to the custom color
		

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

		// Set the text color and font of the labels
		nameLabel.setForeground(Color.GREEN);
		nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
		ageLabel.setForeground(Color.GREEN);
		ageLabel.setFont(new Font("Arial", Font.BOLD, 20));
		colorLabel.setForeground(Color.GREEN);
		colorLabel.setFont(new Font("Arial", Font.BOLD, 20));
		shapeLabel.setForeground(Color.GREEN);
		shapeLabel.setFont(new Font("Arial", Font.BOLD, 20));
		videogLabel.setForeground(Color.GREEN);
		videogLabel.setFont(new Font("Arial", Font.BOLD, 20));
		subjectLabel.setForeground(Color.GREEN);
		subjectLabel.setFont(new Font("Arial", Font.BOLD, 20));
		musicgLabel.setForeground(Color.GREEN);
		musicgLabel.setFont(new Font("Arial", Font.BOLD, 20));
		sportLabel.setForeground(Color.GREEN);
		sportLabel.setFont(new Font("Arial", Font.BOLD, 20));
		foodLabel.setForeground(Color.GREEN);
		foodLabel.setFont(new Font("Arial", Font.BOLD, 20));
		animeLabel.setForeground(Color.GREEN);
		animeLabel.setFont(new Font("Arial", Font.BOLD, 20));

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

		// Set the text color and font of the textfields
		nameField.setForeground(Color.GRAY);
		nameField.setFont(new Font("Arial", Font.BOLD, 20));
		ageField.setForeground(Color.GRAY);
		ageField.setFont(new Font("Arial", Font.BOLD, 20));
		colorField.setForeground(Color.GRAY);
		colorField.setFont(new Font("Arial", Font.BOLD, 20));
		shapeField.setForeground(Color.GRAY);
		shapeField.setFont(new Font("Arial", Font.BOLD, 20));
		videogField.setForeground(Color.GRAY);
		videogField.setFont(new Font("Arial", Font.BOLD, 20));
		subjectField.setForeground(Color.GRAY);
		subjectField.setFont(new Font("Arial", Font.BOLD, 20));
		musicgField.setForeground(Color.GRAY);
		musicgField.setFont(new Font("Arial", Font.BOLD, 20));
		sportField.setForeground(Color.GRAY);
		sportField.setFont(new Font("Arial", Font.BOLD, 20));
		foodField.setForeground(Color.GRAY);
		foodField.setFont(new Font("Arial", Font.BOLD, 20));
		animeField.setForeground(Color.GRAY);
		animeField.setFont(new Font("Arial", Font.BOLD, 20));

		// Set the border of the textfields
		nameField.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		ageField.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		colorField.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		shapeField.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		videogField.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		subjectField.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		musicgField.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		sportField.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		foodField.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		animeField.setBorder(BorderFactory.createLineBorder(Color.RED, 5));

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
				
				String message = "<html><font face='Courier' size='15' color='blue'>Hello, " + name + "! You are " + age +
						" years old. <br> Your favorite is shape is a " + shape + " that is colored in " + color 
						+ " . <br>You always play " + videog + ".<br>You're athletic in " + sport + " but " + subject 
						+ " is what you're good at in school <br>while listening to your " + musicg  
						+ " playlist.<br>You also often eat a lot of " + food + " while watching " + anime + ".";
				JOptionPane.showOptionDialog(null, message , "final output", JOptionPane.OK_OPTION,
						JOptionPane.INFORMATION_MESSAGE, icon, null, 0);
			}
		});

		// Set the background color and font of the submit button
		submitButton.setBackground(Color.CYAN);
		submitButton.setFont(new Font("Arial", Font.BOLD, 20));

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
}
