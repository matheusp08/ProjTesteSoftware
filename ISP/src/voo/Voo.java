package voo;

public class Voo {
	int duracao;
	int fuso;
	
	public String CalculaVoo(String pa, String cb, String pb, String ca){
		int mpa = Integer.parseInt(pa.split(":")[1]) + 60 * Integer.parseInt(pa.split(":")[0]);
		int mcb = Integer.parseInt(cb.split(":")[1]) + 60 * Integer.parseInt(cb.split(":")[0]);
		int mpb = Integer.parseInt(pb.split(":")[1]) + 60 * Integer.parseInt(pb.split(":")[0]);
		int mca = Integer.parseInt(ca.split(":")[1]) + 60 * Integer.parseInt(ca.split(":")[0]);
		
		int ida   = mcb - mpa;
		int volta = mca - mpb;
		this.fuso = (ida - volta)/2;
		this.duracao = ida - this.fuso;
		this.fuso = this.fuso/60;
		
		return this.duracao + " " + this.fuso;
	}
}
