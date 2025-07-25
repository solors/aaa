package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* loaded from: classes8.dex */
public interface x61 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.x61$a */
    /* loaded from: classes8.dex */
    public static final class EnumC31797a {

        /* renamed from: b */
        public static final EnumC31797a f87556b;

        /* renamed from: c */
        public static final EnumC31797a f87557c;

        /* renamed from: d */
        public static final EnumC31797a f87558d;

        /* renamed from: e */
        private static final /* synthetic */ EnumC31797a[] f87559e;

        static {
            EnumC31797a enumC31797a = new EnumC31797a(0, "FIXED");
            f87556b = enumC31797a;
            EnumC31797a enumC31797a2 = new EnumC31797a(1, "FIXED_RATIO");
            f87557c = enumC31797a2;
            EnumC31797a enumC31797a3 = new EnumC31797a(2, "PREFERRED_RATIO");
            f87558d = enumC31797a3;
            EnumC31797a[] enumC31797aArr = {enumC31797a, enumC31797a2, enumC31797a3};
            f87559e = enumC31797aArr;
            C44401b.m3113a(enumC31797aArr);
        }

        private EnumC31797a(int i, String str) {
        }

        public static EnumC31797a valueOf(String str) {
            return (EnumC31797a) Enum.valueOf(EnumC31797a.class, str);
        }

        public static EnumC31797a[] values() {
            return (EnumC31797a[]) f87559e.clone();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x61$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31798b {
        @Nullable
        EnumC31797a getType();
    }

    @NotNull
    InterfaceC31798b getSizeConstraintType();

    float getValue();
}
