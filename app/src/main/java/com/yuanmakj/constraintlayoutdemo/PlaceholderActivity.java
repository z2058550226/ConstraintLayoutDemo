package com.yuanmakj.constraintlayoutdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author zjy
 * @date 2018/5/8
 */
public class PlaceholderActivity extends AppCompatActivity {


    private Placeholder mPlaceholder;
    private Placeholder mPh2;
    private TextView mTv1;
    boolean isPh1 = false;
    private ConstraintLayout mConstraintLayout;

    public static void start(Context context) {
        Intent intent = new Intent(context, PlaceholderActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeholder);

        initView();
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PlaceholderActivity.this,"tv1",Toast.LENGTH_LONG).show();
            }
        });
        mPlaceholder.setEmptyVisibility(View.VISIBLE);
    }

    private void initView() {
        mPlaceholder = findViewById(R.id.placeholder);
        mPh2 = findViewById(R.id.ph2);
        mTv1 = findViewById(R.id.tv1);
        mConstraintLayout = findViewById(R.id.constraint_layout);
    }

    @SuppressLint("NewApi")
    public void changePlaceholder(View view) {
        TransitionManager.beginDelayedTransition(mConstraintLayout);
        if (isPh1 = !isPh1) {
            mPlaceholder.setContentId(R.id.tv1);
        } else {
            mPh2.setContentId(R.id.tv1);
        }
    }
}
