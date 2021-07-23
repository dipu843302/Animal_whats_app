package com.example.recylcerview_whatsaap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
Adapter adapter;
LinearLayoutManager linearLayoutManager;
List<ModelClass>userList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerview();

    }

    private void initRecyclerview() {
        recyclerView=findViewById(R.id.recyclerview);
        linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable._408,"Animal","Bark","Dog"));
        userList.add(new ModelClass(R.drawable.cat,"Animal","Meo","Cat"));
        userList.add(new ModelClass(R.drawable.tiger,"Animal","Growl","Tiger"));
        userList.add(new ModelClass(R.drawable.lion,"Animal","Roar","Lion"));
        userList.add(new ModelClass(R.drawable._408,"Animal","Bark","Dog"));
        userList.add(new ModelClass(R.drawable.cat,"Animal","Meo","Cat"));
        userList.add(new ModelClass(R.drawable.tiger,"Animal","Growl","Tiger"));
        userList.add(new ModelClass(R.drawable.lion,"Animal","Roar","Lion"));
        userList.add(new ModelClass(R.drawable._408,"Animal","Bark","Dog"));
        userList.add(new ModelClass(R.drawable.cat,"Animal","Meo","Cat"));
        userList.add(new ModelClass(R.drawable.tiger,"Animal","Growl","Tiger"));
        userList.add(new ModelClass(R.drawable.lion,"Animal","Roar","Lion"));
        userList.add(new ModelClass(R.drawable._408,"Animal","Bark","Dog"));
        userList.add(new ModelClass(R.drawable.cat,"Animal","Meo","Cat"));
        userList.add(new ModelClass(R.drawable.tiger,"Animal","Growl","Tiger"));
        userList.add(new ModelClass(R.drawable.lion,"Animal","Roar","Lion"));
    }
}