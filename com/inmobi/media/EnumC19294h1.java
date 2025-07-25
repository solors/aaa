package com.inmobi.media;

import android.util.SparseArray;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.h1 */
/* loaded from: classes6.dex */
public final class EnumC19294h1 {

    /* renamed from: b */
    public static final C19280g1 f48276b;

    /* renamed from: c */
    public static final SparseArray f48277c;

    /* renamed from: d */
    public static final EnumC19294h1 f48278d;

    /* renamed from: e */
    public static final EnumC19294h1 f48279e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC19294h1[] f48280f;

    /* renamed from: a */
    public final int f48281a;

    static {
        EnumC19294h1[] values;
        EnumC19294h1 enumC19294h1 = new EnumC19294h1(0, 0, "UNKNOWN");
        f48278d = enumC19294h1;
        EnumC19294h1 enumC19294h12 = new EnumC19294h1(1, 1, "PLAYING");
        f48279e = enumC19294h12;
        EnumC19294h1[] enumC19294h1Arr = {enumC19294h1, enumC19294h12, new EnumC19294h1(2, 2, "PAUSED"), new EnumC19294h1(3, 3, "COMPLETED")};
        f48280f = enumC19294h1Arr;
        C44401b.m3113a(enumC19294h1Arr);
        f48276b = new C19280g1();
        f48277c = new SparseArray();
        for (EnumC19294h1 enumC19294h13 : values()) {
            f48277c.put(enumC19294h13.f48281a, enumC19294h13);
        }
    }

    public EnumC19294h1(int i, int i2, String str) {
        this.f48281a = i2;
    }

    public static EnumC19294h1 valueOf(String str) {
        return (EnumC19294h1) Enum.valueOf(EnumC19294h1.class, str);
    }

    public static EnumC19294h1[] values() {
        return (EnumC19294h1[]) f48280f.clone();
    }
}
