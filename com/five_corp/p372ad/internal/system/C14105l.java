package com.five_corp.p372ad.internal.system;

import android.os.Handler;
import android.os.Looper;
import com.five_corp.p372ad.internal.util.C14120h;
import java.util.Timer;

/* renamed from: com.five_corp.ad.internal.system.l */
/* loaded from: classes4.dex */
public final class C14105l {

    /* renamed from: a */
    public final Object f26314a;

    /* renamed from: b */
    public final Handler f26315b;

    /* renamed from: c */
    public final long f26316c;

    /* renamed from: d */
    public final C14120h f26317d;

    /* renamed from: e */
    public Timer f26318e;

    public C14105l() {
        this(0);
    }

    public C14105l(int i) {
        this.f26314a = new Object();
        this.f26315b = new Handler(Looper.getMainLooper());
        this.f26316c = 200L;
        this.f26317d = new C14120h();
        this.f26318e = null;
    }
}
