/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliotk.models;

/**
 *
 * @author ivanilson
 */
public class GeradorID {
    public static int idUsuario    = 0;
    public static int idLivro      = 0;
    public static int idEmprestimo = 0;
    
    public static int getIdUsuario(){
        return idUsuario++;
    }
 
    public static int getIdLivro(){
        return idLivro++;
    }
 
    public static int getIdEmprestimo(){
        return idEmprestimo++;
    }
}
