 import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {

public static void main(String[] args) {
	Combo combo = new Combo();
	String num ;

System.out.println("Selecione seu combo");

System.out.println("1. Combo Master \n");
combo.ComboMaster();

System.out.println("2. Super Combo \n");
combo.SuperCombo();

System.out.println("Sua escolha:  \n ");

 num = JOptionPane.showInputDialog("Digite o numero do combo:");




 switch(num){
 
 case"1":
	 
	 combo.ComboMaster();
	 break;

 case "2":
	 combo.SuperCombo();
	 break;
 }



}

}
