public class Worker extends Person{
    private String job;

    public Worker(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }
}
