package com.yandex.mobile.ads.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* loaded from: classes8.dex */
public interface k32 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.k32$a */
    /* loaded from: classes8.dex */
    public static final class EnumC30698a {

        /* renamed from: b */
        public static final EnumC30698a f81262b;

        /* renamed from: c */
        public static final EnumC30698a f81263c;

        /* renamed from: d */
        private static final /* synthetic */ EnumC30698a[] f81264d;

        static {
            EnumC30698a enumC30698a = new EnumC30698a(0, "AD");
            f81262b = enumC30698a;
            EnumC30698a enumC30698a2 = new EnumC30698a(1, "PASSBACK");
            f81263c = enumC30698a2;
            EnumC30698a[] enumC30698aArr = {enumC30698a, enumC30698a2};
            f81264d = enumC30698aArr;
            C44401b.m3113a(enumC30698aArr);
        }

        private EnumC30698a(int i, String str) {
        }

        public static EnumC30698a valueOf(String str) {
            return (EnumC30698a) Enum.valueOf(EnumC30698a.class, str);
        }

        public static EnumC30698a[] values() {
            return (EnumC30698a[]) f81264d.clone();
        }
    }

    @NotNull
    /* renamed from: a */
    EnumC30698a mo32294a();

    @NotNull
    /* renamed from: a */
    String mo32293a(@NotNull Context context, @NotNull C30359g3 c30359g3, @NotNull vs1 vs1Var);

    @Nullable
    /* renamed from: a */
    String mo32292a(@NotNull C30359g3 c30359g3);
}
