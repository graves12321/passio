package com.cmajor7.passio.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import com.cmajor7.passio.Adapter.NotificationAdapter;
import com.cmajor7.passio.Adapter.TinTucAdapter;
import com.cmajor7.passio.DTO.Notification;
import com.cmajor7.passio.R;
import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Notification> listTin;
    NotificationAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        anhXa();
        adapter = new NotificationAdapter(this, R.layout.item_nofi, listTin);
        listView.setVerticalScrollBarEnabled(false);
        listView.setAdapter(adapter);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar_notification_detail);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Thông báo");
    }

    public void anhXa() {
        listView = (ListView) findViewById(R.id.lv_nofi);
        listTin = new ArrayList<>();
        listTin.add(new Notification(R.drawable.tin1, "KHAI TRƯƠNG - PASSIO COFFEE", "Khai trương cơ sở mới 664 Nguyễn Thị Định - giảm giá sốc, ưu đãi bất ngờ"));
        listTin.add(new Notification(R.drawable.tin3, "KHUYỄN MÃI TỪ PASSIO COFFE", "Uống cà phê, phát người yêu - duy nhất ở Passio Coffee"));
        listTin.add(new Notification(R.drawable.tin4, "PASSIO COFFE - CƠ SỞ CẨM LỆ", "Passio vừa khai trương cơ sở mới ở 173 Nguyễn Trỗi, Cẩm Lệ - khuyễn mãi 50% cho tất cả sản phẩm"));
        listTin.add(new Notification(R.drawable.tin5, "PASSIO COFFEE – HẢI CHÂU", "Passio tiếp tục gửi đến khách hàng chương trình ưu đãi đổng giá 19.000đ cho sản phẩm Espresso đá/ sữa đá thơm ngon, đậm vị"));
        listTin.add(new Notification(R.drawable.acoustis, "PASSIO COFFE - ĐÀ NẴNG", "Passio tổ chức đêm nhạc acoustic cho khách hàng thưởng thức"));
        listTin.add(new Notification(R.drawable.tin6, "PASSIO COFFEE – NGUYỄN VĂN LINH", "Khai trương cơ sở Nguyễn Văn Linh - Hải Châu - Đà Nẵng"));
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: // nút back
                onBackPressed();
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
