package bloodcafe.savelet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SignUp extends AppCompatActivity
{
    TextView tv_login;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        tv_login=findViewById(R.id.tv_login);
        tv_login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(SignUp.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}
