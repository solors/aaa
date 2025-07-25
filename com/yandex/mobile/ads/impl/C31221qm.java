package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C29880R;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.qm */
/* loaded from: classes8.dex */
public final class C31221qm {
    @NotNull
    /* renamed from: a */
    public static C31385sp m30273a(@NotNull Context context) {
        List m17163p;
        Intrinsics.checkNotNullParameter(context, "context");
        m17163p = C37563v.m17163p(new C31823xh(), new qz1(context.getResources().getColor(C29880R.C29881color.monetization_ads_internal_text_color_white)));
        return new C31385sp(m17163p);
    }
}
