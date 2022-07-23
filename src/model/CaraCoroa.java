package model;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.lang.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import java.util.Random;

	public class CaraCoroa extends JFrame implements KeyListener{
	   
	  Random random = new Random();

	  //Carregar os caminhos no imagesIcon
    
	  //fundo
  	ImageIcon iconFundo = new ImageIcon(getClass().getResource("/images/fundo.png"));
  	JLabel fundo = new JLabel(iconFundo);

  	ImageIcon iconCara = new ImageIcon(getClass().getResource("/images/cara.png"));
  	ImageIcon iconCoroa = new ImageIcon(getClass().getResource("/images/coroa.png"));

  	//moeda girando

  	ImageIcon iconcaraCoroa = new ImageIcon(getClass().getResource("/images/caraCoroa.gif"));	
  	JLabel caraCoroa = new JLabel(iconcaraCoroa);


  	public CaraCoroa(){
  	componentes();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	this.setTitle("Game Cara ou Coroa");
    this.setSize(300,300);
  	this.setLocationRelativeTo(null);
  	this.setResizable(false);
	  this.setLayout(null);
	  this.addKeyListener(this);
	  add(caraCoroa);
	  add(fundo);
	  this.setVisible(true);
  	}
    
		@Override
		public void keyTyped(KeyEvent e) {
       // TODO Auto-generated method stub
		}

		@Override
		public void keyPressed(KeyEvent e) {
		   // TODO Auto-generated method stub
		   boolean n1 = random.nextBoolean();
		  	if(n1){
		    caraCoroa.setIcon(iconCara);
	    	}else {
	    	caraCoroa.setIcon(iconCoroa);
    		}
			}

		@Override
		public void keyReleased(KeyEvent e) {
		   // TODO Auto-generated method stub
		   // System.out.println("Tecla: "+e.getKeyChar());
		   // System.out.println("Tecla: "+e.getKeyCode());
      
			 tempo(1000);
		   caraCoroa.setIcon(iconcaraCoroa);

					
		}
    
    //Thread para da tempo do usuario ver a moeda que caiu 
	public void tempo(int n){
		try   {
                Thread.sleep(n);
		} 
		catch(InterruptedException ex) {
    		Thread.currentThread().interrupt();
		}
	}
	
	public void componentes(){
	
	fundo.setBounds(0,0,300,300);
	caraCoroa.setBounds(40,40,200,161);

  }
 }
