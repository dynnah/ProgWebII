package br.edu.ifpb.pweb2.pratica2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TreinoApp2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(TreinoSpringConfig.class);
		
		TreinamentoIntf treinamento = context.getBean("TreinamentoCrossFit",TreinamentoIntf.class);
		
		treinamento.fazTreinamento();
		
		context.close();

	}

}
