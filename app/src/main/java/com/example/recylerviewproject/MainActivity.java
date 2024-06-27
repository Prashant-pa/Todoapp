package com.example.recylerviewproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recl1;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recl1=findViewById(R.id.recl);
        recl1.setLayoutManager(new LinearLayoutManager(this));
        adapter=new MyAdapter(deque());
        recl1.setAdapter(adapter);


    }
public ArrayList<Model> deque(){
        ArrayList<Model> a=new ArrayList<>();
        Model m=new Model();
        m.setName("pacchu");
        m.setEmail("pacchu@123");
        a.add(m);
        Model m1=new Model();
        m1.setName("raghu");
        m1.setEmail("raghu@132");
        a.add(m1);
        Model m2=new Model();
        m2.setName("john");
        m2.setEmail("john@gmail.com");
        a.add(m2);
    Model m3=new Model();
    m3.setName("john");
    m3.setEmail("john@gmail.com");
    a.add(m3);
    Model m4=new Model();
    m4.setName("john");
    m4.setEmail("john@gmail.com");
    a.add(m4);
    Model m5=new Model();
    m5.setName("john");
    m5.setEmail("john@gmail.com");
    a.add(m5);
    Model m6=new Model();
    m6.setName("pacchu");
    m6.setEmail("pacchu@123");
    a.add(m6);
    Model m7=new Model();
    m7.setName("pacchu");
    m7.setEmail("pacchu@123");
    a.add(m7);
    Model m8=new Model();
    m8.setName("pacchu");
    m8.setEmail("pacchu@123");
    a.add(m8);
    Model m9=new Model();
    m9.setName("pacchu");
    m9.setEmail("pacchu@123");
    a.add(m9);
    Model m10=new Model();
    m10.setName("pacchu");
    m10.setEmail("pacchu@123");
    a.add(m10);
    return a;

}
}