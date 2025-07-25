package com.taurusx.tax.vast;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.taurusx.tax.vast.VastTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public class VideoViewabilityTracker extends VastTracker {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @SerializedName("playtime_ms")
    @Expose

    /* renamed from: e */
    public final int f74385e;
    @SerializedName("percent_viewable")
    @Expose

    /* renamed from: f */
    public final int f74386f;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        public final String f74387a;

        /* renamed from: b */
        public final int f74388b;

        /* renamed from: c */
        public final int f74389c;
        @NotNull

        /* renamed from: d */
        public VastTracker.MessageType f74390d;

        /* renamed from: e */
        public boolean f74391e;

        public Builder(@NotNull String content, int i, int i2) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f74387a = content;
            this.f74388b = i;
            this.f74389c = i2;
            this.f74390d = VastTracker.MessageType.TRACKING_URL;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = builder.f74387a;
            }
            if ((i3 & 2) != 0) {
                i = builder.f74388b;
            }
            if ((i3 & 4) != 0) {
                i2 = builder.f74389c;
            }
            return builder.copy(str, i, i2);
        }

        @NotNull
        public final VideoViewabilityTracker build() {
            return new VideoViewabilityTracker(this.f74388b, this.f74389c, this.f74387a, this.f74390d, this.f74391e);
        }

        public final int component2() {
            return this.f74388b;
        }

        public final int component3() {
            return this.f74389c;
        }

        @NotNull
        public final Builder copy(@NotNull String content, int i, int i2) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Builder(content, i, i2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (Intrinsics.m17075f(this.f74387a, builder.f74387a) && this.f74388b == builder.f74388b && this.f74389c == builder.f74389c) {
                return true;
            }
            return false;
        }

        public final int getPercentViewable() {
            return this.f74389c;
        }

        public final int getViewablePlaytimeMS() {
            return this.f74388b;
        }

        public int hashCode() {
            return (((this.f74387a.hashCode() * 31) + Integer.hashCode(this.f74388b)) * 31) + Integer.hashCode(this.f74389c);
        }

        @NotNull
        public final Builder isRepeatable(boolean z) {
            this.f74391e = z;
            return this;
        }

        @NotNull
        public final Builder messageType(@NotNull VastTracker.MessageType messageType) {
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            this.f74390d = messageType;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(content=" + this.f74387a + ", viewablePlaytimeMS=" + this.f74388b + ", percentViewable=" + this.f74389c + ')';
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewabilityTracker(int i, int i2, @NotNull String content, @NotNull VastTracker.MessageType messageType, boolean z) {
        super(content, messageType, z);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        this.f74385e = i;
        this.f74386f = i2;
    }

    public final int getPercentViewable() {
        return this.f74386f;
    }

    public final int getViewablePlaytimeMS() {
        return this.f74385e;
    }
}
