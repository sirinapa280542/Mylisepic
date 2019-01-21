package com.sirinapa.mylisepic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

//    String [] datas;
    private List<Data> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Data item = new Data("Cat","แมวสีดำ",R.mipmap.cat);
        datas.add(item);
        datas.add(new Data("Dog","หมาน้อย",R.mipmap.dog));
        datas.add(new Data("Lion","สิงโต",R.mipmap.lion));
        datas.add(new Data("Pig","หมู",R.mipmap.pig));
        datas.add(new Data("Fish","ปลาทอง",R.mipmap.fish));

        MyAdapter adapter = new MyAdapter(this,datas);

        ListView lv = (ListView) findViewById(R.id.listview);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
//        datas = new String[]{
//                "Cat",
//                "Dog",
//                "Lion",
//                "Pig",
//                "Fish"
//        };
//        ListAdapter adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,datas);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"Click" + String.valueOf(position)+""+datas.get(position).getmText1(),Toast.LENGTH_SHORT).show();

    }
}
