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
		setContentView(R.layout.activity_temperature);
	}
	
	private String CelsiusToFarenheit(double temperature)
	{
		double fht = temperature * 1.8  + 32;
	    return String.valueOf(fht);
	}
	
	private String FarenheitToCelsius(double temperature)
	{
		double celsius = (temperature -32)/1.8;
	    return String.valueOf(celsius);
	}
	
	public void handleClick(View view)
	{
		boolean checked = ((RadioButton)view).isChecked();
		EditText txt = (EditText)findViewById(R.id.editTextTemperature);
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
