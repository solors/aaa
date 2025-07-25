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
public final class GDPR extends GenericDataUseConsent {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String GDPR_STANDARD = "gdpr";

    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    /* loaded from: classes3.dex */
    public static final class GDPR_CONSENT {
        private static final /* synthetic */ GDPR_CONSENT[] $VALUES;
        @NotNull
        public static final Companion Companion;

        /* renamed from: c */
        public static final /* synthetic */ EnumEntries f23788c;

        /* renamed from: b */
        public final String f23789b;
        public static final GDPR_CONSENT NON_BEHAVIORAL = new GDPR_CONSENT("NON_BEHAVIORAL", 0, "0");
        public static final GDPR_CONSENT BEHAVIORAL = new GDPR_CONSENT("BEHAVIORAL", 1, "1");

        @Metadata
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final GDPR_CONSENT fromValue(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GDPR_CONSENT gdpr_consent = GDPR_CONSENT.NON_BEHAVIORAL;
                if (Intrinsics.m17075f(gdpr_consent.getValue(), value)) {
                    return gdpr_consent;
                }
                GDPR_CONSENT gdpr_consent2 = GDPR_CONSENT.BEHAVIORAL;
                if (Intrinsics.m17075f(gdpr_consent2.getValue(), value)) {
                    return gdpr_consent2;
                }
                return null;
            }

            private Companion() {
            }
        }

        static {
            GDPR_CONSENT[] m79718a = m79718a();
            $VALUES = m79718a;
            f23788c = C44401b.m3113a(m79718a);
            Companion = new Companion(null);
        }

        public GDPR_CONSENT(String str, int i, String str2) {
            super(str, i);
            this.f23789b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ GDPR_CONSENT[] m79718a() {
            return new GDPR_CONSENT[]{NON_BEHAVIORAL, BEHAVIORAL};
        }

        @Nullable
        public static final GDPR_CONSENT fromValue(@NotNull String str) {
            return Companion.fromValue(str);
        }

        @NotNull
        public static EnumEntries<GDPR_CONSENT> getEntries() {
            return f23788c;
        }

        public static GDPR_CONSENT valueOf(String str) {
            return (GDPR_CONSENT) Enum.valueOf(GDPR_CONSENT.class, str);
        }

        public static GDPR_CONSENT[] values() {
            return (GDPR_CONSENT[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.f23789b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GDPR(@NotNull GDPR_CONSENT consent) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(consent, "consent");
        if (m79719c(consent.getValue())) {
            m79714b("gdpr");
            m79716a((Object) consent.getValue());
            return;
        }
        m79715a("Invalid GDPR consent values. Use provided values or Custom class. Value: " + consent);
    }

    /* renamed from: c */
    private final boolean m79719c(String str) {
        if (!Intrinsics.m17075f(GDPR_CONSENT.NON_BEHAVIORAL.getValue(), str) && !Intrinsics.m17075f(GDPR_CONSENT.BEHAVIORAL.getValue(), str)) {
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
