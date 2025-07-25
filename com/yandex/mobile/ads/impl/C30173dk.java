package com.yandex.mobile.ads.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.dk */
/* loaded from: classes8.dex */
public final class C30173dk {
    @NotNull
    /* renamed from: a */
    public static gl1 m34897a(@Nullable C30252ek c30252ek) {
        String str;
        Map<String, String> map;
        EnumC30803lr m34509a;
        qu1 qu1Var = null;
        gl1 gl1Var = new gl1((Map) null, 3);
        if (c30252ek != null && (m34509a = c30252ek.m34509a()) != null) {
            str = m34509a.m32212a();
        } else {
            str = null;
        }
        gl1Var.m33818a(str, "ad_type");
        if (c30252ek != null) {
            map = c30252ek.m34508b();
        } else {
            map = null;
        }
        gl1Var.m33818a(map, "parameters");
        if (c30252ek != null) {
            qu1Var = c30252ek.m34507c();
        }
        if (qu1Var != null) {
            gl1Var.m33814b(qu1Var.mo29654a().m30213a(), "size_type");
            gl1Var.m33814b(Integer.valueOf(qu1Var.getWidth()), "width");
            gl1Var.m33814b(Integer.valueOf(qu1Var.getHeight()), "height");
        }
        return gl1Var;
    }
}
