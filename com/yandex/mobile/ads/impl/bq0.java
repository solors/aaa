package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class bq0 {
    @NotNull
    /* renamed from: a */
    public static ArrayList m35451a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fo0(context, new cq0()));
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a != null && !m35796a.m26773X()) {
            arrayList.add(ic0.m33317a(context));
            arrayList.add(ed0.m34636a(context));
        }
        return arrayList;
    }
}
