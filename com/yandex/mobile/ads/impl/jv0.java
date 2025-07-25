package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jv0 extends kv0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv0(@NotNull C30359g3 adConfiguration) {
        super(adConfiguration);
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
    }

    @Override // com.yandex.mobile.ads.impl.kv0, com.yandex.mobile.ads.impl.s50
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo29851a(@NotNull Context context) {
        Map<String, Object> m17285D;
        Intrinsics.checkNotNullParameter(context, "context");
        m17285D = C37559r0.m17285D(super.mo29851a(context));
        qu1 m33948r = m32420a().m33948r();
        if (m33948r != null) {
            m17285D.put("width", Integer.valueOf(m33948r.mo29651c(context)));
            m17285D.put("height", Integer.valueOf(m33948r.mo29653a(context)));
        }
        return m17285D;
    }
}
