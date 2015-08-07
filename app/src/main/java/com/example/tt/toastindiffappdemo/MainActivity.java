package com.example.tt.toastindiffappdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToastTopLeft(View view) {
        EditText e1 = (EditText) findViewById(R.id.editText1);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        if (e1.getText().toString().trim().length() > 0 &&
                e2.getText().toString().trim().length() > 0) {
            String editT1 = e1.getText().toString();
            String editT2 = e2.getText().toString();
            int xOffSet = Integer.parseInt(editT1);
            int yOffSet = Integer.parseInt(editT2);

            Toast toast = Toast.makeText(getApplicationContext(), "Hello Toast", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP| Gravity.LEFT, xOffSet, yOffSet);
            toast.show();
        } else {
            Toast.makeText(getApplicationContext(),"Please enter xOffSet & yOffSet",Toast.LENGTH_SHORT).show();
        }
    }
    public void showToastTopRight(View view) {
        EditText e1 = (EditText) findViewById(R.id.editText1);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        if (e1.getText().toString().trim().length() > 0 &&
                e2.getText().toString().trim().length() > 0) {
            String editT1 = e1.getText().toString();
            String editT2 = e2.getText().toString();
            int xOffSet = Integer.parseInt(editT1);
            int yOffSet = Integer.parseInt(editT2);

            Toast toast = Toast.makeText(getApplicationContext(), "Hello Toast", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP | Gravity.RIGHT, xOffSet, yOffSet);
            toast.show();
        } else {
            Toast.makeText(getApplicationContext(),"Please enter xOffSet & yOffSet",Toast.LENGTH_SHORT).show();
        }
    }
    public void showToastBottomLeft(View view) {
        EditText e1 = (EditText) findViewById(R.id.editText1);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        if (e1.getText().toString().trim().length() > 0 &&
                e2.getText().toString().trim().length() > 0) {
            String editT1 = e1.getText().toString();
            String editT2 = e2.getText().toString();
            int xOffSet = Integer.parseInt(editT1);
            int yOffSet = Integer.parseInt(editT2);

            Toast toast = Toast.makeText(getApplicationContext(), "Hello Toast", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, xOffSet, yOffSet);
            toast.show();
        } else {
            Toast.makeText(getApplicationContext(),"Please enter xOffSet & yOffSet",Toast.LENGTH_SHORT).show();
        }
    }
    public void showToastBottomRight(View view) {
        EditText e1 = (EditText) findViewById(R.id.editText1);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        if (e1.getText().toString().trim().length() > 0 &&
                e2.getText().toString().trim().length() > 0) {
            String editT1 = e1.getText().toString();
            String editT2 = e2.getText().toString();
            int xOffSet = Integer.parseInt(editT1);
            int yOffSet = Integer.parseInt(editT2);

            Toast toast = Toast.makeText(getApplicationContext(), "Hello Toast", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT, xOffSet, yOffSet);
            toast.show();
        } else {
            Toast.makeText(getApplicationContext(),"Please enter xOffSet & yOffSet",Toast.LENGTH_SHORT).show();
        }
    }
}
