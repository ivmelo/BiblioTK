package br.com.bibliotk.models;

import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class Database {
    
    private static ArrayList<Livro> livros = new ArrayList<Livro>();
    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
    
    public static ArrayList<Livro> getLivros() {
        return livros;
    }
    
    public static void addLivro(Livro livro) {
        Database.livros.add(livro);
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public static void addUsuario(Usuario usuario) {
        usuario.setId(Database.usuarios.size());
        Database.usuarios.add(usuario);
    }
    
}
