package androidandjavatutorial.developer.surviving.com.androidandjavatutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start Java activity
        Button tj_btn_go = (Button) findViewById(R.id.button);
        tj_btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent JavaAct = new Intent(getApplicationContext(), Tjava.class);
                startActivity(JavaAct);
            }
        });

        // Start Android activity
        Button ta_btn_go = (Button) findViewById(R.id.button2);
        ta_btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AndrAct = new Intent(getApplicationContext(), Tandroid.class);
                startActivity(AndrAct);
            }
        });


    }
}
