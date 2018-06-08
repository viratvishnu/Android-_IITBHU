# Android-_IITBHU
Here I have stored my complete Training Classes
*Spinner*
package com.example.nimmalavishnu.myapplication;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Spinner;

public class FindBeerActivity extends Activity {
    Button b1;
    Spinner s1;

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
        }
         public void onClickFindBeer(View view){
             t1=(TextView)findViewById(R.id.brands);
             
             s1=(Spinner)findViewById(R.id.color);
             String beertype= String.valueOf(s1.getSelectedItem());
             t1.setText(beertype);


    }
/strings.xml code/
<resources>
    <string name="app_name">My Application</string>
    <string name="find_beer">Find Beer!</string>
    <string name="brands">No Beer Selected</string>
    <string-array name="beer__colors">
        <item>light</item>
         <item>amber</item>
         <item>Brown</item>
         <item>Dark</item>
         <item>Lickener</item>
    </string-array>
</resources>
/activity_find_beer.xml/
<?xml version="1.0" encoding="utf-8"?>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:padding="16dp"
        android:orientation="vertical"
        tools:context=".FindBeerActivity"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:android="http://schemas.android.com/apk/res/android">
        <Spinner
            android:id="@+id/color"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="40dp"
            android:layout_gravity="center"
        android:entries="@array/beer__colors"
        android:layout_margin="16dp"/>
    <Button
        android:id="@+id/find_beer"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_margin="16dp"
        android:onClick="onClickFindBeer"
        android:text="@string/find_beer" />
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/brands"
        android:layout_gravity="center"
        
        />


</LinearLayout>
