package io.bidmachine.rendering.model;

import io.bidmachine.rendering.utils.RelativePercent;

/* loaded from: classes9.dex */
public class VisibilityParams {

    /* renamed from: a */
    private final float f97929a;

    /* renamed from: b */
    private final boolean f97930b;

    /* renamed from: c */
    private final boolean f97931c;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private float f97932a = 0.5f;

        /* renamed from: b */
        private boolean f97933b = false;

        /* renamed from: c */
        private boolean f97934c = false;

        public VisibilityParams build() {
            return new VisibilityParams(this.f97932a, this.f97933b, this.f97934c);
        }

        public Builder setIgnoreOverlap(boolean z) {
            this.f97934c = z;
            return this;
        }

        public Builder setIgnoreWindowFocus(boolean z) {
            this.f97933b = z;
            return this;
        }

        public Builder setVisibilityPercent(@RelativePercent float f) {
            this.f97932a = f;
            return this;
        }
    }

    public VisibilityParams(@RelativePercent float f, boolean z, boolean z2) {
        this.f97929a = f;
        this.f97930b = z;
        this.f97931c = z2;
    }

    @RelativePercent
    public float getVisibilityPercent() {
        return this.f97929a;
    }

    public boolean isIgnoreOverlap() {
        return this.f97931c;
    }

    public boolean isIgnoreWindowFocus() {
        return this.f97930b;
    }
}
