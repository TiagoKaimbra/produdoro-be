package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;
import lombok.Value;

@Value
public class ConfiguracaoUsuarioResponse {

	private final Integer tempoMinutosFoco;
	private final Integer tempoMinutosPausaCurta;
	private final Integer tempoMinutosPausaLonga;
	private final Integer repeticoesParaPausaLonga;
	
	public ConfiguracaoUsuarioResponse(ConfiguracaoUsuario configuracaoUsuario) {
		this.tempoMinutosFoco = configuracaoUsuario.getTempoMinutosFoco();
		this.tempoMinutosPausaCurta = configuracaoUsuario.getTempoMinutosPausaCurta();
		this.tempoMinutosPausaLonga = configuracaoUsuario.getTempoMinutosPausaLonga();
		this.repeticoesParaPausaLonga = configuracaoUsuario.getRepeticoesParaPausaLonga();
	}
}
