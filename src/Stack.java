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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
    private int s[];
    private int size;
    private int top=-1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setTitle("STACK ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 836, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stack Data Structure");
		lblNewLabel.setForeground(new Color(227, 250, 150));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 26));
		lblNewLabel.setBounds(290, 34, 338, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Stack Size");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(156, 106, 126, 25);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(328, 102, 300, 31);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton stack = new JButton("Create Stack");
		stack.setBackground(new Color(217, 244, 121));
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(sizefield.getText());
				s=new int[size];
				String message=" Stack of size " +size+ " created ";
				JOptionPane.showMessageDialog(contentPane, message);
				
				final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\Stack created.mp3";
				final MP3Player mp3player = new MP3Player(new File(SONG));
				mp3player.play();
			}
		});
		stack.setForeground(new Color(0, 0, 64));
		stack.setFont(new Font("Constantia", Font.PLAIN, 16));
		stack.setBounds(412, 148, 126, 36);
		contentPane.add(stack);
		
		JLabel lblNewLabel_2 = new JLabel("Enter an element");
		lblNewLabel_2.setBackground(new Color(128, 0, 0));
		lblNewLabel_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(156, 217, 143, 36);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(328, 224, 300, 29);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("Push");
		push.setBackground(new Color(217, 244, 121));
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane," Push not Possible ");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, " Push Successfull ");
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element inserted successfully.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					element.setText("");
				}
			}
		});
		push.setForeground(new Color(0, 0, 64));
		push.setFont(new Font("Constantia", Font.PLAIN, 16));
		push.setBounds(365, 281, 91, 36);
		contentPane.add(push);
		
		JButton pop = new JButton("Pop");
		pop.setBackground(new Color(217, 244, 121));
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deleting element
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, " Pop not Possible ");
				}
				else
				{
					String message="Element deleted is "+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					
					final String SONG="C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\src\\music\\element deleted successfully.mp3";
					final MP3Player mp3player = new MP3Player(new File(SONG));
					mp3player.play();
					--top;
			    }
			}
		});
		pop.setForeground(new Color(0, 0, 64));
		pop.setFont(new Font("Constantia", Font.PLAIN, 16));
		pop.setBounds(494, 281, 91, 36);
		contentPane.add(pop);
		
		JButton display = new JButton("Display");
		display.setBackground(new Color(217, 244, 121));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//displaying
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, " Display not Possible ");
				}
				else
				{
					for(int i=top; i>=0; i--)
					{
						msg=msg+" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(0, 0, 64));
		display.setFont(new Font("Constantia", Font.PLAIN, 16));
		display.setBounds(436, 347, 91, 36);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Tahoma", Font.BOLD, 14));
		displaybox.setBackground(new Color(217, 244, 121));
		displaybox.setBounds(328, 406, 313, 36);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if back buttom pressed then it shoild come to the home page
				new Stack().setVisible(false);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.setBounds(436, 465, 91, 41);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\MiniProject\\images\\stack.jpg"));
		lblNewLabel_3.setBounds(0, 0, 820, 561);
		contentPane.add(lblNewLabel_3);
	}

}