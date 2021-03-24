package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;

public class VentanaMenu extends JFrame {

	private JPanel contentPane;
	private Image img;
	private Image img1;
	private Image img2;
	private JTextField textField;

	
	public VentanaMenu() {
		
		img = new ImageIcon(this.getClass().getResource("/images/logo.png")).getImage();
		img1 = new ImageIcon(this.getClass().getResource("/images/lupa.png")).getImage();
		img2 = new ImageIcon(this.getClass().getResource("/images/flecha.png")).getImage();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 250, 775, 623);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFlecha = new JButton(new ImageIcon(img2));
		btnFlecha.setBackground(Color.LIGHT_GRAY);
		btnFlecha.setForeground(Color.LIGHT_GRAY);
		btnFlecha.setBounds(0, 104, 178, 55);
		contentPane.add(btnFlecha);
		
		JButton btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.setBackground(Color.LIGHT_GRAY);
		btnUsuarios.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaUsuario u = new VentanaUsuario();
				u.setVisible(true);
				VentanaMenu.this.dispose();
			}
		});
		btnUsuarios.setBounds(0, 159, 178, 61);
		contentPane.add(btnUsuarios);
		
		JButton btnEquipos = new JButton("EQUIPOS");
		btnEquipos.setBackground(Color.LIGHT_GRAY);
		btnEquipos.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		btnEquipos.setBounds(0, 220, 178, 60);
		contentPane.add(btnEquipos);
		
		JButton btnProyectos = new JButton("ORGANIZACI\u00D3N");
		btnProyectos.setBackground(Color.LIGHT_GRAY);
		btnProyectos.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		btnProyectos.setBounds(0, 280, 178, 61);
		contentPane.add(btnProyectos);
		
		JButton btn1 = new JButton("REPOSITORIO");
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		btn1.setBounds(0, 341, 178, 51);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("...");
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		btn2.setBounds(0, 392, 178, 51);
		contentPane.add(btn2);
		
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
		btnLogo.setBounds(377, 104, 117, 98);
		btnLogo.setBackground(Color.DARK_GRAY);
		contentPane.add(btnLogo);
		
		textField = new JTextField();
		textField.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		textField.setBounds(193, 240, 422, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton(new ImageIcon(img1));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btnBuscar.setText(" ");
		btnBuscar.setOpaque(false);
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setFont(new Font("Rockwell Condensed", Font.PLAIN, 32));
		btnBuscar.setFocusPainted(false);
		btnBuscar.setContentAreaFilled(false);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBorder(null);
		btnBuscar.setBounds(630, 218, 117, 98);
		btnBuscar.setBackground(Color.DARK_GRAY);
		contentPane.add(btnBuscar);
	}
}
