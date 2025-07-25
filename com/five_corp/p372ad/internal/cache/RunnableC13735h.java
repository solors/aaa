package com.five_corp.p372ad.internal.cache;

import android.graphics.Bitmap;

/* renamed from: com.five_corp.ad.internal.cache.h */
/* loaded from: classes4.dex */
public final class RunnableC13735h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC13732e f25513a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f25514b;

    public RunnableC13735h(InterfaceC13732e interfaceC13732e, Bitmap bitmap) {
        this.f25513a = interfaceC13732e;
        this.f25514b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25513a.mo78036a(this.f25514b);
    }
}
