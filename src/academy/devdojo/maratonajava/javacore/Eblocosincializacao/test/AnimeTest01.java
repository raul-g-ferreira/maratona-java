package academy.devdojo.maratonajava.javacore.Eblocosincializacao.test;


import academy.devdojo.maratonajava.javacore.Eblocosincializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
