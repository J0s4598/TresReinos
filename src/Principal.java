import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		//Instanciar os 3 governantes
		Governante montante = new Governante("Montante", 5000, 4000, 20000, 0, 20000, 40000);
		Governante lenha = new Governante("Lenha", 500, 25000, 10000, 0, 0, 100000);		
		Governante clareza = new Governante("Clareza", 200, 7000, 120000, 5000, 10000, 0);
		
		
		//Lista de governantes
		ArrayList<Governante> governantes = new ArrayList<Governante>();
		governantes.add(montante);
		governantes.add(lenha);
		governantes.add(clareza);
		
		//Instanciar a classe Soluçao
		Solucao s = new Solucao();
		
		//Imprimir Resultado A
		System.out.println(s.getQtdeTotal("ouro", governantes));
		System.out.println(s.getQtdeTotal("madeira", governantes));
		System.out.println(s.getQtdeTotal("agua", governantes));
	
		//Imprimir Resultado B
		System.out.println(s.getQtdeFicarVivo("Montante", governantes));
		System.out.println(s.getQtdeFicarVivo("Lenha", governantes));
		System.out.println(s.getQtdeFicarVivo("Clareza", governantes));
		
		//Imprimir Resultado C
		System.out.println(s.cacularQtdeViagens("Montante", governantes) + " Viagens");
		System.out.println(s.cacularQtdeViagens("Lenha", governantes) + " Viagens");
		System.out.println(s.cacularQtdeViagens("Clareza", governantes) + " Viagens");
		
		
		
		
	}
	

}
