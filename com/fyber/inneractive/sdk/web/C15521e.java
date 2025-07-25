package com.fyber.inneractive.sdk.web;

import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.RunnableC15441d;
import com.fyber.inneractive.sdk.util.RunnableC15443e;
import com.fyber.inneractive.sdk.util.ThreadFactoryC15437b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.fyber.inneractive.sdk.web.e */
/* loaded from: classes4.dex */
public final class C15521e {

    /* renamed from: c */
    public RunnableC15443e f30748c;

    /* renamed from: d */
    public RunnableC15441d f30749d;

    /* renamed from: g */
    public final /* synthetic */ String f30752g;

    /* renamed from: h */
    public final /* synthetic */ boolean f30753h;

    /* renamed from: i */
    public final /* synthetic */ String f30754i;

    /* renamed from: j */
    public final /* synthetic */ String f30755j;

    /* renamed from: k */
    public final /* synthetic */ String f30756k;

    /* renamed from: l */
    public final /* synthetic */ AbstractC15529i f30757l;

    /* renamed from: b */
    public Handler f30747b = null;

    /* renamed from: e */
    public final Object f30750e = new Object();

    /* renamed from: f */
    public boolean f30751f = false;

    /* renamed from: a */
    public final ExecutorService f30746a = Executors.newSingleThreadExecutor(new ThreadFactoryC15437b());

    public C15521e(AbstractC15532j0 abstractC15532j0, String str, boolean z, String str2, String str3, String str4) {
        this.f30757l = abstractC15532j0;
        this.f30752g = str;
        this.f30753h = z;
        this.f30754i = str2;
        this.f30755j = str3;
        this.f30756k = str4;
    }

    /* renamed from: a */
    public final Handler m76403a() {
        if (this.f30747b == null) {
            synchronized (this.f30750e) {
                this.f30747b = new Handler(Looper.getMainLooper());
            }
        }
        return this.f30747b;
    }
}
