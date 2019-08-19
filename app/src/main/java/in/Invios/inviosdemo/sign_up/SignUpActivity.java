package in.Invios.inviosdemo.sign_up;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import in.Invios.inviosdemo.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_sign_up);

        // Butter Knife
        ButterKnife.bind(this);
    }

    /*
       On Click Listener.
     */
    @OnClick(R.id.tietDob)
    public void dobOnClick()
    {
        Toast.makeText(this, "Show date picker !", Toast.LENGTH_SHORT).show();
    }

}
