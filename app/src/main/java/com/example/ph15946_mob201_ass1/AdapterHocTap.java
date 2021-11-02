package com.example.ph15946_mob201_ass1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterHocTap extends BaseAdapter {
    private Context context;
    private List<HocTap> list;

    public AdapterHocTap(Context context, List<HocTap> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
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
        convertView = LayoutInflater.from(context).inflate(R.layout.item_gridview,null);

        ImageView imageView = convertView.findViewById(R.id.ImView);
        TextView textView = convertView.findViewById(R.id.txtName);
        HocTap hocTap = list.get(position);
        textView.setText(hocTap.getName());
        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.coures);
            break;
            case 1:
                imageView.setImageResource(R.drawable.maps);
                break;
            case 2:
                imageView.setImageResource(R.drawable.news);
                break;
            case 3:
                imageView.setImageResource(R.drawable.lichj);
                break;
        }
        return convertView;
    }
}
