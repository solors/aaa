package com.maticoo.sdk.p405ad.interact;

import android.graphics.Point;

/* renamed from: com.maticoo.sdk.ad.interact.InteractAdOptions */
/* loaded from: classes6.dex */
public class InteractAdOptions {
    private boolean enableFloating;
    private int height;
    private Point originPosition;
    private int width;

    /* renamed from: com.maticoo.sdk.ad.interact.InteractAdOptions$Builder */
    /* loaded from: classes6.dex */
    public static class Builder {
        private boolean enableFloating;
        private int height;
        private Point originPosition;
        private int width;

        public InteractAdOptions build() {
            InteractAdOptions interactAdOptions = new InteractAdOptions();
            interactAdOptions.enableFloating = this.enableFloating;
            interactAdOptions.originPosition = this.originPosition;
            interactAdOptions.width = this.width;
            interactAdOptions.height = this.height;
            if (this.width <= 0 || this.height <= 0) {
                interactAdOptions.enableFloating = false;
            }
            return interactAdOptions;
        }

        public Builder setEnableFloating(boolean z) {
            this.enableFloating = z;
            return this;
        }

        public Builder setHeight(int i) {
            this.height = i;
            return this;
        }

        public Builder setOriginPosition(Point point) {
            this.originPosition = point;
            return this;
        }

        public Builder setWidth(int i) {
            this.width = i;
            return this;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public Point getOriginPosition() {
        return this.originPosition;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isEnableFloating() {
        return this.enableFloating;
    }

    private InteractAdOptions() {
    }
}
