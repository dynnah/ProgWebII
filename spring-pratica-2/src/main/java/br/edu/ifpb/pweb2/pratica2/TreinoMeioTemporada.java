package br.edu.ifpb.pweb2.pratica2;

import org.springframework.stereotype.Component;

@Component
public class TreinoMeioTemporada implements TreinoIntf{

	public void preparoFisico() {
		System.out.println("Corrida intensa de 120 minutos.");
	}

	public void jogoTreino() {
		System.out.println("Jogo com a equipe principal.");
	}

	public void treinoTatico() {
		System.out.println("Cobrança de pênaltis.");
	}

}
