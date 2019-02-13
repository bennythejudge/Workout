package android.benedetto.com.workout;

public class Workout {

    private String name;
    private String description;

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static final Workout[] workouts = {
            new Workout("workout eent", "workout eent description"),
            new Workout("workout zwee", "workout zwee description"),
            new Workout("workout dräi", "workout dräi description"),
            new Workout("workout veier", "workout veier description"),
            new Workout("workout fënnef", "workout fënnef description"),
            new Workout("workout fënnef", "workout fënnef description")
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
