package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.m9 */
/* loaded from: classes8.dex */
public final class C30834m9 {
    @NotNull
    /* renamed from: a */
    public static String m32077a(@NotNull C30777l9 adTuneInfo) {
        boolean m16635B;
        boolean m16635B2;
        String m17521z0;
        Intrinsics.checkNotNullParameter(adTuneInfo, "adTuneInfo");
        ArrayList arrayList = new ArrayList();
        m16635B = StringsJVM.m16635B(adTuneInfo.m32304a());
        if (!m16635B) {
            arrayList.add(adTuneInfo.m32304a());
        }
        m16635B2 = StringsJVM.m16635B(adTuneInfo.m32302c());
        if (!m16635B2) {
            String m32302c = adTuneInfo.m32302c();
            arrayList.add("erid: " + m32302c);
        }
        m17521z0 = _Collections.m17521z0(arrayList, " · ", null, null, 0, null, null, 62, null);
        return m17521z0;
    }
}
