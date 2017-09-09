package br.com.valdeir.springBoot.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class LivroNaoEcontradoException extends RuntimeException {
	
}
