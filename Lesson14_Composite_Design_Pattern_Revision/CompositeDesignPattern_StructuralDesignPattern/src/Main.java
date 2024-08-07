import WithCompositePattern.FileSystem;
import WithoutCompositePattern.Directory;
import WithoutCompositePattern.File;

public class Main {
    public static void main(String[] args) {
        Directory movie = new Directory("Movie");
        Directory actionMovie = new Directory("Action");
        actionMovie.childs.add(new File("Jawaan"));
        Directory comedyMovie = new Directory("Comedy");
        comedyMovie.childs.add(new File("Hulchul"));
        movie.childs.add(comedyMovie);
        movie.childs.add(actionMovie);
        movie.ls();
        WithCompositePattern.Directory songs = new WithCompositePattern.Directory("Songs");
        WithCompositePattern.Directory bhakti = new WithCompositePattern.Directory("Bhakti");
        bhakti.directoryList.add(new WithCompositePattern.File("Namo Namo"));
        songs.directoryList.add(bhakti);
        WithCompositePattern.Directory romantic = new WithCompositePattern.Directory("Romantic");
        romantic.directoryList.add(new WithCompositePattern.File("Ae Dil Hai Mushkil"));
        songs.directoryList.add(romantic);
        songs.ls();

    }
}