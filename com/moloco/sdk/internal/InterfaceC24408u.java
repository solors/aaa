package com.moloco.sdk.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.u */
/* loaded from: classes7.dex */
public interface InterfaceC24408u {

    /* renamed from: com.moloco.sdk.internal.u$a */
    /* loaded from: classes7.dex */
    public static final class C24409a {
        /* renamed from: a */
        public static /* synthetic */ boolean m46485a(InterfaceC24408u interfaceC24408u, String str, long j, C24229q c24229q, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    c24229q = null;
                }
                return interfaceC24408u.mo46477a(str, j, c24229q);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    /* renamed from: a */
    boolean mo46477a(@NotNull String str, long j, @Nullable C24229q c24229q);
}
