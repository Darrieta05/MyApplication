package com.example.darri.weatherapp;

import android.location.Location;

import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by darri on 22/07/2016.
 */
public class Weather {
    private Object coord;
    private Object sys;
    private ArrayList weather;
    private  Object main;
    private Object wind;
    private String name;

    JSONObject jObj = new JSONObject(data);

    Location loc = new Location();

    JSONObject coordObj = getObject("coord", jObj);
    loc.setLatitude(getFloat("lat", coordObj));
    loc.setLongitude(getFloat("lon", coordObj));

    JSONObject sysObj = getObject("sys", jObj);
    loc.setCountry(getString("country", sysObj));
    loc.setSunrise(getInt("sunrise", sysObj));
    loc.setSunset(getInt("sunset", sysObj));
    loc.setCity(getString("name", jObj));
    weather.location = loc;

}
