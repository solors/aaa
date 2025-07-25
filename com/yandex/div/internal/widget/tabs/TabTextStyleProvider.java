package com.yandex.div.internal.widget.tabs;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p758k9.DivTypefaceProvider;

@Metadata
/* renamed from: com.yandex.div.internal.widget.tabs.p */
/* loaded from: classes8.dex */
public final class TabTextStyleProvider {
    @NotNull

    /* renamed from: a */
    private final DivTypefaceProvider f76453a;

    public TabTextStyleProvider(@NotNull DivTypefaceProvider typefaceProvider) {
        Intrinsics.checkNotNullParameter(typefaceProvider, "typefaceProvider");
        this.f76453a = typefaceProvider;
    }

    @NotNull
    /* renamed from: a */
    public final DivTypefaceProvider m36061a() {
        return this.f76453a;
    }
}
