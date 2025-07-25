package io.bidmachine.media3.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public class FrameInfo {
    public final int height;
    public final long offsetToAddUs;
    public final float pixelWidthHeightRatio;
    public final int width;

    private FrameInfo(int i, int i2, float f, long j) {
        boolean z = i > 0;
        Assertions.checkArgument(z, "width must be positive, but is: " + i);
        boolean z2 = i2 > 0;
        Assertions.checkArgument(z2, "height must be positive, but is: " + i2);
        this.width = i;
        this.height = i2;
        this.pixelWidthHeightRatio = f;
        this.offsetToAddUs = j;
    }

    /* loaded from: classes9.dex */
    public static final class Builder {
        private int height;
        private long offsetToAddUs;
        private float pixelWidthHeightRatio;
        private int width;

        public Builder(int i, int i2) {
            this.width = i;
            this.height = i2;
            this.pixelWidthHeightRatio = 1.0f;
        }

        public FrameInfo build() {
            return new FrameInfo(this.width, this.height, this.pixelWidthHeightRatio, this.offsetToAddUs);
        }

        @CanIgnoreReturnValue
        public Builder setHeight(int i) {
            this.height = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setOffsetToAddUs(long j) {
            this.offsetToAddUs = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPixelWidthHeightRatio(float f) {
            this.pixelWidthHeightRatio = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setWidth(int i) {
            this.width = i;
            return this;
        }

        public Builder(FrameInfo frameInfo) {
            this.width = frameInfo.width;
            this.height = frameInfo.height;
            this.pixelWidthHeightRatio = frameInfo.pixelWidthHeightRatio;
            this.offsetToAddUs = frameInfo.offsetToAddUs;
        }
    }
}
