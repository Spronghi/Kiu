package kiu.sei.informatica.br.uniba.it.kiu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by matte on 13/06/2016.
 */
public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void okBtnClicked(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        this.finish();
    }

    public void cancelBtnClicked(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
