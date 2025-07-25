package com.mobilefuse.sdk.telemetry;

import com.ironsource.C21114v8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetrySdkTypes.kt */
@Metadata
/* loaded from: classes7.dex */
public enum TelemetrySdkParamType implements TelemetryParamType {
    ADVERTISING_ID("advertisingId", false, 2, null),
    PLACEMENT_ID("placementId", false, 2, null),
    AD_INSTANCE_TYPE("adInstanceType", false, 2, null),
    AD_SIZE(C21114v8.C21122h.f54042O, false, 2, null),
    BID_RESPONSE_ID("bid.response.id", false, 2, null),
    BID_RESPONSE_CRID("bid.response.crid", false, 2, null),
    BID_RESPONSE_CPM("bid.response.cpm", false, 2, null),
    BID_RESPONSE_TYPE("bid.response.type", false, 2, null),
    BID_RESPONSE_EXPIRES("bid.response.expires", false, 2, null),
    BID_RESPONSE_CREATIVE_FORMAT("bid.response.creative_format", false, 2, null),
    BID_RESPONSE_LOSS_URL("bid.response.loss_url", false, 2, null),
    BID_RESPONSE_MUTED("bid.response.muted", false, 2, null),
    BID_RESPONSE_CLICK_BEHAVIOR("bid.response.click_behavior", false, 2, null),
    BID_RESPONSE_MX_END_CARDS("bid.response.max_end_cards", false, 2, null),
    BID_RESPONSE_END_CARD_CLOSE_SECONDS("bid.response.end_card_close_seconds", false, 2, null),
    BID_RESPONSE_FORCE_SKIP_SECONDS("bid.response.force_skip_seconds", false, 2, null),
    BID_RESPONSE_BLOCK_SKIP_SECONDS("bid.response.block_skip_seconds", false, 2, null),
    BID_REPOSITORY_ID("bidRepositoryId", false, 2, null),
    BID_REPOSITORY_TYPE("bidRepositoryType", false, 2, null),
    AD_RENDERER("adRenderer", false, 2, null),
    TEST_MODE("testMode", false, 2, null),
    SPOOF_MODE("spoofMode", false, 2, null),
    MUTED("muted", false, 2, null),
    APP_VERSION_NAME("app.versionName", false, 2, null),
    AD_INSTANCE_ID("adInstanceId", false, 2, null),
    AD_LIFECYCLE_EVENT("event", false, 2, null),
    PRIVACY_PREFERENCES_SUBJECT_TO_COPPA("subjectToCoppa", false, 2, null),
    PRIVACY_PREFERENCES_DNT("dnt", false, 2, null),
    PRIVACY_PREFERENCES_US_PRIVACY_STRING("usPrivacyString", false, 2, null);
    
    private final boolean printInLogs;
    @NotNull
    private final String value;

    TelemetrySdkParamType(String str, boolean z) {
        this.value = str;
        this.printInLogs = z;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryParamType
    public boolean getPrintInLogs() {
        return this.printInLogs;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryParamType
    @NotNull
    public String getValue() {
        return this.value;
    }

    /* synthetic */ TelemetrySdkParamType(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
