package com.smaato.sdk.core.remoteconfig.global;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ConfigProperties {
    @NonNull
    private final Long locationValidForPeriodMin;
    @NonNull
    private final Integer numOfRetriesAfterNetErrorInUb;
    @NonNull
    private final Integer sessionIdFrequencyMin;
    @NonNull
    private final Double vastAdVisibilityRatio;
    @NonNull
    private final Long vastAdVisibilityTimeMillis;

    /* renamed from: com.smaato.sdk.core.remoteconfig.global.ConfigProperties$b */
    /* loaded from: classes7.dex */
    static final class C27257b {
        @Nullable

        /* renamed from: a */
        private Integer f71856a;
        @Nullable

        /* renamed from: b */
        private Long f71857b;
        @Nullable

        /* renamed from: c */
        private Double f71858c;
        @Nullable

        /* renamed from: d */
        private Long f71859d;
        @Nullable

        /* renamed from: e */
        private Integer f71860e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27257b() {
        }

        /* renamed from: b */
        private void m39388b(JSONObject jSONObject) {
            Integer num;
            Long l;
            Double d;
            Long l2;
            if (jSONObject == null) {
                return;
            }
            Integer num2 = null;
            if (jSONObject.has("sessionidfrequencyinmins")) {
                num = Integer.valueOf(jSONObject.optInt("sessionidfrequencyinmins"));
            } else {
                num = null;
            }
            this.f71856a = num;
            if (jSONObject.has("loactionvalidforperiodinmins")) {
                l = Long.valueOf(jSONObject.optLong("loactionvalidforperiodinmins"));
            } else {
                l = null;
            }
            this.f71857b = l;
            if (jSONObject.has("vastadvisibilityratio")) {
                d = Double.valueOf(jSONObject.optDouble("vastadvisibilityratio") / 100.0d);
            } else {
                d = null;
            }
            this.f71858c = d;
            if (jSONObject.has("vastadvisibilitytimeinmillis")) {
                l2 = Long.valueOf(jSONObject.optLong("vastadvisibilitytimeinmillis"));
            } else {
                l2 = null;
            }
            this.f71859d = l2;
            if (jSONObject.has("noretriesafternetworkerrorinub")) {
                num2 = Integer.valueOf(jSONObject.optInt("noretriesafternetworkerrorinub"));
            }
            this.f71860e = num2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        /* renamed from: a */
        public ConfigProperties m39389a() {
            int intValue;
            long longValue;
            double doubleValue;
            long longValue2;
            int intValue2;
            Integer num = this.f71856a;
            if (num == null) {
                intValue = 1440;
            } else {
                intValue = num.intValue();
            }
            this.f71856a = Integer.valueOf(intValue);
            Long l = this.f71857b;
            if (l == null) {
                longValue = 1200000;
            } else {
                longValue = l.longValue();
            }
            this.f71857b = Long.valueOf(longValue);
            Double d = this.f71858c;
            if (d == null) {
                doubleValue = 0.01d;
            } else {
                doubleValue = d.doubleValue();
            }
            this.f71858c = Double.valueOf(doubleValue);
            Long l2 = this.f71859d;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            this.f71859d = Long.valueOf(longValue2);
            Integer num2 = this.f71860e;
            if (num2 == null) {
                intValue2 = 5;
            } else {
                intValue2 = num2.intValue();
            }
            Integer valueOf = Integer.valueOf(intValue2);
            this.f71860e = valueOf;
            return new ConfigProperties(this.f71856a, this.f71857b, this.f71858c, this.f71859d, valueOf);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27257b(@NonNull JSONObject jSONObject) {
            m39388b(jSONObject);
        }
    }

    @NonNull
    public Long getLocationValidForPeriodMin() {
        return this.locationValidForPeriodMin;
    }

    @NonNull
    public Integer getNumOfRetriesAfterNetErrorInUb() {
        return this.numOfRetriesAfterNetErrorInUb;
    }

    @NonNull
    public Integer getSessionIdFrequencyMin() {
        return this.sessionIdFrequencyMin;
    }

    @NonNull
    public Double getVastAdVisibilityRatio() {
        return this.vastAdVisibilityRatio;
    }

    @NonNull
    public Long getVastAdVisibilityTimeMillis() {
        return this.vastAdVisibilityTimeMillis;
    }

    private ConfigProperties(@NonNull Integer num, @NonNull Long l, @NonNull Double d, @NonNull Long l2, @NonNull Integer num2) {
        this.sessionIdFrequencyMin = num;
        this.locationValidForPeriodMin = l;
        this.vastAdVisibilityRatio = d;
        this.vastAdVisibilityTimeMillis = l2;
        this.numOfRetriesAfterNetErrorInUb = num2;
    }
}
