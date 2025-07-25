package com.smaato.sdk.nativead;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class NativeAdTracker {

    /* loaded from: classes7.dex */
    public enum Type {
        IMPRESSION("Impression"),
        VIEWABLE_MRC_50("Visible impression using MRC definition at 50% in view for 1 second"),
        VIEWABLE_MRC_100("100% in view for 1 second (ie GroupM standard)"),
        VIEWABLE_VIDEO_50("Visible impression for video using MRC definition at 50% in view for 2 seconds"),
        OPEN_MEASUREMENT("Tracker Url to report for open measurement native display");
        
        private final String spec;

        Type(String str) {
            this.spec = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return name() + "(" + this.spec + ")";
        }
    }

    @NonNull
    public static NativeAdTracker create(Type type, String str) {
        return new AutoValue_NativeAdTracker(type, str);
    }

    @NonNull
    public abstract Type type();

    @NonNull
    public abstract String url();
}
