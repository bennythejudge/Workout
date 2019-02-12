package android.benedetto.com.workout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // if the button is pressed, we start the DetailActivity using an Intent
    public void onShowDetails(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}
