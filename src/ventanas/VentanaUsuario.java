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

public class VentanaUsuario extends JFrame {

	private JPanel contentPane;
	private Image img;
	private Image img1;
	private Image img2;


	public VentanaUsuario() {
		img = new ImageIcon(this.getClass().getResource("/images/logo.png")).getImage();
		img1 = new ImageIcon(this.getClass().getResource("/images/lupa.png")).getImage();
		img2 = new ImageIcon(this.getClass().getResource("/images/flecha.png")).getImage();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1100, 800, 775, 623);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFlecha = new JButton(new ImageIcon(img2));
		btnFlecha.setBackground(Color.LIGHT_GRAY);
		btnFlecha.setForeground(Color.LIGHT_GRAY);
		btnFlecha.setBounds(0, 104, 159, 55);
		contentPane.add(btnFlecha);
		
		JButton btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.setBackground(Color.LIGHT_GRAY);
		btnUsuarios.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUsuarios.setBounds(0, 159, 159, 61);
		contentPane.add(btnUsuarios);
		
		JButton btnEquipos = new JButton("EQUIPOS");
		btnEquipos.setBackground(Color.LIGHT_GRAY);
		btnEquipos.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		btnEquipos.setBounds(0, 220, 159, 60);
		contentPane.add(btnEquipos);
		
		JButton btnProyectos = new JButton("PROYECTOS");
		btnProyectos.setBackground(Color.LIGHT_GRAY);
		btnProyectos.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		btnProyectos.setBounds(0, 280, 159, 61);
		contentPane.add(btnProyectos);
		
		JButton btn1 = new JButton("...");
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		btn1.setBounds(0, 341, 159, 51);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("...");
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		btn2.setBounds(0, 392, 159, 51);
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
		lblUsuario.setBounds(254, 198, 251, 28);
		contentPane.add(lblUsuario);
		
		JLabel lblMail = new JLabel("MAIL:");
		lblMail.setForeground(Color.WHITE);
		lblMail.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		lblMail.setBounds(254, 243, 251, 28);
		contentPane.add(lblMail);
		
		JLabel lblListaSeguidores = new JLabel("LISTA SEGUIDORES:");
		lblListaSeguidores.setForeground(Color.WHITE);
		lblListaSeguidores.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		lblListaSeguidores.setBounds(254, 286, 346, 28);
		contentPane.add(lblListaSeguidores);
		
		JLabel lblLocalizacin = new JLabel("LOCALIZACI\u00D3N:");
		lblLocalizacin.setForeground(Color.WHITE);
		lblLocalizacin.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		lblLocalizacin.setBounds(254, 328, 317, 28);
		contentPane.add(lblLocalizacin);
		
		JLabel lblEmpresa = new JLabel("EMPRESA:");
		lblEmpresa.setForeground(Color.WHITE);
		lblEmpresa.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		lblEmpresa.setBounds(254, 372, 87, 28);
		contentPane.add(lblEmpresa);
		
		JLabel lblRepositorio = new JLabel("REPOSITORIO:");
		lblRepositorio.setForeground(Color.WHITE);
		lblRepositorio.setFont(new Font("Rockwell Condensed", Font.PLAIN, 26));
		lblRepositorio.setBounds(254, 416, 138, 28);
		contentPane.add(lblRepositorio);
		
		
	}

}
