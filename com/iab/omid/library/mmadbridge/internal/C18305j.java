package com.iab.omid.library.mmadbridge.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.mmadbridge.adsession.C18286a;
import java.lang.ref.WeakReference;

/* renamed from: com.iab.omid.library.mmadbridge.internal.j */
/* loaded from: classes6.dex */
public class C18305j {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18305j f45976d = new C18305j();

    /* renamed from: a */
    private WeakReference<Context> f45977a;

    /* renamed from: b */
    private boolean f45978b = false;

    /* renamed from: c */
    private boolean f45979c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.mmadbridge.internal.j$a */
    /* loaded from: classes6.dex */
    public class C18306a extends BroadcastReceiver {
        C18306a() {
            C18305j.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C18305j c18305j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c18305j = C18305j.this;
                z = c18305j.f45979c;
                z2 = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                c18305j = C18305j.this;
                z = c18305j.f45979c;
                z2 = false;
            } else {
                return;
            }
            c18305j.m63195a(z2, z);
            C18305j.this.f45978b = z2;
        }
    }

    /* renamed from: b */
    public static C18305j m63194b() {
        return f45976d;
    }

    /* renamed from: a */
    public void m63199a() {
        Context context = this.f45977a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m63195a(this.f45978b, isDeviceLocked);
        this.f45979c = isDeviceLocked;
    }

    /* renamed from: a */
    public void m63198a(Context context) {
        if (context == null) {
            return;
        }
        this.f45977a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C18306a(), intentFilter);
    }

    /* renamed from: a */
    public void m63195a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f45979c || this.f45978b)) {
            return;
        }
        for (C18286a c18286a : C18296c.m63252c().m63254b()) {
            c18286a.getAdSessionStatePublisher().m63171b(z2 || z);
        }
    }
}
