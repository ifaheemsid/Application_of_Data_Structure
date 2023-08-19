import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import jaco.mp3.player.MP3Player;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField result;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Array() {
		setTitle("ARRAY");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 878, 599);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(172, 209, 223));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("ARRAY DATA STRUCTURE");
		heading.setForeground(new Color(128, 255, 255));
		heading.setBackground(new Color(192, 192, 192));
		heading.setFont(new Font("Algerian", Font.BOLD, 28));
		heading.setBounds(313, 43, 360, 38);
		contentPane.add(heading);
		
		JLabel input1 = new JLabel("Enter the length");
		input1.setForeground(new Color(255, 255, 255));
		input1.setFont(new Font("Constantia", Font.BOLD, 18));
		input1.setBackground(new Color(0, 0, 255));
		input1.setBounds(116, 113, 149, 39);
		contentPane.add(input1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(276, 113, 438, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCreateArray = new JButton("Create Array");
		btnCreateArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//creating array
				//String len = textField.getText();
				//int l = Integer.valueOf(len);
				int len = Integer.valueOf(textField.getText());
				arr = new int[len];		
				
				String message ="Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\array created.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
				
			}
		});
		btnCreateArray.setFont(new Font("Constantia", Font.PLAIN, 16));
		btnCreateArray.setForeground(new Color(0, 0, 160));
		btnCreateArray.setBackground(new Color(128, 255, 255));
		btnCreateArray.setBounds(443, 157, 126, 40);
		contentPane.add(btnCreateArray);
		
		JLabel input2 = new JLabel("Integer Element");
		input2.setForeground(new Color(255, 255, 255));
		input2.setFont(new Font("Constantia", Font.BOLD, 18));
		input2.setBackground(Color.LIGHT_GRAY);
		input2.setBounds(114, 247, 151, 28);
		contentPane.add(input2);
		
		JLabel input3 = new JLabel("Position");
		input3.setForeground(new Color(255, 255, 255));
		input3.setFont(new Font("Constantia", Font.PLAIN, 18));
		input3.setBackground(Color.LIGHT_GRAY);
		input3.setBounds(392, 245, 84, 28);
		contentPane.add(input3);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(276, 244, 94, 33);
		contentPane.add(textField2);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(486, 244, 91, 33);
		contentPane.add(textField3);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert
				int elem = Integer.valueOf(textField2.getText());
				int pos = Integer.valueOf(textField3.getText());
				arr[pos]=elem;
				String massage ="Element "+elem+" Inserted at "+pos;
					
				int len = arr.length;
				String message2="Insertion not possible";
				if(len < pos){
					JOptionPane.showConfirmDialog(contentPane, message2);
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element inserted successfully.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
				}
				else {
					//in underflow
					JOptionPane.showConfirmDialog(contentPane, massage);
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element inserted successfully.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					
				}

				textField2.setText("");
				textField3.setText("");
			}
		});
		btnInsert.setForeground(new Color(0, 0, 160));
		btnInsert.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnInsert.setBackground(new Color(128, 255, 255));
		btnInsert.setBounds(600, 242, 114, 39);
		contentPane.add(btnInsert);
		
		JLabel input4 = new JLabel("Enter Position");
		input4.setForeground(new Color(255, 255, 255));
		input4.setFont(new Font("Constantia", Font.BOLD, 18));
		input4.setBackground(Color.LIGHT_GRAY);
		input4.setBounds(114, 339, 151, 28);
		contentPane.add(input4);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(276, 336, 135, 33);
		contentPane.add(textField4);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete
				int pos = Integer.valueOf(textField4.getText());
				arr[pos] = 0;
				String message ="Element Deleted at the position "+pos;
				JOptionPane.showConfirmDialog(contentPane, message);
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted successfully.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
				textField4.setText("");
			}
		});
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnDelete.setBackground(new Color(0, 0, 0));
		btnDelete.setBounds(443, 334, 126, 39);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				String msg="";
				for (int i = 0; i < arr.length; i++) {
					{
						msg=msg+" "+arr[i];
					}
				}
				result.setText(msg);
			}
		});
		btnDisplay.setForeground(new Color(0, 0, 160));
		btnDisplay.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnDisplay.setBackground(new Color(128, 255, 255));
		btnDisplay.setBounds(373, 472, 114, 39);
		contentPane.add(btnDisplay);
		
		result = new JTextField();
		result.setBackground(new Color(128, 255, 255));
		result.setBounds(276, 411, 438, 33);
		contentPane.add(result);
		result.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if back buttom pressed then it should come to the home page
				new Array().setVisible(false);
				dispose();
				
				
				
			}
		});
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.setBounds(516, 472, 126, 39);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\images\\array.jpg"));
		lblNewLabel.setBounds(0, 0, 862, 560);
		contentPane.add(lblNewLabel);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{heading, input1, textField, btnCreateArray, input2, input3, textField2, textField3}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, heading, input1, textField, btnCreateArray, input2, input3, textField2, textField3}));
	}
}
