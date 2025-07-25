package com.moloco.sdk.publisher.privacy;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes7.dex */
public final class MolocoPrivacy {
    @NotNull
    public static final MolocoPrivacy INSTANCE = new MolocoPrivacy();
    @NotNull
    private static PrivacySettings privacySettings = new PrivacySettings(null, null, null, 7, null);
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes7.dex */
    public static final class PrivacySettings {
        public static final int $stable = 8;
        @Nullable
        private String TCFConsent;
        @Nullable
        private final Boolean isAgeRestrictedUser;
        @Nullable
        private final Boolean isDoNotSell;
        @Nullable
        private final Boolean isUserConsent;

        public PrivacySettings() {
            this(null, null, null, 7, null);
        }

        private final String get_usPrivacy() {
            String str;
            String uSPrivacyConsentString;
            Boolean bool = this.isDoNotSell;
            if (bool == null) {
                str = "1---";
            } else if (Intrinsics.m17075f(bool, Boolean.TRUE)) {
                str = "1-Y-";
            } else {
                str = "1-N-";
            }
            uSPrivacyConsentString = MolocoPrivacyKt.getUSPrivacyConsentString(str);
            return uSPrivacyConsentString;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrivacySettings)) {
                return false;
            }
            PrivacySettings privacySettings = (PrivacySettings) obj;
            if (Intrinsics.m17075f(this.isUserConsent, privacySettings.isUserConsent) && Intrinsics.m17075f(this.isAgeRestrictedUser, privacySettings.isAgeRestrictedUser) && Intrinsics.m17075f(this.isDoNotSell, privacySettings.isDoNotSell) && Intrinsics.m17075f(this.TCFConsent, privacySettings.TCFConsent)) {
                return true;
            }
            return false;
        }

        @Nullable
        public final String getTCFConsent() {
            return this.TCFConsent;
        }

        @NotNull
        public final String getUsPrivacy() {
            return get_usPrivacy();
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            Boolean bool = this.isUserConsent;
            int i4 = 0;
            if (bool != null) {
                i = bool.hashCode();
            } else {
                i = 0;
            }
            int i5 = i * 31;
            Boolean bool2 = this.isAgeRestrictedUser;
            if (bool2 != null) {
                i2 = bool2.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 31;
            Boolean bool3 = this.isDoNotSell;
            if (bool3 != null) {
                i3 = bool3.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            String str = this.TCFConsent;
            if (str != null) {
                i4 = str.hashCode();
            }
            return i7 + i4;
        }

        @Nullable
        public final Boolean isAgeRestrictedUser() {
            return this.isAgeRestrictedUser;
        }

        @Nullable
        public final Boolean isDoNotSell() {
            return this.isDoNotSell;
        }

        @Nullable
        public final Boolean isUserConsent() {
            return this.isUserConsent;
        }

        public PrivacySettings(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
            this.isUserConsent = bool;
            this.isAgeRestrictedUser = bool2;
            this.isDoNotSell = bool3;
        }

        public /* synthetic */ PrivacySettings(Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
        }

        public PrivacySettings(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str) {
            this(bool, bool2, bool3);
            this.TCFConsent = str;
        }
    }

    private MolocoPrivacy() {
    }

    public static final void setPrivacy(@NotNull PrivacySettings privacySettings2) {
        Intrinsics.checkNotNullParameter(privacySettings2, "privacySettings");
        privacySettings = privacySettings2;
    }

    @NotNull
    public final PrivacySettings getPrivacySettings() {
        Boolean gdprApplies;
        Boolean bool;
        String tCFConsent;
        PrivacySettings privacySettings2 = privacySettings;
        gdprApplies = MolocoPrivacyKt.gdprApplies();
        if (gdprApplies == null) {
            bool = privacySettings2.isUserConsent();
        } else {
            bool = gdprApplies;
        }
        Boolean isAgeRestrictedUser = privacySettings2.isAgeRestrictedUser();
        Boolean isDoNotSell = privacySettings2.isDoNotSell();
        tCFConsent = MolocoPrivacyKt.getTCFConsent();
        PrivacySettings privacySettings3 = new PrivacySettings(bool, isAgeRestrictedUser, isDoNotSell, tCFConsent);
        if (gdprApplies != null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "MolocoPrivacy", "PrivacySettings (isUserConsent/gdpr): " + gdprApplies + ", (isAgeRestrictedUser/coppa): " + privacySettings3.isAgeRestrictedUser() + ", (isDoNotSell/ccpa): " + privacySettings3.isDoNotSell(), false, 4, null);
        } else {
            MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger2, "MolocoPrivacy", "PrivacySettings (isUserConsent/gdpr): " + privacySettings3.isUserConsent() + ", (isAgeRestrictedUser/coppa): " + privacySettings3.isAgeRestrictedUser() + ", (isDoNotSell/ccpa): " + privacySettings3.isDoNotSell(), false, 4, null);
        }
        MolocoLogger molocoLogger3 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger3, "MolocoPrivacy", "PrivacySettings (TCF): " + privacySettings3.getTCFConsent(), false, 4, null);
        return privacySettings3;
    }
}
