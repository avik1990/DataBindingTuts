package in.supertroninfotech.httpwww.databindingtuts;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import in.supertroninfotech.httpwww.databindingtuts.databinding.ActivityMain1Binding;
import in.supertroninfotech.httpwww.databindingtuts.model.Register;


public class SimpleBindng2 extends AppCompatActivity implements View.OnClickListener {

    private ActivityMain1Binding activityMainBinding;
    public Register myOUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initview();
    }

    private void initview() {
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main1);
        activityMainBinding.btnSubmit.setOnClickListener(this);
        myOUser = new Register();
        activityMainBinding.setUser(myOUser);
    }

    @Override
    public void onClick(View v) {
        if (v == activityMainBinding.btnSubmit) {
           /* myOUser.name = (activityMainBinding.etName.getText().toString());
            myOUser.password = activityMainBinding.etPassword.getText().toString();*/
            Toast.makeText(SimpleBindng2.this, myOUser.getName()+":"+myOUser.getPassword(), Toast.LENGTH_LONG).show();
        }
    }

    public void GetData(View view) {

        // activityMainBinding.etName.getText().toString();

    }

}
