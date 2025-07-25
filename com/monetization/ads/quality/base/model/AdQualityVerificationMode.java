package com.monetization.ads.quality.base.model;

import kotlin.Metadata;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes7.dex */
public final class AdQualityVerificationMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdQualityVerificationMode[] $VALUES;
    public static final AdQualityVerificationMode FAST_VERIFICATION;
    public static final AdQualityVerificationMode LONG_VERIFICATION;

    static {
        AdQualityVerificationMode adQualityVerificationMode = new AdQualityVerificationMode(0, "FAST_VERIFICATION");
        FAST_VERIFICATION = adQualityVerificationMode;
        AdQualityVerificationMode adQualityVerificationMode2 = new AdQualityVerificationMode(1, "LONG_VERIFICATION");
        LONG_VERIFICATION = adQualityVerificationMode2;
        AdQualityVerificationMode[] adQualityVerificationModeArr = {adQualityVerificationMode, adQualityVerificationMode2};
        $VALUES = adQualityVerificationModeArr;
        $ENTRIES = C44401b.m3113a(adQualityVerificationModeArr);
    }

    private AdQualityVerificationMode(int i, String str) {
    }

    public static AdQualityVerificationMode valueOf(String str) {
        return (AdQualityVerificationMode) Enum.valueOf(AdQualityVerificationMode.class, str);
    }

    public static AdQualityVerificationMode[] values() {
        return (AdQualityVerificationMode[]) $VALUES.clone();
    }
}
