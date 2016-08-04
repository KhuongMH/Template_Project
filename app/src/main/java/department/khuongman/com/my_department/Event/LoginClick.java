package department.khuongman.com.my_department.Event;

import android.content.Intent;
import android.view.View;

import department.khuongman.com.my_department.Activity.LoginActivity;
import department.khuongman.com.my_department.Activity.MainActivity;

/**
 * Created by khuong.man on 8/4/2016.
 */

public class LoginClick implements View.OnClickListener {

    LoginActivity activity;

    public LoginClick(LoginActivity activity) {
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);
    }
}
