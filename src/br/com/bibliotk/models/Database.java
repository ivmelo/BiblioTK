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
            if(l.getId() == id) {
                return l;
            }
        }
        return null;
    }
    
    public static void setIndisponivel(int id){
        int length = livros.size();
        for(int i = 0; i < length; i++) {
            if(livros.get(i).getId() == id) {
                livros.get(i).setDisponivel(false);
                return;
            }
        }
    }
    
    public static void setDisponivel(int id){
        int length = livros.size();
        for(int i = 0; i < length; i++) {
            if(livros.get(i).getId() == id) {
                livros.get(i).setDisponivel(true);
                return;
            }
        }
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
            if(u.getId() == id) {
                return u;
            }
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
        emprestimo.setId(GeradorID.getIdEmprestimo());
        emprestimos.add(emprestimo);
    }
    
    public static void excluirEmprestimo(Emprestimo emprestimo){
        int length = emprestimos.size();
        for(int i = 0; i < length; i++) {
            if(emprestimos.get(i).equals(emprestimo)) {
                emprestimos.remove(i);
                return;
            }
        }
    }
    
    public static void excluirEmprestimoPorId(int id){
        int length = emprestimos.size();
        for(int i = 0; i < length; i++) {
            if(emprestimos.get(i).getId() == id) {
                emprestimos.remove(i);
                return;
            }
        }
    }
    
    public static Emprestimo encontrarEmprestimoIdEmprestimo(int idEmprestimo){
        for(Emprestimo e: emprestimos){
            if(e.getId() == idEmprestimo){
                return e;
            }
        }
        return null;
    }
    
    public static Emprestimo encontrarEmprestimoIdLivro(int idLivro){
        for(Emprestimo e: emprestimos){
            if(e.getLivro().getId() == idLivro) {
                return e;
            }
        }
        return null;
    }
    
}
