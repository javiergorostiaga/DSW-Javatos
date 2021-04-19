package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Icon;

public class VentanaUsuario extends JFrame {

	private JPanel contentPane;
	private Image img;
	private Image img1;
	private Image img2;
	private Image img3;
	private Image img4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	public VentanaUsuario() {
		img = new ImageIcon(this.getClass().getResource("/images/logo.png")).getImage();
		img1 = new ImageIcon(this.getClass().getResource("/images/lupa.png")).getImage();
		img2 = new ImageIcon(this.getClass().getResource("/images/flecha.png")).getImage();
		img3 = new ImageIcon(this.getClass().getResource("/images/C1.png")).getImage();
		img4 = new ImageIcon(this.getClass().getResource("/images/C2.png")).getImage();

		
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
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		btnLogo.setBounds(362, 37, 117, 98);
		btnLogo.setBackground(Color.DARK_GRAY);
		contentPane.add(btnLogo);
		
		JLabel lblUsuario = new JLabel("USUARIO:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		lblUsuario.setBounds(236, 341, 251, 28);
		contentPane.add(lblUsuario);
		
		JLabel lblLocalizacin = new JLabel("LOCALIZACI\u00D3N:");
		lblLocalizacin.setForeground(Color.WHITE);
		lblLocalizacin.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		lblLocalizacin.setBounds(236, 383, 146, 28);
		contentPane.add(lblLocalizacin);
		
		JLabel lblEmpresa = new JLabel("EMPRESA:");
		lblEmpresa.setForeground(Color.WHITE);
		lblEmpresa.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		lblEmpresa.setBounds(236, 427, 87, 28);
		contentPane.add(lblEmpresa);
		
		JLabel lblDesde = new JLabel("DESDE:");
		lblDesde.setForeground(Color.WHITE);
		lblDesde.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		lblDesde.setBounds(305, 175, 87, 28);
		contentPane.add(lblDesde);
		
		JLabel lblHasta = new JLabel("HASTA:");
		lblHasta.setForeground(Color.WHITE);
		lblHasta.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		lblHasta.setBounds(480, 175, 87, 28);
		contentPane.add(lblHasta);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		btnBuscar.setBackground(Color.LIGHT_GRAY);
		btnBuscar.setBounds(542, 491, 159, 60);
		contentPane.add(btnBuscar);
		
		textField = new JTextField();
		textField.setBounds(377, 341, 208, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(377, 385, 208, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(377, 427, 208, 30);
		contentPane.add(textField_2);
		
		JButton btnC1 = new JButton(new ImageIcon(img3));
		btnC1.setText("");
		btnC1.setOpaque(false);
		btnC1.setForeground(Color.WHITE);
		btnC1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 32));
		btnC1.setFocusPainted(false);
		btnC1.setContentAreaFilled(false);
		btnC1.setBorderPainted(false);
		btnC1.setBorder(null);
		btnC1.setBackground(Color.DARK_GRAY);
		btnC1.setBounds(275, 215, 107, 98);
		contentPane.add(btnC1);
		
		JButton btnC2 = new JButton(new ImageIcon(img4));
		btnC2.setText("");
		btnC2.setOpaque(false);
		btnC2.setForeground(Color.WHITE);
		btnC2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 32));
		btnC2.setFocusPainted(false);
		btnC2.setContentAreaFilled(false);
		btnC2.setBorderPainted(false);
		btnC2.setBorder(null);
		btnC2.setBackground(Color.DARK_GRAY);
		btnC2.setBounds(463, 215, 107, 98);
		contentPane.add(btnC2);
		
		
	}
}
