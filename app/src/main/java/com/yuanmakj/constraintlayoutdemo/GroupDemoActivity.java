package com.yuanmakj.constraintlayoutdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * @author zjy
 * @date 2018/5/8
 */
public class GroupDemoActivity extends AppCompatActivity {

    private Group mGroup;
    private Button mBtn1;
    private Button mBtn2;
    private Button mTv;

    public static void start(Context context) {
        Intent intent = new Intent(context, GroupDemoActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_demo);

        initView();
    }

    public void changeVisible(View view) {
        int visibility = mGroup.getVisibility();
        if (visibility == View.GONE) {
            mGroup.setVisibility(View.VISIBLE);
        } else {
            mGroup.setVisibility(View.GONE);
        }
    }

    private void initView() {
        mGroup = findViewById(R.id.group);
        mBtn1 = findViewById(R.id.btn1);
        mBtn2 = findViewById(R.id.btn2);
        mTv = findViewById(R.id.tv);
    }
}
