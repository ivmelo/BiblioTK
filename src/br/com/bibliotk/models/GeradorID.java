/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliotk.controllers;

/**
 *
 * @author ivanilson
 */
public class GeradorID {
    public static int idUsuario = 0;
    public static int idLivro = 0;
    
    public static int getIdUsuario(){
        idUsuario++;
        return idUsuario;
    }
 
    public static int getIdLivro(){
        idLivro++;
        return idLivro;
    }
}
