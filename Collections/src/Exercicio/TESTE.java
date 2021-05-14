package Exercicio;

import java.util.*;

public class TESTE {
	public static void main(String[] args) {

		List<Double> Emp1 = new ArrayList<Double>();
		List<Double> Emp2 = new ArrayList<Double>();

		Emp1.add(12.4);
		Emp1.add(16.2);

		Emp2.add(10.6);
		Emp2.add(22.2);

		List<List> empresas = new ArrayList<List>();
		empresas.add(Emp1);
		empresas.add(Emp2);

		Iterator<List> it = empresas.iterator();
		while (it.hasNext()) {
			System.out.println("Empresa: " + it.next());
			/*
			 * exibiu: Empresa: [12.4, 16.2] Empresa: [10.6, 22.2]
			 * 
			 * Agora que vem o problema(rs), eu tento resgatar cada numero individualmente e
			 * nao consigo, tentei fazendo dentro do loop, criando outro loop:
			 */

			Iterator<List> itD = it.next().iterator();
			while (itD.hasNext()) {
				System.out.println(itD.next());
			}

		}
	}
}