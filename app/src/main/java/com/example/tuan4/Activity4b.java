package com.example.tuan4;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tuan4.adapter.GridViewAdapter;
import com.example.tuan4.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Activity4b extends AppCompatActivity {
    private GridView gridView;
    private List<Product> listProduct;
    private GridViewAdapter gridViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_b);

        gridView = findViewById(R.id.girdview);

        listProduct = new ArrayList<>();
        listProduct.add(new Product("","",R.drawable.giacchuyen_1));
        listProduct.add(new Product("","",R.drawable.daynguon_1));
        listProduct.add(new Product("","",R.drawable.dauchuyendoipsps2_1));
        listProduct.add(new Product("","",R.drawable.dauchuyendoi_1));
        listProduct.add(new Product("","",R.drawable.carbusbtops2_1));
        listProduct.add(new Product("","",R.drawable.daucam_1));

        gridViewAdapter = new GridViewAdapter(this,R.layout.item_gridview,listProduct);
        gridView.setAdapter(gridViewAdapter);
    }
}