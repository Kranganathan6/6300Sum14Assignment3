package edu.gatech.unitconvertor;

import edu.gatech.assignment3.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class TemperatureActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("Temperature Converter");
		setContentView(R.layout.activity_temperature);
	}
	
	private String CelsiusToFarenheit(double temperature)
	{
		double fht = Math.round((temperature * 1.8  + 32) * 1000.0)/1000.0;
	    return String.valueOf(fht);
	}
	
	private String FarenheitToCelsius(double temperature)
	{
		double celsius =Math.round(( (temperature -32)/1.8)*1000.0)/1000.0;
	    return String.valueOf(celsius);
	}
	
	public void handleClick(View view)
	{
		boolean checked = ((RadioButton)view).isChecked();
		EditText txt = (EditText)findViewById(R.id.editTextTemperature);
		
		// Check if the temperature text field is not empty
		if (txt.getText().toString().matches("")) {
		    Toast.makeText(this, "You did not enter a temperature", Toast.LENGTH_SHORT).show();
		    return;
		}
		double temperature = Double.parseDouble(txt.getText().toString());
		switch(view.getId())
		{
			case R.id.celsius:
			{
				if(checked)
				{
					txt.setText(FarenheitToCelsius(temperature));
				}
				break;
			}
			case R.id.farenheit:
			{
				if(checked)
				{
					txt.setText(CelsiusToFarenheit(temperature));
				}
				break;
			}
		}
	}
}
