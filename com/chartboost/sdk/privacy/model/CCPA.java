package com.chartboost.sdk.privacy.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;
import td.EnumEntries;

@Metadata
/* loaded from: classes3.dex */
public final class CCPA extends GenericDataUseConsent {
    @NotNull
    public static final String CCPA_STANDARD = "us_privacy";
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata
    /* loaded from: classes3.dex */
    public static final class CCPA_CONSENT {
        private static final /* synthetic */ CCPA_CONSENT[] $VALUES;
        @NotNull
        public static final Companion Companion;

        /* renamed from: c */
        public static final /* synthetic */ EnumEntries f23784c;

        /* renamed from: b */
        public final String f23785b;
        public static final CCPA_CONSENT OPT_OUT_SALE = new CCPA_CONSENT("OPT_OUT_SALE", 0, "1YY-");
        public static final CCPA_CONSENT OPT_IN_SALE = new CCPA_CONSENT("OPT_IN_SALE", 1, "1YN-");

        @Metadata
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final CCPA_CONSENT fromValue(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CCPA_CONSENT ccpa_consent = CCPA_CONSENT.OPT_OUT_SALE;
                if (Intrinsics.m17075f(ccpa_consent.getValue(), value)) {
                    return ccpa_consent;
                }
                CCPA_CONSENT ccpa_consent2 = CCPA_CONSENT.OPT_IN_SALE;
                if (Intrinsics.m17075f(ccpa_consent2.getValue(), value)) {
                    return ccpa_consent2;
                }
                return null;
            }

            private Companion() {
            }
        }

        static {
            CCPA_CONSENT[] m79723a = m79723a();
            $VALUES = m79723a;
            f23784c = C44401b.m3113a(m79723a);
            Companion = new Companion(null);
        }

        public CCPA_CONSENT(String str, int i, String str2) {
            super(str, i);
            this.f23785b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ CCPA_CONSENT[] m79723a() {
            return new CCPA_CONSENT[]{OPT_OUT_SALE, OPT_IN_SALE};
        }

        @Nullable
        public static final CCPA_CONSENT fromValue(@NotNull String str) {
            return Companion.fromValue(str);
        }

        @NotNull
        public static EnumEntries<CCPA_CONSENT> getEntries() {
            return f23784c;
        }

        public static CCPA_CONSENT valueOf(String str) {
            return (CCPA_CONSENT) Enum.valueOf(CCPA_CONSENT.class, str);
        }

        public static CCPA_CONSENT[] values() {
            return (CCPA_CONSENT[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.f23785b;
        }
    }

    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CCPA(@NotNull CCPA_CONSENT consent) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(consent, "consent");
        if (m79724c(consent.getValue())) {
            m79714b("us_privacy");
            m79716a((Object) consent.getValue());
            return;
        }
        m79715a("Invalid CCPA consent values. Use provided values or Custom class. Value: " + consent);
    }

    /* renamed from: c */
    public final boolean m79724c(String str) {
        if (!Intrinsics.m17075f(CCPA_CONSENT.OPT_OUT_SALE.getValue(), str) && !Intrinsics.m17075f(CCPA_CONSENT.OPT_IN_SALE.getValue(), str)) {
            return false;
        }
        return true;
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    @NotNull
    public String getConsent() {
        Object m79717a = m79717a();
        Intrinsics.m17073h(m79717a, "null cannot be cast to non-null type kotlin.String");
        return (String) m79717a;
    }
}
