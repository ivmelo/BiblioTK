package br.com.bibliotk.exceptions;

/**
 * @author ivanilson
 */
public class UsuarioNaoAptoException extends Exception {
    
    public UsuarioNaoAptoException() {
        
    }

    public UsuarioNaoAptoException(String msg) {
        super(msg);
    }
}
