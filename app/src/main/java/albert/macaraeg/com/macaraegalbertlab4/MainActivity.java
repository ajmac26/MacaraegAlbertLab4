package albert.macaraeg.com.macaraegalbertlab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    protected Button myButton1;
    String myString1 = "This is a Toast.";

    protected Button myButton2;
    String myString2 = "This is a Snackbar.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Main Activity","Inside OnCreateMethod");

        myButton1 = (Button)findViewById(R.id.button1);
        myButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),myString1,Toast.LENGTH_LONG).show();
            }
        });

        myButton2 = (Button)findViewById(R.id.button2);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view,myString2,Snackbar.LENGTH_LONG)
                        .setAction("Action",null).show();
            }
        });

    }




}