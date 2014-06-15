package edu.gatech.unitconvertor;

import edu.gatech.assignment3.R;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("Unit Converter");
		 try {
		        setContentView(R.layout.activity_main);
		 
		        // Build the items for the list view
				ListView mlistView = (ListView) findViewById(R.id.idListView);
				mlistView.setAdapter(new ArrayAdapter<String>(this,
				        android.R.layout.simple_list_item_1, 
				        new String[] {"Distance Converter", "Temperature Converter",
						"Weight Converter"}));
	 
				
				// Set the onItemClickListener Handler
		        mlistView.setOnItemClickListener(new OnItemClickListener() {
		            public void onItemClick(AdapterView<?> parent, View view,
		                int position, long id) {

		              Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
		                  Toast.LENGTH_SHORT).show();
		              String sText = ((TextView) view).getText().toString();
		              Intent intent = null;
		              
		              // Check the item selected and invoke the appropriate activity
		              if(sText.equals("Distance Converter"))
		              {
			              intent = new Intent(getBaseContext(),
									DistanceActivity.class);
			          }
		              else if(sText.equals("Temperature Converter"))
		              {
		            	  intent = new Intent(getBaseContext(),
									TemperatureActivity.class);
		              }
		              else if(sText.equals("Weight Converter"))
		              {
		            	  intent = new Intent(getBaseContext(),
									WeightActivity.class);
		              }
		 
		              if(intent != null)
						startActivity(intent);              
		            }
		          });
		        } catch (Exception e) {
		        	// TODO Auto-generated catch block
		        	e.printStackTrace();
		        }
	}
	
}
