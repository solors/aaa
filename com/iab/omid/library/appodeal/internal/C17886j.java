package com.iab.omid.library.appodeal.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.appodeal.adsession.C17867a;
import java.lang.ref.WeakReference;

/* renamed from: com.iab.omid.library.appodeal.internal.j */
/* loaded from: classes6.dex */
public class C17886j {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C17886j f45088d = new C17886j();

    /* renamed from: a */
    private WeakReference<Context> f45089a;

    /* renamed from: b */
    private boolean f45090b = false;

    /* renamed from: c */
    private boolean f45091c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.appodeal.internal.j$a */
    /* loaded from: classes6.dex */
    public class C17887a extends BroadcastReceiver {
        C17887a() {
            C17886j.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C17886j c17886j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c17886j = C17886j.this;
                z = c17886j.f45091c;
                z2 = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                c17886j = C17886j.this;
                z = c17886j.f45091c;
                z2 = false;
            } else {
                return;
            }
            c17886j.m64841a(z2, z);
            C17886j.this.f45090b = z2;
        }
    }

    /* renamed from: b */
    public static C17886j m64840b() {
        return f45088d;
    }

    /* renamed from: a */
    public void m64845a() {
        Context context = this.f45089a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m64841a(this.f45090b, isDeviceLocked);
        this.f45091c = isDeviceLocked;
    }

    /* renamed from: a */
    public void m64844a(Context context) {
        if (context == null) {
            return;
        }
        this.f45089a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C17887a(), intentFilter);
    }

    /* renamed from: a */
    public void m64841a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f45091c || this.f45090b)) {
            return;
        }
        for (C17867a c17867a : C17877c.m64898c().m64900b()) {
            c17867a.getAdSessionStatePublisher().m64817b(z2 || z);
        }
    }
}
