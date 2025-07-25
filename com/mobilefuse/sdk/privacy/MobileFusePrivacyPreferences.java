package com.mobilefuse.sdk.privacy;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFusePrivacyPreferences.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFusePrivacyPreferences {
    private final boolean doNotTrack;
    @Nullable
    private final String gppConsentString;
    @Nullable
    private final String iabConsentString;
    private final boolean isSubjectToCoppa;
    private final boolean subjectToGdpr;
    @Nullable
    private final String usPrivacyConsentString;

    public MobileFusePrivacyPreferences() {
        this(null, null, false, false, 15, null);
    }

    public static /* synthetic */ MobileFusePrivacyPreferences copy$default(MobileFusePrivacyPreferences mobileFusePrivacyPreferences, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileFusePrivacyPreferences.gppConsentString;
        }
        if ((i & 2) != 0) {
            str2 = mobileFusePrivacyPreferences.usPrivacyConsentString;
        }
        if ((i & 4) != 0) {
            z = mobileFusePrivacyPreferences.isSubjectToCoppa;
        }
        if ((i & 8) != 0) {
            z2 = mobileFusePrivacyPreferences.doNotTrack;
        }
        return mobileFusePrivacyPreferences.copy(str, str2, z, z2);
    }

    @Nullable
    public final String component1() {
        return this.gppConsentString;
    }

    @Nullable
    public final String component2() {
        return this.usPrivacyConsentString;
    }

    public final boolean component3() {
        return this.isSubjectToCoppa;
    }

    public final boolean component4() {
        return this.doNotTrack;
    }

    @NotNull
    public final MobileFusePrivacyPreferences copy(@Nullable String str, @Nullable String str2, boolean z, boolean z2) {
        return new MobileFusePrivacyPreferences(str, str2, z, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof MobileFusePrivacyPreferences) {
                MobileFusePrivacyPreferences mobileFusePrivacyPreferences = (MobileFusePrivacyPreferences) obj;
                if (!Intrinsics.m17075f(this.gppConsentString, mobileFusePrivacyPreferences.gppConsentString) || !Intrinsics.m17075f(this.usPrivacyConsentString, mobileFusePrivacyPreferences.usPrivacyConsentString) || this.isSubjectToCoppa != mobileFusePrivacyPreferences.isSubjectToCoppa || this.doNotTrack != mobileFusePrivacyPreferences.doNotTrack) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final String getGppConsentString() {
        return this.gppConsentString;
    }

    @Nullable
    public final String getIabConsentString() {
        return this.iabConsentString;
    }

    @Nullable
    public final String getUsPrivacyConsentString() {
        return this.usPrivacyConsentString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        String str = this.gppConsentString;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.usPrivacyConsentString;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        boolean z = this.isSubjectToCoppa;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        boolean z2 = this.doNotTrack;
        if (!z2) {
            i5 = z2 ? 1 : 0;
        }
        return i7 + i5;
    }

    public final boolean isDoNotTrack() {
        return this.doNotTrack;
    }

    public final boolean isSubjectToCoppa() {
        return this.isSubjectToCoppa;
    }

    public final boolean isSubjectToGdpr() {
        return this.subjectToGdpr;
    }

    @NotNull
    public String toString() {
        return "MobileFusePrivacyPreferences(gppConsentString=" + this.gppConsentString + ", usPrivacyConsentString=" + this.usPrivacyConsentString + ", isSubjectToCoppa=" + this.isSubjectToCoppa + ", doNotTrack=" + this.doNotTrack + ")";
    }

    public MobileFusePrivacyPreferences(@Nullable String str, @Nullable String str2, boolean z, boolean z2) {
        this.gppConsentString = str;
        this.usPrivacyConsentString = str2;
        this.isSubjectToCoppa = z;
        this.doNotTrack = z2;
        this.subjectToGdpr = true;
        this.iabConsentString = "";
    }

    public /* synthetic */ MobileFusePrivacyPreferences(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public static /* synthetic */ void getIabConsentString$annotations() {
    }

    public static /* synthetic */ void isSubjectToGdpr$annotations() {
    }

    /* compiled from: MobileFusePrivacyPreferences.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        private boolean doNotTrack;
        private String gppConsentString;
        private boolean isSubjectToCoppa;
        private String usPrivacyConsentString;

        @NotNull
        public final MobileFusePrivacyPreferences build() {
            return new MobileFusePrivacyPreferences(this.gppConsentString, this.usPrivacyConsentString, this.isSubjectToCoppa, this.doNotTrack);
        }

        @NotNull
        public final Builder setDoNotTrack(boolean z) {
            this.doNotTrack = z;
            return this;
        }

        @NotNull
        public final Builder setGppConsentString(@Nullable String str) {
            this.gppConsentString = str;
            return this;
        }

        @NotNull
        public final Builder setSubjectToCoppa(boolean z) {
            this.isSubjectToCoppa = z;
            return this;
        }

        @NotNull
        public final Builder setUsPrivacyConsentString(@Nullable String str) {
            this.usPrivacyConsentString = str;
            return this;
        }

        @NotNull
        public final Builder setIabConsentString(@Nullable String str) {
            return this;
        }

        @NotNull
        public final Builder setSubjectToGdpr(boolean z) {
            return this;
        }
    }
}
