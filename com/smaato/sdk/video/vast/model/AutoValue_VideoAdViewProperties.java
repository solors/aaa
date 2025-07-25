package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.video.vast.model.VideoAdViewProperties;

/* renamed from: com.smaato.sdk.video.vast.model.a */
/* loaded from: classes7.dex */
final class AutoValue_VideoAdViewProperties extends VideoAdViewProperties {

    /* renamed from: a */
    private final long f72497a;

    /* renamed from: b */
    private final int f72498b;

    /* renamed from: c */
    private final boolean f72499c;

    /* renamed from: d */
    private final boolean f72500d;

    /* renamed from: e */
    private final boolean f72501e;

    /* compiled from: AutoValue_VideoAdViewProperties.java */
    /* renamed from: com.smaato.sdk.video.vast.model.a$b */
    /* loaded from: classes7.dex */
    static final class C27732b extends VideoAdViewProperties.Builder {

        /* renamed from: a */
        private Long f72502a;

        /* renamed from: b */
        private Integer f72503b;

        /* renamed from: c */
        private Boolean f72504c;

        /* renamed from: d */
        private Boolean f72505d;

        /* renamed from: e */
        private Boolean f72506e;

        @Override // com.smaato.sdk.video.vast.model.VideoAdViewProperties.Builder
        public VideoAdViewProperties build() {
            String str = "";
            if (this.f72502a == null) {
                str = " skipInterval";
            }
            if (this.f72503b == null) {
                str = str + " closeButtonSize";
            }
            if (this.f72504c == null) {
                str = str + " isSkippable";
            }
            if (this.f72505d == null) {
                str = str + " isClickable";
            }
            if (this.f72506e == null) {
                str = str + " isSoundOn";
            }
            if (str.isEmpty()) {
                return new AutoValue_VideoAdViewProperties(this.f72502a.longValue(), this.f72503b.intValue(), this.f72504c.booleanValue(), this.f72505d.booleanValue(), this.f72506e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.video.vast.model.VideoAdViewProperties.Builder
        public VideoAdViewProperties.Builder closeButtonSize(int i) {
            this.f72503b = Integer.valueOf(i);
            return this;
        }

        @Override // com.smaato.sdk.video.vast.model.VideoAdViewProperties.Builder
        public VideoAdViewProperties.Builder isClickable(boolean z) {
            this.f72505d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.smaato.sdk.video.vast.model.VideoAdViewProperties.Builder
        public VideoAdViewProperties.Builder isSkippable(boolean z) {
            this.f72504c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.smaato.sdk.video.vast.model.VideoAdViewProperties.Builder
        public VideoAdViewProperties.Builder isSoundOn(boolean z) {
            this.f72506e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.smaato.sdk.video.vast.model.VideoAdViewProperties.Builder
        public VideoAdViewProperties.Builder skipInterval(long j) {
            this.f72502a = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.smaato.sdk.video.vast.model.VideoAdViewProperties
    public int closeButtonSize() {
        return this.f72498b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoAdViewProperties)) {
            return false;
        }
        VideoAdViewProperties videoAdViewProperties = (VideoAdViewProperties) obj;
        if (this.f72497a == videoAdViewProperties.skipInterval() && this.f72498b == videoAdViewProperties.closeButtonSize() && this.f72499c == videoAdViewProperties.isSkippable() && this.f72500d == videoAdViewProperties.isClickable() && this.f72501e == videoAdViewProperties.isSoundOn()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        long j = this.f72497a;
        int i3 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f72498b) * 1000003;
        int i4 = 1231;
        if (this.f72499c) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i5 = (i3 ^ i) * 1000003;
        if (this.f72500d) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i6 = (i5 ^ i2) * 1000003;
        if (!this.f72501e) {
            i4 = 1237;
        }
        return i6 ^ i4;
    }

    @Override // com.smaato.sdk.video.vast.model.VideoAdViewProperties
    public boolean isClickable() {
        return this.f72500d;
    }

    @Override // com.smaato.sdk.video.vast.model.VideoAdViewProperties
    public boolean isSkippable() {
        return this.f72499c;
    }

    @Override // com.smaato.sdk.video.vast.model.VideoAdViewProperties
    public boolean isSoundOn() {
        return this.f72501e;
    }

    @Override // com.smaato.sdk.video.vast.model.VideoAdViewProperties
    public long skipInterval() {
        return this.f72497a;
    }

    public String toString() {
        return "VideoAdViewProperties{skipInterval=" + this.f72497a + ", closeButtonSize=" + this.f72498b + ", isSkippable=" + this.f72499c + ", isClickable=" + this.f72500d + ", isSoundOn=" + this.f72501e + "}";
    }

    private AutoValue_VideoAdViewProperties(long j, int i, boolean z, boolean z2, boolean z3) {
        this.f72497a = j;
        this.f72498b = i;
        this.f72499c = z;
        this.f72500d = z2;
        this.f72501e = z3;
    }
}
