package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.AbstractC31846xw;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.zw */
/* loaded from: classes8.dex */
public abstract class AbstractC32021zw<T extends AbstractC31846xw> extends RecyclerView.ViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32021zw(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
    }

    /* renamed from: a */
    public abstract void mo25980a(@NotNull T t);
}
