package com.example.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import com.example.tuan4.adapter.ProductAdapter;
import com.example.tuan4.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Main_4a extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Product> products;
    private ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        products = new ArrayList<>();
        products.add(new Product("Ca nấu lẩu","Devang",R.drawable.ca_nau_lau));
        products.add(new Product("1 kg Khô gà, Bơ tỏi","LDT Shop",R.drawable.ga_bo_toi));
        products.add(new Product("Xa cần cẩu đa năng","Thế giới đồ chơi",R.drawable.xa_can_cau));
        products.add(new Product("Đồ chơi dạng mô hình","Thế giới đồ chơi",R.drawable.do_choi_dang_mo_hinh));
        products.add(new Product("Lãnh đạo đơn giản","Minh Long book",R.drawable.lanh_dao_gian_don));
        products.add(new Product("Hiểu lòng con trẻ","Minh Long book",R.drawable.hieu_long_con_tre));
        products.add(new Product("Donal Trump Thiên tài lãnh đạo","Minh Long book",R.drawable.trump_1));
        adapter = new ProductAdapter(this,R.layout.item,products);
        listView.setAdapter(adapter);
    }
}