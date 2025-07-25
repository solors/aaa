package com.mobilefuse.sdk.network.model;

import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.network.model.MfxBidResponseToTelemetryExtrasKt */
/* loaded from: classes7.dex */
public final class MfxBidResponseToTelemetryExtras {
    @NotNull
    public static final List<TelemetryActionParam> toTelemetryExtras(@NotNull MfxBidResponse toTelemetryExtras) {
        List<TelemetryActionParam> m17160s;
        Intrinsics.checkNotNullParameter(toTelemetryExtras, "$this$toTelemetryExtras");
        m17160s = C37563v.m17160s(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_ID, toTelemetryExtras.getId(), true), new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_CRID, toTelemetryExtras.getCrid(), true), new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_CPM, String.valueOf(toTelemetryExtras.getCpm()), true), new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_TYPE, toTelemetryExtras.getType().getValue(), true), new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_EXPIRES, Integer.valueOf(toTelemetryExtras.getExpires()), true));
        AdmCreativeFormat creativeFormat = toTelemetryExtras.getCreativeFormat();
        if (creativeFormat != null) {
            m17160s.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_CREATIVE_FORMAT, creativeFormat, true));
        }
        String lossUrl = toTelemetryExtras.getLossUrl();
        if (lossUrl != null) {
            m17160s.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_LOSS_URL, lossUrl, false));
        }
        Boolean muted = toTelemetryExtras.getMuted();
        if (muted != null) {
            m17160s.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_MUTED, Boolean.valueOf(muted.booleanValue()), false));
        }
        ClickthroughBehaviour clickBehavior = toTelemetryExtras.getClickBehavior();
        if (clickBehavior != null) {
            m17160s.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_CLICK_BEHAVIOR, clickBehavior, false));
        }
        Integer maxEndCards = toTelemetryExtras.getMaxEndCards();
        if (maxEndCards != null) {
            m17160s.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_MX_END_CARDS, Integer.valueOf(maxEndCards.intValue()), false));
        }
        Float endCardCloseSeconds = toTelemetryExtras.getEndCardCloseSeconds();
        if (endCardCloseSeconds != null) {
            m17160s.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_END_CARD_CLOSE_SECONDS, Float.valueOf(endCardCloseSeconds.floatValue()), false));
        }
        Float forceSkipSeconds = toTelemetryExtras.getForceSkipSeconds();
        if (forceSkipSeconds != null) {
            m17160s.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_FORCE_SKIP_SECONDS, Float.valueOf(forceSkipSeconds.floatValue()), false));
        }
        Float blockSkipSeconds = toTelemetryExtras.getBlockSkipSeconds();
        if (blockSkipSeconds != null) {
            m17160s.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_BLOCK_SKIP_SECONDS, Float.valueOf(blockSkipSeconds.floatValue()), false));
        }
        return m17160s;
    }
}
