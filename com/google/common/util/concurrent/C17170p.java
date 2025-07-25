package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.common.util.concurrent.p */
/* loaded from: classes4.dex */
public final /* synthetic */ class C17170p {
    /* renamed from: a */
    public static /* synthetic */ boolean m67426a(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
