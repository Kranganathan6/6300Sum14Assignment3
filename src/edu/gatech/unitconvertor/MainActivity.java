package edu.gatech.unitconvertor;

import edu.gatech.assignment3.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void handleClick(View view)
	{
		boolean checked = ((RadioButton)view).isChecked();
		switch(view.getId())
		{
			case R.id.radioDistanceConverter:
			{
				if(checked)
				{
					 Intent intent = new Intent(MainActivity.this,DistanceActivity.class);
			            startActivity(intent);
				}
				break;
			}
			case R.id.radioTemperatureConverter:
			{
				if(checked)
				{
					Intent intent = new Intent(MainActivity.this,TemperatureActivity.class);
		            startActivity(intent);
				}
				break;
			}
			case R.id.radioWeightConverter:
			{
				if(checked)
				{
					Intent intent = new Intent(MainActivity.this,WeightActivity.class);
		            startActivity(intent);
				}
				break;
			}
		}
	}
}
