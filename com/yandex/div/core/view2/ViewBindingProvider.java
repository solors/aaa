package com.yandex.div.core.view2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1072z8.DivDataTag;
import sb.DivData;

@Metadata
/* renamed from: com.yandex.div.core.view2.d */
/* loaded from: classes8.dex */
public final class ViewBindingProvider {
    @NotNull

    /* renamed from: a */
    private final DivDataTag f75470a;
    @Nullable

    /* renamed from: b */
    private final DivData f75471b;

    public ViewBindingProvider(@NotNull DivDataTag tag, @Nullable DivData divData) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f75470a = tag;
        this.f75471b = divData;
    }

    @Nullable
    /* renamed from: a */
    public final DivData m37094a() {
        return this.f75471b;
    }

    @NotNull
    /* renamed from: b */
    public final DivDataTag m37093b() {
        return this.f75470a;
    }
}
