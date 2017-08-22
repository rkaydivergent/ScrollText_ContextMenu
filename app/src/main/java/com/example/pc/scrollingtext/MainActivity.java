package com.example.pc.scrollingtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView myTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTxt = (TextView) findViewById(R.id.article);
        registerForContextMenu(myTxt);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
              getMenuInflater().inflate(R.menu.my_context_menu ,menu);
      }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_edit:
                Toast.makeText(this, "Editing Text", Toast.LENGTH_LONG).show();
            case R.id.item_share:
                Toast.makeText(this, "Sharing Text", Toast.LENGTH_LONG).show();
            case R.id.item_delete:
                Toast.makeText(this, "Deleting Text", Toast.LENGTH_LONG).show();
        }
    return true;}
}
