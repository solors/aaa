package com.inmobi.media;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.p9 */
/* loaded from: classes6.dex */
public final class EnumC19414p9 {

    /* renamed from: b */
    public static final EnumC19414p9 f48580b;

    /* renamed from: c */
    public static final EnumC19414p9 f48581c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC19414p9[] f48582d;

    /* renamed from: a */
    public final int f48583a;

    static {
        EnumC19414p9 enumC19414p9 = new EnumC19414p9(0, 0, "HIGHEST");
        f48580b = enumC19414p9;
        EnumC19414p9 enumC19414p92 = new EnumC19414p9(1, 1, "HIGH");
        EnumC19414p9 enumC19414p93 = new EnumC19414p9(2, 2, "MEDIUM");
        f48581c = enumC19414p93;
        EnumC19414p9[] enumC19414p9Arr = {enumC19414p9, enumC19414p92, enumC19414p93, new EnumC19414p9(3, 3, "LOW"), new EnumC19414p9(4, 4, "LOWEST")};
        f48582d = enumC19414p9Arr;
        C44401b.m3113a(enumC19414p9Arr);
    }

    public EnumC19414p9(int i, int i2, String str) {
        this.f48583a = i2;
    }

    public static EnumC19414p9 valueOf(String str) {
        return (EnumC19414p9) Enum.valueOf(EnumC19414p9.class, str);
    }

    public static EnumC19414p9[] values() {
        return (EnumC19414p9[]) f48582d.clone();
    }
}
