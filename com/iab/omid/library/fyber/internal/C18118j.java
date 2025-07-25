package com.iab.omid.library.fyber.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.fyber.adsession.C18099a;
import java.lang.ref.WeakReference;

/* renamed from: com.iab.omid.library.fyber.internal.j */
/* loaded from: classes6.dex */
public class C18118j {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18118j f45587d = new C18118j();

    /* renamed from: a */
    private WeakReference<Context> f45588a;

    /* renamed from: b */
    private boolean f45589b = false;

    /* renamed from: c */
    private boolean f45590c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.fyber.internal.j$a */
    /* loaded from: classes6.dex */
    public class C18119a extends BroadcastReceiver {
        C18119a() {
            C18118j.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C18118j c18118j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c18118j = C18118j.this;
                z = c18118j.f45590c;
                z2 = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                c18118j = C18118j.this;
                z = c18118j.f45590c;
                z2 = false;
            } else {
                return;
            }
            c18118j.m63924a(z2, z);
            C18118j.this.f45589b = z2;
        }
    }

    /* renamed from: b */
    public static C18118j m63923b() {
        return f45587d;
    }

    /* renamed from: a */
    public void m63928a() {
        Context context = this.f45588a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m63924a(this.f45589b, isDeviceLocked);
        this.f45590c = isDeviceLocked;
    }

    /* renamed from: a */
    public void m63927a(Context context) {
        if (context == null) {
            return;
        }
        this.f45588a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C18119a(), intentFilter);
    }

    /* renamed from: a */
    public void m63924a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f45590c || this.f45589b)) {
            return;
        }
        for (C18099a c18099a : C18109c.m63981c().m63983b()) {
            c18099a.getAdSessionStatePublisher().m63900b(z2 || z);
        }
    }
}
