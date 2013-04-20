package br.com.bibliotk.exceptions;

/**
 * @author ivanilson
 */
public class LivroNaoEncontradoException extends Exception {

    public LivroNaoEncontradoException() {
    
    }

    public LivroNaoEncontradoException(String msg) {
        super(msg);
    }
}
