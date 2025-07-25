package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ka */
/* loaded from: classes8.dex */
public final class C30714ka {
    @Nullable
    /* renamed from: a */
    public static String m32614a(@Nullable List list) {
        Object obj;
        Object obj2;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C31792x4) obj).m27670a() == EnumC31868y4.f88025c) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C31792x4 c31792x4 = (C31792x4) obj;
        if (c31792x4 == null || (obj2 = c31792x4.m27669b().get(EnumC31868y4.f88025c.m27044a())) == null) {
            return null;
        }
        return obj2.toString();
    }
}
