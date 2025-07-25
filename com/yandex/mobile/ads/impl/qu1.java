package com.yandex.mobile.ads.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* loaded from: classes8.dex */
public interface qu1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.qu1$a */
    /* loaded from: classes8.dex */
    public static final class EnumC31236a {

        /* renamed from: c */
        public static final EnumC31236a f84540c;

        /* renamed from: d */
        public static final EnumC31236a f84541d;

        /* renamed from: e */
        public static final EnumC31236a f84542e;

        /* renamed from: f */
        private static final /* synthetic */ EnumC31236a[] f84543f;
        @NotNull

        /* renamed from: b */
        private final String f84544b;

        static {
            EnumC31236a enumC31236a = new EnumC31236a(0, "FIXED", "fixed");
            f84540c = enumC31236a;
            EnumC31236a enumC31236a2 = new EnumC31236a(1, "FLEXIBLE", "flexible");
            f84541d = enumC31236a2;
            EnumC31236a enumC31236a3 = new EnumC31236a(2, "SCREEN", "screen");
            EnumC31236a enumC31236a4 = new EnumC31236a(3, "STICKY", "sticky");
            f84542e = enumC31236a4;
            EnumC31236a[] enumC31236aArr = {enumC31236a, enumC31236a2, enumC31236a3, enumC31236a4};
            f84543f = enumC31236aArr;
            C44401b.m3113a(enumC31236aArr);
        }

        private EnumC31236a(int i, String str, String str2) {
            this.f84544b = str2;
        }

        public static EnumC31236a valueOf(String str) {
            return (EnumC31236a) Enum.valueOf(EnumC31236a.class, str);
        }

        public static EnumC31236a[] values() {
            return (EnumC31236a[]) f84543f.clone();
        }

        @NotNull
        /* renamed from: a */
        public final String m30213a() {
            return this.f84544b;
        }
    }

    /* renamed from: a */
    int mo29653a(@NotNull Context context);

    @NotNull
    /* renamed from: a */
    EnumC31236a mo29654a();

    /* renamed from: b */
    int mo29652b(@NotNull Context context);

    /* renamed from: c */
    int mo29651c(@NotNull Context context);

    /* renamed from: d */
    int mo29650d(@NotNull Context context);

    int getHeight();

    int getWidth();
}
