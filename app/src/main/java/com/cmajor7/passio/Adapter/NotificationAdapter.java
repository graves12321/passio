package com.cmajor7.passio.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.cmajor7.passio.DTO.Notification;
import com.cmajor7.passio.DTO.TinTuc;
import com.cmajor7.passio.R;

import java.util.List;

public class NotificationAdapter extends BaseAdapter {
    private Context context;
    int layout;
    List<Notification> tinList;

    public NotificationAdapter(Context context, int layout, List<Notification> tinList) {
        this.context = context;
        this.layout = layout;
        this.tinList = tinList;
    }

    @Override
    public int getCount() {
        return tinList.size();
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.item_nofi, null);

        ImageView Image = (ImageView) convertView.findViewById(R.id.image);
        TextView Title = (TextView) convertView.findViewById(R.id.text);
        TextView Descript = (TextView) convertView.findViewById(R.id.time);

        Notification Notification = tinList.get(position);

        Image.setImageResource(Notification.getImage());
        Title.setText(Notification.getTitle());
        Descript.setText(Notification.getDescription());
        return convertView;
    }
}