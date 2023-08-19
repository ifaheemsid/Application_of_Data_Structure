import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	private JTextField displayBox;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setTitle("CIRCULAR QUEUE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 812, 504);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Circular Queue Data Structure");
		lblNewLabel.setBackground(new Color(223, 30, 64));
		lblNewLabel.setForeground(new Color(223, 30, 64));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 28));
		lblNewLabel.setBounds(168, 11, 486, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Queue Size");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1.setBounds(103, 76, 159, 23);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(275, 74, 269, 25);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.setBackground(new Color(223, 30, 64));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(sizefield.getText());
				cq=new int[size];
				size=cq.length;
				String message="Circular Queue of " +size+ " created ";
				JOptionPane.showMessageDialog(contentPane, message);
				
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\Queue is created.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(565, 70, 89, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Enter an Element");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_2.setBounds(103, 130, 151, 23);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(275, 128, 269, 25);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.setBackground(new Color(223, 30, 64));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//insertion
				int elem;
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane," Insertion not Possible ");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, " Insertion sucessufull ");
                    
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element inserted successfully.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					element.setText("");
				}
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(295, 178, 89, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBackground(new Color(223, 30, 64));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane," Deletion not Possible ");	
				}
				else
				{
					String message="Element deleted is "+cq[f];
					f=(f+1)%size;
					count--;
                    JOptionPane.showMessageDialog(contentPane, message);
                    final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted successfully.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
				}
				
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(433, 178, 89, 31);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Display");
		btnNewButton_3.setBackground(new Color(223, 30, 64));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				String msg="";
				int f1=f;
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane," Display not Possible ");	
				}
				else
				{
					for(int i=0; i<count; i++)
					{
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displayBox.setText(msg);
					}
				}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(366, 307, 89, 31);
		contentPane.add(btnNewButton_3);
		
		displayBox = new JTextField();
		displayBox.setBackground(new Color(192, 192, 192));
		displayBox.setColumns(10);
		displayBox.setBounds(275, 255, 269, 31);
		contentPane.add(displayBox);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if back buttom pressed then it shoild come to the home page
				new CircularQueue().setVisible(false);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.setBounds(366, 360, 89, 38);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\images\\circularQueue.jpg"));
		lblNewLabel_3.setBounds(0, 0, 796, 465);
		contentPane.add(lblNewLabel_3);
		
		
	}
}