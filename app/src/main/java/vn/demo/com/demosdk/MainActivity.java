package vn.demo.com.demosdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vn.demo.com.sdklibrary.callapi.TestCall1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestCall1.call1();
    }
}
