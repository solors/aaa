package com.smaato.sdk.core.kpi;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.kpi.AutoValue_KpiData;

@AutoValue
/* loaded from: classes7.dex */
public abstract class KpiData {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract KpiData build();

        public abstract Builder setRollingFillRatePerAdSpace(String str);

        public abstract Builder setSessionDepthPerAdSpace(String str);

        public abstract Builder setTotalAdRequests(String str);

        public abstract Builder setTotalFillRate(String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_KpiData.C27120b();
    }

    public abstract String getRollingFillRatePerAdSpace();

    public abstract String getSessionDepthPerAdSpace();

    public abstract String getTotalAdRequests();

    public abstract String getTotalFillRate();
}
