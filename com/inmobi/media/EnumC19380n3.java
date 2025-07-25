package com.inmobi.media;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.n3 */
/* loaded from: classes6.dex */
public final class EnumC19380n3 {

    /* renamed from: a */
    public static final EnumC19380n3 f48533a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC19380n3[] f48534b;

    static {
        EnumC19380n3 enumC19380n3 = new EnumC19380n3("URL", 0);
        f48533a = enumC19380n3;
        EnumC19380n3[] enumC19380n3Arr = {enumC19380n3, new EnumC19380n3("HTML", 1)};
        f48534b = enumC19380n3Arr;
        C44401b.m3113a(enumC19380n3Arr);
    }

    public EnumC19380n3(String str, int i) {
    }

    public static EnumC19380n3 valueOf(String str) {
        return (EnumC19380n3) Enum.valueOf(EnumC19380n3.class, str);
    }

    public static EnumC19380n3[] values() {
        return (EnumC19380n3[]) f48534b.clone();
    }
}
