package androidx.concurrent.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.concurrent.futures.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1074a {
    /* renamed from: a */
    public static /* synthetic */ boolean m105283a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
