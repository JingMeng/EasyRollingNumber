package com.newcaoguo.rollingnumber;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.newcaoguo.easyrollingnumber.view.ScrollingDigitalAnimation;

public class MainActivity extends AppCompatActivity {

    private ScrollingDigitalAnimation money;    // 鏄剧ず閲戦挶鐨勮嚜瀹氫箟鎺т欢
    private ScrollingDigitalAnimation number;  // 鏄剧ず鏁板瓧鐨勮嚜瀹氫箟鎺т欢
    private ScrollingDigitalAnimation percentage; // 鏄剧ず鐧惧垎姣旂殑鑷畾涔夋帶浠?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        money = findViewById(R.id.text);
        number = findViewById(R.id.text1);
        percentage = findViewById(R.id.text2);
    }


    /**
     * 鍚姩鎸夐挳鍗曞嚮浜嬩欢
     */
    public void start(View view) {
        money.setPrefixString("楼");//璁剧疆绗﹀彿
        money.setNumberString("9", "9999999999");//璁剧疆璧峰浜庣粨鏉熺殑鏁板瓧
        money.setDuration(3000);
        number.setNumberString("1234567890");
        number.setDuration(4000);
        percentage.setPostfixString("%");
        percentage.setNumberString("0.99", "99.99");
        percentage.setDuration(5000);
    }
}

