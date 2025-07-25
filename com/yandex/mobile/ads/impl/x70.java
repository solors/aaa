package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class x70 extends DiffUtil.ItemCallback<w70> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(w70 w70Var, w70 w70Var2) {
        w70 oldItem = w70Var;
        w70 newItem = w70Var2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.m17075f(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(w70 w70Var, w70 w70Var2) {
        w70 oldItem = w70Var;
        w70 newItem = w70Var2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof b70) && (newItem instanceof b70)) {
            return Intrinsics.m17075f(((b70) oldItem).m35583a(), ((b70) newItem).m35583a());
        }
        v70 v70Var = v70.f86587a;
        if (Intrinsics.m17075f(oldItem, v70Var) && Intrinsics.m17075f(newItem, v70Var)) {
            return true;
        }
        return false;
    }
}
