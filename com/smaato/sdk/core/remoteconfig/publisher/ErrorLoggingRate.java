package com.smaato.sdk.core.remoteconfig.publisher;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ErrorLoggingRate {
    private final int adResponse;
    private final int configurationApi;
    private final int configurationSdk;
    private final int creative;
    private final int requestTimeout;

    /* renamed from: com.smaato.sdk.core.remoteconfig.publisher.ErrorLoggingRate$b */
    /* loaded from: classes7.dex */
    static final class C27269b {
        @Nullable

        /* renamed from: a */
        private Integer f71882a;
        @Nullable

        /* renamed from: b */
        private Integer f71883b;
        @Nullable

        /* renamed from: c */
        private Integer f71884c;
        @Nullable

        /* renamed from: d */
        private Integer f71885d;
        @Nullable

        /* renamed from: e */
        private Integer f71886e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27269b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        /* renamed from: a */
        public ErrorLoggingRate m39374a() {
            Integer num = this.f71882a;
            if (num == null || num.intValue() < 0 || this.f71882a.intValue() > 100) {
                this.f71882a = 100;
            }
            Integer num2 = this.f71883b;
            if (num2 == null || num2.intValue() < 0 || this.f71883b.intValue() > 100) {
                this.f71883b = 100;
            }
            Integer num3 = this.f71884c;
            if (num3 == null || num3.intValue() < 0 || this.f71884c.intValue() > 100) {
                this.f71884c = 100;
            }
            Integer num4 = this.f71885d;
            if (num4 == null || num4.intValue() < 0 || this.f71885d.intValue() > 100) {
                this.f71885d = 100;
            }
            Integer num5 = this.f71886e;
            if (num5 == null || num5.intValue() < 0 || this.f71886e.intValue() > 100) {
                this.f71886e = 100;
            }
            return new ErrorLoggingRate(this.f71882a.intValue(), this.f71883b.intValue(), this.f71884c.intValue(), this.f71885d.intValue(), this.f71886e.intValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27269b(@NonNull JSONObject jSONObject) {
            if (jSONObject.optInt("requestTimeout", -1) != -1) {
                this.f71882a = Integer.valueOf(jSONObject.optInt("requestTimeout"));
            }
            if (jSONObject.optInt("adResponse", -1) != -1) {
                this.f71883b = Integer.valueOf(jSONObject.optInt("adResponse"));
            }
            if (jSONObject.optInt("configurationApi", -1) != -1) {
                this.f71884c = Integer.valueOf(jSONObject.optInt("configurationApi"));
            }
            if (jSONObject.optInt("configurationSdk", -1) != -1) {
                this.f71885d = Integer.valueOf(jSONObject.optInt("configurationSdk"));
            }
            if (jSONObject.optInt(Reporting.Key.CREATIVE, -1) != -1) {
                this.f71886e = Integer.valueOf(jSONObject.optInt(Reporting.Key.CREATIVE));
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ErrorLoggingRate.class != obj.getClass()) {
            return false;
        }
        ErrorLoggingRate errorLoggingRate = (ErrorLoggingRate) obj;
        if (this.requestTimeout == errorLoggingRate.requestTimeout && this.adResponse == errorLoggingRate.adResponse && this.configurationApi == errorLoggingRate.configurationApi && this.configurationSdk == errorLoggingRate.configurationSdk && this.creative == errorLoggingRate.creative) {
            return true;
        }
        return false;
    }

    public int getAdResponse() {
        return this.adResponse;
    }

    public int getConfigurationApi() {
        return this.configurationApi;
    }

    public int getConfigurationSdk() {
        return this.configurationSdk;
    }

    public int getCreative() {
        return this.creative;
    }

    public int getRequestTimeout() {
        return this.requestTimeout;
    }

    public int hashCode() {
        return (((((((this.requestTimeout * 31) + this.adResponse) * 31) + this.configurationApi) * 31) + this.configurationSdk) * 31) + this.creative;
    }

    private ErrorLoggingRate(int i, int i2, int i3, int i4, int i5) {
        this.requestTimeout = i;
        this.adResponse = i2;
        this.configurationApi = i3;
        this.configurationSdk = i4;
        this.creative = i5;
    }
}
