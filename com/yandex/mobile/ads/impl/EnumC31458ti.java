package com.yandex.mobile.ads.impl;

import com.maticoo.sdk.MaticooAdsConstant;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.ti */
/* loaded from: classes8.dex */
public final class EnumC31458ti {
    @NotNull

    /* renamed from: c */
    public static final C31459a f85691c;

    /* renamed from: d */
    public static final EnumC31458ti f85692d;

    /* renamed from: e */
    private static final /* synthetic */ EnumC31458ti[] f85693e;
    @NotNull

    /* renamed from: b */
    private final String f85694b;

    /* renamed from: com.yandex.mobile.ads.impl.ti$a */
    /* loaded from: classes8.dex */
    public static final class C31459a {
        private C31459a() {
        }

        public /* synthetic */ C31459a(int i) {
            this();
        }
    }

    static {
        EnumC31458ti enumC31458ti = new EnumC31458ti(0, "CONSTANT", "constant");
        EnumC31458ti enumC31458ti2 = new EnumC31458ti(1, "RATIO", "ratio");
        EnumC31458ti enumC31458ti3 = new EnumC31458ti(2, "SCREEN_BASED", "screen_based");
        EnumC31458ti enumC31458ti4 = new EnumC31458ti(3, "SCREEN_ORIENTATION_BASED", "screen_orientation_based");
        f85692d = enumC31458ti4;
        EnumC31458ti[] enumC31458tiArr = {enumC31458ti, enumC31458ti2, enumC31458ti3, enumC31458ti4, new EnumC31458ti(4, "MEDIATION", MaticooAdsConstant.KEY_AD_MEDIATION)};
        f85693e = enumC31458tiArr;
        C44401b.m3113a(enumC31458tiArr);
        f85691c = new C31459a(0);
    }

    private EnumC31458ti(int i, String str, String str2) {
        this.f85694b = str2;
    }

    public static EnumC31458ti valueOf(String str) {
        return (EnumC31458ti) Enum.valueOf(EnumC31458ti.class, str);
    }

    public static EnumC31458ti[] values() {
        return (EnumC31458ti[]) f85693e.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m29161a() {
        return this.f85694b;
    }
}
