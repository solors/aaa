package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* renamed from: com.yandex.mobile.ads.impl.lv */
/* loaded from: classes8.dex */
public final class C30810lv {
    @Nullable

    /* renamed from: a */
    private final String f81950a;
    @Nullable

    /* renamed from: b */
    private final String f81951b;
    @NotNull

    /* renamed from: c */
    private final EnumC30811a f81952c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.lv$a */
    /* loaded from: classes8.dex */
    public static final class EnumC30811a {

        /* renamed from: c */
        public static final EnumC30811a f81953c;

        /* renamed from: d */
        private static final /* synthetic */ EnumC30811a[] f81954d;
        @NotNull

        /* renamed from: b */
        private final String f81955b;

        static {
            EnumC30811a enumC30811a = new EnumC30811a(0, "ERROR", "error");
            EnumC30811a enumC30811a2 = new EnumC30811a(1, "MESSAGE", "message");
            f81953c = enumC30811a2;
            EnumC30811a[] enumC30811aArr = {enumC30811a, enumC30811a2};
            f81954d = enumC30811aArr;
            C44401b.m3113a(enumC30811aArr);
        }

        private EnumC30811a(int i, String str, String str2) {
            this.f81955b = str2;
        }

        public static EnumC30811a valueOf(String str) {
            return (EnumC30811a) Enum.valueOf(EnumC30811a.class, str);
        }

        public static EnumC30811a[] values() {
            return (EnumC30811a[]) f81954d.clone();
        }

        @NotNull
        /* renamed from: a */
        public final String m32194a() {
            return this.f81955b;
        }
    }

    public C30810lv(@Nullable String str, @Nullable String str2, @NotNull EnumC30811a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f81950a = str;
        this.f81951b = str2;
        this.f81952c = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30810lv)) {
            return false;
        }
        C30810lv c30810lv = (C30810lv) obj;
        if (Intrinsics.m17075f(this.f81950a, c30810lv.f81950a) && Intrinsics.m17075f(this.f81951b, c30810lv.f81951b) && this.f81952c == c30810lv.f81952c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f81950a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f81951b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.f81952c.hashCode() + ((i2 + i) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f81950a;
        String str2 = this.f81951b;
        EnumC30811a enumC30811a = this.f81952c;
        return "DebugPanelAlertData(title=" + str + ", message=" + str2 + ", type=" + enumC30811a + ")";
    }
}
