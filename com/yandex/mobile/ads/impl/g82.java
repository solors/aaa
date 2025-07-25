package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g82 {
    @NotNull
    /* renamed from: a */
    public static f82 m33910a(@NotNull List videoAds) {
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : videoAds) {
            if (((z52) obj).m26356o()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Tuples tuples = new Tuples(arrayList, arrayList2);
        return new f82((List) tuples.m17631b(), (List) tuples.m17632a());
    }
}
