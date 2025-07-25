package com.applovin.impl;

import android.view.Surface;

/* renamed from: com.applovin.impl.nd */
/* loaded from: classes2.dex */
public class C5007nd extends C4583id {

    /* renamed from: c */
    public final int f8557c;

    /* renamed from: d */
    public final boolean f8558d;

    public C5007nd(Throwable th, C4647jd c4647jd, Surface surface) {
        super(th, c4647jd);
        boolean z;
        this.f8557c = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z = false;
        } else {
            z = true;
        }
        this.f8558d = z;
    }
}
