package department.khuongman.com.my_department.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import department.khuongman.com.my_department.Event.LoginClick;
import department.khuongman.com.my_department.R;

public class LoginActivity extends Activity {

    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponent();
        btn_login.setOnClickListener(new LoginClick(this));
    }

    private void initComponent() {
        btn_login = (Button) findViewById(R.id.btn_login);
    }
}