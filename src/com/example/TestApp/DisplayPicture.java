package com.example.TestApp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

/**
 * Created by guillermovera on 2/14/14.
 */
public class DisplayPicture extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        getWindow().setBackgroundDrawableResource(R.drawable.test_image);
        getWindow().setTitle(getResources().getText(R.drawable.test_image));

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
