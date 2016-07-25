package com.example.darri.weatherapp;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.Response;

public class MainActivity extends AppCompatActivity {

    ServiceHandler service;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        service = new ServiceHandler();
        //get Your Current Location
        LocationManager locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        MyCurrentLoctionListener locationListener = new MyCurrentLoctionListener();
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);



    }
}
