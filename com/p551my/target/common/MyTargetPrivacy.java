package com.p551my.target.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.common.MyTargetPrivacy */
/* loaded from: classes7.dex */
public class MyTargetPrivacy {
    private static boolean ageRestricted;
    @Nullable
    private static Boolean ccpaConsent;
    @Nullable
    private static Boolean consent;
    @Nullable
    private static Boolean iabConsent;
    @Nullable
    public final Boolean ccpaUserConsent;
    @Nullable
    public final Boolean iabUserConsent;
    public final boolean userAgeRestricted;
    @Nullable
    public final Boolean userConsent;

    public MyTargetPrivacy(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, boolean z) {
        this.userConsent = bool;
        this.ccpaUserConsent = bool2;
        this.iabUserConsent = bool3;
        this.userAgeRestricted = z;
    }

    @NonNull
    public static MyTargetPrivacy currentPrivacy() {
        return new MyTargetPrivacy(consent, ccpaConsent, iabConsent, ageRestricted);
    }

    public static void setCcpaUserConsent(boolean z) {
        ccpaConsent = Boolean.valueOf(z);
    }

    public static void setIabUserConsent(boolean z) {
        iabConsent = Boolean.valueOf(z);
    }

    public static void setUserAgeRestricted(boolean z) {
        ageRestricted = z;
    }

    public static void setUserConsent(boolean z) {
        consent = Boolean.valueOf(z);
    }

    public boolean isConsent() {
        Boolean bool = Boolean.FALSE;
        if (!bool.equals(this.userConsent) && !bool.equals(this.ccpaUserConsent) && !bool.equals(this.iabUserConsent)) {
            return true;
        }
        return false;
    }
}
