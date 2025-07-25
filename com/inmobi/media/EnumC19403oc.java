package com.inmobi.media;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.oc */
/* loaded from: classes6.dex */
public final class EnumC19403oc {

    /* renamed from: a */
    public static final EnumC19403oc f48563a;

    /* renamed from: b */
    public static final EnumC19403oc f48564b;

    /* renamed from: c */
    public static final EnumC19403oc f48565c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC19403oc[] f48566d;

    static {
        EnumC19403oc enumC19403oc = new EnumC19403oc("UNKNOWN", 0);
        f48563a = enumC19403oc;
        EnumC19403oc enumC19403oc2 = new EnumC19403oc("HIDDEN", 1);
        f48564b = enumC19403oc2;
        EnumC19403oc enumC19403oc3 = new EnumC19403oc("VISIBLE", 2);
        f48565c = enumC19403oc3;
        EnumC19403oc[] enumC19403ocArr = {enumC19403oc, enumC19403oc2, enumC19403oc3};
        f48566d = enumC19403ocArr;
        C44401b.m3113a(enumC19403ocArr);
    }

    public EnumC19403oc(String str, int i) {
    }

    public static EnumC19403oc valueOf(String str) {
        return (EnumC19403oc) Enum.valueOf(EnumC19403oc.class, str);
    }

    public static EnumC19403oc[] values() {
        return (EnumC19403oc[]) f48566d.clone();
    }
}
