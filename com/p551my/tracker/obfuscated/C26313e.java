package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.my.tracker.obfuscated.e */
/* loaded from: classes7.dex */
public final class C26313e {

    /* renamed from: a */
    final AtomicReference<String> f68557a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<Integer> f68558b = new AtomicReference<>(-1);

    /* renamed from: c */
    boolean f68559c = false;

    /* renamed from: com.my.tracker.obfuscated.e$a */
    /* loaded from: classes7.dex */
    public static final class C26314a {

        /* renamed from: a */
        public static final boolean f68560a;

        static {
            boolean z = false;
            try {
                if (AppSet.class.equals(AppSet.class) && AppSetIdClient.class.equals(AppSetIdClient.class)) {
                    if (AppSetIdInfo.class.equals(AppSetIdInfo.class)) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                C26468z0.m41527a("AppSetIdProvider: error occurred while working with App Set library classes", th);
            }
            f68560a = z;
        }
    }

    /* renamed from: b */
    void m42086b(Context context) {
        final C26400r0 m41763a = C26400r0.m41763a(context);
        this.f68557a.set(m41763a.m41752d());
        if (!C26314a.f68560a) {
            C26468z0.m41528a("AppSetIdProvider: app set library is not available");
            return;
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(C26325g.f68590c, new OnSuccessListener() { // from class: com.my.tracker.obfuscated.u1
                {
                    C26313e.this = this;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C26313e.this.m42088a(m41763a, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable th) {
            C26468z0.m41527a("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        m42091a();
    }

    /* renamed from: a */
    void m42091a() {
        try {
            String str = this.f68557a.get();
            if (TextUtils.isEmpty(str)) {
                synchronized (this.f68557a) {
                    this.f68557a.wait(300L);
                }
                C26468z0.m41528a("AppSetIdProvider: timeout for collecting id has exceeded");
                return;
            }
            C26468z0.m41528a("AppSetIdProvider: app set id has been collected, value: " + str);
        } catch (Throwable th) {
            C26468z0.m41527a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }

    /* renamed from: a */
    public void m42090a(Context context) {
        if (this.f68559c) {
            return;
        }
        m42086b(context);
        this.f68559c = true;
    }

    /* renamed from: a */
    public /* synthetic */ void m42088a(C26400r0 c26400r0, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != this.f68558b.getAndSet(Integer.valueOf(scope)).intValue()) {
            c26400r0.m41765a(scope);
        }
        String id2 = appSetIdInfo.getId();
        if (!id2.equals(this.f68557a.getAndSet(id2))) {
            c26400r0.m41746f(id2);
            C26468z0.m41528a("AppSetIdProvider: new id value has been received: " + id2);
        }
        synchronized (this.f68557a) {
            this.f68557a.notify();
        }
    }

    /* renamed from: a */
    public void m42087a(C26405s0 c26405s0, Context context) {
        StringBuilder sb2;
        String str;
        if (TextUtils.isEmpty(this.f68557a.get()) || this.f68558b.get().intValue() == -1) {
            sb2 = new StringBuilder();
            sb2.append("AppSetIdProvider: App Set ID ");
            sb2.append(this.f68557a.get());
            sb2.append(" and Scope ");
            sb2.append(this.f68558b.get());
            str = " were not sent due to its values";
        } else {
            c26405s0.m41711a(this.f68557a.get(), this.f68558b.get().intValue());
            sb2 = new StringBuilder();
            sb2.append("AppSetIdProvider: App Set ID ");
            sb2.append(this.f68557a.get());
            sb2.append(" and Scope ");
            sb2.append(this.f68558b.get());
            str = " set to proto builder successfully";
        }
        sb2.append(str);
        C26468z0.m41528a(sb2.toString());
    }

    /* renamed from: c */
    public void m42085c(Context context) {
    }
}
