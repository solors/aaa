package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* renamed from: com.yandex.mobile.ads.impl.zr */
/* loaded from: classes8.dex */
public final class C32011zr {
    @NotNull

    /* renamed from: a */
    private final EnumC32012a f89078a;

    /* renamed from: b */
    private final long f89079b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.zr$a */
    /* loaded from: classes8.dex */
    public static final class EnumC32012a {

        /* renamed from: b */
        public static final EnumC32012a f89080b;

        /* renamed from: c */
        public static final EnumC32012a f89081c;

        /* renamed from: d */
        public static final EnumC32012a f89082d;

        /* renamed from: e */
        private static final /* synthetic */ EnumC32012a[] f89083e;

        static {
            EnumC32012a enumC32012a = new EnumC32012a(0, "PERCENTS");
            f89080b = enumC32012a;
            EnumC32012a enumC32012a2 = new EnumC32012a(1, "MILLISECONDS");
            f89081c = enumC32012a2;
            EnumC32012a enumC32012a3 = new EnumC32012a(2, "POSITION");
            f89082d = enumC32012a3;
            EnumC32012a[] enumC32012aArr = {enumC32012a, enumC32012a2, enumC32012a3};
            f89083e = enumC32012aArr;
            C44401b.m3113a(enumC32012aArr);
        }

        private EnumC32012a(int i, String str) {
        }

        public static EnumC32012a valueOf(String str) {
            return (EnumC32012a) Enum.valueOf(EnumC32012a.class, str);
        }

        public static EnumC32012a[] values() {
            return (EnumC32012a[]) f89083e.clone();
        }
    }

    public C32011zr(@NotNull EnumC32012a positionType, long j) {
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        this.f89078a = positionType;
        this.f89079b = j;
    }

    @NotNull
    /* renamed from: a */
    public final EnumC32012a m26012a() {
        return this.f89078a;
    }

    /* renamed from: b */
    public final long m26011b() {
        return this.f89079b;
    }
}
