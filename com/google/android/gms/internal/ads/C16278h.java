package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.gms.internal.ads.h */
/* loaded from: classes5.dex */
public final /* synthetic */ class C16278h {
    /* renamed from: a */
    public static /* synthetic */ boolean m72294a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
