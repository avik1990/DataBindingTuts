package in.supertroninfotech.httpwww.databindingtuts;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import in.supertroninfotech.httpwww.databindingtuts.adapter.SimpleObjectAdapter;
import in.supertroninfotech.httpwww.databindingtuts.databinding.ActivityMain1Binding;
import in.supertroninfotech.httpwww.databindingtuts.databinding.ActivityMain2Binding;
import in.supertroninfotech.httpwww.databindingtuts.model.Register;
import in.supertroninfotech.httpwww.databindingtuts.model.SimpleObject;


public class SimpleBindng3 extends AppCompatActivity implements View.OnClickListener {

    private ActivityMain2Binding activityMainBinding;
    public Register myOUser;
    List<SimpleObject> list=new ArrayList<>();
    SimpleObjectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initview();
    }

    private void initview() {
        list.clear();
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        for (int i = 0; i < 100; i++) {
            list.add(new SimpleObject("Avik", "29"));
        }
        adapter = new SimpleObjectAdapter(this, list);
        activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {

    }
}
