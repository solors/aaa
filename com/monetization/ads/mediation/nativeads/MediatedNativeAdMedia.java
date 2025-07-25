package com.monetization.ads.mediation.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class MediatedNativeAdMedia {

    /* renamed from: a */
    private final float f66541a;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {

        /* renamed from: a */
        private final float f66542a;

        public Builder(float f) {
            this.f66542a = f;
        }

        @NotNull
        public final MediatedNativeAdMedia build() {
            return new MediatedNativeAdMedia(this.f66542a, null);
        }

        public final float getAspectRatio() {
            return this.f66542a;
        }
    }

    public /* synthetic */ MediatedNativeAdMedia(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    public final float getAspectRatio() {
        return this.f66541a;
    }

    private MediatedNativeAdMedia(float f) {
        this.f66541a = f;
    }
}
