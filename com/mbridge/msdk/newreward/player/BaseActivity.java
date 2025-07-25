package com.mbridge.msdk.newreward.player;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.C21114v8;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.newreward.player.presenter.ActivityPresenter;

/* loaded from: classes6.dex */
public class BaseActivity extends Activity {
    private final String TAG = "BaseActivity";
    ActivityPresenter activityPresenter;

    private void hideNavigationBar() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        } catch (Throwable th) {
            SameLogTool.m51824b("BaseActivity", th.getMessage());
        }
    }

    private void setActivityFull() {
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            hideNavigationBar();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("BaseActivity", e.getMessage());
        }
    }

    private void updateScreenSize(boolean z) {
        if (z) {
            int i = getResources().getDisplayMetrics().widthPixels;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName("onBackPressed");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setActivityFull();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName("onDestroy");
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName(C21114v8.C21122h.f54092t0);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName(C21114v8.C21122h.f54094u0);
        MBSDKContext.m52746m().m52803a(this);
        hideNavigationBar();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName("onStart");
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        ActivityPresenter activityPresenter = this.activityPresenter;
        if (activityPresenter == null) {
            return;
        }
        activityPresenter.bindMethodName("onStop");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        hideNavigationBar();
        updateScreenSize(z);
    }
}
