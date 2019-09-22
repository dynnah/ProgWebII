package br.edu.ifpb.pweb2.pratica2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Treinamento implements TreinamentoIntf {

	private TreinoIntf treino;
	
	public Treinamento(TreinoIntf treino) {
		this.treino = treino;
	}
	
	public Treinamento() {}

	public TreinoIntf getTreino() {
		return treino;
	}

	@Autowired
	@Qualifier("treinoMeioTemporada")
	public void setTreino(TreinoIntf treino) {
		this.treino = treino;
	}

	public void fazTreinamento() {
		
		System.out.println("Vamos lá, moçada, sem moleza!");
		System.out.println("Primeiro:");
		treino.preparoFisico();
		System.out.println("Agora quero:");
		treino.jogoTreino();
		System.out.println("Para terminar:");
		treino.treinoTatico();
		
	}
	
}
