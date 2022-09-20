package com.firstapp.recycler_stagger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClick {
     StaggerAdapter staggerAdapter;
     StaggerPojo staggerPojo;
     RecyclerView recyclerView;
     List<StaggerPojo> staggerPojoList=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            recyclerView = findViewById(R.id.stagger_layout);
            recyclerView.setHasFixedSize(true);


            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL);
            staggeredGridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
            
            recyclerView.setLayoutManager(staggeredGridLayoutManager);


//            List<StaggerPojo> staggerPojoList = new ArrayList<>();


             StaggerAdapter staggerAdapter=new StaggerAdapter(getApplicationContext(), (List<StaggerPojo>) staggerPojo,staggerPojoList);

            
            recyclerView.setAdapter(staggerAdapter);

            loaduser();


        }catch (Exception e)
        {
            e.printStackTrace();
        }


        }




    private void loaduser() {
        staggerPojo=new StaggerPojo(R.drawable.img);
        staggerPojoList.add(staggerPojo);
        staggerPojo=new StaggerPojo(R.drawable.img_1);
        staggerPojoList.add(staggerPojo);
        staggerPojo=new StaggerPojo(R.drawable.img_6);
        staggerPojoList.add(staggerPojo);
        staggerPojo=new StaggerPojo(R.drawable.img_4);
        staggerPojoList.add(staggerPojo);
        staggerPojo=new StaggerPojo(R.drawable.img_5);
        staggerPojoList.add(staggerPojo);
        staggerPojo=new StaggerPojo(R.drawable.img_11);
        staggerPojoList.add(staggerPojo);
        staggerPojo=new StaggerPojo(R.drawable.img_2);
        staggerPojoList.add(staggerPojo);
        staggerPojo=new StaggerPojo(R.drawable.img_3);
        staggerPojoList.add(staggerPojo);

        staggerPojo=new StaggerPojo(R.drawable.img_7);
        staggerPojoList.add(staggerPojo);

        staggerPojo=new StaggerPojo(R.drawable.img_8);
        staggerPojoList.add(staggerPojo);

        staggerAdapter.notifyDataSetChanged();

    }

    @Override
    public void onClick(int i) {
        Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
        
    }
}
