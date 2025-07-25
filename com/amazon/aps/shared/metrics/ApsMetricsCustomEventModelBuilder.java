package com.amazon.aps.shared.metrics;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.model.ApsMetricsCustomEventInfo;
import com.amazon.aps.shared.metrics.model.ApsMetricsCustomModel;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataModel;
import com.amazon.aps.shared.metrics.model.ApsMetricsEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetricsCustomEventModelBuilder.kt */
@Metadata
/* loaded from: classes2.dex */
public class ApsMetricsCustomEventModelBuilder {
    @NotNull
    private String eventCategory = "custom";
    @Nullable
    private String eventName;
    @Nullable
    private String eventValue;
    @Nullable
    private JSONObject extraAttrs;

    @Nullable
    public final JSONObject build() {
        try {
            String str = this.eventName;
            if (str != null) {
                return new ApsMetricsTahoeDataModel(this.eventCategory, str, new ApsMetricsDataModel(new ApsMetricsEvent(new ApsMetricsCustomModel(new ApsMetricsCustomEventInfo(str, this.eventValue, this.extraAttrs)))).toJsonObject()).toJsonObject();
            }
            return null;
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error builing the custom metrics object from builder", e);
            return null;
        }
    }

    @NotNull
    public final ApsMetricsCustomEventModelBuilder withEventCategory(@NotNull String eventCategory) {
        Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        this.eventCategory = eventCategory;
        return this;
    }

    @NotNull
    public final ApsMetricsCustomEventModelBuilder withEventDetail(@NotNull JSONObject extraAttributes) {
        Intrinsics.checkNotNullParameter(extraAttributes, "extraAttributes");
        this.extraAttrs = extraAttributes;
        return this;
    }

    @NotNull
    public final ApsMetricsCustomEventModelBuilder withEventName(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        return this;
    }

    @NotNull
    public final ApsMetricsCustomEventModelBuilder withEventValue(@NotNull String eventValue) {
        Intrinsics.checkNotNullParameter(eventValue, "eventValue");
        this.eventValue = eventValue;
        return this;
    }
}
