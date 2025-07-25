package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.cn */
/* loaded from: classes9.dex */
public final class C34463cn {

    /* renamed from: c */
    public static final int[] f94126c = {0, 1, 2, 3};

    /* renamed from: a */
    public final SparseArray f94127a = new SparseArray();

    /* renamed from: b */
    public int f94128b = 0;

    public C34463cn(int[] iArr) {
        for (int i : iArr) {
            this.f94127a.put(i, new HashMap());
        }
    }
}
