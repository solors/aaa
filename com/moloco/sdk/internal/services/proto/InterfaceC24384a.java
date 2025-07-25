package com.moloco.sdk.internal.services.proto;

import com.moloco.sdk.C24490t;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.proto.a */
/* loaded from: classes7.dex */
public interface InterfaceC24384a {

    /* renamed from: com.moloco.sdk.internal.services.proto.a$a */
    /* loaded from: classes7.dex */
    public static final class C24385a {
        /* renamed from: a */
        public static /* synthetic */ String m46511a(InterfaceC24384a interfaceC24384a, C24490t c24490t, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 10;
                }
                return interfaceC24384a.mo46510a(c24490t, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeUserAdInteractionExt");
        }
    }

    @NotNull
    /* renamed from: a */
    String mo46510a(@NotNull C24490t c24490t, int i);
}
