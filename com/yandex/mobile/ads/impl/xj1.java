package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.InterfaceC37618e;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class xj1 implements InterfaceC37618e<Object, Object> {
    @NotNull

    /* renamed from: a */
    private WeakReference<Object> f87714a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xj1(Object obj) {
        this.f87714a = new WeakReference<>(obj);
    }

    @Override // kotlin.properties.InterfaceC37618e, kotlin.properties.Interfaces
    @Nullable
    public final Object getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f87714a.get();
    }

    @Override // kotlin.properties.InterfaceC37618e
    public final void setValue(@Nullable Object obj, @NotNull KProperty<?> property, @Nullable Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f87714a = new WeakReference<>(obj2);
    }
}
