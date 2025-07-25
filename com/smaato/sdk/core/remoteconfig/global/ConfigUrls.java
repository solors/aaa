package com.smaato.sdk.core.remoteconfig.global;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.BuildConfig;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ConfigUrls {
    private static final Pattern URL_PATTERN = Pattern.compile("^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)([).!';/?:,][[:blank:]])?$");
    @NonNull
    private final String adViolationUrl;
    @NonNull
    private final String configLogUrl;
    @NonNull
    private final String configurationUrl;
    @NonNull
    private final String eventLogUrl;
    @NonNull
    private final String somaUbUrl;
    @NonNull
    private final String somaUrl;

    /* renamed from: com.smaato.sdk.core.remoteconfig.global.ConfigUrls$b */
    /* loaded from: classes7.dex */
    static final class C27259b {
        @Nullable

        /* renamed from: a */
        private String f71861a;
        @Nullable

        /* renamed from: b */
        private String f71862b;
        @Nullable

        /* renamed from: c */
        private String f71863c;
        @Nullable

        /* renamed from: d */
        private String f71864d;
        @Nullable

        /* renamed from: e */
        private String f71865e;
        @Nullable

        /* renamed from: f */
        private String f71866f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27259b() {
        }

        /* renamed from: b */
        private void m39386b(JSONObject jSONObject) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (jSONObject == null) {
                return;
            }
            String str6 = null;
            if (jSONObject.has("somaurl")) {
                str = m39385c(jSONObject.optString("somaurl"));
            } else {
                str = null;
            }
            this.f71861a = str;
            if (jSONObject.has("adviolationurl")) {
                str2 = m39385c(jSONObject.optString("adviolationurl"));
            } else {
                str2 = null;
            }
            this.f71862b = str2;
            if (jSONObject.has("somauburl")) {
                str3 = m39385c(jSONObject.optString("somauburl"));
            } else {
                str3 = null;
            }
            this.f71863c = str3;
            if (jSONObject.has("configurationurl")) {
                str4 = m39385c(jSONObject.optString("configurationurl"));
            } else {
                str4 = null;
            }
            this.f71864d = str4;
            if (jSONObject.has("configlogurl")) {
                str5 = m39385c(jSONObject.optString("configlogurl"));
            } else {
                str5 = null;
            }
            this.f71865e = str5;
            if (jSONObject.has("eventlogurl")) {
                str6 = m39385c(jSONObject.optString("eventlogurl"));
            }
            this.f71866f = str6;
        }

        /* renamed from: c */
        private String m39385c(String str) {
            if (str != null && !str.isEmpty() && ConfigUrls.URL_PATTERN.matcher(str).matches()) {
                return str;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        /* renamed from: a */
        public ConfigUrls m39387a() {
            String str = this.f71861a;
            if (str == null) {
                str = BuildConfig.SOMA_API_URL;
            }
            this.f71861a = str;
            String str2 = this.f71862b;
            if (str2 == null) {
                str2 = BuildConfig.SOMA_VIOLATIONS_AGGREGATOR_URL;
            }
            this.f71862b = str2;
            String str3 = this.f71863c;
            if (str3 == null) {
                str3 = BuildConfig.SOMA_UB_URL;
            }
            this.f71863c = str3;
            String str4 = this.f71864d;
            if (str4 == null) {
                str4 = BuildConfig.PUBLISHER_CONFIGURATION_URL;
            }
            this.f71864d = str4;
            String str5 = this.f71865e;
            if (str5 == null) {
                str5 = BuildConfig.PUBLISHER_CONFIGURATION_LOG_URL;
            }
            this.f71865e = str5;
            String str6 = this.f71866f;
            if (str6 == null) {
                str6 = BuildConfig.EVENT_LOG_URL;
            }
            this.f71866f = str6;
            return new ConfigUrls(this.f71861a, this.f71862b, this.f71863c, this.f71864d, this.f71865e, this.f71866f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27259b(@NonNull JSONObject jSONObject) {
            m39386b(jSONObject);
        }
    }

    @NonNull
    public String getAdViolationUrl() {
        return this.adViolationUrl;
    }

    @NonNull
    public String getConfigLogUrl() {
        return this.configLogUrl;
    }

    @NonNull
    public String getConfigurationUrl() {
        return this.configurationUrl;
    }

    @NonNull
    public String getEventLogUrl() {
        return this.eventLogUrl;
    }

    @NonNull
    public String getSomaUbUrl() {
        return this.somaUbUrl;
    }

    @NonNull
    public String getSomaUrl() {
        return this.somaUrl;
    }

    private ConfigUrls(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6) {
        this.somaUrl = str;
        this.adViolationUrl = str2;
        this.somaUbUrl = str3;
        this.configurationUrl = str4;
        this.configLogUrl = str5;
        this.eventLogUrl = str6;
    }
}
