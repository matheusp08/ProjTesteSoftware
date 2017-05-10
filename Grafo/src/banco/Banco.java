package banco;

import java.util.ArrayList;
import java.util.Collections;

public class Banco {
	public int CalculaClientesEmEspera(int C, int N, ArrayList<String> tempos){
		System.out.print("[1-");
		if (N <= C){
			System.out.print("2]");
			return 0;
		}
		else{
			System.out.print("3-");
			int count = 0;
			int caixas = C - 1;
			ArrayList<Integer> termina = new ArrayList<Integer>();
			int atendimento = 0;
			int indiceMinimo = 0;
			
			int tempoChegada = Integer.parseInt(tempos.get(0).split(" ")[0]);
			int tempoAtendimento = Integer.parseInt(tempos.get(0).split(" ")[1]);
			
			termina.add(tempoChegada + tempoAtendimento);
			
			System.out.print("4-");
			for(int i = 1; i < N; i++){
				System.out.print("6-");
				termina.sort(null);
				
				System.out.print("7-");
				while (termina.get(0) <= tempoChegada){
					termina.remove(0);
					caixas++;
					System.out.print("8-");
					if (termina.isEmpty()){
						System.out.print("9-");
						break;
					}
					System.out.print("7-");
				}
				
				tempoChegada = Integer.parseInt(tempos.get(i).split(" ")[0]);
				tempoAtendimento = Integer.parseInt(tempos.get(i).split(" ")[1]);
				System.out.print("10-");
				if (caixas > 1){
					System.out.print("11-");
					caixas--;
					termina.add(tempoChegada + tempoAtendimento);
				}
				else{
					indiceMinimo = termina.indexOf(Collections.min(termina));
					atendimento = termina.indexOf(indiceMinimo);
					termina.remove(indiceMinimo);
					termina.add(atendimento + tempoAtendimento);
					System.out.print("12-");
					if (atendimento - tempoChegada > 20){
						System.out.print("13-");
						count++;
					}
				}
				System.out.print("14-4-");
			}
			System.out.print("5]");
			return count;
		}
	}
}
