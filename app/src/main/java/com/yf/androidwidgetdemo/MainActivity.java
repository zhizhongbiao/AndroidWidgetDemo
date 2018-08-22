package com.yf.androidwidgetdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.ivMerge)
    ImageView ivMerge;
    @BindView(R.id.tvMerge)
    TextView tvMerge;
    @BindView(R.id.tvMerge2)
    TextView tvMerge2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);

//        viewStubDemo();
    }

    private int getLayout() {
//        return R.layout.layout_stub_view;
        return R.layout.layout_include;
    }

//    private void viewStubDemo() {
//        if (new Random().nextBoolean())
//        {
//            vsTextView.inflate();
//        }else {
//            vsImageView.inflate();
//        }
//    }
}
