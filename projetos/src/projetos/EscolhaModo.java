package projetos;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EscolhaModo extends JFrame {
	private JButton bt1v1,bt1vBot;
	Font fonteGrande =new Font("SansSerif",Font.BOLD,17);

	public EscolhaModo() {

		int altura=60;
		int largura=100;
		int distancia=160;
		int grossura=40;
		
	setTitle("Jogo da Velha");
	setSize(300,200); 
	setLocationRelativeTo(null); 
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
	setResizable(false);
	
	bt1v1=new JButton();
	bt1v1.setText("1 vs 1"); 
	bt1v1.setBounds(distancia,altura,largura,grossura);
	bt1v1.setBorder(null);
	bt1v1.setFocusPainted(false);
	bt1v1.setContentAreaFilled(false);
	bt1v1.setFont(fonteGrande);
	bt1v1.setCursor(new Cursor(Cursor.HAND_CURSOR));
	add(bt1v1);
	
	bt1v1.addActionListener(new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) {
		
			new JogodaVelhaInterfaceGrafiga(1);
			dispose();
		}
	});
	
	

	bt1vBot=new JButton();
	bt1vBot.setText("1 vs Bot"); 
	bt1vBot.setBounds(30,altura,largura,grossura);
	bt1vBot.setBorder(null);
	bt1vBot.setFocusPainted(false);
	bt1vBot.setContentAreaFilled(false);
	bt1vBot.setFont(fonteGrande);
	bt1vBot.setCursor(new Cursor(Cursor.HAND_CURSOR));
	add(bt1vBot);
	bt1vBot.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new JogodaVelhaInterfaceGrafiga(2);
			dispose();
		}
	});
	
	JLabel lbTitulo = new JLabel();
	lbTitulo.setText("Escolha o modo de jogo:");
	lbTitulo.setBounds(70,10,280,20);
	add(lbTitulo);
	
	
	
	setVisible(true);
}
}
