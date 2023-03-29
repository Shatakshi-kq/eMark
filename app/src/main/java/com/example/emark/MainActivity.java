package com.example.emark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, LocationListener {

    private Spinner courseSpinner, yearSpinner, branchSpinner;
    private static String selectedCourse, selectedYear, selectedBranch;
    private static List<String> courses = new ArrayList<String>();
    private static List<String> branches = new ArrayList<String>();
    private static List<String> years = new ArrayList<String>();
    Button proceedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        courseSpinner = findViewById(R.id.courseSpinner);
        yearSpinner = findViewById(R.id.yearSpinner);
        branchSpinner = findViewById(R.id.branchSpinner);
        proceedBtn = findViewById(R.id.proceedBtn);

        courseSpinner.setOnItemSelectedListener(this);
        yearSpinner.setOnItemSelectedListener(this);
        branchSpinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements

        proceedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StudentListActivity.class);
                intent.putExtra("course", selectedCourse);
                intent.putExtra("branch", selectedBranch);
                intent.putExtra("year", selectedYear);
                startActivity(intent);

            }
        });


        courses.add("Select Course");
        courses.add("B Tech");
        courses.add("BBA");


        branches.add("Select Branch");


        years.add("Select Year");
        years.add("1st");
        years.add("2nd");
        years.add("3rd");
        years.add("4th");

        // Creating adapter for spinner
        ArrayAdapter<String> courseAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, courses);
        ArrayAdapter<String> yearAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, years);
        ArrayAdapter<String> branchAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, branches);

        // Drop down layout style - list view with radio button
        courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branchAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        courseSpinner.setAdapter(courseAdapter);
        yearSpinner.setAdapter(yearAdapter);
        branchSpinner.setAdapter(branchAdapter);


        LocationManager locationManager = (LocationManager) getSystemService(this.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.

            return;
        }


        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 60000000L, 220.0F, this);

    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
        if(parent.getItemAtPosition(0).toString().equals("Select Course")){
            selectedCourse = parent.getItemAtPosition(position).toString();
            if(parent.getItemAtPosition(position).toString().equals("B Tech")) {
                branches.clear();

                branches.add("CSE");
                branches.add("IT");
                branches.add("EE");
                branches.add("ECE");
                branches.add("ME");
            }else if(parent.getItemAtPosition(position).toString().equals("BBA")){
                branches.clear();
                branches.add("BBA 1");
                branches.add("BBA 2");
            }
        }else if(parent.getItemAtPosition(0).toString().equals("Select Year")){
            selectedYear = parent.getItemAtPosition(position).toString();


        }else {
            selectedBranch= parent.getItemAtPosition(position).toString();
        }
        // Showing selected spinner item
//        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }



    @Override
    public void onLocationChanged(Location location) {
//        txtLat = (TextView) findViewById(R.id.textview1);
//        txtLat.setText("Latitude:" + location.getLatitude() + ", Longitude:" + location.getLongitude());
        Toast.makeText(this, location.getLatitude() + "   " + location.getLongitude(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProviderDisabled(String provider) {
        Log.d("Latitude","disable");
    }

    @Override
    public void onProviderEnabled(String provider) {
        Log.d("Latitude","enable");
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Log.d("Latitude","status");
    }


}