package janela;

import java.util.Scanner;

public class Janela2 {
	
	public static int calculaJanela(int p1, int p2, int p3){
		int i, soma =0;
		int [] centimetros = new int[600];
        
		for(i=0;i<600;i++){
            centimetros[i] = 0;
        }
        
        for(i=p1;i<p1+200;i++){
            centimetros[i] = 1;
        }
        
        for(i=p2;i<=p2+200;i++){
            centimetros[i] = 1;
        }
        
        for(i=p3;i<p3+200;i++){
            centimetros[i] = 1;
        }
        
        for(i=1;i<600;i++){
            if(centimetros[i]==1)
            	soma++;
        }
        
        return soma*100;
	}

    public static void main(String[] args) {
        
        int p1, p2, p3;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        String valor = entrada.nextLine();
        entrada.close();
        
        String [] posicao = valor.split(" ");
        p1 = Integer.parseInt(posicao[0]);
        p2 = Integer.parseInt(posicao[1]);
        p3 = Integer.parseInt(posicao[2]);
        
        System.out.println(Janela2.calculaJanela(p1, p2, p3));
        
    }

}
