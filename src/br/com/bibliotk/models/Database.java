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
        livro.setId(GeradorID.getIdLivro());
        livros.add(livro);
    }
    
    public static void excluirLivro(int index) {
        livros.remove(index);
    }
    
    public static Livro encontrarLivro(int id) {
        for(Livro l : livros) {
            if(l.getId() == id) return l;
        }
        return null;
    }
    
    
    /**
     * Usuarios
     */
    
    public static void addUsuario(Usuario usuario) {
        usuario.setId(GeradorID.getIdUsuario());
        usuarios.add(usuario);
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public static void excluirUsuario(int index) {
        usuarios.remove(index);
    }
    
    public static Usuario encontrarUsuario(int id) {
        for(Usuario u : usuarios) {
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
    
    public static void addEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }
    
    
}
