package com.taurusx.tax.core;

import com.taurusx.tax.C28162a;
import p692h2.StringFogImpl;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum Banner_320_50 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class AdSize {
    public static final AdSize Banner_300_250;
    public static final AdSize Banner_320_50;

    /* renamed from: c */
    public static final /* synthetic */ AdSize[] f73526c;

    /* renamed from: a */
    public int f73527a;

    /* renamed from: b */
    public int f73528b;

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        AdSize adSize = new AdSize(stringFogImpl.m23824a(new byte[]{24, -59, 52, -54, 63, -42, 5, -105, 104, -108, 5, -111, 106}, new byte[]{90, -92}), 0, 320, 50);
        Banner_320_50 = adSize;
        AdSize adSize2 = new AdSize(stringFogImpl.m23824a(new byte[]{10, -17, 38, -32, 45, -4, 23, -67, 120, -66, 23, -68, 125, -66}, new byte[]{72, -114}), 1, 300, 250);
        Banner_300_250 = adSize2;
        f73526c = new AdSize[]{adSize, adSize2};
    }

    public AdSize(String str, int i, int i2, int i3) {
        this.f73527a = i2;
        this.f73528b = i3;
    }

    public static AdSize valueOf(String str) {
        return (AdSize) Enum.valueOf(AdSize.class, str);
    }

    public static AdSize[] values() {
        return (AdSize[]) f73526c.clone();
    }

    public int getHeight() {
        return this.f73528b;
    }

    public int getWidth() {
        return this.f73527a;
    }
}
