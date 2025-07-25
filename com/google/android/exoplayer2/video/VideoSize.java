package com.google.android.exoplayer2.video;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class VideoSize implements Bundleable {
    @IntRange(from = 0)
    public final int height;
    @FloatRange(from = 0.0d, fromInclusive = false)
    public final float pixelWidthHeightRatio;
    @IntRange(from = 0, m105510to = 359)
    public final int unappliedRotationDegrees;
    @IntRange(from = 0)
    public final int width;
    public static final VideoSize UNKNOWN = new VideoSize(0, 0);

    /* renamed from: b */
    private static final String f36358b = Util.intToStringMaxRadix(0);

    /* renamed from: c */
    private static final String f36359c = Util.intToStringMaxRadix(1);

    /* renamed from: d */
    private static final String f36360d = Util.intToStringMaxRadix(2);

    /* renamed from: f */
    private static final String f36361f = Util.intToStringMaxRadix(3);
    public static final Bundleable.Creator<VideoSize> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.video.m
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return VideoSize.m72369a(bundle);
        }
    };

    public VideoSize(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        this(i, i2, 0, 1.0f);
    }

    /* renamed from: a */
    public static /* synthetic */ VideoSize m72369a(Bundle bundle) {
        return m72368b(bundle);
    }

    /* renamed from: b */
    public static /* synthetic */ VideoSize m72368b(Bundle bundle) {
        return new VideoSize(bundle.getInt(f36358b, 0), bundle.getInt(f36359c, 0), bundle.getInt(f36360d, 0), bundle.getFloat(f36361f, 1.0f));
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

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f36358b, this.width);
        bundle.putInt(f36359c, this.height);
        bundle.putInt(f36360d, this.unappliedRotationDegrees);
        bundle.putFloat(f36361f, this.pixelWidthHeightRatio);
        return bundle;
    }

    public VideoSize(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0, m105510to = 359) int i3, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this.width = i;
        this.height = i2;
        this.unappliedRotationDegrees = i3;
        this.pixelWidthHeightRatio = f;
    }
}
