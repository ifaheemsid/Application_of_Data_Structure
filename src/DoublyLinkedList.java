import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	class Node{
		Node prelink;
		int data;
		Node nextlink;
	}
	private Node first;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setTitle("DOUBLY LINKED LIST ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 797, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Doubly Linked List");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 28));
		lblNewLabel.setBounds(279, 21, 318, 33);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Enter the Element");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(139, 91, 148, 22);
		contentPane.add(lblNewLabel_1);

		sizefield = new JTextField();
		sizefield.setBounds(297, 88, 221, 27);
		contentPane.add(sizefield);
		sizefield.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Enter the Element");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(139, 150, 148, 22);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setBounds(297, 143, 221, 27);
		contentPane.add(element);
		element.setColumns(10);

		JButton btnNewButton = new JButton("Insert Rear");
		btnNewButton.setBackground(new Color(213, 247, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				int elem=Integer.valueOf(sizefield.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null){
					first=newnode;
					JOptionPane.showMessageDialog(contentPane," Element inserted at rear end sucessfull ");

					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element inserted in rear.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					sizefield.setText("");
				}
				else{
					temp=first;
					while(temp.nextlink!=null){
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					JOptionPane.showMessageDialog(contentPane," Element inserted at rear end sucessfull ");

					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element inserted in rear.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
				}
				sizefield.setText("");
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(546, 87, 116, 33);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Insert Front");
		btnNewButton_1.setBackground(new Color(213, 247, 240));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(element.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if (first==null){
					first=newnode;
					JOptionPane.showMessageDialog(contentPane," Element inserted at front end sucessfull ");

					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element inserted in front.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
				}
				else{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane," Element inserted at front end sucessfull ");

					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element inserted in front.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
				}
				element.setText("");
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_1.setBounds(546, 143, 116, 33);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Delete Rear");
		btnNewButton_2.setBackground(new Color(213, 247, 240));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first==null){
					JOptionPane.showMessageDialog(contentPane," Deletion not Possible ");
				}
				else if(first.nextlink==null){
					JOptionPane.showMessageDialog(contentPane, " Element deleted is "+first.data);
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted from rear.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					first=null;
				}
				else{
					temp=first;
					while(temp.nextlink.nextlink!=null){
						temp=temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, " Element deleted is "+temp.nextlink.data);
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted from rear.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					
					temp.nextlink=null;
				}
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(257, 200, 123, 33);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Delete Front");
		btnNewButton_3.setBackground(new Color(213, 247, 240));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null){
					JOptionPane.showMessageDialog(contentPane," Deletion not Possible ");
				}
				else if(first.nextlink==null){
					JOptionPane.showMessageDialog(contentPane, " Element deleted is "+first.data);
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted from front.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					first=null;
				}
				else{
					JOptionPane.showMessageDialog(contentPane, " Element deleted is "+first.data);
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted from front.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					
					first=first.nextlink;
					first.prelink=null;
				}
			}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(421, 200, 123, 33);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Display Forword");
		btnNewButton_4.setBackground(new Color(213, 247, 240));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, " Display not Possible");
				}
				else if(first.nextlink==null)
				{
					displaybox.setText(String.valueOf(first.data));					}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.nextlink;
					}
					displaybox.setText(msg);
				}
			}
		});
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBounds(257, 313, 133, 33);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Display Reverse");
		btnNewButton_5.setBackground(new Color(213, 247, 240));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane," Display not Possible ");
				}
				if(first.nextlink==null)
				{
					displaybox.setText(String.valueOf(first.data));
				}
				else{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
				}
				displaybox.setText(msg);
			}
		});
		btnNewButton_5.setForeground(new Color(0, 0, 0));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5.setBounds(421, 313, 133, 33);
		contentPane.add(btnNewButton_5);

		displaybox = new JTextField();
		displaybox.setBackground(new Color(213, 247, 240));
		displaybox.setFont(new Font("Tahoma", Font.BOLD, 12));
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setBounds(237, 269, 342, 27);
		contentPane.add(displaybox);
		displaybox.setColumns(10);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if back buttom pressed then it shoild come to the home page
				new DoublyLinkedList().setVisible(false);
				dispose();
			}
		});
		btnBack.setForeground(new Color(213, 247, 240));
		btnBack.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.setBounds(353, 376, 108, 39);
		contentPane.add(btnBack);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\images\\doubly.jpeg"));
		lblNewLabel_3.setBounds(0, 0, 781, 479);
		contentPane.add(lblNewLabel_3);
	}
}