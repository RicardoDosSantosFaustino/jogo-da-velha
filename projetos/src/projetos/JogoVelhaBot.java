package projetos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import java.util.Random;

public class JogoVelhaBot extends JFrame {
	
	private JButton esp,esp2,esp3,esp4,esp5,esp6,esp7,esp8,esp9;
	private JLabel lbTitulo, lbFormaJ1,lbFormaJ2; 
	
	int i=0,elementoEsquerda=55,elementoDireita=150,elementoMeio=102,
			alturaSuperior=45,alturaMeio=95,alturaInferior=142;
	
	final int TAM=10;
	
	
	public JogoVelhaBot(String jogador1, String jogador2) { 

		
		Font fonteGrande =new Font("SansSerif",Font.BOLD,19);
		Font fonteMedia =new Font("SansSerif",Font.BOLD,14);
		Font fontePequena =new Font("SansSerif",Font.BOLD,12);
		MatteBorder borda =BorderFactory.createMatteBorder(0,0,3,3, Color.BLACK );
		MatteBorder bordaMeio =BorderFactory.createMatteBorder(0,0,3,0, Color.BLACK );
		MatteBorder bordaUltima =BorderFactory.createMatteBorder(0,3,3,0, Color.BLACK );
		MatteBorder bordaDireita =BorderFactory.createMatteBorder(0,0,0,3, Color.BLACK );	
		MatteBorder bordaEsquerda =BorderFactory.createMatteBorder(0,3,0,0, Color.BLACK );	
		MatteBorder bordaEmCima =BorderFactory.createMatteBorder(3,0,0,0, Color.BLACK );	
		JButton [] botoes=new JButton[9];
		Random aleatorio=new Random();
			
				
		
		setTitle("Jogo da velha com bot");
		setSize(270,250); 
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
	
		esp=new JButton();
		esp.setText("");
		esp.setBounds(elementoEsquerda,alturaSuperior,50,50);
		esp.setFont(fonteGrande);
		esp.setBorder(borda);
		esp.setContentAreaFilled(false);
		esp.setFocusPainted(false);
		esp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(esp);
		
		esp.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			esp.setText(jogador1);

			if(i<4) {
				while (true) {
				    int a = aleatorio.nextInt(9); 

				    if (botoes[a].getText().equals("")) {
				        botoes[a].setText(jogador2);
				        botoes[a].setEnabled(false);
				        
				        break; 
				    } else {
				        
				    }
				}
			}
				
				esp.setEnabled(false);
				i+=1;	
			
				if(	new Comparacao(jogador1,jogador2, esp, esp2, esp3, esp4, esp5, esp6, esp7, esp8, esp9,i).getTestVitoria()) {
				
					
					setVisible(false);
					}else  if(i>=5){ 
						new ComparacaoBot(i);
						setVisible(false);
					}
			
			} 
			
		});
		
		esp4=new JButton();
		esp4.setText("");
		esp4.setBounds(elementoEsquerda,alturaMeio,50,50);
		esp4.setFont(fonteGrande);
		esp4.setBorder(borda);
		esp4.setContentAreaFilled(false);
		esp4.setFocusPainted(false);
		esp4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(esp4);
		
		esp4.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
				esp4.setText(jogador1);

			if(i<4) {
				while (true) {
				    int a = aleatorio.nextInt(9); 

				    if (botoes[a].getText().equals("")) {
				        botoes[a].setText(jogador2);
				        botoes[a].setEnabled(false);
				        
				        break; 
				    } else {
				        
				    }
				}
				
			}

				i+=1;
				esp4.setEnabled(false);	
				
				if(	new Comparacao(jogador1,jogador2, esp, esp2, esp3, esp4, esp5, esp6, esp7, esp8, esp9,i).getTestVitoria()) {
				
				
					setVisible(false);
					}else  if(i>=5){ 
						new ComparacaoBot(i);
						setVisible(false);
					}
			
			} 
			
		});
	//A posição desse é diferente por que ele quando eu coloco a mesma medida q os outros elementos ele fica torto
		esp5=new JButton();
		esp5.setText("");
		esp5.setBounds(elementoMeio,92,50,50);
		esp5.setFont(fonteGrande);
		esp5.setBorder(null);
		esp5.setContentAreaFilled(false);
		esp5.setFocusPainted(false);
		esp5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(esp5);
		
		esp5.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			esp5.setText(jogador1);

			if(i<4) {
				while (true) {
				    int a = aleatorio.nextInt(9); 

				    if (botoes[a].getText().equals("")) {
				        botoes[a].setText(jogador2);
				        botoes[a].setEnabled(false);
				        
				        break; 
				    } else {
				       
				    }
				}
			}

				i+=1;
				esp5.setEnabled(false);
				
				if(	new Comparacao(jogador1,jogador2, esp, esp2, esp3, esp4, esp5, esp6, esp7, esp8, esp9,i).getTestVitoria()) {
				
					setVisible(false);
					}else  if(i>=5) { 
						new ComparacaoBot(i);
						setVisible(false);
					}
			
			} 
			
		});
		esp2=new JButton();
		esp2.setText("");
		esp2.setBounds(elementoMeio,alturaSuperior,50,50);
		esp2.setFont(fonteGrande);
		esp2.setBorder(bordaMeio);
		esp2.setContentAreaFilled(false);
		esp2.setFocusPainted(false);
		esp2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(esp2);
		
		esp2.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			esp2.setText(jogador1);

			if(i<4) {
				while (true) {
				    int a = aleatorio.nextInt(9); 

				    if (botoes[a].getText().equals("")) {
				        botoes[a].setText(jogador2);
				        botoes[a].setEnabled(false);
				        
				        break; 
				    } else {
				        
				    }
				 }
		   	}

				i+=1;
				esp2.setEnabled(false);
				
				if(	new Comparacao(jogador1,jogador2, esp, esp2, esp3, esp4, esp5, esp6, esp7, esp8, esp9,i).getTestVitoria()) {
				
					setVisible(false);
					
					}else  if(i>=5){ 
						new ComparacaoBot(i);
						setVisible(false);
					}
			
			} 
			
		});
		esp3=new JButton();
		esp3.setText("");
		esp3.setBounds(elementoDireita,alturaSuperior,50,50);
		esp3.setFont(fonteGrande);
		esp3.setBorder(bordaUltima);
		esp3.setContentAreaFilled(false);
		esp3.setFocusPainted(false);
		esp3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(esp3);
		
		esp3.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			esp3.setText(jogador1);

			if(i<4) {
				while (true) {
				    int a = aleatorio.nextInt(9); 

				    if (botoes[a].getText().equals("")) {
				        botoes[a].setText(jogador2);
				        botoes[a].setEnabled(false);
				        
				        break; 
				    } else {
				        
				    }
				}
			}

				i+=1;
				esp3.setEnabled(false);	
				
				if(	new Comparacao(jogador1,jogador2, esp, esp2, esp3, esp4, esp5, esp6, esp7, esp8, esp9,i).getTestVitoria()) {
				
					setVisible(false);
					}else  if(i>=5){ 
						new ComparacaoBot(i);
						setVisible(false);
					}
				
			} 
			
		});
		esp6=new JButton();
		esp6.setText("");
		esp6.setBounds(elementoDireita,alturaMeio,50,50);
		esp6.setFont(fonteGrande);
		esp6.setBorder(bordaUltima);
		esp6.setContentAreaFilled(false);
		esp6.setFocusPainted(false);
		esp6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(esp6);
		
		esp6.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			esp6.setText(jogador1);
			
			if(i<4) {
				while (true) {
				    int a = aleatorio.nextInt(9); 

				    if (botoes[a].getText().equals("")) {
				        botoes[a].setText(jogador2);
				        botoes[a].setEnabled(false);
				        
				        break; 
				    } else {
				        
				    }
				}
			}

				i+=1;
				esp6.setEnabled(false);
	
				if(	new Comparacao(jogador1,jogador2, esp, esp2, esp3, esp4, esp5, esp6, esp7, esp8, esp9,i).getTestVitoria()) {
				
					setVisible(false);
					}else  if(i>=5){ 
						new ComparacaoBot(i);
						setVisible(false);
					}
			
			} 
			
		});
		esp7=new JButton();
		esp7.setText("");
		esp7.setBounds(elementoEsquerda,alturaInferior,50,50);
		esp7.setFont(fonteGrande);
		esp7.setBorder(bordaDireita);
		esp7.setContentAreaFilled(false);
		esp7.setFocusPainted(false);
		esp7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(esp7);
		
		esp7.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			esp7.setText(jogador1);
			
            if(i<4) {
				while (true) {
				    int a = aleatorio.nextInt(9); 

				    if (botoes[a].getText().equals("")) {
				        botoes[a].setText(jogador2);
				        botoes[a].setEnabled(false);
				        
				        break; 
				    } else {
				        
				    }
				}
             }

				i+=1;
				esp7.setEnabled(false);
				
				if(	new Comparacao(jogador1,jogador2, esp, esp2, esp3, esp4, esp5, esp6, esp7, esp8, esp9,i).getTestVitoria()) {
					
					setVisible(false);
					}else if(i>=5) { 
						new ComparacaoBot(i);
						setVisible(false);
					}
			
			} 
			
		});
		esp8=new JButton();
		esp8.setText("");
		esp8.setBounds(elementoMeio,alturaInferior,50,50);
		esp8.setFont(fonteGrande);
		esp8.setBorder(bordaEmCima);
		esp8.setContentAreaFilled(false);
		esp8.setFocusPainted(false);
		esp8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(esp8);
		
		esp8.addActionListener(new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				
			esp8.setText(jogador1);
				
			if(i<4) {
				while (true) {
				    int a = aleatorio.nextInt(9); 

				    if (botoes[a].getText().equals("")) {
				        botoes[a].setText(jogador2);
				        botoes[a].setEnabled(false);
				        
				        break; 
				    } else {
				        
				    }
				}
			}

				i+=1;
				esp8.setEnabled(false);
				if(	new Comparacao(jogador1,jogador2, esp, esp2, esp3, esp4, esp5, esp6, esp7, esp8, esp9,i).getTestVitoria()) {
			
					setVisible(false);
					}else  if(i>=5) { 
						new ComparacaoBot(i);
						setVisible(false);
					}
			
				
			} 
			
		});
		esp9=new JButton();
		esp9.setText("");
		esp9.setBounds(elementoDireita,alturaInferior,50,50);
		esp9.setFont(fonteGrande);
		esp9.setBorder(bordaEsquerda);
		esp9.setContentAreaFilled(false);
		esp9.setFocusPainted(false);
		esp9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(esp9);
		
		esp9.addActionListener(new ActionListener() {

			

			@Override
		public void actionPerformed(ActionEvent e) {
				
			esp9.setText(jogador1);
				
			if(i<4) {
				while (true) {
				    int a = aleatorio.nextInt(9); 

				    if (botoes[a].getText().equals("")) {
				        botoes[a].setText(jogador2);
				        botoes[a].setEnabled(false);
				        
				        break; 
				    } else {
				        
				    }
				}
			}
				i+=1;
				esp9.setEnabled(false);
				if(	new Comparacao(jogador1,jogador2, esp, esp2, esp3, esp4, esp5, esp6, esp7, esp8, esp9,i).getTestVitoria()) {
				

					setVisible(false);
					
					}else  if(i>=5){ 
						new ComparacaoBot(i);
						setVisible(false);
					}
			
				
			} 
				
		});
		botoes[0]=esp;
		botoes[1]=esp2;
		botoes[2]=esp3;
		botoes[3]=esp4;
		botoes[4]=esp5;
		botoes[5]=esp6;
		botoes[6]=esp7;
		botoes[7]=esp8;
		botoes[8]=esp9;
	
	
		setVisible(true);
		
	}
	

	}

