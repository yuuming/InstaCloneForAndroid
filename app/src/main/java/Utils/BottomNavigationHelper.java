package Utils;

import android.support.design.internal.BottomNavigationItemView;
import android.util.Log;

import com.example.yuminakamura.instacloneforandroid.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by yuminakamura on 2018-02-11.
 */

public class BottomNavigationHelper {
    private static final String TAG = "BottomNavigationHelper";

    public static void setUpBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setUpBottomNavigationView: setting up bottom navigation view");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);

    }
}

