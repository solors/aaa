package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import com.bytedance.sdk.component.utils.C7741PX;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class TTBaseActivity extends Activity {

    /* renamed from: iR */
    protected boolean f17383iR = false;

    /* renamed from: IL */
    public void m87260IL(boolean z) {
        this.f17383iR = z;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                super.onPause();
                return;
            } catch (IllegalArgumentException e) {
                C7741PX.m87871bg("TTBaseActivity", "super.onPause(); run fail", e);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, Boolean.TRUE);
                    return;
                } catch (Exception e2) {
                    C7741PX.m87871bg("TTBaseActivity", "onPause() set mCalled fail", e2);
                    return;
                }
            }
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                super.onResume();
                return;
            } catch (IllegalArgumentException e) {
                C7741PX.m87871bg("TTBaseActivity", "super.onResume() run fail", e);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, Boolean.TRUE);
                    return;
                } catch (Exception e2) {
                    C7741PX.m87871bg("TTBaseActivity", "onResume set mCalled fail", e2);
                    return;
                }
            }
        }
        super.onResume();
    }
}
