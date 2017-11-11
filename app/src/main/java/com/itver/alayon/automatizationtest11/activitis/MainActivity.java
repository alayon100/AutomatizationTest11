package com.itver.alayon.automatizationtest11.activitis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.itver.alayon.automatizationtest11.R;
import com.itver.alayon.automatizationtest11.adapters.MyAdapter;
import com.itver.alayon.automatizationtest11.models.Build;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private MyAdapter adapter;
    private List<Build> buildList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }


    private void initComponents(){
        listView = (ListView) findViewById(R.id.listView);
        buildList = Build.getAllBuilds();
        adapter = new MyAdapter(this, R.layout.list_view_builds_item, buildList);

        listView.setAdapter(adapter);
    }

}
