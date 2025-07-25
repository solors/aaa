package com.taurusx.tax.vast;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public enum VideoTrackingEvent {
    START("start"),
    FIRST_QUARTILE("firstQuartile"),
    MIDPOINT("midpoint"),
    THIRD_QUARTILE("thirdQuartile"),
    COMPLETE("complete"),
    COMPANION_AD_VIEW("companionAdView"),
    COMPANION_AD_CLICK("companionAdClick"),
    UNKNOWN("");
    
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull

    /* renamed from: a */
    public final String f74384a;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VideoTrackingEvent fromString(@Nullable String str) {
            VideoTrackingEvent videoTrackingEvent;
            boolean m16615y;
            VideoTrackingEvent[] valuesCustom = VideoTrackingEvent.valuesCustom();
            int length = valuesCustom.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    videoTrackingEvent = valuesCustom[i];
                    m16615y = StringsJVM.m16615y(videoTrackingEvent.getValue(), str, true);
                    if (m16615y) {
                        break;
                    }
                    i++;
                } else {
                    videoTrackingEvent = null;
                    break;
                }
            }
            if (videoTrackingEvent == null) {
                return VideoTrackingEvent.UNKNOWN;
            }
            return videoTrackingEvent;
        }

        public Companion() {
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoTrackingEvent.valuesCustom().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[4] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    VideoTrackingEvent(String str) {
        this.f74384a = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static VideoTrackingEvent[] valuesCustom() {
        VideoTrackingEvent[] valuesCustom = values();
        return (VideoTrackingEvent[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getValue() {
        return this.f74384a;
    }

    public final float toFloat() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return 0.0f;
                    }
                    return 1.0f;
                }
                return 0.75f;
            }
            return 0.5f;
        }
        return 0.25f;
    }
}
