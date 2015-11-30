package app.my_car_assist.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import app.my_car_assist.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.home_page);
        int screenH=getPhoneHeight();
        View home_list= findViewById(R.id.home_list);
        ViewGroup.LayoutParams params = home_list.getLayoutParams();
        params.height=screenH;
        System.out.println("The heigh is ---------> "+params.height);
        Log.w("ListHeight", "------------>" + params.height);

        home_list.setLayoutParams(params);
    }

    public int getPhoneHeight(){
        int i= getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        Log.w("PhoneHeight", "------------>" + i);
        return i;

    }
    public int getPhoneWidth(){
        return getApplicationContext().getResources().getDisplayMetrics().widthPixels;
    }
}
