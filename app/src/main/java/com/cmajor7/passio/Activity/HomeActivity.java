package com.cmajor7.passio.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.cmajor7.passio.R;
import com.cmajor7.passio.DTO.TinTuc;
import com.cmajor7.passio.Adapter.TinTucAdapter;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private GridView gridView;
    ArrayList<TinTuc> listTin;
    TinTucAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        anhXa();
        adapter = new TinTucAdapter(this, R.layout.grid_rows, listTin);
        gridView.setVerticalScrollBarEnabled(false);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(HomeActivity.this, NotificationDetailActivity.class);
                startActivity(intent);
            }
        });
        ImageView card = findViewById(R.id.card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MemberCardActivity.class);
                startActivity(intent);
            }
        });
        ImageView location = findViewById(R.id.location);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Map.class);
                startActivity(intent);
            }
        });
        ImageView coupon = findViewById(R.id.coupon);
        coupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MyCouponActivity.class);
                startActivity(intent);
            }
        });
        TextView acc_name = findViewById(R.id.acc_name);
        acc_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        ImageView book = findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, OrderActivity.class);
                startActivity(intent);
            }
        });
        ImageView noti = findViewById(R.id.noti);
        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });
    }

    public void anhXa() {
        gridView = (GridView) findViewById(R.id.grid_tt);
        listTin = new ArrayList<>();
        listTin.add(new TinTuc(R.drawable.tin1, "KHAI TRƯƠNG - PASSIO COFFEE", "Khai trương cơ sở mới 664 Nguyễn Thị Định - giảm giá sốc, ưu đãi bất ngờ"));
        listTin.add(new TinTuc(R.drawable.tin3, "KHUYỄN MÃI TỪ PASSIO COFFE", "Uống cà phê, phát người yêu - duy nhất ở Passio Coffee"));
        listTin.add(new TinTuc(R.drawable.tin4, "PASSIO COFFE - CƠ SỞ CẨM LỆ", "Passio vừa khai trương cơ sở mới ở 173 Nguyễn Trỗi, Cẩm Lệ - khuyễn mãi 50% cho tất cả sản phẩm"));
        listTin.add(new TinTuc(R.drawable.tin5, "PASSIO COFFEE – HẢI CHÂU", "Passio tiếp tục gửi đến khách hàng chương trình ưu đãi đổng giá 19.000đ cho sản phẩm Espresso đá/ sữa đá thơm ngon, đậm vị"));
    }
}