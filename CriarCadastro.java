package Atividade1;

public class CriarCadastro {
	public static void main(String[] args) {
	
			
	Cadastro SportCarSP = new Cadastro ();
		SportCarSP.nome = "Sport Car";
		SportCarSP.estado = "São Paulo";
		SportCarSP.numeroFuncionario = "15";
		SportCarSP.faturamentoMensal = "650000.0";
			
			System.out.println("----------------------------");
			System.out.println("Nome: " + SportCarSP.nome);
			System.out.println("Estado: " + SportCarSP.estado);
			System.out.println("Número de Funcionários: " + SportCarSP.numeroFuncionario);
			System.out.println("Faturamento: " + SportCarSP.faturamentoMensal);
			
	
	Cadastro SportCarRJ= new Cadastro ();
		SportCarRJ.nome = "Sport Car";
		SportCarRJ.estado = "Rio de Janeiro";
		SportCarRJ.numeroFuncionario = "20";
		SportCarRJ.faturamentoMensal = "420000.0";
	
			System.out.println("----------------------------");
			System.out.println("Nome: " + SportCarRJ.nome);
			System.out.println("Estado: " + SportCarRJ.estado);
			System.out.println("Número de Funcionários: " + SportCarRJ.numeroFuncionario);
			System.out.println("Faturamento: " + SportCarRJ.faturamentoMensal);
		
	Cadastro SportCarBA= new Cadastro ();
		SportCarBA.nome = "Sport Car";
		SportCarBA.estado = "Bahia";
		SportCarBA.numeroFuncionario = "10";
		SportCarBA.faturamentoMensal = "180000.0";
			
			System.out.println("----------------------------");
			System.out.println("Nome: " + SportCarBA.nome);
			System.out.println("Estado: " + SportCarBA.estado);
			System.out.println("Número de Funcionários: " + SportCarBA.numeroFuncionario);
			System.out.println("Faturamento: " + SportCarBA.faturamentoMensal);
			System.out.println("----------------------------");
	
	}

}

	



