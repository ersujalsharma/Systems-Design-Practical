package WithoutCompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    public List<Object> childs;
    public Directory(String name){
        directoryName = name;
        childs = new ArrayList<>();
    }
    public void ls(){
        System.out.print(directoryName+"->");
        for(Object o : childs){
            if(o instanceof Directory){
                ((Directory) o).ls();
            }
            else{
                ((File) o).ls();
            }
        }
    }
}
