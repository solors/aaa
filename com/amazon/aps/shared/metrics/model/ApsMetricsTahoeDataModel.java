package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetricsTahoeDataModel.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsTahoeDataModel {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String TAHOE_EVENT_CATEGORY_CRASH = "crash";
    @NotNull
    public static final String TAHOE_EVENT_CATEGORY_CUSTOM = "custom";
    @NotNull
    public static final String TAHOE_EVENT_CATEGORY_FUNNEL = "funnel";
    @NotNull
    private String eventCategory;
    @NotNull
    private String eventName;
    @NotNull
    private JSONObject eventProperties;
    @NotNull
    private final String eventSource;

    /* compiled from: ApsMetricsTahoeDataModel.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ApsMetricsTahoeDataModel(@NotNull String eventCategory, @NotNull String eventName, @NotNull JSONObject eventProperties) {
        Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventProperties, "eventProperties");
        this.eventCategory = eventCategory;
        this.eventName = eventName;
        this.eventProperties = eventProperties;
        this.eventSource = "aps_android_sdk";
    }

    private final String component1() {
        return this.eventCategory;
    }

    private final String component2() {
        return this.eventName;
    }

    private final JSONObject component3() {
        return this.eventProperties;
    }

    public static /* synthetic */ ApsMetricsTahoeDataModel copy$default(ApsMetricsTahoeDataModel apsMetricsTahoeDataModel, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apsMetricsTahoeDataModel.eventCategory;
        }
        if ((i & 2) != 0) {
            str2 = apsMetricsTahoeDataModel.eventName;
        }
        if ((i & 4) != 0) {
            jSONObject = apsMetricsTahoeDataModel.eventProperties;
        }
        return apsMetricsTahoeDataModel.copy(str, str2, jSONObject);
    }

    @NotNull
    public final ApsMetricsTahoeDataModel copy(@NotNull String eventCategory, @NotNull String eventName, @NotNull JSONObject eventProperties) {
        Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventProperties, "eventProperties");
        return new ApsMetricsTahoeDataModel(eventCategory, eventName, eventProperties);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApsMetricsTahoeDataModel)) {
            return false;
        }
        ApsMetricsTahoeDataModel apsMetricsTahoeDataModel = (ApsMetricsTahoeDataModel) obj;
        if (Intrinsics.m17075f(this.eventCategory, apsMetricsTahoeDataModel.eventCategory) && Intrinsics.m17075f(this.eventName, apsMetricsTahoeDataModel.eventName) && Intrinsics.m17075f(this.eventProperties, apsMetricsTahoeDataModel.eventProperties)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.eventCategory.hashCode() * 31) + this.eventName.hashCode()) * 31) + this.eventProperties.hashCode();
    }

    @NotNull
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventSource", this.eventSource);
        jSONObject2.put("eventTime", System.currentTimeMillis());
        jSONObject2.put("eventName", this.eventName);
        jSONObject2.put("eventCategory", this.eventCategory);
        jSONObject2.put("eventProperties", this.eventProperties);
        Unit unit = Unit.f99208a;
        jSONObject.put("Data", jSONObject2);
        jSONObject.put("PartitionKey", System.currentTimeMillis());
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsTahoeDataModel(eventCategory=" + this.eventCategory + ", eventName=" + this.eventName + ", eventProperties=" + this.eventProperties + ')';
    }
}
