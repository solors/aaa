package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* loaded from: classes8.dex */
public final class k52 extends RuntimeException {
    @NotNull

    /* renamed from: b */
    private final j52 f81277b;
    @NotNull

    /* renamed from: c */
    private final EnumC30701a f81278c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.k52$a */
    /* loaded from: classes8.dex */
    public static final class EnumC30701a {

        /* renamed from: c */
        public static final EnumC30701a f81279c;

        /* renamed from: d */
        public static final EnumC30701a f81280d;

        /* renamed from: e */
        private static final /* synthetic */ EnumC30701a[] f81281e;

        /* renamed from: b */
        private final int f81282b;

        static {
            EnumC30701a enumC30701a = new EnumC30701a(0, 1, "VERIFICATION_REJECTED");
            EnumC30701a enumC30701a2 = new EnumC30701a(1, 2, "VERIFICATION_NOT_SUPPORTED");
            f81279c = enumC30701a2;
            EnumC30701a enumC30701a3 = new EnumC30701a(2, 3, "ERROR_RESOURCE_LOAD");
            f81280d = enumC30701a3;
            EnumC30701a[] enumC30701aArr = {enumC30701a, enumC30701a2, enumC30701a3};
            f81281e = enumC30701aArr;
            C44401b.m3113a(enumC30701aArr);
        }

        private EnumC30701a(int i, int i2, String str) {
            this.f81282b = i2;
        }

        public static EnumC30701a valueOf(String str) {
            return (EnumC30701a) Enum.valueOf(EnumC30701a.class, str);
        }

        public static EnumC30701a[] values() {
            return (EnumC30701a[]) f81281e.clone();
        }

        /* renamed from: a */
        public final int m32671a() {
            return this.f81282b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k52(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.j52 r4, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.k52.EnumC30701a r5) {
        /*
            r3 = this;
            java.lang.String r0 = "verification"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = r5.name()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Verification not executed with reason = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            r3.f81277b = r4
            r3.f81278c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.k52.<init>(com.yandex.mobile.ads.impl.j52, com.yandex.mobile.ads.impl.k52$a):void");
    }

    @NotNull
    /* renamed from: a */
    public final EnumC30701a m32673a() {
        return this.f81278c;
    }

    @NotNull
    /* renamed from: b */
    public final j52 m32672b() {
        return this.f81277b;
    }
}
