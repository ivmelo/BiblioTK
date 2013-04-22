/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliotk.exceptions;

/**
 *
 * @author rafael
 */
public class RegistroNaoEncontradoException extends Exception {
    public RegistroNaoEncontradoException() {
    
    }
    
    public RegistroNaoEncontradoException(String msg) {
        super(msg);
    }
}
