package br.com.bibliotk.exceptions;

/**
 * @author ivanilson
 */
public class LivroNaoDisponivelException extends Exception {

    public LivroNaoDisponivelException() {
    
    }

    public LivroNaoDisponivelException(String msg) {
        super(msg);
    }
}
