package banco;

import java.util.ArrayList;
import java.util.Collections;

public class Banco {
	public int CalculaClientesEmEspera(int C, int N, ArrayList<String> tempos){
		if (N <= C){
			return 0;
		}
		else{
			int count = 0;
			int caixas = C - 1;
			ArrayList<Integer> termina = new ArrayList<Integer>();
			int atendimento = 0;
			int indiceMinimo = 0;
			
			int tempoChegada = Integer.parseInt(tempos.get(0).split(" ")[0]);
			int tempoAtendimento = Integer.parseInt(tempos.get(0).split(" ")[1]);
			
			termina.add(tempoChegada + tempoAtendimento);
			
			for(int i = 1; i < N; i++){
				termina.sort(null);
				
				while (termina.get(0) <= tempoChegada){
					termina.remove(0);
					caixas++;
					if (termina.isEmpty())
						break;
				}
				
				tempoChegada = Integer.parseInt(tempos.get(i).split(" ")[0]);
				tempoAtendimento = Integer.parseInt(tempos.get(i).split(" ")[1]);
				
				if (caixas > 1){
					caixas--;
					termina.add(tempoChegada + tempoAtendimento);
				}
				else{
					indiceMinimo = termina.indexOf(Collections.min(termina));
					atendimento = termina.indexOf(indiceMinimo);
					termina.remove(indiceMinimo);
					termina.add(atendimento + tempoAtendimento);
					if (atendimento - tempoChegada > 20)
						count++;
				}
			}
			
			return count;
		}
	}
}
