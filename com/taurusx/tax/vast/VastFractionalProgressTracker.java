package com.taurusx.tax.vast;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.taurusx.tax.vast.VastTracker;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class VastFractionalProgressTracker extends VastTracker implements Comparable<VastFractionalProgressTracker> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final Pattern f74334f = Pattern.compile("((\\d{1,2})|(100))%");
    @SerializedName("tracking_fraction")
    @Expose

    /* renamed from: e */
    public final float f74335e;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        public final String f74336a;

        /* renamed from: b */
        public final float f74337b;
        @NotNull

        /* renamed from: c */
        public VastTracker.MessageType f74338c;

        /* renamed from: d */
        public boolean f74339d;

        public Builder(@NotNull String content, float f) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f74336a = content;
            this.f74337b = f;
            this.f74338c = VastTracker.MessageType.TRACKING_URL;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                str = builder.f74336a;
            }
            if ((i & 2) != 0) {
                f = builder.f74337b;
            }
            return builder.copy(str, f);
        }

        @NotNull
        public final VastFractionalProgressTracker build() {
            return new VastFractionalProgressTracker(this.f74337b, this.f74336a, this.f74338c, this.f74339d);
        }

        @NotNull
        public final Builder copy(@NotNull String content, float f) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Builder(content, f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (Intrinsics.m17075f(this.f74336a, builder.f74336a) && Intrinsics.m17075f(Float.valueOf(this.f74337b), Float.valueOf(builder.f74337b))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f74336a.hashCode() * 31) + Float.hashCode(this.f74337b);
        }

        @NotNull
        public final Builder isRepeatable(boolean z) {
            this.f74339d = z;
            return this;
        }

        @NotNull
        public final Builder messageType(@NotNull VastTracker.MessageType messageType) {
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            this.f74338c = messageType;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(content=" + this.f74336a + ", trackingFraction=" + this.f74337b + ')';
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPercentageTracker(@Nullable String str) {
            boolean z;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z || !VastFractionalProgressTracker.f74334f.matcher(str).matches()) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
            r7 = kotlin.text.StringsJVM.m16628I(r7, "%", "", false, 4, null);
         */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Integer parsePercentageOffset(@org.jetbrains.annotations.Nullable java.lang.String r7, int r8) {
            /*
                r6 = this;
                if (r7 != 0) goto L3
                goto L11
            L3:
                java.lang.String r1 = "%"
                java.lang.String r2 = ""
                r3 = 0
                r4 = 4
                r5 = 0
                r0 = r7
                java.lang.String r7 = kotlin.text.C37686h.m16718I(r0, r1, r2, r3, r4, r5)
                if (r7 != 0) goto L13
            L11:
                r7 = 0
                goto L27
            L13:
                float r8 = (float) r8
                float r7 = java.lang.Float.parseFloat(r7)
                float r8 = r8 * r7
                r7 = 1120403456(0x42c80000, float:100.0)
                float r8 = r8 / r7
                double r7 = (double) r8
                double r7 = java.lang.Math.rint(r7)
                float r7 = (float) r7
                int r7 = (int) r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            L27:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.vast.VastFractionalProgressTracker.Companion.parsePercentageOffset(java.lang.String, int):java.lang.Integer");
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VastFractionalProgressTracker(float f, @NotNull String content, @NotNull VastTracker.MessageType messageType, boolean z) {
        super(content, messageType, z);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        this.f74335e = f;
    }

    public final float getTrackingFraction() {
        return this.f74335e;
    }

    @Override // com.taurusx.tax.vast.VastTracker
    @NotNull
    public String toString() {
        return this.f74335e + ": " + getContent();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull VastFractionalProgressTracker other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Float.compare(this.f74335e, other.f74335e);
    }
}
