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
		setContentView(R.layout.activity_distance);
	}
	
	private String MileToKm(double distance)
	{
	    return String.valueOf(distance * 1.60934);
	}
	
	private String KmToMile(double distance)
	{
	    return String.valueOf(distance * 0.6214);
	}
	
	public void handleClick(View view)
	{
		boolean checked = ((RadioButton)view).isChecked();
		EditText txt = (EditText)findViewById(R.id.editTextDistance);
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
