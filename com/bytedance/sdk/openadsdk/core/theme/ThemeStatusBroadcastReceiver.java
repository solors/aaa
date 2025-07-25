package com.bytedance.sdk.openadsdk.core.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: bg */
    private WeakReference<Object> f20155bg;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        intent.getIntExtra("theme_status_change", 0);
        WeakReference<Object> weakReference = this.f20155bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f20155bg.get();
        }
    }
}
