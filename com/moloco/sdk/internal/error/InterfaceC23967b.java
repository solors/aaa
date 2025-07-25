package com.moloco.sdk.internal.error;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.error.b */
/* loaded from: classes7.dex */
public interface InterfaceC23967b {

    /* renamed from: com.moloco.sdk.internal.error.b$a */
    /* loaded from: classes7.dex */
    public static final class C23968a {
        /* renamed from: a */
        public static /* synthetic */ void m47257a(InterfaceC23967b interfaceC23967b, String str, C23964a c23964a, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    c23964a = new C23964a(null, 1, null);
                }
                interfaceC23967b.mo47256a(str, c23964a);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
        }
    }

    /* renamed from: a */
    void mo47256a(@NotNull String str, @NotNull C23964a c23964a);
}
