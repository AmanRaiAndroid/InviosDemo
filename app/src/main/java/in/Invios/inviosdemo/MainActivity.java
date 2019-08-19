package in.Invios.inviosdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;
import in.Invios.inviosdemo.sign_up.SignUpActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Butter Knife
        ButterKnife.bind(this);
    }

    /*
       Button On Click Listener.
     */
    @OnClick(R.id.btnSignIn)
    public void signInOnClick()
    {

    }

    @OnClick(R.id.btnSignUp)
    public void signUpOnClick()
    {
        startActivity(new Intent(this, SignUpActivity.class));
    }
}
