package WithCompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    public List<FileSystem> directoryList;
    public Directory(String directoryName){
        this.directoryName = directoryName;
        this.directoryList = new ArrayList<>();
    }

    @Override
    public void ls() {
        System.out.print(directoryName+"->");
        for(FileSystem fileSystem : directoryList){
            fileSystem.ls();
        }
    }
}
