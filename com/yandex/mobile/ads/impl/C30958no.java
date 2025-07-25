package com.yandex.mobile.ads.impl;

import com.facebook.share.internal.ShareConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* renamed from: com.yandex.mobile.ads.impl.no */
/* loaded from: classes8.dex */
public final class C30958no {
    @NotNull

    /* renamed from: a */
    private final EnumC30959a f82838a;
    @Nullable

    /* renamed from: b */
    private final String f82839b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.no$a */
    /* loaded from: classes8.dex */
    public static final class EnumC30959a {

        /* renamed from: b */
        public static final EnumC30959a f82840b;

        /* renamed from: c */
        public static final EnumC30959a f82841c;

        /* renamed from: d */
        private static final /* synthetic */ EnumC30959a[] f82842d;

        static {
            EnumC30959a enumC30959a = new EnumC30959a(0, "TEXT");
            f82840b = enumC30959a;
            EnumC30959a enumC30959a2 = new EnumC30959a(1, ShareConstants.IMAGE_URL);
            f82841c = enumC30959a2;
            EnumC30959a[] enumC30959aArr = {enumC30959a, enumC30959a2};
            f82842d = enumC30959aArr;
            C44401b.m3113a(enumC30959aArr);
        }

        private EnumC30959a(int i, String str) {
        }

        public static EnumC30959a valueOf(String str) {
            return (EnumC30959a) Enum.valueOf(EnumC30959a.class, str);
        }

        public static EnumC30959a[] values() {
            return (EnumC30959a[]) f82842d.clone();
        }
    }

    public C30958no(@NotNull EnumC30959a type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f82838a = type;
        this.f82839b = str;
    }

    @Nullable
    /* renamed from: a */
    public final String m31462a() {
        return this.f82839b;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC30959a m31461b() {
        return this.f82838a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30958no)) {
            return false;
        }
        C30958no c30958no = (C30958no) obj;
        if (this.f82838a == c30958no.f82838a && Intrinsics.m17075f(this.f82839b, c30958no.f82839b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f82838a.hashCode() * 31;
        String str = this.f82839b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public final String toString() {
        EnumC30959a enumC30959a = this.f82838a;
        String str = this.f82839b;
        return "CloseButtonValue(type=" + enumC30959a + ", text=" + str + ")";
    }
}
