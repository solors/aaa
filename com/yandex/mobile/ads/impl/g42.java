package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* loaded from: classes8.dex */
public final class g42 {
    @NotNull

    /* renamed from: a */
    private final EnumC30362a f79481a;
    @Nullable

    /* renamed from: b */
    private String f79482b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.g42$a */
    /* loaded from: classes8.dex */
    public static final class EnumC30362a {

        /* renamed from: c */
        public static final EnumC30362a f79483c;

        /* renamed from: d */
        public static final EnumC30362a f79484d;

        /* renamed from: e */
        public static final EnumC30362a f79485e;

        /* renamed from: f */
        public static final EnumC30362a f79486f;

        /* renamed from: g */
        public static final EnumC30362a f79487g;

        /* renamed from: h */
        public static final EnumC30362a f79488h;

        /* renamed from: i */
        public static final EnumC30362a f79489i;

        /* renamed from: j */
        public static final EnumC30362a f79490j;

        /* renamed from: k */
        public static final EnumC30362a f79491k;

        /* renamed from: l */
        public static final EnumC30362a f79492l;

        /* renamed from: m */
        public static final EnumC30362a f79493m;

        /* renamed from: n */
        public static final EnumC30362a f79494n;

        /* renamed from: o */
        public static final EnumC30362a f79495o;

        /* renamed from: p */
        private static final /* synthetic */ EnumC30362a[] f79496p;
        @NotNull

        /* renamed from: b */
        private final String f79497b;

        static {
            EnumC30362a enumC30362a = new EnumC30362a(0, "SUCCESS", "success");
            f79483c = enumC30362a;
            EnumC30362a enumC30362a2 = new EnumC30362a(1, "APPLICATION_INACTIVE", "application_inactive");
            f79484d = enumC30362a2;
            EnumC30362a enumC30362a3 = new EnumC30362a(2, "INCONSISTENT_ASSET_VALUE", "inconsistent_asset_value");
            f79485e = enumC30362a3;
            EnumC30362a enumC30362a4 = new EnumC30362a(3, "NO_AD_VIEW", "no_ad_view");
            f79486f = enumC30362a4;
            EnumC30362a enumC30362a5 = new EnumC30362a(4, "NO_VISIBLE_ADS", "no_visible_ads");
            f79487g = enumC30362a5;
            EnumC30362a enumC30362a6 = new EnumC30362a(5, "NO_VISIBLE_REQUIRED_ASSETS", "no_visible_required_assets");
            f79488h = enumC30362a6;
            EnumC30362a enumC30362a7 = new EnumC30362a(6, "NOT_ADDED_TO_HIERARCHY", "not_added_to_hierarchy");
            f79489i = enumC30362a7;
            EnumC30362a enumC30362a8 = new EnumC30362a(7, "NOT_VISIBLE_FOR_PERCENT", "not_visible_for_percent");
            f79490j = enumC30362a8;
            EnumC30362a enumC30362a9 = new EnumC30362a(8, "REQUIRED_ASSET_CAN_NOT_BE_VISIBLE", "required_asset_can_not_be_visible");
            f79491k = enumC30362a9;
            EnumC30362a enumC30362a10 = new EnumC30362a(9, "REQUIRED_ASSET_IS_NOT_SUBVIEW", "required_asset_is_not_subview");
            f79492l = enumC30362a10;
            EnumC30362a enumC30362a11 = new EnumC30362a(10, "SUPERVIEW_HIDDEN", "superview_hidden");
            f79493m = enumC30362a11;
            EnumC30362a enumC30362a12 = new EnumC30362a(11, "TOO_SMALL", "too_small");
            f79494n = enumC30362a12;
            EnumC30362a enumC30362a13 = new EnumC30362a(12, "VISIBLE_AREA_TOO_SMALL", "visible_area_too_small");
            f79495o = enumC30362a13;
            EnumC30362a[] enumC30362aArr = {enumC30362a, enumC30362a2, enumC30362a3, enumC30362a4, enumC30362a5, enumC30362a6, enumC30362a7, enumC30362a8, enumC30362a9, enumC30362a10, enumC30362a11, enumC30362a12, enumC30362a13};
            f79496p = enumC30362aArr;
            C44401b.m3113a(enumC30362aArr);
        }

        private EnumC30362a(int i, String str, String str2) {
            this.f79497b = str2;
        }

        public static EnumC30362a valueOf(String str) {
            return (EnumC30362a) Enum.valueOf(EnumC30362a.class, str);
        }

        public static EnumC30362a[] values() {
            return (EnumC30362a[]) f79496p.clone();
        }

        @NotNull
        /* renamed from: a */
        public final String m33928a() {
            return this.f79497b;
        }
    }

    public g42(@NotNull EnumC30362a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f79481a = status;
    }

    @Nullable
    /* renamed from: a */
    public final String m33931a() {
        return this.f79482b;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC30362a m33929b() {
        return this.f79481a;
    }

    /* renamed from: a */
    public final void m33930a(@Nullable String str) {
        this.f79482b = str;
    }
}
