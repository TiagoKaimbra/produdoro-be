package dev.wakandaacademy.produdoro.credencial.application.service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import jakarta.validation.Valid;

public interface CredencialApplicationService {

	void criarNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo);

}
