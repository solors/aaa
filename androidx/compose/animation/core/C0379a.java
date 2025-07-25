package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.compose.animation.core.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0379a {
    /* renamed from: a */
    public static /* synthetic */ boolean m105461a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
