package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* loaded from: classes8.dex */
public final class k62 {

    /* renamed from: d */
    static final /* synthetic */ KProperty<Object>[] f81291d = {Reflection.m17039e(new MutablePropertyReference1Impl(k62.class, "view", "getView()Landroid/view/View;", 0))};
    @NotNull

    /* renamed from: a */
    private final EnumC30704a f81292a;
    @Nullable

    /* renamed from: b */
    private final String f81293b;
    @NotNull

    /* renamed from: c */
    private final xj1 f81294c;

    /* renamed from: com.yandex.mobile.ads.impl.k62$a */
    /* loaded from: classes8.dex */
    public static final class EnumC30704a {

        /* renamed from: b */
        public static final EnumC30704a f81295b;

        /* renamed from: c */
        public static final EnumC30704a f81296c;

        /* renamed from: d */
        public static final EnumC30704a f81297d;

        /* renamed from: e */
        public static final EnumC30704a f81298e;

        /* renamed from: f */
        private static final /* synthetic */ EnumC30704a[] f81299f;

        static {
            EnumC30704a enumC30704a = new EnumC30704a(0, "CONTROLS");
            f81295b = enumC30704a;
            EnumC30704a enumC30704a2 = new EnumC30704a(1, "CLOSE_AD");
            f81296c = enumC30704a2;
            EnumC30704a enumC30704a3 = new EnumC30704a(2, "NOT_VISIBLE");
            f81297d = enumC30704a3;
            EnumC30704a enumC30704a4 = new EnumC30704a(3, "OTHER");
            f81298e = enumC30704a4;
            EnumC30704a[] enumC30704aArr = {enumC30704a, enumC30704a2, enumC30704a3, enumC30704a4};
            f81299f = enumC30704aArr;
            C44401b.m3113a(enumC30704aArr);
        }

        private EnumC30704a(int i, String str) {
            super(str, i);
        }

        public static EnumC30704a valueOf(String str) {
            return (EnumC30704a) Enum.valueOf(EnumC30704a.class, str);
        }

        public static EnumC30704a[] values() {
            return (EnumC30704a[]) f81299f.clone();
        }
    }

    public k62(@NotNull View view, @NotNull EnumC30704a purpose, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.f81292a = purpose;
        this.f81293b = str;
        this.f81294c = yj1.m26872a(view);
    }

    @Nullable
    /* renamed from: a */
    public final String m32666a() {
        return this.f81293b;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC30704a m32665b() {
        return this.f81292a;
    }

    @Nullable
    /* renamed from: c */
    public final View m32664c() {
        return (View) this.f81294c.getValue(this, f81291d[0]);
    }
}
