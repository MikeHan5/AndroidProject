package garyszetobcit.comp3717project;

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
    }
    public void startNewTask(View view){
        startActivity(new Intent(getApplicationContext(), newTaskActivity.class));
    }
    public void chooseDate(View view){
        startActivity(new Intent(getApplicationContext(),chooseDate.class));
    }

}
