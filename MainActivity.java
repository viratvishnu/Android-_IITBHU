package com.example.nimmalavishnu.callintentactivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends Activity {
    Spinner sp;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.spinner1);
        b1=(Button)findViewById(R.id.button1);
        ArrayAdapter adapter =  ArrayAdapter.createFromResource(this,R.array.intents,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);


    }
    public void onClickButton(View view)
    {
      Intent intent = null;
      int id = sp.getSelectedItemPosition();
      switch(id)
      {
          case 0:
              intent = new Intent(Intent.ACTION_VIEW,
                      Uri.parse("http://www.vogella.com"));
              break;
          case 1:
              intent = new Intent(Intent.ACTION_DIAL,
                      Uri.parse("tel:(+49)12345789"));
              break;
          case 2:
              intent = new Intent(Intent.ACTION_VIEW,
                      Uri.parse("geo:50.123,7.1434?z=19"));
              break;
          case 3:
              intent = new Intent(Intent.ACTION_VIEW,
                      Uri.parse("geo:0,0?q=query"));
              break;
          case 4:
              intent = new Intent("android.media.action.IMAGE_CAPTURE");
              break;
          case 5:
              intent = new Intent(Intent.ACTION_VIEW,
                      Uri.parse("content://contacts/people/"));
              break;
          case 6:
              intent = new Intent(Intent.ACTION_EDIT,
                      Uri.parse("content://contacts/people/1"));
              break;

      }
        if (intent != null) {
            startActivity(intent);
        }








    }




    }
