package com.iab.omid.library.smaato.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.smaato.adsession.C18559a;
import java.lang.ref.WeakReference;

/* renamed from: com.iab.omid.library.smaato.internal.j */
/* loaded from: classes6.dex */
public class C18578j {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18578j f46516d = new C18578j();

    /* renamed from: a */
    private WeakReference<Context> f46517a;

    /* renamed from: b */
    private boolean f46518b = false;

    /* renamed from: c */
    private boolean f46519c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.smaato.internal.j$a */
    /* loaded from: classes6.dex */
    public class C18579a extends BroadcastReceiver {
        C18579a() {
            C18578j.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C18578j c18578j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c18578j = C18578j.this;
                z = c18578j.f46519c;
                z2 = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                c18578j = C18578j.this;
                z = c18578j.f46519c;
                z2 = false;
            } else {
                return;
            }
            c18578j.m62183a(z2, z);
            C18578j.this.f46518b = z2;
        }
    }

    /* renamed from: b */
    public static C18578j m62182b() {
        return f46516d;
    }

    /* renamed from: a */
    public void m62187a() {
        Context context = this.f46517a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m62183a(this.f46518b, isDeviceLocked);
        this.f46519c = isDeviceLocked;
    }

    /* renamed from: a */
    public void m62186a(Context context) {
        if (context == null) {
            return;
        }
        this.f46517a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C18579a(), intentFilter);
    }

    /* renamed from: a */
    public void m62183a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f46519c || this.f46518b)) {
            return;
        }
        for (C18559a c18559a : C18569c.m62240c().m62242b()) {
            c18559a.getAdSessionStatePublisher().m62159b(z2 || z);
        }
    }
}
