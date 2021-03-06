package com.example.demo.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button formulaButton;
    private Button sudokuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        bindButton();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void findView() {
        formulaButton = (Button)findViewById(R.id.formulaButton);
        sudokuButton = (Button)findViewById(R.id.sudokuButton);
    }

    private void bindButton() {
        formulaButton.setOnClickListener(this);
        sudokuButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, CameraActivity.class);
        Bundle bundle = new Bundle();
        switch(v.getId()) {
            case R.id.formulaButton:
                bundle.putString("MODE", "formula");
                break;
            case R.id.sudokuButton:
                bundle.putString("MODE", "sudoku");
        }
        intent.putExtras(bundle);
        startActivity(intent);
        this.finish();
    }
}
