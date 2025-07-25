package com.yandex.mobile.ads.impl;

import com.facebook.share.internal.ShareConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* renamed from: com.yandex.mobile.ads.impl.ts */
/* loaded from: classes8.dex */
public final class C31477ts {
    @NotNull

    /* renamed from: a */
    private final EnumC31478a f85818a;
    @Nullable

    /* renamed from: b */
    private final String f85819b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.ts$a */
    /* loaded from: classes8.dex */
    public static final class EnumC31478a {

        /* renamed from: b */
        public static final EnumC31478a f85820b;

        /* renamed from: c */
        public static final EnumC31478a f85821c;

        /* renamed from: d */
        private static final /* synthetic */ EnumC31478a[] f85822d;

        static {
            EnumC31478a enumC31478a = new EnumC31478a(0, "TEXT");
            f85820b = enumC31478a;
            EnumC31478a enumC31478a2 = new EnumC31478a(1, ShareConstants.IMAGE_URL);
            f85821c = enumC31478a2;
            EnumC31478a[] enumC31478aArr = {enumC31478a, enumC31478a2};
            f85822d = enumC31478aArr;
            C44401b.m3113a(enumC31478aArr);
        }

        private EnumC31478a(int i, String str) {
        }

        public static EnumC31478a valueOf(String str) {
            return (EnumC31478a) Enum.valueOf(EnumC31478a.class, str);
        }

        public static EnumC31478a[] values() {
            return (EnumC31478a[]) f85822d.clone();
        }
    }

    public C31477ts(@NotNull EnumC31478a type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f85818a = type;
        this.f85819b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31477ts)) {
            return false;
        }
        C31477ts c31477ts = (C31477ts) obj;
        if (this.f85818a == c31477ts.f85818a && Intrinsics.m17075f(this.f85819b, c31477ts.f85819b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f85818a.hashCode() * 31;
        String str = this.f85819b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public final String toString() {
        EnumC31478a enumC31478a = this.f85818a;
        String str = this.f85819b;
        return "CoreNativeCloseButton(type=" + enumC31478a + ", text=" + str + ")";
    }
}
