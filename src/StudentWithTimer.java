public class StudentWithTimer implements Learner {
    private Learner learner;

    public StudentWithTimer(Student learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        long start = System.currentTimeMillis();
        learner.learn();
        System.out.printf("Время учёбы: %s ms", System.currentTimeMillis() - start);
    }
}
