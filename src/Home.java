import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\Welcome to Home Page, please select data structure.mp3";
		final MP3Player mp3player = new MP3Player(new File(SONG));
		mp3player.play();
		setTitle("HOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 605);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 223, 223));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CHOOSE DATA STRUCTURE");
		heading.setForeground(new Color(128, 255, 255));
		heading.setBackground(new Color(255, 255, 255));
		heading.setFont(new Font("Algerian", Font.BOLD, 28));
		heading.setBounds(266, 53, 373, 43);
		contentPane.add(heading);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place array window open from here
//				Array a= new Array();
//				a.setVisible(true);
				//if we want to write in one line
				new Array().setVisible(true);
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\Welcome to array data structure.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
			}
		});
		array.setBackground(new Color(128, 255, 255));
		array.setForeground(new Color(0, 64, 128));
		array.setFont(new Font("Constantia", Font.PLAIN, 14));
		array.setBounds(224, 124, 117, 51);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Stack().setVisible(true);
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\welcome to Stack data structure.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
			}
		});
		stack.setForeground(new Color(0, 64, 128));
		stack.setFont(new Font("Constantia", Font.PLAIN, 14));
		stack.setBackground(new Color(128, 255, 255));
		stack.setBounds(224, 235, 117, 51);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\Welcome to queue data structure.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
			}
		});
		queue.setForeground(new Color(0, 64, 128));
		queue.setFont(new Font("Constantia", Font.PLAIN, 14));
		queue.setBackground(new Color(128, 255, 255));
		queue.setBounds(224, 352, 117, 51);
		contentPane.add(queue);
		
		JButton LinkedList = new JButton("SINGLY LINKED LIST");
		LinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				linkedlist link
				new LinkedList().setVisible(true);
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\Welcome to Linked list.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
			}
		});
		LinkedList.setForeground(new Color(0, 64, 128));
		LinkedList.setFont(new Font("Constantia", Font.PLAIN, 14));
		LinkedList.setBackground(new Color(128, 255, 255));
		LinkedList.setBounds(468, 232, 190, 56);
		contentPane.add(LinkedList);
		
		JButton DoublyLinkedList = new JButton("DOUBLY LINKED LIST");
		DoublyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//dll link
				new DoublyLinkedList().setVisible(true);
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\Welcome to Doubly Linked list.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
			}
		});
		DoublyLinkedList.setForeground(new Color(0, 64, 128));
		DoublyLinkedList.setFont(new Font("Constantia", Font.PLAIN, 14));
		DoublyLinkedList.setBackground(new Color(128, 255, 255));
		DoublyLinkedList.setBounds(468, 349, 190, 56);
		contentPane.add(DoublyLinkedList);
		
		JButton CircularQueue = new JButton("CIRCULAR QUEUE");
		CircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CircularQueue().setVisible(true);
			}
		});
		CircularQueue.setForeground(new Color(0, 64, 128));
		CircularQueue.setFont(new Font("Constantia", Font.PLAIN, 14));
		CircularQueue.setBackground(new Color(128, 255, 255));
		CircularQueue.setBounds(467, 124, 191, 51);
		contentPane.add(CircularQueue);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\images\\home.jpg"));
		lblNewLabel.setBounds(0, 0, 870, 566);
		contentPane.add(lblNewLabel);
	}
}
