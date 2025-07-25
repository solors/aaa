package com.amazon.aps.shared.metrics.model;

import com.amazon.aps.shared.ApsMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetricsSdkInfo.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsSdkInfo {
    @Nullable
    private String version;

    public ApsMetricsSdkInfo() {
        this(null, 1, null);
    }

    public static /* synthetic */ ApsMetricsSdkInfo copy$default(ApsMetricsSdkInfo apsMetricsSdkInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apsMetricsSdkInfo.version;
        }
        return apsMetricsSdkInfo.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.version;
    }

    @NotNull
    public final ApsMetricsSdkInfo copy(@Nullable String str) {
        return new ApsMetricsSdkInfo(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ApsMetricsSdkInfo) && Intrinsics.m17075f(this.version, ((ApsMetricsSdkInfo) obj).version)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    @NotNull
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        String version = getVersion();
        if (version != null) {
            jSONObject.put("cv", version);
        }
        String adapterVersion = ApsMetrics.Companion.getAdapterVersion();
        if (adapterVersion != null) {
            jSONObject.put("av", adapterVersion);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsSdkInfo(version=" + ((Object) this.version) + ')';
    }

    public ApsMetricsSdkInfo(@Nullable String str) {
        this.version = str;
    }

    public /* synthetic */ ApsMetricsSdkInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
