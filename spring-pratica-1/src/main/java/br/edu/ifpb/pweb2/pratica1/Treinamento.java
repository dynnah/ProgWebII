package br.edu.ifpb.pweb2.pratica1;

public class Treinamento implements TreinamentoIntf {

	private TreinoIntf treino;
	
	public Treinamento(TreinoIntf treino) {
		this.treino = treino;
	}
	
	public Treinamento() {}

	public TreinoIntf getTreino() {
		return treino;
	}

	public void setTreino(TreinoIntf treino) {
		this.treino = treino;
	}

	public void fazTreinamento() {
		
		System.out.println("Vamos l�, mo�ada, sem moleza!");
		System.out.println("Primeiro:");
		treino.preparoFisico();
		System.out.println("Agora quero:");
		treino.jogoTreino();
		System.out.println("Para terminar:");
		treino.treinoTatico();
		
	}
	
}
