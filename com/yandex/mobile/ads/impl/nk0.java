package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class nk0 {
    @Nullable

    /* renamed from: a */
    private final List<C31034of<?>> f82809a;

    /* JADX WARN: Multi-variable type inference failed */
    public nk0(@Nullable List<? extends C31034of<?>> list) {
        this.f82809a = list;
    }

    @Nullable
    /* renamed from: a */
    public final C31034of<?> m31486a(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        List<C31034of<?>> list = this.f82809a;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.m17075f(((C31034of) next).m31043b(), assetName)) {
                obj = next;
                break;
            }
        }
        return (C31034of) obj;
    }
}
