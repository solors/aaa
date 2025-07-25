package com.iab.omid.library.pubmatic.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.pubmatic.adsession.C18426a;
import java.lang.ref.WeakReference;

/* renamed from: com.iab.omid.library.pubmatic.internal.j */
/* loaded from: classes6.dex */
public class C18445j {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18445j f46246d = new C18445j();

    /* renamed from: a */
    private WeakReference<Context> f46247a;

    /* renamed from: b */
    private boolean f46248b = false;

    /* renamed from: c */
    private boolean f46249c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.pubmatic.internal.j$a */
    /* loaded from: classes6.dex */
    public class C18446a extends BroadcastReceiver {
        C18446a() {
            C18445j.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C18445j c18445j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c18445j = C18445j.this;
                z = c18445j.f46249c;
                z2 = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                c18445j = C18445j.this;
                z = c18445j.f46249c;
                z2 = false;
            } else {
                return;
            }
            c18445j.m62689a(z2, z);
            C18445j.this.f46248b = z2;
        }
    }

    /* renamed from: b */
    public static C18445j m62688b() {
        return f46246d;
    }

    /* renamed from: a */
    public void m62693a() {
        Context context = this.f46247a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m62689a(this.f46248b, isDeviceLocked);
        this.f46249c = isDeviceLocked;
    }

    /* renamed from: a */
    public void m62692a(Context context) {
        if (context == null) {
            return;
        }
        this.f46247a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C18446a(), intentFilter);
    }

    /* renamed from: a */
    public void m62689a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f46249c || this.f46248b)) {
            return;
        }
        for (C18426a c18426a : C18436c.m62746c().m62748b()) {
            c18426a.getAdSessionStatePublisher().m62665b(z2 || z);
        }
    }
}
