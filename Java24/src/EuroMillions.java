import java.awt.BorderLayout;

import javax.swing.*;

public class EuroMillions extends JFrame {
	
	public EuroMillions() {
		super("Euro Milhões Probability Calculator");
    	setLookAndFeel();
    	setSize(800, 600);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    	
    	JLabel[] numRand = new JLabel[5];
    	JLabel[] estRand = new JLabel[2];
    		   	
    	for(int i = 0; i < numRand.length; i++ ){
    		double  rand = Math.floor( Math.random()*100-50 );
    		if (rand < 0)
    			rand = rand * -1;
    		numRand[i] = new JLabel();
    		numRand[i].setText(String.valueOf(rand));
    	}
    	
    	for(int i = 0; i < numRand.length; i++ ){
    		System.out.println(numRand[i].getText());
    		
    	}
    	
    	JPanel pane = new JPanel();
    	BorderLayout bord = new BorderLayout();
    	pane.setLayout(bord);
    	pane.add(numRand[1]);
    	add(pane);

    		
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exec) {
			//ignore error
		}
	
	}
	
	public static void main(String[] args) {
		RandomizeNum arr = new RandomizeNum();
		
		int[] randNum = arr.random(5,50);
	
		int[] randEst = arr.random(2,11);
		
		System.out.println("\n");
		
		for(int i = 0; i < randNum.length; i++)
			System.out.print(randNum[i] + " ");
		
		System.out.println("\n");
		for(int i = 0; i < randEst.length; i++)
			System.out.print(randEst[i] + " ");
		
	}

}
