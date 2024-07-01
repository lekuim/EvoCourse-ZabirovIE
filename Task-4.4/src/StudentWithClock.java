import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentWithClock implements Learner {
    private Learner learner;

    public StudentWithClock(Learner learner) {
        this.learner = learner;
    }


    @Override
    public void learn() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        learner.learn();
        System.out.println("Текущее время: " + sdf.format(date));
    }
}
