package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ie */
/* loaded from: classes8.dex */
public final class C30549ie {
    @NotNull

    /* renamed from: a */
    private final C30620je f80436a = new C30620je();

    /* renamed from: a */
    private static String m33289a(String str) {
        return "Internal state wasn't completely configured. " + str + ".";
    }

    @NotNull
    /* renamed from: b */
    public static String m33288b() {
        return m33289a("Incorrect integration");
    }

    @NotNull
    /* renamed from: a */
    public final String m33290a(@NotNull EnumC31348se reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f80436a.getClass();
        return m33289a(C30620je.m32942a(reason));
    }

    @NotNull
    /* renamed from: a */
    public static String m33291a() {
        return m33289a("Connection timeout");
    }
}
