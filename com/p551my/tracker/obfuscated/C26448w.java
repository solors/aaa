package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: com.my.tracker.obfuscated.w */
/* loaded from: classes7.dex */
public final class C26448w {

    /* renamed from: f */
    static int f69061f = 3;

    /* renamed from: g */
    static volatile C26448w f69062g;

    /* renamed from: a */
    final C26382p f69063a;

    /* renamed from: b */
    final C26332h f69064b;

    /* renamed from: c */
    final Context f69065c;

    /* renamed from: d */
    InstallReferrerClient f69066d;

    /* renamed from: e */
    int f69067e;

    /* renamed from: com.my.tracker.obfuscated.w$a */
    /* loaded from: classes7.dex */
    public final class C26449a implements InstallReferrerStateListener {
        C26449a() {
            C26448w.this = r1;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            C26468z0.m41528a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + C26448w.this.f69067e);
            C26448w.this.m41566a(this);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            C26468z0.m41528a("ReferrerHandler: install referrer setup is finished");
            if (i == -1) {
                C26448w.this.m41566a(this);
            } else {
                C26448w.this.m41567a(i);
            }
        }
    }

    C26448w(C26382p c26382p, C26332h c26332h, Context context) {
        this.f69063a = c26382p;
        this.f69064b = c26332h;
        this.f69065c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static /* synthetic */ void m41562a(C26448w c26448w, ReferrerDetails referrerDetails) {
        c26448w.m41558b(referrerDetails);
    }

    /* renamed from: b */
    public static /* synthetic */ void m41557b(C26448w c26448w) {
        c26448w.m41556c();
    }

    /* renamed from: c */
    public static /* synthetic */ void m41555c(C26448w c26448w) {
        m41563a(c26448w);
    }

    /* renamed from: c */
    public /* synthetic */ void m41556c() {
        try {
            C26468z0.m41528a("ReferrerHandler: initialize InstallReferrerClient");
            this.f69066d = InstallReferrerClient.newBuilder(this.f69065c).build();
            m41566a(new C26449a());
        } catch (Throwable th) {
            C26468z0.m41524b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    /* renamed from: a */
    void m41568a() {
        if (C26400r0.m41763a(this.f69065c).m41732n()) {
            return;
        }
        C26325g.m42071c(new Runnable() { // from class: com.my.tracker.obfuscated.v3
            @Override // java.lang.Runnable
            public final void run() {
                C26448w.m41557b(C26448w.this);
            }
        });
    }

    /* renamed from: b */
    void m41559b() {
        C26400r0 m41763a = C26400r0.m41763a(this.f69065c);
        if (m41763a.m41729q()) {
            return;
        }
        String m41735l = m41763a.m41735l();
        if (TextUtils.isEmpty(m41735l)) {
            return;
        }
        m41560a(m41735l, (Runnable) null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0036 -> B:35:0x003b). Please submit an issue!!! */
    /* renamed from: a */
    void m41567a(int i) {
        if (this.f69066d == null) {
            C26468z0.m41525b("ReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                C26468z0.m41528a("ReferrerHandler: retrieving install referrer");
                final ReferrerDetails installReferrer = this.f69066d.getInstallReferrer();
                C26325g.m42073a(new Runnable() { // from class: com.my.tracker.obfuscated.u3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C26448w.m41562a(C26448w.this, installReferrer);
                    }
                });
            } else {
                C26468z0.m41528a("ReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            C26468z0.m41524b("ReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.f69066d.endConnection();
        } catch (Throwable unused) {
        }
        this.f69066d = null;
    }

    /* renamed from: a */
    void m41566a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.f69066d;
        if (installReferrerClient == null) {
            C26468z0.m41528a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.f69067e;
        if (i >= f69061f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.f69066d = null;
            return;
        }
        this.f69067e = i + 1;
        try {
            C26468z0.m41528a("ReferrerHandler: connect to referrer client");
            this.f69066d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            C26468z0.m41524b("ReferrerHandler: error occurred while connection InstallReferrerClient", th);
            m41566a(installReferrerStateListener);
        }
    }

    /* renamed from: a */
    public void m41558b(ReferrerDetails referrerDetails) {
        C26400r0 m41763a = C26400r0.m41763a(this.f69065c);
        if (m41763a.m41732n()) {
            C26468z0.m41528a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        C26468z0.m41528a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.f69063a.m41865a(installReferrer, AbstractC26356k.m41974b(this.f69065c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f69064b.m42060a(installReferrer);
        m41763a.m41728r();
    }

    /* renamed from: a */
    public static void m41564a(C26382p c26382p, C26332h c26332h, Context context) {
        if (f69062g != null) {
            return;
        }
        synchronized (C26448w.class) {
            if (f69062g != null) {
                return;
            }
            C26448w c26448w = new C26448w(c26382p, c26332h, context);
            C26325g.m42073a(new Runnable() { // from class: com.my.tracker.obfuscated.w3
                @Override // java.lang.Runnable
                public final void run() {
                    C26448w.m41555c(C26448w.this);
                }
            });
            f69062g = c26448w;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m41563a(C26448w c26448w) {
        c26448w.m41559b();
        c26448w.m41568a();
    }

    /* renamed from: a */
    public static void m41561a(String str, Context context, Runnable runnable) {
        C26448w c26448w = f69062g;
        if (c26448w != null) {
            c26448w.m41560a(str, runnable);
            return;
        }
        C26400r0 m41763a = C26400r0.m41763a(context);
        if (!m41763a.m41729q()) {
            m41763a.m41734l(str);
        }
        runnable.run();
    }

    /* renamed from: a */
    void m41560a(String str, Runnable runnable) {
        C26400r0 m41763a = C26400r0.m41763a(this.f69065c);
        if (m41763a.m41729q()) {
            C26468z0.m41528a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.f69063a.m41862a(str, AbstractC26356k.m41974b(this.f69065c), runnable);
        this.f69064b.m42060a(str);
        m41763a.m41725u();
    }
}
