package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.jt */
/* loaded from: classes6.dex */
public interface InterfaceC20169jt {
    /* renamed from: a */
    static /* synthetic */ void m57780a(InterfaceC20169jt interfaceC20169jt, Runnable runnable, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = 0;
            }
            interfaceC20169jt.mo54478a(runnable, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
    }

    /* renamed from: a */
    void mo54479a(@NotNull Runnable runnable);

    /* renamed from: a */
    void mo54478a(@NotNull Runnable runnable, long j);
}
