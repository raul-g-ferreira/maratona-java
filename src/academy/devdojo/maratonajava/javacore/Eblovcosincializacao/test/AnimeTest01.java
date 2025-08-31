package academy.devdojo.maratonajava.javacore.Eblovcosincializacao.test;


import academy.devdojo.maratonajava.javacore.Eblovcosincializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
