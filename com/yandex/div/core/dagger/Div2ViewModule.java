package com.yandex.div.core.dagger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import md.Provider;
import org.jetbrains.annotations.NotNull;
import p717ia.DivJoinedStateSwitcher;
import p717ia.DivMultipleStateSwitcher;
import p717ia.DivStateSwitcher;

@Metadata
/* renamed from: com.yandex.div.core.dagger.b */
/* loaded from: classes8.dex */
public final class Div2ViewModule {
    @NotNull

    /* renamed from: a */
    public static final Div2ViewModule f75243a = new Div2ViewModule();

    private Div2ViewModule() {
    }

    @NotNull
    /* renamed from: a */
    public static final DivStateSwitcher m37312a(boolean z, @NotNull Provider<DivJoinedStateSwitcher> joinedStateSwitcher, @NotNull Provider<DivMultipleStateSwitcher> multipleStateSwitcher) {
        DivStateSwitcher divStateSwitcher;
        String str;
        Intrinsics.checkNotNullParameter(joinedStateSwitcher, "joinedStateSwitcher");
        Intrinsics.checkNotNullParameter(multipleStateSwitcher, "multipleStateSwitcher");
        if (z) {
            divStateSwitcher = multipleStateSwitcher.get();
            str = "multipleStateSwitcher.get()";
        } else {
            divStateSwitcher = joinedStateSwitcher.get();
            str = "joinedStateSwitcher.get()";
        }
        Intrinsics.checkNotNullExpressionValue(divStateSwitcher, str);
        return divStateSwitcher;
    }
}
