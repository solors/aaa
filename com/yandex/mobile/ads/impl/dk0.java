package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class dk0 {
    @NotNull

    /* renamed from: a */
    private final gj0 f78174a;
    @NotNull

    /* renamed from: b */
    private final C30346fz f78175b;

    public /* synthetic */ dk0(gj0 gj0Var, vk0 vk0Var) {
        this(gj0Var, vk0Var, new C30346fz(vk0Var));
    }

    @Nullable
    /* renamed from: a */
    public final b62 m34896a(@NotNull h50 instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        b62 m33826a = this.f78174a.m33826a();
        if (m33826a == null) {
            C30346fz c30346fz = this.f78175b;
            Context context = instreamAdView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return c30346fz.m34055a(context, instreamAdView);
        }
        return m33826a;
    }

    public dk0(@NotNull gj0 customUiElementsHolder, @NotNull vk0 instreamDesign, @NotNull C30346fz defaultUiElementsCreator) {
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(instreamDesign, "instreamDesign");
        Intrinsics.checkNotNullParameter(defaultUiElementsCreator, "defaultUiElementsCreator");
        this.f78174a = customUiElementsHolder;
        this.f78175b = defaultUiElementsCreator;
    }
}
