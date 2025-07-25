package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetricsCustomEventInfo.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsCustomEventInfo {
    @Nullable
    private final JSONObject extraAttrs;
    @NotNull
    private final String name;
    @Nullable
    private final String value;

    public ApsMetricsCustomEventInfo(@NotNull String name, @Nullable String str, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = str;
        this.extraAttrs = jSONObject;
    }

    private final String component1() {
        return this.name;
    }

    private final String component2() {
        return this.value;
    }

    private final JSONObject component3() {
        return this.extraAttrs;
    }

    public static /* synthetic */ ApsMetricsCustomEventInfo copy$default(ApsMetricsCustomEventInfo apsMetricsCustomEventInfo, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apsMetricsCustomEventInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = apsMetricsCustomEventInfo.value;
        }
        if ((i & 4) != 0) {
            jSONObject = apsMetricsCustomEventInfo.extraAttrs;
        }
        return apsMetricsCustomEventInfo.copy(str, str2, jSONObject);
    }

    @NotNull
    public final ApsMetricsCustomEventInfo copy(@NotNull String name, @Nullable String str, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ApsMetricsCustomEventInfo(name, str, jSONObject);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApsMetricsCustomEventInfo)) {
            return false;
        }
        ApsMetricsCustomEventInfo apsMetricsCustomEventInfo = (ApsMetricsCustomEventInfo) obj;
        if (Intrinsics.m17075f(this.name, apsMetricsCustomEventInfo.name) && Intrinsics.m17075f(this.value, apsMetricsCustomEventInfo.value) && Intrinsics.m17075f(this.extraAttrs, apsMetricsCustomEventInfo.extraAttrs)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.name.hashCode() * 31;
        String str = this.value;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        JSONObject jSONObject = this.extraAttrs;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("n", this.name);
        jSONObject.put("t", System.currentTimeMillis());
        String str = this.value;
        if (str != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VALUE, str);
        }
        JSONObject jSONObject2 = this.extraAttrs;
        if (jSONObject2 != null) {
            jSONObject.put("ext", jSONObject2);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsCustomEventInfo(name=" + this.name + ", value=" + ((Object) this.value) + ", extraAttrs=" + this.extraAttrs + ')';
    }

    public /* synthetic */ ApsMetricsCustomEventInfo(String str, String str2, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jSONObject);
    }
}
