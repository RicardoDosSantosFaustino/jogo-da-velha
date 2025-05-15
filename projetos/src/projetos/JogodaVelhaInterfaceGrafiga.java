package projetos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class JogodaVelhaInterfaceGrafiga extends JFrame  {
	private JButton btX,btO;
	private String formaJ1,formaJ2;
	private JLabel lbTitulo;
	
	
	public  JogodaVelhaInterfaceGrafiga(int modo) {
	
		int altura=60;
		int largura=50;
		int distancia=180;
		int grossura=40;
		Font fonteGrande =new Font("SansSerif",Font.BOLD,17);
		
		
		
		
		setTitle("Jogo da Velha");
		setSize(300,200); 
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		
		btX=new JButton();
		btX.setText("X"); 
		btX.setBounds(distancia,altura,largura,grossura);
		btX.setBorder(null);
		btX.setFocusPainted(false);
		btX.setContentAreaFilled(false);
		btX.setFont(fonteGrande);
		btX.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btX);
		
		btX.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				formaJ1="X";
				formaJ2="O";
				
				if(modo==1) {
				new Jogo(formaJ1,formaJ2);
				}if(modo==2) { 
					new JogoVelhaBot(formaJ1,formaJ2);
				}
				dispose();
			}
		});
		
		

		btO=new JButton();
		btO.setText("O"); 
		btO.setBounds(50,altura,largura,grossura);
		btO.setBorder(null);
		btO.setFocusPainted(false);
		btO.setContentAreaFilled(false);
		btO.setFont(fonteGrande);
		btO.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(btO);
		btO.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				formaJ2="X";
				formaJ1="O";
				
			
				if(modo==1) {
					new Jogo(formaJ1,formaJ2);
					}if(modo==2) { 
						new JogoVelhaBot(formaJ1,formaJ2);
					}
				dispose();
			}
		});
		
		lbTitulo=new JLabel();
		lbTitulo.setText("Jogador 1, escolha o simbulo q vc quer usar : ");
		lbTitulo.setBounds(10,10,280,20);
		add(lbTitulo);
		
		
		
		setVisible(true);
	}
	
	
	
    
	}

