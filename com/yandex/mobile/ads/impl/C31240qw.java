package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* renamed from: com.yandex.mobile.ads.impl.qw */
/* loaded from: classes8.dex */
public final class C31240qw {
    @NotNull

    /* renamed from: a */
    private final EnumC31241a f84561a;
    @Nullable

    /* renamed from: b */
    private final List<String> f84562b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.qw$a */
    /* loaded from: classes8.dex */
    public static final class EnumC31241a {

        /* renamed from: b */
        public static final EnumC31241a f84563b;

        /* renamed from: c */
        public static final EnumC31241a f84564c;

        /* renamed from: d */
        public static final EnumC31241a f84565d;

        /* renamed from: e */
        private static final /* synthetic */ EnumC31241a[] f84566e;

        static {
            EnumC31241a enumC31241a = new EnumC31241a(0, "SUCCESS");
            f84563b = enumC31241a;
            EnumC31241a enumC31241a2 = new EnumC31241a(1, "WARNING");
            f84564c = enumC31241a2;
            EnumC31241a enumC31241a3 = new EnumC31241a(2, "ERROR");
            f84565d = enumC31241a3;
            EnumC31241a[] enumC31241aArr = {enumC31241a, enumC31241a2, enumC31241a3};
            f84566e = enumC31241aArr;
            C44401b.m3113a(enumC31241aArr);
        }

        private EnumC31241a(int i, String str) {
        }

        public static EnumC31241a valueOf(String str) {
            return (EnumC31241a) Enum.valueOf(EnumC31241a.class, str);
        }

        public static EnumC31241a[] values() {
            return (EnumC31241a[]) f84566e.clone();
        }
    }

    public C31240qw(@NotNull EnumC31241a status, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f84561a = status;
        this.f84562b = list;
    }

    @Nullable
    /* renamed from: a */
    public final List<String> m30205a() {
        return this.f84562b;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC31241a m30204b() {
        return this.f84561a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31240qw)) {
            return false;
        }
        C31240qw c31240qw = (C31240qw) obj;
        if (this.f84561a == c31240qw.f84561a && Intrinsics.m17075f(this.f84562b, c31240qw.f84562b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f84561a.hashCode() * 31;
        List<String> list = this.f84562b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public final String toString() {
        EnumC31241a enumC31241a = this.f84561a;
        List<String> list = this.f84562b;
        return "DebugPanelSdkIntegrationStatusData(status=" + enumC31241a + ", messages=" + list + ")";
    }
}
