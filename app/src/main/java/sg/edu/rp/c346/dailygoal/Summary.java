package sg.edu.rp.c346.dailygoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array name "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv1 = findViewById(R.id.textView1);
        //Display the output on the TextView
        tv1.setText("Read up on materials before class: " + info[0] +
                "\n Arrive on time so as not to miss important part of the lesson:\n" + info[1] +
                "\n Attempt the problem myself: \n" + info[2] +
                "\n Reflection: \n" + info[3]);
    }
}
