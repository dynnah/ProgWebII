package br.edu.ifpb.pweb2.pratica2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages= {"br.edu.ifpb.pweb2.pratica2"})
public class TreinoSpringConfig {

	@Bean
	public TreinoIntf TreinoFimTemporada() {
		return new TreinoFimTemporada();
	}

	@Bean
	public TreinamentoIntf TreinamentoCrossFit() {
		return (TreinamentoIntf) new TreinamentoCrossFit(TreinoFimTemporada());
	}


}
