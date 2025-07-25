package com.smaato.sdk.video.vast.tracking.macro;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class PlayerState {
    @Nullable
    public final Float clickPositionX;
    @Nullable
    public final Float clickPositionY;
    @Nullable
    public final Integer errorCode;
    @Nullable
    public final Boolean isMuted;
    @Nullable
    public final Long offsetMillis;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private Float clickPositionX;
        @Nullable
        private Float clickPositionY;
        @Nullable
        private Integer code;
        @Nullable
        private Boolean isMuted;
        @Nullable
        private Long offsetMillis;

        @NonNull
        public PlayerState build() {
            return new PlayerState(this.clickPositionX, this.clickPositionY, this.isMuted, this.offsetMillis, this.code);
        }

        @NonNull
        public Builder setClickPositionX(float f) {
            this.clickPositionX = Float.valueOf(f);
            return this;
        }

        @NonNull
        public Builder setClickPositionY(float f) {
            this.clickPositionY = Float.valueOf(f);
            return this;
        }

        @NonNull
        public Builder setErrorCode(int i) {
            this.code = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder setMuted(boolean z) {
            this.isMuted = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder setOffsetMillis(long j) {
            this.offsetMillis = Long.valueOf(j);
            return this;
        }
    }

    private PlayerState(@Nullable Float f, @Nullable Float f2, @Nullable Boolean bool, @Nullable Long l, @Nullable Integer num) {
        this.clickPositionX = f;
        this.clickPositionY = f2;
        this.isMuted = bool;
        this.offsetMillis = l;
        this.errorCode = num;
    }
}
