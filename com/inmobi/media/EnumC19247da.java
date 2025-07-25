package com.inmobi.media;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.da */
/* loaded from: classes6.dex */
public final class EnumC19247da {

    /* renamed from: a */
    public static final EnumC19247da f48165a;

    /* renamed from: b */
    public static final EnumC19247da f48166b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC19247da[] f48167c;

    static {
        EnumC19247da enumC19247da = new EnumC19247da("GET", 0);
        f48165a = enumC19247da;
        EnumC19247da enumC19247da2 = new EnumC19247da("POST", 1);
        f48166b = enumC19247da2;
        EnumC19247da[] enumC19247daArr = {enumC19247da, enumC19247da2, new EnumC19247da("PUT", 2), new EnumC19247da("DELETE", 3), new EnumC19247da("PATCH", 4)};
        f48167c = enumC19247daArr;
        C44401b.m3113a(enumC19247daArr);
    }

    public EnumC19247da(String str, int i) {
    }

    public static EnumC19247da valueOf(String str) {
        return (EnumC19247da) Enum.valueOf(EnumC19247da.class, str);
    }

    public static EnumC19247da[] values() {
        return (EnumC19247da[]) f48167c.clone();
    }
}
