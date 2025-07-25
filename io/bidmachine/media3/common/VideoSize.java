package io.bidmachine.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Bundleable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;

/* loaded from: classes9.dex */
public final class VideoSize implements Bundleable {
    private static final int DEFAULT_HEIGHT = 0;
    private static final float DEFAULT_PIXEL_WIDTH_HEIGHT_RATIO = 1.0f;
    private static final int DEFAULT_UNAPPLIED_ROTATION_DEGREES = 0;
    private static final int DEFAULT_WIDTH = 0;
    @IntRange(from = 0)
    public final int height;
    @FloatRange(from = 0.0d, fromInclusive = false)
    public final float pixelWidthHeightRatio;
    @IntRange(from = 0, m105510to = 359)
    public final int unappliedRotationDegrees;
    @IntRange(from = 0)
    public final int width;
    public static final VideoSize UNKNOWN = new VideoSize(0, 0);
    private static final String FIELD_WIDTH = Util.intToStringMaxRadix(0);
    private static final String FIELD_HEIGHT = Util.intToStringMaxRadix(1);
    private static final String FIELD_UNAPPLIED_ROTATION_DEGREES = Util.intToStringMaxRadix(2);
    private static final String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = Util.intToStringMaxRadix(3);
    @UnstableApi
    public static final Bundleable.Creator<VideoSize> CREATOR = new Bundleable.Creator() { // from class: io.bidmachine.media3.common.y2
        @Override // io.bidmachine.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return VideoSize.m19956a(bundle);
        }
    };

    @UnstableApi
    public VideoSize(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        this(i, i2, 0, 1.0f);
    }

    /* renamed from: a */
    public static /* synthetic */ VideoSize m19956a(Bundle bundle) {
        return lambda$static$0(bundle);
    }

    public static /* synthetic */ VideoSize lambda$static$0(Bundle bundle) {
        return new VideoSize(bundle.getInt(FIELD_WIDTH, 0), bundle.getInt(FIELD_HEIGHT, 0), bundle.getInt(FIELD_UNAPPLIED_ROTATION_DEGREES, 0), bundle.getFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, 1.0f));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        if (this.width == videoSize.width && this.height == videoSize.height && this.unappliedRotationDegrees == videoSize.unappliedRotationDegrees && this.pixelWidthHeightRatio == videoSize.pixelWidthHeightRatio) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.width) * 31) + this.height) * 31) + this.unappliedRotationDegrees) * 31) + Float.floatToRawIntBits(this.pixelWidthHeightRatio);
    }

    @Override // io.bidmachine.media3.common.Bundleable
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_WIDTH, this.width);
        bundle.putInt(FIELD_HEIGHT, this.height);
        bundle.putInt(FIELD_UNAPPLIED_ROTATION_DEGREES, this.unappliedRotationDegrees);
        bundle.putFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, this.pixelWidthHeightRatio);
        return bundle;
    }

    @UnstableApi
    public VideoSize(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0, m105510to = 359) int i3, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this.width = i;
        this.height = i2;
        this.unappliedRotationDegrees = i3;
        this.pixelWidthHeightRatio = f;
    }
}
