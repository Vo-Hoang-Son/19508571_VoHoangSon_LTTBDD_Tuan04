package com.example.tuan4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tuan4.model.Product;
import com.example.tuan4.R;
import java.util.List;


public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private int idlayout;
    private List<Product> productList;

    public GridViewAdapter(Context context, int idlayout, List<Product> productList) {
        this.context = context;
        this.idlayout = idlayout;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        if (!productList.isEmpty() && productList.size()!=0)
            return productList.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(idlayout,parent,false);
        }

        TextView tvProductName = convertView.findViewById(R.id.textViewProductName4b);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView4b);
        final Product product = productList.get(position);

        if (productList != null && !productList.isEmpty()) {
            imageView.setImageResource(product.getImage());
        }
        return convertView;
    }
}
