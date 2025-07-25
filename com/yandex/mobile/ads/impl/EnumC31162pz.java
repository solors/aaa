package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.pz */
/* loaded from: classes8.dex */
public final class EnumC31162pz {

    /* renamed from: c */
    public static final EnumC31162pz f84122c;

    /* renamed from: d */
    private static final /* synthetic */ EnumC31162pz[] f84123d;
    @NotNull

    /* renamed from: b */
    private final String f84124b = "ad_pod";

    static {
        EnumC31162pz enumC31162pz = new EnumC31162pz();
        f84122c = enumC31162pz;
        EnumC31162pz[] enumC31162pzArr = {enumC31162pz};
        f84123d = enumC31162pzArr;
        C44401b.m3113a(enumC31162pzArr);
    }

    private EnumC31162pz() {
    }

    public static EnumC31162pz valueOf(String str) {
        return (EnumC31162pz) Enum.valueOf(EnumC31162pz.class, str);
    }

    public static EnumC31162pz[] values() {
        return (EnumC31162pz[]) f84123d.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m30551a() {
        return this.f84124b;
    }
}
