package in.supertroninfotech.httpwww.databindingtuts;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import in.supertroninfotech.httpwww.databindingtuts.databinding.ActivityMainBinding;


public class SimpleBindng1 extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding activityMainBinding1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initview();
    }

    private void initview() {
        activityMainBinding1= DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding1.btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v==activityMainBinding1.btnSubmit){
            Toast.makeText(SimpleBindng1.this,"Hello",Toast.LENGTH_LONG).show();
        }
    }
}
