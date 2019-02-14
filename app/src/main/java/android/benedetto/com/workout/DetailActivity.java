package android.benedetto.com.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        // get a reference to the detail fragment using the getSupportFragmentManager
        // because we are using the support library for appcompatibility
        WorkoutDetailFragment detail_fragment = (WorkoutDetailFragment) getSupportFragmentManager().
                findFragmentById(R.id.detail_fragment);
        detail_fragment.setWorkoutId(0);
    }
}
