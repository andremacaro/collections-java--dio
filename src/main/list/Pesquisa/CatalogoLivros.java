package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosDeMesmoAutor = new ArrayList<>();
        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosDeMesmoAutor.add(l);
                }
            }
        }
        return livrosDeMesmoAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();

        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro1", "Autor5", 1999);
        catalogoLivros.adicionarLivro("Livro1", "Autor1", 1999);
        catalogoLivros.adicionarLivro("Livro2", "Autor5", 2010);
        catalogoLivros.adicionarLivro("Livro3", "Autor3", 2001);
        catalogoLivros.adicionarLivro("Livro4", "Autor4", 1970);


        System.out.println(catalogoLivros.pesquisarPorAutor("Autor5"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2001, 2003));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro1"));
    }
}

