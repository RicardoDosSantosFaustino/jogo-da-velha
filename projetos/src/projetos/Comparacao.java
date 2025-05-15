package projetos;

import javax.swing.JButton;

public  class Comparacao  {
	JButton[] posi=new JButton[9];
	boolean testVitoria=false;
	String voltas2;
	
	public Comparacao(String valorX,String valorO,JButton esp,JButton esp2,JButton esp3,JButton esp4,JButton esp5,JButton esp6
			,JButton esp7,JButton esp8,JButton esp9,int voltas) {
		
		posi[0]=esp;
		posi[1]=esp2;
		posi[2]=esp3;
		posi[3]=esp4;
		posi[4]=esp5;
		posi[5]=esp6;
		posi[6]=esp7;
		posi[7]=esp8;
		posi[8]=esp9;
		
   //Condição de vitória na horizontal
   for(int i=0;i<7;i+=3) { 
		
		if(posi[i].getText()!=""&&posi[i+1].getText()!=""&&posi[i+2].getText()!="") {
			
			if((posi[i].getText().equals(posi[i+1].getText()))&&(posi[i+1].getText().equals(posi[i+2].getText()))) {
				testVitoria=true;
				new Decisao(true,posi[i].getText());
				break;
			}
		
		}
	}
	
	//Condição de vitória na vertical
	for(int i=0;i<3;i++) { 
		
		if(posi[i].getText()!=""&&posi[i+3].getText()!=""&&posi[i+6].getText()!="") {
			
			if((posi[i].getText().equals(posi[i+3].getText()))&&(posi[i+3].getText().equals(posi[i+6].getText()))) {
				testVitoria=true;
				 
				new Decisao(true,posi[i].getText());
				break;
			}
		}
	}
	
   //Condição de vitória na Diagonal
    for(int i=0;i<1;i++) { 
		
	 if(posi[i].getText()!=""&&posi[i+4].getText()!=""&&posi[i+8].getText()!="") {
			
		if((posi[i].getText().equals(posi[i+4].getText()))&&(posi[i+4].getText().equals(posi[i+8].getText()))) {
			testVitoria=true;
			new Decisao(true,posi[i].getText());
			break;
		}
	 }
		
	  if(posi[2].getText()!=""&&posi[4].getText()!=""&&posi[6].getText()!="") {
			
		 if((posi[2].getText().equals(posi[4].getText()))&&(posi[4].getText().equals(posi[6].getText()))) {
			testVitoria=true;
			new Decisao(true,posi[2].getText());
			break;
		  }
			
	  }
		
		
	}
	//Caso o jogo de empate 
	if(voltas>=9&&testVitoria==false) { 
		
		new Decisao(false,"");
		
	}
	

	
	}
	public boolean getTestVitoria() {
		return testVitoria;
	}
	
}
