package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public class InneractiveBaseActivity extends Activity {

    /* renamed from: a */
    public C14179b f26856a;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f26856a = new C14179b(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f26856a);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                if (this.f26856a != null) {
                    getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f26856a);
                    this.f26856a = null;
                }
            } catch (Exception e) {
                IAlog.m76524f("failed to unregisterOnBackInvokedCallback with error: %s", e.getMessage());
            }
        }
    }
}
