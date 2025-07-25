package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.C20410l;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.lr */
/* loaded from: classes8.dex */
public final class EnumC30803lr {
    @NotNull

    /* renamed from: c */
    public static final C30804a f81893c;

    /* renamed from: d */
    public static final EnumC30803lr f81894d;

    /* renamed from: e */
    public static final EnumC30803lr f81895e;

    /* renamed from: f */
    public static final EnumC30803lr f81896f;

    /* renamed from: g */
    public static final EnumC30803lr f81897g;

    /* renamed from: h */
    public static final EnumC30803lr f81898h;

    /* renamed from: i */
    public static final EnumC30803lr f81899i;

    /* renamed from: j */
    public static final EnumC30803lr f81900j;

    /* renamed from: k */
    public static final EnumC30803lr f81901k;

    /* renamed from: l */
    private static final /* synthetic */ EnumC30803lr[] f81902l;
    @NotNull

    /* renamed from: b */
    private final String f81903b;

    /* renamed from: com.yandex.mobile.ads.impl.lr$a */
    /* loaded from: classes8.dex */
    public static final class C30804a {
        private C30804a() {
        }

        public /* synthetic */ C30804a(int i) {
            this();
        }
    }

    static {
        EnumC30803lr enumC30803lr = new EnumC30803lr(0, C20410l.f51629a, "banner");
        f81894d = enumC30803lr;
        EnumC30803lr enumC30803lr2 = new EnumC30803lr(1, "INTERSTITIAL", "interstitial");
        f81895e = enumC30803lr2;
        EnumC30803lr enumC30803lr3 = new EnumC30803lr(2, "REWARDED", "rewarded");
        f81896f = enumC30803lr3;
        EnumC30803lr enumC30803lr4 = new EnumC30803lr(3, "NATIVE", "native");
        f81897g = enumC30803lr4;
        EnumC30803lr enumC30803lr5 = new EnumC30803lr(4, "VASTVIDEO", "vastvideo");
        f81898h = enumC30803lr5;
        EnumC30803lr enumC30803lr6 = new EnumC30803lr(5, "INSTREAM", "instream");
        f81899i = enumC30803lr6;
        EnumC30803lr enumC30803lr7 = new EnumC30803lr(6, "APPOPENAD", "appopenad");
        f81900j = enumC30803lr7;
        EnumC30803lr enumC30803lr8 = new EnumC30803lr(7, "FEED", "feed");
        f81901k = enumC30803lr8;
        EnumC30803lr[] enumC30803lrArr = {enumC30803lr, enumC30803lr2, enumC30803lr3, enumC30803lr4, enumC30803lr5, enumC30803lr6, enumC30803lr7, enumC30803lr8};
        f81902l = enumC30803lrArr;
        C44401b.m3113a(enumC30803lrArr);
        f81893c = new C30804a(0);
    }

    private EnumC30803lr(int i, String str, String str2) {
        this.f81903b = str2;
    }

    public static EnumC30803lr valueOf(String str) {
        return (EnumC30803lr) Enum.valueOf(EnumC30803lr.class, str);
    }

    public static EnumC30803lr[] values() {
        return (EnumC30803lr[]) f81902l.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m32212a() {
        return this.f81903b;
    }
}
