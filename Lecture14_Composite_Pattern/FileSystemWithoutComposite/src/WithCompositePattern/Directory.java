package WithCompositePattern;
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    public String directoryName;
    public List<FileSystem> list = new ArrayList<>();
    public Directory(String directoryName){
        this.directoryName = directoryName;
    }
    public void ls(){
        System.out.println(this.directoryName+" -> ");
        for(FileSystem o : list){
            if(o instanceof File){
                ((File) o).ls();
            }
            else{
                ((Directory) o).ls();
            }
        }
    }

    @Override
    public String toString() {
        return directoryName;
    }
}
