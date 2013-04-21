package br.com.bibliotk.models;

import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class Database {
    
    private static ArrayList<Livro> livros = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    
    
    /**
     * Livros
     */
    
    public static ArrayList<Livro> getLivros() {
        return livros;
    }
    
    public static void addLivro(Livro livro) {
        Database.livros.add(livro);
    }
    
    public static void excluirLivro(int index) {
        Database.livros.remove(index);
    }
    
    public static Livro encontrarLivro(int id) {
        for(Livro l : Database.livros) {
            if(l.getId() == id) return l;
        }
        return null;
    }
    
    
    /**
     * Usuarios
     */
    
    public static void addUsuario(Usuario usuario) {
        // Pega id do usuário da classe GeradorID
        usuario.setId(GeradorID.getIdUsuario());
        Database.usuarios.add(usuario);
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public static void excluirUsuario(int index) {
        Database.usuarios.remove(index);
    }
    
    public static Usuario encontrarUsuario(int id) {
        for(Usuario u : Database.usuarios) {
            if(u.getId() == id) return u;
        }
        return null;
    }
    
    
    /**
     * Emprestimos
     */

    public static ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }    
    
    
}
