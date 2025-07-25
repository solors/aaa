package com.yandex.mobile.ads.feed;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class FeedAdAppearance {
    @Nullable

    /* renamed from: a */
    private final Integer f76604a;
    @Nullable

    /* renamed from: b */
    private final Double f76605b;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {

        /* renamed from: a */
        private final int f76606a;
        @Nullable

        /* renamed from: b */
        private Double f76607b;

        public Builder(int i) {
            this.f76606a = i;
        }

        @NotNull
        public final FeedAdAppearance build() {
            return new FeedAdAppearance(Integer.valueOf(this.f76606a), this.f76607b);
        }

        @NotNull
        public final Builder setCardCornerRadius(@Nullable Double d) {
            this.f76607b = d;
            return this;
        }
    }

    public FeedAdAppearance(@Nullable Integer num, @Nullable Double d) {
        this.f76604a = num;
        this.f76605b = d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(FeedAdAppearance.class, obj.getClass())) {
            return false;
        }
        FeedAdAppearance feedAdAppearance = (FeedAdAppearance) obj;
        if (!Intrinsics.m17075f(this.f76604a, feedAdAppearance.f76604a)) {
            return false;
        }
        return Intrinsics.m17078c(this.f76605b, feedAdAppearance.f76605b);
    }

    @Nullable
    public final Double getCardCornerRadius() {
        return this.f76605b;
    }

    @Nullable
    public final Integer getCardWidth() {
        return this.f76604a;
    }

    public int hashCode() {
        int i;
        Integer num = this.f76604a;
        int i2 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Double d = this.f76605b;
        if (d != null) {
            i2 = d.hashCode();
        }
        return i3 + i2;
    }
}
