package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes4.dex */
public final class PlaybackParameters implements Bundleable {

    /* renamed from: b */
    private final int f31868b;
    public final float pitch;
    public final float speed;
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f);

    /* renamed from: c */
    private static final String f31866c = Util.intToStringMaxRadix(0);

    /* renamed from: d */
    private static final String f31867d = Util.intToStringMaxRadix(1);
    public static final Bundleable.Creator<PlaybackParameters> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.n2
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return PlaybackParameters.m75575a(bundle);
        }
    };

    public PlaybackParameters(float f) {
        this(f, 1.0f);
    }

    /* renamed from: a */
    public static /* synthetic */ PlaybackParameters m75575a(Bundle bundle) {
        return m75574b(bundle);
    }

    /* renamed from: b */
    public static /* synthetic */ PlaybackParameters m75574b(Bundle bundle) {
        return new PlaybackParameters(bundle.getFloat(f31866c, 1.0f), bundle.getFloat(f31867d, 1.0f));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaybackParameters.class != obj.getClass()) {
            return false;
        }
        PlaybackParameters playbackParameters = (PlaybackParameters) obj;
        if (this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch) {
            return true;
        }
        return false;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j) {
        return j * this.f31868b;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.speed)) * 31) + Float.floatToRawIntBits(this.pitch);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f31866c, this.speed);
        bundle.putFloat(f31867d, this.pitch);
        return bundle;
    }

    public String toString() {
        return Util.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.speed), Float.valueOf(this.pitch));
    }

    @CheckResult
    public PlaybackParameters withSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        return new PlaybackParameters(f, this.pitch);
    }

    public PlaybackParameters(@FloatRange(from = 0.0d, fromInclusive = false) float f, @FloatRange(from = 0.0d, fromInclusive = false) float f2) {
        Assertions.checkArgument(f > 0.0f);
        Assertions.checkArgument(f2 > 0.0f);
        this.speed = f;
        this.pitch = f2;
        this.f31868b = Math.round(f * 1000.0f);
    }
}
