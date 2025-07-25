package com.yandex.mobile.ads.impl;

import com.maticoo.sdk.MaticooAdsConstant;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.iv */
/* loaded from: classes8.dex */
public final class EnumC30581iv {

    /* renamed from: c */
    public static final EnumC30581iv f80636c;

    /* renamed from: d */
    public static final EnumC30581iv f80637d;

    /* renamed from: e */
    public static final EnumC30581iv f80638e;

    /* renamed from: f */
    private static final /* synthetic */ EnumC30581iv[] f80639f;
    @NotNull

    /* renamed from: b */
    private final String f80640b;

    static {
        EnumC30581iv enumC30581iv = new EnumC30581iv(0, "BIDDING", "Bidding");
        f80636c = enumC30581iv;
        EnumC30581iv enumC30581iv2 = new EnumC30581iv(1, "WATERFALL", "Waterfall");
        f80637d = enumC30581iv2;
        EnumC30581iv enumC30581iv3 = new EnumC30581iv(2, InterfaceC32663coo2iico.cco22, MaticooAdsConstant.VALUE_AD_MEDIATION);
        f80638e = enumC30581iv3;
        EnumC30581iv[] enumC30581ivArr = {enumC30581iv, enumC30581iv2, enumC30581iv3};
        f80639f = enumC30581ivArr;
        C44401b.m3113a(enumC30581ivArr);
    }

    private EnumC30581iv(int i, String str, String str2) {
        this.f80640b = str2;
    }

    public static EnumC30581iv valueOf(String str) {
        return (EnumC30581iv) Enum.valueOf(EnumC30581iv.class, str);
    }

    public static EnumC30581iv[] values() {
        return (EnumC30581iv[]) f80639f.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m33114a() {
        return this.f80640b;
    }
}
