import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.Label;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextPane;

public class fenetre extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fenetre frame = new fenetre();
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
	public fenetre() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(533, 343, 64, 29);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(379, 309, 203, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(245, 340, 285, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setBackground(new Color(0, 0, 0));
		table.setBounds(582, 270, -326, -183);
		contentPane.add(table);
		
		panel = new JPanel();
		panel.setBounds(0, -6, 233, 378);
		contentPane.add(panel);
		
		lblNewLabel = new JLabel("ChatBox support M2L");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Type de problème ");
		lblNewLabel_1.setBounds(245, 316, 116, 16);
		contentPane.add(lblNewLabel_1);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 153, 153));
		panel_1.setBounds(219, 301, 378, 71);
		contentPane.add(panel_1);
		
		
	}
}

/**
 * Launch the application.
 */

