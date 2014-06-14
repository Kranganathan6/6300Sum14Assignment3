package edu.gatech.unitconvertor;

import edu.gatech.assignment3.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class WeightActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);
	}
	
	private String PoundsToKilograms(double weight)
	{
	    return String.valueOf(Math.round(weight * 0.454*1000.0)/1000.0);
	}
	
	private String KilogramsToPounds(double weight)
	{
	    return String.valueOf(Math.round(weight * 2.205*1000.0)/1000.0);
	}
	
	public void handleClick(View view)
	{
		boolean checked = ((RadioButton)view).isChecked();
		EditText txt = (EditText)findViewById(R.id.editTextWeight);
		if (txt.getText().toString().matches("")) {
		    Toast.makeText(this, "You did not enter a weight", Toast.LENGTH_SHORT).show();
		    return;
		}
		double weight = Double.parseDouble(txt.getText().toString());
		switch(view.getId())
		{
			case R.id.pounds:
			{
				if(checked)
				{
					txt.setText(KilogramsToPounds(weight));
				}
				break;
				
			}
			case R.id.kgms:
			{
				if(checked)
				{
					txt.setText(PoundsToKilograms(weight));
				}
				break;
			}
		}
	}
}
