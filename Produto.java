
public class Produto {
	
	private String Descricao;
	private double Preco;
	
	
    public void DescricaoComboMaster(String Descricao, int Preco) {
		
    	System.out.println("1. Combo Master \nEsse combo contem " + Descricao + "\nPreco: " + Preco);
	}
    
    public void DescricaoSuperCombo(String Descricao, double Preco) {
		
		System.out.println("2. Super Combo \nEsse combo contem " + Descricao + "\nPreco: " + Preco);

		
	}

	
	

}
