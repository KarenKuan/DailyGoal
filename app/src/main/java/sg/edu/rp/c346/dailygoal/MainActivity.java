package sg.edu.rp.c346.dailygoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the button and set the OnClickListener
        Button btnOK = (Button) findViewById(R.id.buttonOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the RadioGroup object
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);
                // Get the comment that user keys in name
                EditText etComment = (EditText) findViewById(R.id.editTextComment);
                // Put the editText into an array
                String[] info = {etComment.getText().toString()};
                // Create an intent to start another activity called
                // Summary (which we would create Later)
                Intent i = new Intent(MainActivity.this, Summary.class);
                // Pass the String array holding the comment to new activity
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);
            }
        });
    }
}
