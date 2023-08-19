import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

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
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class 

Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					Queue frame = new Queue();
					frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Queue() {
		setTitle("QUEUE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 871, 584);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Queue Data Structure");

		lblNewLabel.setForeground(new Color(0, 0, 64));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 26));
		lblNewLabel.setBounds(325, 52, 322, 36);
		contentPane.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("Enter Queue Size");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(132, 147, 151));

		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 18));

		lblNewLabel_1.setBounds(152, 112, 166, 45);
		contentPane.add(lblNewLabel_1);

		sizefield = new JTextField();
		sizefield.setBounds(325, 116, 314, 35);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		JButton btnNewButton = new JButton("Create Queue");
		btnNewButton.setBackground(new Color(128, 128, 128));

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				size=Integer.valueOf(sizefield.getText());

				q=new int[size];
				size=q.length;
				String message="Queue of " +size+ " created ";
				JOptionPane.showMessageDialog(contentPane, message);
				
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\Queue is created.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
			}
		});

		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(414, 171, 131, 36);
		contentPane.add(btnNewButton);
		JLabel lblNewLabel_2 = new JLabel("Enter an Element");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(132, 147, 151));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 18));

		lblNewLabel_2.setBounds(152, 239, 166, 36);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setBounds(325, 238, 314, 36);
		contentPane.add(element);


		element.setColumns(10);
		JButton btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int elem;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane," Insertion not Possible ");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "Inertion sucessufull");
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element inserted successfully.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					element.setText("");
				}
			}
		});


		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_1.setBounds(376, 302,97, 36);
		contentPane.add(btnNewButton_1);
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBackground(new Color(128, 128, 128));
		btnNewButton_2.addActionListener(new ActionListener() {

			public void actionPerformed (ActionEvent e) {

				if(r==1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane," Deletion not Possible");	
				}
				else
				{
					String message="Element deleted is "+q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted successfully.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					++f;
				}
			}

		});

		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_2.setBounds(506, 302, 97, 36);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Display");
		btnNewButton_3.setBackground(new Color(128, 128, 128));

		btnNewButton_3.addActionListener(new ActionListener() {

			public void actionPerformed

			(ActionEvent e) {
				String msg="";
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog
					(contentPane, " Display not Possible");
				}
				else
				{
					for(int i=f; i<=r; i++)
					{
						msg=msg+" "+q[i];
					}
					displaybox.setText

					(msg);
				}
			}
		});


		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_3.setBounds(376, 416, 97, 36);
		contentPane.add(btnNewButton_3);
		displaybox = new JTextField();
		displaybox.setFont(new Font("Tahoma", Font.BOLD, 12));
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setBackground(new Color(192, 192, 192));
		displaybox.setBounds(325, 362, 314, 35);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if back buttom pressed then it shoild come to the home page
				new Queue().setVisible(false);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.setBounds(506, 418, 97, 36);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_3.setBackground(new Color(128, 128, 128));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\images\\queue.jpg"));
		lblNewLabel_3.setBounds(0, 0, 855, 545);
		contentPane.add(lblNewLabel_3);
	}
}


