package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import androidx.annotation.Size;
import androidx.annotation.UiThread;
import com.facebook.AuthenticationTokenClaims;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.AbstractC18851A5;
import com.inmobi.media.AbstractC18880C6;
import com.inmobi.media.AbstractC18899Db;
import com.inmobi.media.AbstractC19187Z5;
import com.inmobi.media.AbstractC19220bb;
import com.inmobi.media.AbstractC19330j9;
import com.inmobi.media.AbstractC19494v5;
import com.inmobi.media.AbstractC19512w9;
import com.inmobi.media.AbstractC19521x4;
import com.inmobi.media.C18954Ha;
import com.inmobi.media.C18955Hb;
import com.inmobi.media.C19017M3;
import com.inmobi.media.C19070Q4;
import com.inmobi.media.C19089Rb;
import com.inmobi.media.C19140Va;
import com.inmobi.media.C19212b3;
import com.inmobi.media.C19262eb;
import com.inmobi.media.C19351l2;
import com.inmobi.media.C19379n2;
import com.inmobi.media.C19484u9;
import com.inmobi.media.C19508w5;
import com.inmobi.media.EnumC19332jb;
import com.inmobi.media.RunnableC18948H4;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import td.C44401b;
import td.EnumEntries;

@Metadata
/* loaded from: classes6.dex */
public final class InMobiSdk {
    @NotNull
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    @NotNull
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";
    @NotNull
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";
    @NotNull
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    /* loaded from: classes6.dex */
    public static final class AgeGroup {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AgeGroup[] $VALUES;
        @NotNull
        private final String value;
        public static final AgeGroup BELOW_18 = new AgeGroup("BELOW_18", 0, "below18");
        public static final AgeGroup BETWEEN_18_AND_24 = new AgeGroup("BETWEEN_18_AND_24", 1, "between18and24");
        public static final AgeGroup BETWEEN_25_AND_29 = new AgeGroup("BETWEEN_25_AND_29", 2, "between25and29");
        public static final AgeGroup BETWEEN_30_AND_34 = new AgeGroup("BETWEEN_30_AND_34", 3, "between30and34");
        public static final AgeGroup BETWEEN_35_AND_44 = new AgeGroup("BETWEEN_35_AND_44", 4, "between35and44");
        public static final AgeGroup BETWEEN_45_AND_54 = new AgeGroup("BETWEEN_45_AND_54", 5, "between45and54");
        public static final AgeGroup BETWEEN_55_AND_65 = new AgeGroup("BETWEEN_55_AND_65", 6, "between55and65");
        public static final AgeGroup ABOVE_65 = new AgeGroup("ABOVE_65", 7, "above65");

        private static final /* synthetic */ AgeGroup[] $values() {
            return new AgeGroup[]{BELOW_18, BETWEEN_18_AND_24, BETWEEN_25_AND_29, BETWEEN_30_AND_34, BETWEEN_35_AND_44, BETWEEN_45_AND_54, BETWEEN_55_AND_65, ABOVE_65};
        }

        static {
            AgeGroup[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C44401b.m3113a($values);
        }

        private AgeGroup(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<AgeGroup> getEntries() {
            return $ENTRIES;
        }

        public static AgeGroup valueOf(String str) {
            return (AgeGroup) Enum.valueOf(AgeGroup.class, str);
        }

        public static AgeGroup[] values() {
            return (AgeGroup[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    /* loaded from: classes6.dex */
    public static final class Education {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Education[] $VALUES;
        @NotNull
        private final String value;
        public static final Education HIGH_SCHOOL_OR_LESS = new Education("HIGH_SCHOOL_OR_LESS", 0, "highschoolorless");
        public static final Education COLLEGE_OR_GRADUATE = new Education("COLLEGE_OR_GRADUATE", 1, "collegeorgraduate");
        public static final Education POST_GRADUATE_OR_ABOVE = new Education("POST_GRADUATE_OR_ABOVE", 2, "postgraduateorabove");

        private static final /* synthetic */ Education[] $values() {
            return new Education[]{HIGH_SCHOOL_OR_LESS, COLLEGE_OR_GRADUATE, POST_GRADUATE_OR_ABOVE};
        }

        static {
            Education[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C44401b.m3113a($values);
        }

        private Education(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Education> getEntries() {
            return $ENTRIES;
        }

        public static Education valueOf(String str) {
            return (Education) Enum.valueOf(Education.class, str);
        }

        public static Education[] values() {
            return (Education[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    /* loaded from: classes6.dex */
    public static final class Gender {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Gender[] $VALUES;
        public static final Gender FEMALE = new Gender("FEMALE", 0, InneractiveMediationDefs.GENDER_FEMALE);
        public static final Gender MALE = new Gender("MALE", 1, "m");
        @NotNull
        private final String value;

        private static final /* synthetic */ Gender[] $values() {
            return new Gender[]{FEMALE, MALE};
        }

        static {
            Gender[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C44401b.m3113a($values);
        }

        private Gender(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Gender> getEntries() {
            return $ENTRIES;
        }

        public static Gender valueOf(String str) {
            return (Gender) Enum.valueOf(Gender.class, str);
        }

        public static Gender[] values() {
            return (Gender[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    /* loaded from: classes6.dex */
    public static final class LogLevel {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel NONE = new LogLevel(InterfaceC32663coo2iico.cco22, 0);
        public static final LogLevel ERROR = new LogLevel("ERROR", 1);
        public static final LogLevel DEBUG = new LogLevel("DEBUG", 2);

        private static final /* synthetic */ LogLevel[] $values() {
            return new LogLevel[]{NONE, ERROR, DEBUG};
        }

        static {
            LogLevel[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C44401b.m3113a($values);
        }

        private LogLevel(String str, int i) {
        }

        @NotNull
        public static EnumEntries<LogLevel> getEntries() {
            return $ENTRIES;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }
    }

    @Metadata
    /* loaded from: classes6.dex */
    public static final class PublisherSignals {
        @NotNull
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        @Nullable
        public final Map<String, Object> getPublisherSignals() {
            Map<String, Object> m17284j;
            Map<String, Object> m59875a;
            if (InMobiSdk.isSDKInitialized()) {
                C19484u9 c19484u9 = C19484u9.f48721a;
                c19484u9.getClass();
                try {
                    LinkedHashMap linkedHashMap = C19379n2.f48527a;
                    Config m60081a = C19351l2.m60081a("signals", C18954Ha.m61076b(), null);
                    Intrinsics.m17073h(m60081a, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                    SignalsConfig.PublisherConfig publisherConfig = ((SignalsConfig) m60081a).getPublisherConfig();
                    if (!publisherConfig.getEnableMCO() && !publisherConfig.getEnableAB()) {
                        m59875a = C37559r0.m17284j();
                        return m59875a;
                    }
                    m59875a = c19484u9.m59875a();
                    return m59875a;
                } catch (Exception e) {
                    C19070Q4 c19070q4 = C19070Q4.f47635a;
                    C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
                    AbstractC19187Z5.m60514a((byte) 1, "PubSignalsStore", "Publisher signals could not be retrieved.");
                    m17284j = C37559r0.m17284j();
                    return m17284j;
                }
            }
            String access$getTAG$p = InMobiSdk.access$getTAG$p();
            Intrinsics.checkNotNullExpressionValue(access$getTAG$p, "access$getTAG$p(...)");
            AbstractC19187Z5.m60514a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
            return null;
        }

        public final void putPublisherSignals(@Nullable Map<String, ? extends Object> map) {
            if (InMobiSdk.isSDKInitialized()) {
                if (map != null) {
                    C19484u9 c19484u9 = C19484u9.f48721a;
                    c19484u9.getClass();
                    Intrinsics.checkNotNullParameter(map, "signals");
                    try {
                        LinkedHashMap linkedHashMap = C19379n2.f48527a;
                        Config m60081a = C19351l2.m60081a("signals", C18954Ha.m61076b(), null);
                        Intrinsics.m17073h(m60081a, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                        SignalsConfig.PublisherConfig publisherConfig = ((SignalsConfig) m60081a).getPublisherConfig();
                        if (!publisherConfig.getEnableMCO() && !publisherConfig.getEnableAB()) {
                            AbstractC19187Z5.m60514a((byte) 1, "PubSignalsStore", "Publisher signals are disabled from InMobi");
                            return;
                        }
                        LinkedHashMap m59875a = c19484u9.m59875a();
                        Intrinsics.checkNotNullParameter(m59875a, "<this>");
                        Intrinsics.checkNotNullParameter(map, "map");
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.putAll(m59875a);
                        linkedHashMap2.putAll(map);
                        JSONObject m59868a = C19484u9.m59868a(C19484u9.m59871a(C19484u9.m59870a(linkedHashMap2, publisherConfig)), publisherConfig);
                        if (m59868a != null) {
                            C19484u9.m59869a(m59868a);
                        }
                        return;
                    } catch (Exception e) {
                        C19070Q4 c19070q4 = C19070Q4.f47635a;
                        C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
                        AbstractC19187Z5.m60514a((byte) 1, "PubSignalsStore", "Publisher signals could not be saved.");
                        return;
                    }
                }
                return;
            }
            String access$getTAG$p = InMobiSdk.access$getTAG$p();
            Intrinsics.checkNotNullExpressionValue(access$getTAG$p, "access$getTAG$p(...)");
            AbstractC19187Z5.m60514a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
        }

        public final void resetPublisherSignals() {
            if (InMobiSdk.isSDKInitialized()) {
                C19484u9.f48721a.getClass();
                C19484u9.m59867b();
                return;
            }
            String access$getTAG$p = InMobiSdk.access$getTAG$p();
            Intrinsics.checkNotNullExpressionValue(access$getTAG$p, "access$getTAG$p(...)");
            AbstractC19187Z5.m60514a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot reset publisher signals.");
        }
    }

    /* renamed from: a */
    public static void m59513a(final Context context, final String str, final JSONObject jSONObject, final SdkInitializationListener sdkInitializationListener) {
        AbstractC19220bb.m60432a(new Runnable() { // from class: p3.a
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.m59515a(context, sdkInitializationListener, str, jSONObject);
            }
        });
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    /* renamed from: b */
    public static void m59510b(final SdkInitializationListener sdkInitializationListener, final String str) {
        if (sdkInitializationListener != null) {
            AbstractC19220bb.m60432a(new Runnable() { // from class: p3.d
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiSdk.m59509c(sdkInitializationListener, str);
                }
            });
        }
        if (str == null) {
            StringBuilder m61272a = AbstractC18851A5.m61272a("InMobiSdk", "TAG", "InMobi SDK initialized with account id: ");
            m61272a.append(C18954Ha.m61076b());
            AbstractC19187Z5.m60514a((byte) 2, "InMobiSdk", m61272a.toString());
            return;
        }
        Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
        AbstractC19187Z5.m60514a((byte) 1, "InMobiSdk", str);
    }

    /* renamed from: c */
    public static final void m59509c(SdkInitializationListener sdkInitializationListener, String str) {
        INSTANCE.m59512a(sdkInitializationListener, str);
    }

    @Nullable
    public static final String getToken() {
        return getToken(null, null);
    }

    @NotNull
    public static final String getVersion() {
        return "10.7.8";
    }

    @UiThread
    public static final void init(@Nullable Context context, @Size(max = 36, min = 32) @Nullable String str, @Nullable JSONObject jSONObject, @Nullable SdkInitializationListener sdkInitializationListener) {
        INSTANCE.getClass();
        m59513a(context, str, jSONObject, sdkInitializationListener);
    }

    public static final boolean isSDKInitialized() {
        return C18954Ha.m61055q();
    }

    public static final void setAge(int i) {
        Context m61068d = C18954Ha.m61068d();
        if (i != Integer.MIN_VALUE) {
            AbstractC19512w9.f48828a = i;
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d, "user_info_store").m59620a("user_age", i);
            }
        }
    }

    public static final void setAgeGroup(@NotNull AgeGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        String ageGroup = group.toString();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = ageGroup.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        Context m61068d = C18954Ha.m61068d();
        if (lowerCase != null) {
            AbstractC19512w9.f48830c = lowerCase;
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d, "user_info_store").m59618a("user_age_group", lowerCase);
            }
        }
    }

    public static final void setApplicationMuted(boolean z) {
        C18954Ha.m61072b(z);
    }

    public static final void setAreaCode(@Nullable String str) {
        Context m61068d = C18954Ha.m61068d();
        AbstractC19512w9.f48831d = str;
        if (m61068d != null && str != null) {
            ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
            AbstractC19494v5.m59823a(m61068d, "user_info_store").m59618a("user_area_code", str);
        }
    }

    public static final void setEducation(@NotNull Education education) {
        Intrinsics.checkNotNullParameter(education, "education");
        String education2 = education.toString();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = education2.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        Context m61068d = C18954Ha.m61068d();
        if (lowerCase != null) {
            AbstractC19512w9.f48838k = lowerCase;
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d, "user_info_store").m59618a("user_education", lowerCase);
            }
        }
    }

    public static final void setGender(@NotNull Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        String gender2 = gender.toString();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = gender2.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        Context m61068d = C18954Ha.m61068d();
        if (lowerCase != null) {
            AbstractC19512w9.f48837j = lowerCase;
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d, "user_info_store").m59618a(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, lowerCase);
            }
        }
    }

    public static final void setInterests(@Nullable String str) {
        Context m61068d = C18954Ha.m61068d();
        if (str != null) {
            AbstractC19512w9.f48840m = str;
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d, "user_info_store").m59618a("user_interest", str);
            }
        }
    }

    public static final void setIsAgeRestricted(boolean z) {
        AbstractC19512w9.m59607a(z);
        C18955Hb.f47329a.m61049a(z);
        if (z) {
            InMobiUnifiedIdService.reset();
        }
    }

    public static final void setLanguage(@Nullable String str) {
        Context m61068d = C18954Ha.m61068d();
        if (str != null) {
            AbstractC19512w9.f48839l = str;
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d, "user_info_store").m59618a("user_language", str);
            }
        }
    }

    public static final void setLocation(@Nullable Location location) {
        Context m61068d = C18954Ha.m61068d();
        if (location != null) {
            AbstractC19512w9.f48841n = location;
            if (m61068d != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(location.getLatitude());
                sb2.append(',');
                sb2.append(location.getLongitude());
                sb2.append(',');
                sb2.append((int) location.getAccuracy());
                sb2.append(',');
                sb2.append(location.getTime());
                String sb3 = sb2.toString();
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d, "user_info_store").m59618a(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, sb3);
            }
        }
    }

    public static final void setLocationWithCityStateCountry(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        Context m61068d = C18954Ha.m61068d();
        if (str != null) {
            AbstractC19512w9.f48833f = str;
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d, "user_info_store").m59618a("user_city_code", str);
            }
        }
        Context m61068d2 = C18954Ha.m61068d();
        if (str2 != null) {
            AbstractC19512w9.f48834g = str2;
            if (m61068d2 != null) {
                ConcurrentHashMap concurrentHashMap2 = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d2, "user_info_store").m59618a("user_state_code", str2);
            }
        }
        Context m61068d3 = C18954Ha.m61068d();
        if (str3 != null) {
            AbstractC19512w9.f48835h = str3;
            if (m61068d3 != null) {
                ConcurrentHashMap concurrentHashMap3 = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d3, "user_info_store").m59618a("user_country_code", str3);
            }
        }
    }

    public static final void setLogLevel(@Nullable LogLevel logLevel) {
        int i;
        if (logLevel == null) {
            i = -1;
        } else {
            i = AbstractC19558a.f48971a[logLevel.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    AbstractC19187Z5.m60515a((byte) 2);
                    return;
                } else {
                    AbstractC19187Z5.m60515a((byte) 2);
                    return;
                }
            }
            AbstractC19187Z5.m60515a((byte) 1);
            return;
        }
        AbstractC19187Z5.m60515a((byte) 0);
    }

    public static final void setPartnerGDPRConsent(@Nullable JSONObject jSONObject) {
        C19017M3.m60911c(jSONObject);
    }

    public static final void setPostalCode(@Nullable String str) {
        Context m61068d = C18954Ha.m61068d();
        if (str != null) {
            AbstractC19512w9.f48832e = str;
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d, "user_info_store").m59618a("user_post_code", str);
            }
        }
    }

    public static final void setPublisherProvidedUnifiedId(@Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
        Objects.toString(jSONObject);
        C18954Ha.m61079a(new RunnableC18948H4(jSONObject));
    }

    public static final void setYearOfBirth(int i) {
        Context m61068d = C18954Ha.m61068d();
        if (i != Integer.MIN_VALUE) {
            AbstractC19512w9.f48836i = i;
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                AbstractC19494v5.m59823a(m61068d, "user_info_store").m59620a("user_yob", i);
            }
        }
    }

    public static final void updateGDPRConsent(@Nullable JSONObject jSONObject) {
        C19017M3.m60913b(jSONObject);
    }

    /* renamed from: a */
    public static final void m59515a(final Context context, final SdkInitializationListener sdkInitializationListener, String str, JSONObject jSONObject) {
        if (context == null) {
            INSTANCE.getClass();
            m59510b(sdkInitializationListener, SdkInitializationListener.MISSING_CONTEXT);
        } else if (str == null) {
            INSTANCE.getClass();
            m59510b(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
        } else {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            C19140Va.f47870a.m60629a();
            if (C19089Rb.f47669a.m60730c()) {
                INSTANCE.getClass();
                m59510b(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.m17071j(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            final String m61239a = AbstractC18880C6.m61239a(length, 1, str, i);
            try {
                C19017M3.m60913b(jSONObject);
                if (m61239a.length() == 0) {
                    INSTANCE.getClass();
                    m59510b(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                    return;
                }
                if (!AbstractC19330j9.m60162a(context, "android.permission.ACCESS_COARSE_LOCATION") && !AbstractC19330j9.m60162a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                    Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
                    AbstractC19187Z5.m60514a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
                }
                if (C18954Ha.m61055q()) {
                    Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
                    INSTANCE.getClass();
                    m59510b(sdkInitializationListener, null);
                    return;
                }
                C18954Ha c18954Ha = C18954Ha.f47320a;
                if (c18954Ha.m61063i() == 1) {
                    Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
                } else if (!C18954Ha.m61074b(context, m61239a)) {
                    Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
                    c18954Ha.m61053s();
                    INSTANCE.getClass();
                    m59510b(sdkInitializationListener, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                } else {
                    C19089Rb.f47669a.m60727e(context);
                    INSTANCE.getClass();
                    m59517a();
                    C18954Ha.m61079a(new Runnable() { // from class: p3.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            InMobiSdk.m59514a(context, m61239a, sdkInitializationListener, elapsedRealtime);
                        }
                    });
                }
            } catch (Exception unused) {
                Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
                C18954Ha.f47320a.m61053s();
                INSTANCE.getClass();
                m59510b(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
            }
        }
    }

    @UiThread
    @Nullable
    public static final String getToken(@Nullable Map<String, String> map, @Nullable String str) {
        return AbstractC18899Db.m61144a(map, str);
    }

    /* renamed from: b */
    public static final void m59511b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb2 = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (AbstractC19330j9.m60162a(C18954Ha.m61068d(), str)) {
                sb2.append("\n");
                sb2.append(str);
            }
        }
        Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
        AbstractC19187Z5.m60514a((byte) 2, "InMobiSdk", sb2.toString());
    }

    /* renamed from: a */
    public static final void m59514a(Context context, String str, SdkInitializationListener sdkInitializationListener, long j) {
        try {
            C19089Rb c19089Rb = C19089Rb.f47669a;
            c19089Rb.m60734a(context);
            C18954Ha c18954Ha = C18954Ha.f47320a;
            c18954Ha.m61085a();
            c18954Ha.m61073b(str);
            c19089Rb.m60729c(context);
            c18954Ha.m61052t();
            INSTANCE.getClass();
            m59510b(sdkInitializationListener, null);
            LinkedHashMap m59516a = m59516a(j);
            C19262eb c19262eb = C19262eb.f48183a;
            C19262eb.m60370b("SdkInitialized", m59516a, EnumC19332jb.f48415a);
            InMobiUnifiedIdService.push(null);
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
            C18954Ha.f47320a.m61053s();
            INSTANCE.getClass();
            m59510b(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    /* renamed from: a */
    public final void m59512a(SdkInitializationListener sdkInitializationListener, String str) {
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    /* renamed from: a */
    public static LinkedHashMap m59516a(long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
        Objects.toString(linkedHashMap.get("latency"));
        linkedHashMap.put("networkType", C19212b3.m60446q());
        linkedHashMap.put("integrationType", "InMobi");
        return linkedHashMap;
    }

    /* renamed from: a */
    public static void m59517a() {
        C18954Ha.m61079a(new Runnable() { // from class: p3.c
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.m59511b();
            }
        });
    }
}
