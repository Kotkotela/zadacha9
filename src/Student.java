import java.util.stream.IntStream;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Student implements Learner {
    @Override
    public void learn() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = formatter.format(currentTime);
        System.out.println(formattedTime);
        System.out.println("Я учусь. .zZ");
        IntStream.range(0, 1000000).forEach(i -> Math.log(i));
        System.out.println("Я закончил учиться");
    }
}
