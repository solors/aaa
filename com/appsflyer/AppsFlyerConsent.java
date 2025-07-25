package com.appsflyer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AppsFlyerConsent {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private final Boolean AFInAppEventParameterName;
    @Nullable
    private final Boolean AFKeystoreWrapper;
    private final boolean values;

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppsFlyerConsent forGDPRUser(boolean z, boolean z2) {
            return new AppsFlyerConsent(true, Boolean.valueOf(z), Boolean.valueOf(z2), null);
        }

        @NotNull
        public final AppsFlyerConsent forNonGDPRUser() {
            return new AppsFlyerConsent(false, null, null, null);
        }
    }

    public /* synthetic */ AppsFlyerConsent(boolean z, Boolean bool, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, bool, bool2);
    }

    public static /* synthetic */ AppsFlyerConsent copy$default(AppsFlyerConsent appsFlyerConsent, boolean z, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appsFlyerConsent.values;
        }
        if ((i & 2) != 0) {
            bool = appsFlyerConsent.AFKeystoreWrapper;
        }
        if ((i & 4) != 0) {
            bool2 = appsFlyerConsent.AFInAppEventParameterName;
        }
        return appsFlyerConsent.copy(z, bool, bool2);
    }

    @NotNull
    public static final AppsFlyerConsent forGDPRUser(boolean z, boolean z2) {
        return Companion.forGDPRUser(z, z2);
    }

    @NotNull
    public static final AppsFlyerConsent forNonGDPRUser() {
        return Companion.forNonGDPRUser();
    }

    public final boolean component1() {
        return this.values;
    }

    @Nullable
    public final Boolean component2() {
        return this.AFKeystoreWrapper;
    }

    @Nullable
    public final Boolean component3() {
        return this.AFInAppEventParameterName;
    }

    @NotNull
    public final AppsFlyerConsent copy(boolean z, @Nullable Boolean bool, @Nullable Boolean bool2) {
        return new AppsFlyerConsent(z, bool, bool2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFlyerConsent)) {
            return false;
        }
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) obj;
        if (this.values == appsFlyerConsent.values && Intrinsics.m17075f(this.AFKeystoreWrapper, appsFlyerConsent.AFKeystoreWrapper) && Intrinsics.m17075f(this.AFInAppEventParameterName, appsFlyerConsent.AFInAppEventParameterName)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Boolean getHasConsentForAdsPersonalization() {
        return this.AFInAppEventParameterName;
    }

    @Nullable
    public final Boolean getHasConsentForDataUsage() {
        return this.AFKeystoreWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.values;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.AFKeystoreWrapper;
        int i2 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Boolean bool2 = this.AFInAppEventParameterName;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return i3 + i2;
    }

    public final boolean isUserSubjectToGDPR() {
        return this.values;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppsFlyerConsent(isUserSubjectToGDPR=");
        sb2.append(this.values);
        sb2.append(", hasConsentForDataUsage=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", hasConsentForAdsPersonalization=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(')');
        return sb2.toString();
    }

    private AppsFlyerConsent(boolean z, Boolean bool, Boolean bool2) {
        this.values = z;
        this.AFKeystoreWrapper = bool;
        this.AFInAppEventParameterName = bool2;
    }
}
