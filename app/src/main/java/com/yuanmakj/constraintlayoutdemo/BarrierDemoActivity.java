package com.yuanmakj.constraintlayoutdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.Barrier;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;

/**
 * @author zjy
 * @date 2018/5/8
 */
public class BarrierDemoActivity extends AppCompatActivity {

    private Barrier mBarrier;
    private Button mBtn1;
    private Button mBtn2;
    private Button mBtnChange;
    private ConstraintLayout mConstraintLayout;

    public static void start(Context context) {
        Intent intent = new Intent(context, BarrierDemoActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barrier);

        initView();
    }

    @SuppressLint("NewApi")
    public void change(View view) {
        TransitionManager.beginDelayedTransition(mConstraintLayout);
        mBtn1.setVisibility(mBtn1.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
    }

    private void initView() {
        mBarrier = findViewById(R.id.barrier);
        mBtn1 = findViewById(R.id.btn1);
        mBtn2 = findViewById(R.id.btn2);
        mBtnChange = findViewById(R.id.btn_change);
        mConstraintLayout = findViewById(R.id.constraint_layout);
    }
}
