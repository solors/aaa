package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: bg */
    private WeakReference<InterfaceC7560bg> f16465bg;

    /* renamed from: bg */
    public void m88556bg(InterfaceC7560bg interfaceC7560bg) {
        this.f16465bg = new WeakReference<>(interfaceC7560bg);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<InterfaceC7560bg> weakReference = this.f16465bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16465bg.get().onThemeChanged(intExtra);
        }
    }
}
