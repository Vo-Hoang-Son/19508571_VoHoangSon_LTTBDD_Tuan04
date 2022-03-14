package com.example.tuan4.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.example.tuan4.R;
import com.example.tuan4.model.Product;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Product> listProduct;
    private int positionSelect = -1;

    public ProductAdapter(Context context, int idLayout, List<Product> listProduct) {
        this.context = context;
        this.idLayout = idLayout;
        this.listProduct = listProduct;
    }

    @Override
    public int getCount() {
        if (listProduct.size() != 0 && !listProduct.isEmpty()) {
            return listProduct.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }
        TextView tvmoTa = convertView.findViewById(R.id.textViewShop);
        TextView tvProductName = (TextView) convertView.findViewById(R.id.textViewName);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        final Product product = listProduct.get(position);

        if (listProduct != null && !listProduct.isEmpty()) {
            tvmoTa.setText(product.getMoTa());
            tvProductName.setText(product.getName());
            imageView.setImageResource(product.getImage());
        }
        return convertView;
    }

}