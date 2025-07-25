package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.ym */
/* loaded from: classes6.dex */
public final class C21273ym extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21273ym(@NotNull Exception e) {
        super("Missing Headers", e);
        Intrinsics.checkNotNullParameter(e, "e");
    }
}
