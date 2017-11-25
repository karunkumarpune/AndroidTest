package org.possibilities.weather.weatherapp.locationautogooglemapv2;

import java.util.HashMap;

import android.content.Context;
import android.util.AttributeSet;


/** Customizing AutoCompleteTextView to return Place Description   
 *  corresponding to the selected item
 */
public class CustomAutoCompleteTextView extends android.support.v7.widget.AppCompatAutoCompleteTextView {
	
	public CustomAutoCompleteTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	/** Returns the Place Description corresponding to the selected item */
	@Override
	protected CharSequence convertSelectionToString(Object selectedItem) {
		/** Each item in the autocompetetextview suggestion list is a hashmap object */
		HashMap<String, String> hm = (HashMap<String, String>) selectedItem;
		return hm.get("description");
	}
}
