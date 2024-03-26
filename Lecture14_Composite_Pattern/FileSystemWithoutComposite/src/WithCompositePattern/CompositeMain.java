package WithCompositePattern;
public class CompositeMain {
    public static void main(String[] args) {
        File tkss = new File("The Kapil Sharma Show");
        Directory netflix = new Directory("NetFlix");
        netflix.list.add(tkss);
        Directory comedy = new Directory("Comedy");
        File hungama = new File("Hungama");
        comedy.list.add(hungama);
        netflix.list.add(comedy);
        netflix.ls();
    }
}
