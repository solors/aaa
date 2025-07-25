package com.amazon.aps.ads;

import com.amazon.device.ads.DtbConstants;

/* loaded from: classes2.dex */
public class ApsAdFormatProperties {
    private static final String LOGTAG = "ApsAdFormatProperties";
    private int playerHeight;
    private int playerWidth;

    /* loaded from: classes2.dex */
    public static class Builder {
        private int playerHeight;
        private int playerWidth;

        public ApsAdFormatProperties build() {
            return new ApsAdFormatProperties(this);
        }

        public Builder setPlayerHeight(int i) {
            this.playerHeight = i;
            return this;
        }

        public Builder setPlayerWidth(int i) {
            this.playerWidth = i;
            return this;
        }
    }

    public int getPlayerHeight() {
        int i = this.playerHeight;
        if (i == 0) {
            return DtbConstants.DEFAULT_PLAYER_HEIGHT;
        }
        return i;
    }

    public int getPlayerWidth() {
        int i = this.playerWidth;
        if (i == 0) {
            return 320;
        }
        return i;
    }

    private ApsAdFormatProperties(Builder builder) {
        this.playerHeight = builder.playerHeight;
        this.playerWidth = builder.playerWidth;
    }
}
