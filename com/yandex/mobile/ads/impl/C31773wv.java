package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.wv */
/* loaded from: classes8.dex */
public final class C31773wv extends DiffUtil.ItemCallback<AbstractC31846xw> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(AbstractC31846xw abstractC31846xw, AbstractC31846xw abstractC31846xw2) {
        AbstractC31846xw prevItem = abstractC31846xw;
        AbstractC31846xw newItem = abstractC31846xw2;
        Intrinsics.checkNotNullParameter(prevItem, "prevItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return prevItem.mo27185a(newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(AbstractC31846xw abstractC31846xw, AbstractC31846xw abstractC31846xw2) {
        AbstractC31846xw prevItem = abstractC31846xw;
        AbstractC31846xw newItem = abstractC31846xw2;
        Intrinsics.checkNotNullParameter(prevItem, "prevItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return prevItem.mo27185a(newItem);
    }
}
