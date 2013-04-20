package br.com.bibliotk.exceptions;

/**
 * @author ivanilson
 */
public class UsuarioNaoEncontradoException extends Exception {

    public UsuarioNaoEncontradoException() {
    
    }

    public UsuarioNaoEncontradoException(String msg) {
        super(msg);
    }
}
