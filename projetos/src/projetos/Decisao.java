package projetos;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public  class Decisao extends JFrame {
	
 private JLabel lbMensagem;
 private JButton btVoltar;
 
 	
	public  Decisao(boolean decisao,String forma) { 
		
		Font fonteGrande =new Font("SansSerif",Font.BOLD,20);
		Font fonteMedia =new Font("SansSerif",Font.BOLD,15);
		
		setTitle("Jogo da Velha");
		setSize(300,200); 
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		
		if(decisao) { 
			lbMensagem=new JLabel(); 
			lbMensagem.setText(forma +" ganhou");
			lbMensagem.setFont(fonteGrande);
			lbMensagem.setBounds(95, 50, 100, 50);
			add(lbMensagem); 
			
			
			btVoltar=new JButton();
			btVoltar.setText("Voltar");
			btVoltar.setFont(fonteMedia);
			btVoltar.setBorder(null);
			btVoltar.setFocusPainted(false);
			btVoltar.setContentAreaFilled(false);
			btVoltar.setBounds(5, 10, 50, 20);
			btVoltar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			add(btVoltar);
			
			btVoltar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					new EscolhaModo();
					dispose();
				}
			});
			
		}
		else { 
			lbMensagem=new JLabel(); 
			lbMensagem.setText("Deu velha");
			lbMensagem.setFont(fonteMedia);
			lbMensagem.setBounds(105, 50, 100, 50);
			add(lbMensagem); 
			
			btVoltar=new JButton();
			btVoltar.setText("Voltar");
			btVoltar.setFont(fonteMedia);
			btVoltar.setBorder(null);
			btVoltar.setFocusPainted(false);
			btVoltar.setContentAreaFilled(false);
			btVoltar.setBounds(5, 10, 50, 20);
			btVoltar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			add(btVoltar);
			
			btVoltar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					new EscolhaModo();
					dispose();
				}
			});
			

		}
	
		setVisible(true);
	}
	
	
}
