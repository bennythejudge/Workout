package android.benedetto.com.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        // get a reference to the detail fragment using the getSupportFragmentManager
        // because we are using the support library for appcompatibility
        WorkoutDetailFragment detail_fragment = (WorkoutDetailFragment) getSupportFragmentManager().
                findFragmentById(R.id.detail_fragment);

        // get the id from the intent and pass it to the fragment via the setWorkout()
        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        detail_fragment.setWorkoutId(workoutId);
    }
}
