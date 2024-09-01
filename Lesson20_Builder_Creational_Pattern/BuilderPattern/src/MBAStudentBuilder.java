import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    public StudentBuilder setSubjects(){
        List<String> subs = new ArrayList<>();
        subs.add("Micro Econimics");
        subs.add("Business Studies");
        subs.add("Operation Management");
        this.subjects = subs;
        return this;
    }
}
