import java.util.ArrayList;

public class Solucao {
	
	//Metodo para questao A
	public int getQtdeTotal(String recurso, ArrayList<Governante> governantes){
		
		int resultado = 0;
		
		//Testar o tipo do recurso
		switch (recurso) {
		case "ouro":
			for (int x = 0; x < governantes.size(); x++) {
				resultado = resultado + governantes.get(x).getOuro();
				}
			return resultado;
			
		case "madeira":
			for (int y = 0; y < governantes.size(); y++) {
				resultado = resultado + governantes.get(y).getMadeira();
				}
			return resultado;
			
		case "agua":
			for (int z = 0; z < governantes.size(); z++) {
				resultado = resultado + governantes.get(z).getAgua();
				}
			return resultado;
			
		default:
			return resultado;
		}
	}
		
		//Metodo para resposta de questao B
		public String getQtdeFicarVivo(String nomeGovernante, ArrayList<Governante> governantes){
			String resultado = "";
			//Buscar o governante na lista com base no nome
			for (int i = 0; i < governantes.size(); i++) {
				if (governantes.get(i).getNome().equals(nomeGovernante)) {
					resultado = "Pedido do Governante: " + nomeGovernante + "\n" + 
							"Ouro: " + governantes.get(i).getPedidoOuro() + "\n" + 
							"Madeira: " + governantes.get(i).getPedidoMadeira() + "\n" +
							"Água: " + governantes.get(i).getPedidoAgua();
				}
			}
			return resultado;
		}

		
		//Metodo para resposta da questao c
		public int cacularQtdeViagens(String nomeGovernante, ArrayList<Governante> governantes){
			
			int resultado = 0;
			
			//Buscaro governante na lista com base no nome
			for (int i = 0; i < governantes.size(); i++) {
				if (governantes.get(i).getNome().equals(nomeGovernante)){
					resultado = (governantes.get(i).getPedidoOuro() / 50) + 
							(governantes.get(i).getPedidoMadeira() / 100) + 
							(governantes.get(i).getPedidoAgua() / 1000);
					
				}
				
			}
			
			return resultado;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}