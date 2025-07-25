package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.sz */
/* loaded from: classes8.dex */
public final class EnumC31414sz {

    /* renamed from: c */
    public static final EnumC31414sz f85446c;

    /* renamed from: d */
    public static final EnumC31414sz f85447d;

    /* renamed from: e */
    public static final EnumC31414sz f85448e;

    /* renamed from: f */
    private static final /* synthetic */ EnumC31414sz[] f85449f;
    @NotNull

    /* renamed from: b */
    private final String f85450b;

    static {
        EnumC31414sz enumC31414sz = new EnumC31414sz(0, "AD", "ad");
        f85446c = enumC31414sz;
        EnumC31414sz enumC31414sz2 = new EnumC31414sz(1, "PACK_SHOT", "pack_shot");
        f85447d = enumC31414sz2;
        EnumC31414sz enumC31414sz3 = new EnumC31414sz(2, "CLOSE_DIALOG", "close_dialog");
        f85448e = enumC31414sz3;
        EnumC31414sz[] enumC31414szArr = {enumC31414sz, enumC31414sz2, enumC31414sz3};
        f85449f = enumC31414szArr;
        C44401b.m3113a(enumC31414szArr);
    }

    private EnumC31414sz(int i, String str, String str2) {
        this.f85450b = str2;
    }

    public static EnumC31414sz valueOf(String str) {
        return (EnumC31414sz) Enum.valueOf(EnumC31414sz.class, str);
    }

    public static EnumC31414sz[] values() {
        return (EnumC31414sz[]) f85449f.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m29343a() {
        return this.f85450b;
    }
}
