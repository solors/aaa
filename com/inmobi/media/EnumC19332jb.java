package com.inmobi.media;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.jb */
/* loaded from: classes6.dex */
public final class EnumC19332jb {

    /* renamed from: a */
    public static final EnumC19332jb f48415a;

    /* renamed from: b */
    public static final EnumC19332jb f48416b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC19332jb[] f48417c;

    static {
        EnumC19332jb enumC19332jb = new EnumC19332jb("SDK", 0);
        f48415a = enumC19332jb;
        EnumC19332jb enumC19332jb2 = new EnumC19332jb("TEMPLATE", 1);
        f48416b = enumC19332jb2;
        EnumC19332jb[] enumC19332jbArr = {enumC19332jb, enumC19332jb2};
        f48417c = enumC19332jbArr;
        C44401b.m3113a(enumC19332jbArr);
    }

    public EnumC19332jb(String str, int i) {
    }

    public static EnumC19332jb valueOf(String str) {
        return (EnumC19332jb) Enum.valueOf(EnumC19332jb.class, str);
    }

    public static EnumC19332jb[] values() {
        return (EnumC19332jb[]) f48417c.clone();
    }
}
