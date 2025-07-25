package com.inmobi.media;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.inmobi.media.bb */
/* loaded from: classes6.dex */
public abstract class AbstractC19220bb {

    /* renamed from: a */
    public static final InterfaceC38501j f48111a;

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C19206ab.f48071a);
        f48111a = m14554a;
    }

    /* renamed from: a */
    public static final void m60431a(@NotNull Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((Handler) f48111a.getValue()).postDelayed(runnable, j);
    }

    /* renamed from: a */
    public static final void m60432a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((Handler) f48111a.getValue()).post(runnable);
    }
}
