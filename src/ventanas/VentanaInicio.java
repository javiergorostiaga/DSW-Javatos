package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class VentanaInicio extends JFrame {

	private JPanel contentPane;
	private Image img;
	private Image img1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
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
	public VentanaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 250, 775, 623);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		img = new ImageIcon(this.getClass().getResource("/images/logo1.png")).getImage();
		img1 = new ImageIcon(this.getClass().getResource("/images/menu1.png")).getImage();
		
		
		
		
		JButton btnLogo = new JButton(new ImageIcon(img));
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btnLogo.setText(" ");
		btnLogo.setOpaque(false);
		btnLogo.setForeground(Color.WHITE);
		btnLogo.setFont(new Font("Rockwell Condensed", Font.PLAIN, 32));
		btnLogo.setFocusPainted(false);
		btnLogo.setContentAreaFilled(false);
		btnLogo.setBorderPainted(false);
		btnLogo.setBorder(null);
		btnLogo.setBounds(202, 185, 325, 274);
		btnLogo.setBackground(Color.DARK_GRAY);
		contentPane.add(btnLogo);
		
		JLabel lblBienvenidoAJavatos = new JLabel("BIENVENIDO A JAVATOS");
		lblBienvenidoAJavatos.setFont(new Font("Rockwell Condensed", Font.PLAIN, 34));
		lblBienvenidoAJavatos.setBackground(new Color(240, 240, 240));
		lblBienvenidoAJavatos.setForeground(Color.WHITE);
		lblBienvenidoAJavatos.setBounds(227, 62, 298, 98);
		contentPane.add(lblBienvenidoAJavatos);
		
		JButton btnComenzar = new JButton(new ImageIcon(img1));
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu m = new VentanaMenu();
				m.setVisible(true);
				VentanaInicio.this.dispose();
			}
		});
		btnComenzar.setText(" ");
		btnComenzar.setOpaque(false);
		btnComenzar.setForeground(Color.WHITE);
		btnComenzar.setFont(new Font("Rockwell Condensed", Font.PLAIN, 32));
		btnComenzar.setFocusPainted(false);
		btnComenzar.setContentAreaFilled(false);
		btnComenzar.setBorderPainted(false);
		btnComenzar.setBorder(null);
		btnComenzar.setBounds(15, 16, 214, 93);
		btnComenzar.setBackground(Color.DARK_GRAY);
		contentPane.add(btnComenzar);
	}
}
