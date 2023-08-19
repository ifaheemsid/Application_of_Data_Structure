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

public class LinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	class Node{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 LinkedList frame = new  LinkedList();
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
	public LinkedList() {
		setTitle("SINGLY LINKED LIST");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 807, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Singly Linked List");
		lblNewLabel.setForeground(new Color(209, 209, 209));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 28));
		lblNewLabel.setBounds(267, 32, 317, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter The Element");
		lblNewLabel_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1.setForeground(new Color(212, 212, 212));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(149, 98, 149, 29);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(302, 96, 223, 29);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter the Element");
		lblNewLabel_2.setBackground(new Color(64, 0, 0));
		lblNewLabel_2.setForeground(new Color(212, 212, 212));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(149, 153, 149, 26);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(302, 153, 223, 29);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton btnNewButton = new JButton("Insert Rear");
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				Node temp;
				elem=Integer.valueOf(sizefield.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
					
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
				}
				JOptionPane.showMessageDialog(contentPane," Element inserted at rear end sucessfull ");
				
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element inserted in rear.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
				
				sizefield.setText("");
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(557, 98, 110, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete Rear");
		btnNewButton_1.setBackground(new Color(211, 211, 211));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane," Deletion not Possible ");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, " Element deleted is "+first.data);
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted from rear.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
                    first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, " Element deleted is "+temp.link.data);
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted from rear.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					temp.link=null;
				}
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_1.setBounds(302, 218, 124, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Insert front");
		btnNewButton_2.setBackground(new Color(211, 211, 211));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				elem=Integer.valueOf(element.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.link=first;
					first=newnode;
				}
				JOptionPane.showMessageDialog(contentPane," Element inserted at front end sucessfull ");
				
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element inserted in front.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
				element.setText("");
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_2.setBounds(557, 153, 110, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete Front");
		btnNewButton_3.setBackground(new Color(211, 211, 211));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane," Deletion not Possible ");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, " Element deleted is "+first.data);
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted from front.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, " Element deleted is "+first.data);
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted from front.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					
					first=first.link;
				}
			}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_3.setBounds(443, 218, 124, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Display");
		btnNewButton_4.setBackground(new Color(209, 209, 209));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane," Display not Possible ");
				}
				else if(first.link==null)
				{
					displaybox.setText(String.valueOf(first.data));
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
					displaybox.setText(msg);
			}
			}
		});
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_4.setBounds(374, 337, 99, 29);
		contentPane.add(btnNewButton_4);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(212, 212, 212));
		displaybox.setFont(new Font("Tahoma", Font.BOLD, 13));
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setBounds(267, 284, 317, 29);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if back buttom pressed then it shoild come to the home page
				new LinkedList().setVisible(false);
				dispose();
			}
		});
		btnBack.setForeground(new Color(212, 212, 212));
		btnBack.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.setBounds(374, 385, 99, 38);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(new Color(211, 211, 211));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\images\\linkedlist.jpg"));
		lblNewLabel_3.setBounds(0, 0, 791, 476);
		contentPane.add(lblNewLabel_3);
	}

}