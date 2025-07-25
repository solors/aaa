package com.iab.omid.library.pubnativenet.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.pubnativenet.adsession.C18496a;
import java.lang.ref.WeakReference;

/* renamed from: com.iab.omid.library.pubnativenet.internal.j */
/* loaded from: classes6.dex */
public class C18515j {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18515j f46381d = new C18515j();

    /* renamed from: a */
    private WeakReference<Context> f46382a;

    /* renamed from: b */
    private boolean f46383b = false;

    /* renamed from: c */
    private boolean f46384c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.pubnativenet.internal.j$a */
    /* loaded from: classes6.dex */
    public class C18516a extends BroadcastReceiver {
        C18516a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C18515j c18515j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c18515j = C18515j.this;
                z = c18515j.f46384c;
                z2 = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                c18515j = C18515j.this;
                z = c18515j.f46384c;
                z2 = false;
            } else {
                return;
            }
            c18515j.m62436a(z2, z);
            C18515j.this.f46383b = z2;
        }
    }

    /* renamed from: b */
    public static C18515j m62435b() {
        return f46381d;
    }

    /* renamed from: a */
    public void m62440a() {
        Context context = this.f46382a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m62436a(this.f46383b, isDeviceLocked);
        this.f46384c = isDeviceLocked;
    }

    /* renamed from: a */
    public void m62439a(Context context) {
        if (context == null) {
            return;
        }
        this.f46382a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C18516a(), intentFilter);
    }

    /* renamed from: a */
    public void m62436a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f46384c || this.f46383b)) {
            return;
        }
        for (C18496a c18496a : C18506c.m62493c().m62495b()) {
            c18496a.getAdSessionStatePublisher().m62412b(z2 || z);
        }
    }
}
