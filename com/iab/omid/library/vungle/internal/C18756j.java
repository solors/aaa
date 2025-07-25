package com.iab.omid.library.vungle.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.vungle.adsession.C18737a;
import java.lang.ref.WeakReference;

/* renamed from: com.iab.omid.library.vungle.internal.j */
/* loaded from: classes6.dex */
public class C18756j {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18756j f46907d = new C18756j();

    /* renamed from: a */
    private WeakReference<Context> f46908a;

    /* renamed from: b */
    private boolean f46909b = false;

    /* renamed from: c */
    private boolean f46910c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.vungle.internal.j$a */
    /* loaded from: classes6.dex */
    public class C18757a extends BroadcastReceiver {
        C18757a() {
            C18756j.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C18756j c18756j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c18756j = C18756j.this;
                z = c18756j.f46910c;
                z2 = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                c18756j = C18756j.this;
                z = c18756j.f46910c;
                z2 = false;
            } else {
                return;
            }
            c18756j.m61461a(z2, z);
            C18756j.this.f46909b = z2;
        }
    }

    /* renamed from: b */
    public static C18756j m61460b() {
        return f46907d;
    }

    /* renamed from: a */
    public void m61465a() {
        Context context = this.f46908a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m61461a(this.f46909b, isDeviceLocked);
        this.f46910c = isDeviceLocked;
    }

    /* renamed from: a */
    public void m61464a(Context context) {
        if (context == null) {
            return;
        }
        this.f46908a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C18757a(), intentFilter);
    }

    /* renamed from: a */
    public void m61461a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f46910c || this.f46909b)) {
            return;
        }
        for (C18737a c18737a : C18747c.m61518c().m61520b()) {
            c18737a.getAdSessionStatePublisher().m61437b(z2 || z);
        }
    }
}
