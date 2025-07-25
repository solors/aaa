package com.mobilefuse.sdk.nativeads;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: NativeAdMarkup.kt */
@Metadata
/* loaded from: classes7.dex */
public enum NativeEventTrackerType {
    IMPRESSION(1),
    VIEWABLE_MRC_50(2),
    VIEWABLE_MRC_100(3),
    VIEWABLE_VIDEO_50(4),
    UNKNOWN(500);
    
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* compiled from: NativeAdMarkup.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NativeEventTrackerType fromInt(int i) {
            NativeEventTrackerType[] values;
            boolean z;
            try {
                for (NativeEventTrackerType nativeEventTrackerType : NativeEventTrackerType.values()) {
                    if (nativeEventTrackerType.getValue() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return nativeEventTrackerType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                return NativeEventTrackerType.UNKNOWN;
            }
        }
    }

    NativeEventTrackerType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
