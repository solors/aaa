package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class lo0<V extends ViewGroup> {
    @NotNull

    /* renamed from: a */
    private final List<ho0<V>> f81871a;

    public lo0(@NotNull List<ho0<V>> layoutDesigns) {
        Intrinsics.checkNotNullParameter(layoutDesigns, "layoutDesigns");
        this.f81871a = layoutDesigns;
    }

    @Nullable
    /* renamed from: a */
    public final ho0<V> m32222a(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator<T> it = this.f81871a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ho0) obj).m33505b().mo28715a(context)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ho0) obj;
    }
}
