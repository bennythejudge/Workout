package android.benedetto.com.workout;

public class Workout {

    private String name;
    private String description;

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static final Workout[] workouts = {
            new Workout("workout eent", "workout eent description\nline two\nline three"),
            new Workout("workout zwee", "workout zwee description\nline two\nline three"),
            new Workout("workout dräi", "workout dräi description\nline two\nline three"),
            new Workout("workout veier", "workout veier description\nline two\nline three"),
            new Workout("workout fënnef", "workout fënnef description\nline two\nline three"),
            new Workout("workout fënnef", "workout fënnef description\nline two\nline three")
    };

    // getter and setter


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "Workout{" +
                "name='" + name;
    }
}
