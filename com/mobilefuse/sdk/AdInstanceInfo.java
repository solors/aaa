package com.mobilefuse.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import java.util.List;

/* loaded from: classes7.dex */
public class AdInstanceInfo {
    private static int NEXT_AD_INSTANCE_ID = 1;
    @Nullable
    protected String adSize;
    @NonNull
    protected final String adType;
    protected final int instanceId;
    @Nullable
    protected String placementId;
    @NonNull
    protected TelemetryAgent telemetryAgent;

    public AdInstanceInfo(@NonNull Object obj, @NonNull String str) {
        this(obj, str, null);
    }

    public void fillTelemetryExtras(List<TelemetryActionParam> list) {
        try {
            TelemetrySdkParamType telemetrySdkParamType = TelemetrySdkParamType.AD_INSTANCE_ID;
            list.add(new TelemetryActionParam(telemetrySdkParamType, this.instanceId + "", true));
            list.add(new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_TYPE, this.adType, true));
            String str = this.placementId;
            if (str != null) {
                list.add(new TelemetryActionParam(TelemetrySdkParamType.PLACEMENT_ID, str, true));
            }
            String str2 = this.adSize;
            if (str2 != null) {
                list.add(new TelemetryActionParam(TelemetrySdkParamType.AD_SIZE, str2, true));
            }
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public String getAdSize() {
        return this.adSize;
    }

    @NonNull
    public String getAdType() {
        return this.adType;
    }

    public int getInstanceId() {
        return this.instanceId;
    }

    @Nullable
    public String getPlacementId() {
        return this.placementId;
    }

    @NonNull
    public TelemetryAgent getTelemetryAgent() {
        return this.telemetryAgent;
    }

    public void setAdSize(@Nullable String str) {
        this.adSize = str;
    }

    public void setPlacementId(@Nullable String str) {
        this.placementId = str;
    }

    public AdInstanceInfo(@NonNull Object obj, @NonNull String str, @Nullable String str2) {
        int i = NEXT_AD_INSTANCE_ID;
        NEXT_AD_INSTANCE_ID = i + 1;
        this.instanceId = i;
        this.adType = str;
        this.placementId = str2;
        this.telemetryAgent = new TelemetryAgent(obj);
    }
}
