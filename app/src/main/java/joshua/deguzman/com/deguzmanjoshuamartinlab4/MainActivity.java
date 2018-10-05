package joshua.deguzman.com.deguzmanjoshuamartinlab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastButton = findViewById(R.id.backButton);
        Button snackButton = findViewById(R.id.nextButton);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "Back button pressed!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });

        snackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = findViewById(R.id.main_layout);
                String message = "Next button pressed!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackBar(view, message, duration);
            }
        });
    }

    public void showSnackBar(View view, String message, int duration){
        final Snackbar snackbar = Snackbar.make(view, message, duration);
        snackbar.setAction("Dismiss", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LAB4", "onStart() have executed");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LAB4", "onResume() have executed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("LAB4", "onPause() have executed");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LAB4", "onStop() have executed");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LAB4", "onDestroy() has executed");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LAB4", "onRestart() has executed");
    }

}

