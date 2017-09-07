package com.cm.xingyu.networkprogramminglearn.LineChart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cm.xingyu.networkprogramminglearn.R;

import java.util.ArrayList;
import java.util.List;

public class LineChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);
        LineChartView lcv=(LineChartView) findViewById(R.id.test);
        List<String> x_coords=new ArrayList<String>();
        x_coords.add("1");
        x_coords.add("2");
        x_coords.add("3");
        x_coords.add("4");
        x_coords.add("5");
        x_coords.add("6");
        x_coords.add("7");
        x_coords.add("8");
        x_coords.add("9");
        x_coords.add("10");
        x_coords.add("11");
        x_coords.add("12");
        x_coords.add("13");
        x_coords.add("14");
        x_coords.add("15");
        x_coords.add("16");
        x_coords.add("17");
        x_coords.add("18");

        List<String> x_coord_values=new ArrayList<String>();
        x_coord_values.add("A");
        x_coord_values.add("B");
        x_coord_values.add("C");
        x_coord_values.add("D");
        x_coord_values.add("D");
        x_coord_values.add("C");
        x_coord_values.add("B");
        x_coord_values.add("A");
        x_coord_values.add("D");
        x_coord_values.add("A");
        x_coord_values.add("C");
        x_coord_values.add("C");
        x_coord_values.add("A");
        x_coord_values.add("B");
        x_coord_values.add("A");
        x_coord_values.add("D");
        x_coord_values.add("A");
        x_coord_values.add("A");
        lcv.setBgColor(Color.BLACK);
        lcv.setValue(x_coords, x_coord_values);


}
}
