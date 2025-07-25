package com.moloco.sdk.internal.ortb.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.ortb.model.e */
/* loaded from: classes7.dex */
public final class C24022e {
    @NotNull
    /* renamed from: a */
    public static final String m47184a(@NotNull C24013b c24013b) {
        Intrinsics.checkNotNullParameter(c24013b, "<this>");
        String m47195a = c24013b.m47199d().m47195a();
        if (m47195a == null) {
            return "UNKNOWN_MTID";
        }
        return m47195a;
    }
}
