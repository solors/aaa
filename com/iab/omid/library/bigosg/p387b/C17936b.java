package com.iab.omid.library.bigosg.p387b;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.bigosg.adsession.C17933a;

/* renamed from: com.iab.omid.library.bigosg.b.b */
/* loaded from: classes6.dex */
public class C17936b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static C17936b f45193a = new C17936b();

    /* renamed from: b */
    private Context f45194b;

    /* renamed from: c */
    private BroadcastReceiver f45195c;

    /* renamed from: d */
    private boolean f45196d;

    /* renamed from: e */
    private boolean f45197e;

    /* renamed from: f */
    private InterfaceC17938a f45198f;

    /* renamed from: com.iab.omid.library.bigosg.b.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17938a {
        /* renamed from: a */
        void mo64614a(boolean z);
    }

    private C17936b() {
    }

    /* renamed from: a */
    public static C17936b m64652a() {
        return f45193a;
    }

    /* renamed from: e */
    private void m64644e() {
        this.f45195c = new BroadcastReceiver() { // from class: com.iab.omid.library.bigosg.b.b.1
            {
                C17936b.this = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent == null) {
                    return;
                }
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    C17936b.this.m64648a(true);
                } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    C17936b.this.m64648a(false);
                } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                    C17936b.this.m64648a(false);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f45194b.registerReceiver(this.f45195c, intentFilter);
    }

    /* renamed from: f */
    private void m64643f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f45194b;
        if (context != null && (broadcastReceiver = this.f45195c) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f45195c = null;
        }
    }

    /* renamed from: g */
    private void m64642g() {
        boolean z = !this.f45197e;
        for (C17933a c17933a : C17935a.m64659a().m64657b()) {
            c17933a.getAdSessionStatePublisher().m64544a(z);
        }
    }

    /* renamed from: b */
    public void m64647b() {
        m64644e();
        this.f45196d = true;
        m64642g();
    }

    /* renamed from: c */
    public void m64646c() {
        m64643f();
        this.f45196d = false;
        this.f45197e = false;
        this.f45198f = null;
    }

    /* renamed from: d */
    public boolean m64645d() {
        if (!this.f45197e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m64651a(@NonNull Context context) {
        this.f45194b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m64650a(InterfaceC17938a interfaceC17938a) {
        this.f45198f = interfaceC17938a;
    }

    /* renamed from: a */
    public void m64648a(boolean z) {
        if (this.f45197e != z) {
            this.f45197e = z;
            if (this.f45196d) {
                m64642g();
                InterfaceC17938a interfaceC17938a = this.f45198f;
                if (interfaceC17938a != null) {
                    interfaceC17938a.mo64614a(m64645d());
                }
            }
        }
    }
}
