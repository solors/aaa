package com.fyber.inneractive.sdk.cache.session.enums;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum REWARDED_VIDEO uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.fyber.inneractive.sdk.cache.session.enums.c */
/* loaded from: classes4.dex */
public final class EnumC14282c {
    private static final /* synthetic */ EnumC14282c[] $VALUES;
    public static final EnumC14282c BANNER_DISPLAY;
    public static final EnumC14282c INTERSTITIAL_DISPLAY;
    public static final EnumC14282c INTERSTITIAL_VIDEO;
    public static final EnumC14282c NONE;
    public static final EnumC14282c RECTANGLE_DISPLAY;
    public static final EnumC14282c REWARDED_DISPLAY;
    public static final EnumC14282c REWARDED_VIDEO;
    private boolean mShouldCountCompletion;
    private UnitDisplayType mType;

    static {
        UnitDisplayType unitDisplayType = UnitDisplayType.REWARDED;
        EnumC14282c enumC14282c = new EnumC14282c("REWARDED_VIDEO", 0, unitDisplayType, true);
        REWARDED_VIDEO = enumC14282c;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.INTERSTITIAL;
        EnumC14282c enumC14282c2 = new EnumC14282c("INTERSTITIAL_VIDEO", 1, unitDisplayType2, true);
        INTERSTITIAL_VIDEO = enumC14282c2;
        EnumC14282c enumC14282c3 = new EnumC14282c("RECTANGLE_DISPLAY", 2, UnitDisplayType.MRECT, false);
        RECTANGLE_DISPLAY = enumC14282c3;
        EnumC14282c enumC14282c4 = new EnumC14282c("REWARDED_DISPLAY", 3, unitDisplayType, true);
        REWARDED_DISPLAY = enumC14282c4;
        EnumC14282c enumC14282c5 = new EnumC14282c("BANNER_DISPLAY", 4, UnitDisplayType.BANNER, false);
        BANNER_DISPLAY = enumC14282c5;
        EnumC14282c enumC14282c6 = new EnumC14282c("INTERSTITIAL_DISPLAY", 5, unitDisplayType2, false);
        INTERSTITIAL_DISPLAY = enumC14282c6;
        EnumC14282c enumC14282c7 = new EnumC14282c(InterfaceC32663coo2iico.cco22, 6, UnitDisplayType.DEFAULT, false);
        NONE = enumC14282c7;
        $VALUES = new EnumC14282c[]{enumC14282c, enumC14282c2, enumC14282c3, enumC14282c4, enumC14282c5, enumC14282c6, enumC14282c7};
    }

    public EnumC14282c(String str, int i, UnitDisplayType unitDisplayType, boolean z) {
        this.mType = unitDisplayType;
        this.mShouldCountCompletion = z;
    }

    /* renamed from: a */
    public static EnumC14282c m78012a(String str, String str2) {
        int i = AbstractC14281b.f26991a[UnitDisplayType.fromValue(str).ordinal()];
        if (i == 1) {
            return str2.contains("video") ? REWARDED_VIDEO : REWARDED_DISPLAY;
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return null;
                }
                return str2.contains("video") ? INTERSTITIAL_VIDEO : INTERSTITIAL_DISPLAY;
            }
            return BANNER_DISPLAY;
        } else {
            return RECTANGLE_DISPLAY;
        }
    }

    public static EnumC14282c valueOf(String str) {
        return (EnumC14282c) Enum.valueOf(EnumC14282c.class, str);
    }

    public static EnumC14282c[] values() {
        return (EnumC14282c[]) $VALUES.clone();
    }

    /* renamed from: b */
    public final boolean m78011b() {
        return this.mShouldCountCompletion;
    }

    /* renamed from: a */
    public final UnitDisplayType m78013a() {
        return this.mType;
    }
}
