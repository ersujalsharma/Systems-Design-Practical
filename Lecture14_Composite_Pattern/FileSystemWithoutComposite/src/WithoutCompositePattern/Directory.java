package WithoutCompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    public String directoryName;
    public List<Object> list = new ArrayList<>();
    public Directory(String directoryName){
        this.directoryName = directoryName;
    }
    public void ls(){
        System.out.println(this.directoryName+" -> ");
        for(Object o : list){
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
