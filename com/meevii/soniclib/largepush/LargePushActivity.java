package com.meevii.soniclib.largepush;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.meevii.soniclib.C23336R;
import com.meevii.soniclib.largepush.style.BasePushUiStyle;
import com.meevii.soniclib.largepush.style.LargePushUiStyle;

/* loaded from: classes5.dex */
public class LargePushActivity extends AppCompatActivity {
    public static final String LARGE_PUSH_DATA_KEY = "large_push_data_key";
    private FrameLayout mFrameParent;
    private LargePushData mLargePushData;
    private BasePushUiStyle mPushUiStyle;
    public StyleData[] mStyleDataArray = {new StyleData("afternoon_push", C23336R.C23341layout.large_push_a, "large_push_lottie/giftbox.json"), new StyleData("night_push", C23336R.C23341layout.large_push_b, "large_push_lottie/remove.json")};

    private void initWindowSetting() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C23336R.dimen.dp_400);
        Window window = getWindow();
        window.setFlags(32, 32);
        window.setLayout(-1, dimensionPixelOffset);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 8388659;
        window.setAttributes(attributes);
    }

    private void updateDataAndView() {
        try {
            if (getIntent() != null) {
                this.mLargePushData = (LargePushData) getIntent().getParcelableExtra(LARGE_PUSH_DATA_KEY);
            }
            LargePushData largePushData = this.mLargePushData;
            if (largePushData != null && !largePushData.isDirty()) {
                int uiStyle = this.mLargePushData.getUiStyle();
                StyleData styleData = this.mStyleDataArray[(uiStyle < 0 || uiStyle >= this.mStyleDataArray.length) ? 0 : 0];
                this.mFrameParent.removeAllViews();
                View inflate = LayoutInflater.from(this).inflate(styleData.getLayoutId(), (ViewGroup) null);
                this.mFrameParent.addView(inflate);
                LargePushUiStyle largePushUiStyle = new LargePushUiStyle();
                this.mPushUiStyle = largePushUiStyle;
                largePushUiStyle.init(this, inflate, this.mLargePushData, styleData);
                return;
            }
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C23336R.C23341layout.activity_large_push);
        this.mFrameParent = (FrameLayout) findViewById(C23336R.C23339id.frame_parent);
        initWindowSetting();
        updateDataAndView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        updateDataAndView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        BasePushUiStyle basePushUiStyle = this.mPushUiStyle;
        if (basePushUiStyle != null) {
            basePushUiStyle.onPause();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        BasePushUiStyle basePushUiStyle = this.mPushUiStyle;
        if (basePushUiStyle != null) {
            basePushUiStyle.onResume();
        }
    }
}
