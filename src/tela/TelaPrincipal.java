package tela;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import dao.CartasDao;
import domain.Carta;
import domain.Jogo;

public class TelaPrincipal extends JFrame {

	private static JPanel contentPane;
	private static JLabel lCartaUsuario = new JLabel("");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public TelaPrincipal() throws SQLException {
		List<Carta> cartas = CartasDao.carregaCartas();
		Jogo jogo = new Jogo();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		jogo.setBaralho(cartas);
		jogo.embaralharCartas();
		jogo.distribuirCartas(3);
		lCartaUsuario.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/arquivos/Cartas"+jogo.getMaoCartas1().get(0).getImagem())));
		lCartaUsuario.setBounds(51, 28, 138, 209);
		contentPane.add(lCartaUsuario);
		
		JButton bJogar = new JButton("Jogar");
		bJogar.setHorizontalAlignment(SwingConstants.RIGHT);
		bJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogo.jogar();
				lCartaUsuario.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/arquivos/Cartas"+jogo.getMaoCartas1().get(0).getImagem())));
			}
		});
		bJogar.setBounds(72, 273, 85, 21);
		contentPane.add(bJogar);
	}
}
