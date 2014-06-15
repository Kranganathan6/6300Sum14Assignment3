package edu.gatech.unitconvertor;

import edu.gatech.assignment3.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class DistanceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("Distance Converter");
		setContentView(R.layout.activity_distance);
	}
	
	private String MileToKm(double distance)
	{
	    return String.valueOf(Math.round(distance * 1.60934 *1000.0)/1000.0);
	}
	
	private String KmToMile(double distance)
	{
	    return String.valueOf(Math.round(distance * 0.6214*1000.0)/1000.0);
	}
	
	public void handleClick(View view)
	{
		boolean checked = ((RadioButton)view).isChecked();
		EditText txt = (EditText)findViewById(R.id.editTextDistance);
		// Check if the distance text field is not empty
		if (txt.getText().toString().matches("")) {
		    Toast.makeText(this, "You did not enter a distance", Toast.LENGTH_SHORT).show();
		    return;
		}
		double distance = Double.parseDouble(txt.getText().toString());
		switch(view.getId())
		{
			case R.id.mile:
			{
				if(checked)
				{
					txt.setText(KmToMile(distance));
				}
				break;
			}
			case R.id.km:
			{
				if(checked)
				{
					txt.setText(MileToKm(distance));
				}
				break;
			}
		}
	}
}
