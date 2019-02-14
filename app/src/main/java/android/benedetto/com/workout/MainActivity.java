package android.benedetto.com.workout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // if the button is pressed, we start the DetailActivity using an Intent
//    public void onShowDetails(View view) {
//        Intent intent = new Intent(this, DetailActivity.class);
//        startActivity(intent);
//    }

    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID, (int) id);
        startActivity(intent);
    }
}
