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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import dao.CartasDao;
import domain.Carta;
import domain.Jogo;
import javax.swing.JRadioButton;
import java.awt.Color;

public class TelaPrincipal extends JFrame {
	List<Carta> cartas = CartasDao.carregaCartas();
	Jogo jogo = new Jogo();
	JPanel contentPane;
	JLabel lCartaUsuario = new JLabel("");
	JLabel lCartaComputador = new JLabel("");
	JButton bAltura = new JButton("");
	JButton bInteligencia = new JButton("");
	JButton bForca = new JButton("");
	JButton bVelocidade = new JButton("");
	JButton bHabilidade = new JButton("");
	int atributoMao1, atributoMao2;
	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		jogo.setBaralho(cartas);
		jogo.embaralharCartas();
		jogo.distribuirCartas(3);
		
		organizaInicioRodada();
		
		lCartaUsuario.setBounds(51, 28, 138, 209);
		lCartaComputador.setBounds(689, 28, 138, 209);
		bAltura.setBounds(51, 271, 85, 21);
		bInteligencia.setBounds(51, 310, 85, 21);
		bForca.setBounds(51, 354, 85, 21);
		bVelocidade.setBounds(51, 397, 85, 21);
		bHabilidade.setBounds(51, 439, 85, 21);
		
		bAltura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeCartaComputador();
				atributoMao1 = jogo.getMaoCartas1().get(0).getAtributo1();
				atributoMao2 = jogo.getMaoCartas2().get(0).getAtributo1();
				bAltura.setBackground(Color.ORANGE);
			}
		});
		bInteligencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeCartaComputador();
				atributoMao1 = jogo.getMaoCartas1().get(0).getAtributo2();
				atributoMao2 = jogo.getMaoCartas2().get(0).getAtributo2();
				bInteligencia.setBackground(Color.ORANGE);
			}
		});
		bForca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeCartaComputador();
				atributoMao1 = jogo.getMaoCartas1().get(0).getAtributo3();
				atributoMao2 = jogo.getMaoCartas2().get(0).getAtributo3();
				bForca.setBackground(Color.ORANGE);
			}
		});
		bVelocidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeCartaComputador();
				atributoMao1 = jogo.getMaoCartas1().get(0).getAtributo4();
				atributoMao2 = jogo.getMaoCartas2().get(0).getAtributo4();
				bVelocidade.setBackground(Color.ORANGE);
			}
		});
		bHabilidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeCartaComputador();
				atributoMao1 = jogo.getMaoCartas1().get(0).getAtributo5();
				atributoMao2 = jogo.getMaoCartas2().get(0).getAtributo5();
				bHabilidade.setBackground(Color.ORANGE);
			}
		});
		
		contentPane.add(lCartaUsuario);
		contentPane.add(lCartaComputador);
		contentPane.add(bAltura);
		contentPane.add(bInteligencia);
		contentPane.add(bForca);
		contentPane.add(bVelocidade);
		contentPane.add(bHabilidade);
		
		JButton bJogar = new JButton("Jogar");
		bJogar.setHorizontalAlignment(SwingConstants.RIGHT);
		bJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(atributoMao1!=0) {
					jogo.jogar(atributoMao1,atributoMao2);
					organizaInicioRodada();
					atributoMao1=0;
					atributoMao2=0;
				} else {
					JOptionPane.showMessageDialog(null, "Escolha um atributo");
				}
			}
		});
		bJogar.setBounds(381, 180, 85, 21);
		contentPane.add(bJogar);
		
	}
	
	private void organizaInicioRodada() {
		if(!jogo.getMaoCartas1().isEmpty() || !jogo.getMaoCartas2().isEmpty())
		lCartaUsuario.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/arquivos/Cartas"+jogo.getMaoCartas1().get(0).getImagem())));
		lCartaComputador.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/arquivos/Cartas/fundo.jpg")));
		bAltura.setText(jogo.getMaoCartas1().get(0).getAtributo1()+"");
		bInteligencia.setText(jogo.getMaoCartas1().get(0).getAtributo2()+"");
		bForca.setText(jogo.getMaoCartas1().get(0).getAtributo3()+"");
		bVelocidade.setText(jogo.getMaoCartas1().get(0).getAtributo4()+"");
		bHabilidade.setText(jogo.getMaoCartas1().get(0).getAtributo5()+"");
		bAltura.setBackground(Color.WHITE);
		bInteligencia.setBackground(Color.WHITE);
		bForca.setBackground(Color.WHITE);
		bVelocidade.setBackground(Color.WHITE);
		bHabilidade.setBackground(Color.WHITE);
	}
	
	private void exibeCartaComputador(){
		lCartaComputador.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/arquivos/Cartas"+jogo.getMaoCartas2().get(0).getImagem())));
	}
}
