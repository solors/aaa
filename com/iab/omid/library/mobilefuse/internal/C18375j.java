package com.iab.omid.library.mobilefuse.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.mobilefuse.adsession.C18356a;
import java.lang.ref.WeakReference;

/* renamed from: com.iab.omid.library.mobilefuse.internal.j */
/* loaded from: classes6.dex */
public class C18375j {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18375j f46111d = new C18375j();

    /* renamed from: a */
    private WeakReference<Context> f46112a;

    /* renamed from: b */
    private boolean f46113b = false;

    /* renamed from: c */
    private boolean f46114c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.mobilefuse.internal.j$a */
    /* loaded from: classes6.dex */
    public class C18376a extends BroadcastReceiver {
        C18376a() {
            C18375j.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C18375j c18375j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c18375j = C18375j.this;
                z = c18375j.f46114c;
                z2 = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                c18375j = C18375j.this;
                z = c18375j.f46114c;
                z2 = false;
            } else {
                return;
            }
            c18375j.m62942a(z2, z);
            C18375j.this.f46113b = z2;
        }
    }

    /* renamed from: b */
    public static C18375j m62941b() {
        return f46111d;
    }

    /* renamed from: a */
    public void m62946a() {
        Context context = this.f46112a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m62942a(this.f46113b, isDeviceLocked);
        this.f46114c = isDeviceLocked;
    }

    /* renamed from: a */
    public void m62945a(Context context) {
        if (context == null) {
            return;
        }
        this.f46112a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C18376a(), intentFilter);
    }

    /* renamed from: a */
    public void m62942a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f46114c || this.f46113b)) {
            return;
        }
        for (C18356a c18356a : C18366c.m62999c().m63001b()) {
            c18356a.getAdSessionStatePublisher().m62918b(z2 || z);
        }
    }
}
