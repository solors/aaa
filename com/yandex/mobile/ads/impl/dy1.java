package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class dy1 implements InterfaceC30017bg<String> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC30017bg
    /* renamed from: a */
    public final boolean mo32562a(String str) {
        String value = str;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() > 0 && !Intrinsics.m17075f("null", value)) {
            return true;
        }
        return false;
    }
}
