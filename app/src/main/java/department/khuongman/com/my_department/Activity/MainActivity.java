package department.khuongman.com.my_department.Activity;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import department.khuongman.com.my_department.Fragment.MainFragment;
import department.khuongman.com.my_department.R;

public class MainActivity extends Activity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle mDrawerToggle;
    ImageView iv_navigation_left, iv_navigation_right;

    LinearLayout ll_top_1, ll_top_2, ll_middle_1, ll_middle_2, ll_bottom_1, ll_bottom_2;
    RelativeLayout rl_navigation_left_1, rl_navigation_left_2, rl_navigation_left_3, rl_navigation_left_4, rl_navigation_left_5, rl_navigation_left_6;
    RelativeLayout rl_navigation_right_1, rl_navigation_right_2, rl_navigation_right_3, rl_navigation_right_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
        setupNavigation();
        scaleRightNavigationItems();
        showMainFragment();
    }

    public void initComponent() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        iv_navigation_left = (ImageView) findViewById(R.id.iv_navigation_left);
        iv_navigation_right = (ImageView) findViewById(R.id.iv_navigation_right);
        rl_navigation_left_1 = (RelativeLayout) findViewById(R.id.rl_navigation_left_1);
        rl_navigation_left_2 = (RelativeLayout) findViewById(R.id.rl_navigation_left_2);
        rl_navigation_left_3 = (RelativeLayout) findViewById(R.id.rl_navigation_left_3);
        rl_navigation_left_4 = (RelativeLayout) findViewById(R.id.rl_navigation_left_4);
        rl_navigation_left_5 = (RelativeLayout) findViewById(R.id.rl_navigation_left_5);
        rl_navigation_left_6 = (RelativeLayout) findViewById(R.id.rl_navigation_left_6);
        rl_navigation_right_1 = (RelativeLayout) findViewById(R.id.rl_navigation_right_1);
        rl_navigation_right_2 = (RelativeLayout) findViewById(R.id.rl_navigation_right_2);
        rl_navigation_right_3 = (RelativeLayout) findViewById(R.id.rl_navigation_right_3);
        rl_navigation_right_4 = (RelativeLayout) findViewById(R.id.rl_navigation_right_4);
        ll_top_1 = (LinearLayout) findViewById(R.id.ll_top_1);
        ll_top_2 = (LinearLayout) findViewById(R.id.ll_top_2);
        ll_middle_1 = (LinearLayout) findViewById(R.id.ll_middle_1);
        ll_middle_2 = (LinearLayout) findViewById(R.id.ll_middle_2);
        ll_bottom_1 = (LinearLayout) findViewById(R.id.ll_bottom_1);
        ll_bottom_2 = (LinearLayout) findViewById(R.id.ll_bottom_2);
    }

    public void setupNavigation() {
        mDrawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout,
                R.drawable.ic_navigation, R.string.app_name, R.string.app_name);
        iv_navigation_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });
        iv_navigation_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.RIGHT);
            }
        });
        mDrawerToggle.syncState();
        drawerLayout.setDrawerListener(mDrawerToggle);
    }

    public void scaleRightNavigationItems(){
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = (displaymetrics.heightPixels - findViewById(R.id.info_apartment).getLayoutParams().height) / 6;
        rl_navigation_right_1.getLayoutParams().height = height;
        rl_navigation_right_2.getLayoutParams().height = height;
        rl_navigation_right_3.getLayoutParams().height = height;
        rl_navigation_right_4.getLayoutParams().height = height;
    }

    public void showMainFragment() {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.main_screen, new MainFragment());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
}
