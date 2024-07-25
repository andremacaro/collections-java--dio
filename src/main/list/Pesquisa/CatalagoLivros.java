package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> catalogo;

    public CatalagoLivros() {
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
                if(l.getAnoPublicacao() >= anoInicial || l.getAnoPublicacao() <= anoFinal){
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
}
