package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C33853Dm;
import io.appmetrica.analytics.impl.C34440c0;
import io.appmetrica.analytics.impl.C34927u5;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class ReporterConfig {
    @NonNull
    public final Map<String, Object> additionalConfig;
    @NonNull
    public final String apiKey;
    public final Map<String, String> appEnvironment;
    @Nullable
    public final Boolean dataSendingEnabled;
    @Nullable
    public final Integer dispatchPeriodSeconds;
    @Nullable
    public final Boolean logs;
    @Nullable
    public final Integer maxReportsCount;
    @Nullable
    public final Integer maxReportsInDatabaseCount;
    @Nullable
    public final Integer sessionTimeout;
    @Nullable
    public final String userProfileID;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: l */
        private static final C33853Dm f92227l = new C33853Dm(new C34440c0());

        /* renamed from: a */
        private final C34927u5 f92228a;

        /* renamed from: b */
        private final String f92229b;

        /* renamed from: c */
        private Integer f92230c;

        /* renamed from: d */
        private Boolean f92231d;

        /* renamed from: e */
        private Boolean f92232e;

        /* renamed from: f */
        private Integer f92233f;

        /* renamed from: g */
        private String f92234g;

        /* renamed from: h */
        private Integer f92235h;

        /* renamed from: i */
        private Integer f92236i;

        /* renamed from: j */
        private final HashMap f92237j;

        /* renamed from: k */
        private final HashMap f92238k;

        /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        @NonNull
        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, @Nullable Object obj) {
            this.f92238k.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f92237j.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z) {
            this.f92232e = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i) {
            this.f92235h = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f92231d = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i) {
            this.f92236i = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f92233f = Integer.valueOf(this.f92228a.m20921a(i));
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i) {
            this.f92230c = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f92234g = str;
            return this;
        }

        private Builder(String str) {
            this.f92237j = new HashMap();
            this.f92238k = new HashMap();
            f92227l.mo20778a(str);
            this.f92228a = new C34927u5(str);
            this.f92229b = str;
        }
    }

    /* synthetic */ ReporterConfig(Builder builder, int i) {
        this(builder);
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f92229b;
        this.sessionTimeout = builder.f92230c;
        this.logs = builder.f92231d;
        this.dataSendingEnabled = builder.f92232e;
        this.maxReportsInDatabaseCount = builder.f92233f;
        this.userProfileID = builder.f92234g;
        this.dispatchPeriodSeconds = builder.f92235h;
        this.maxReportsCount = builder.f92236i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f92237j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f92238k);
    }
}
