package com.taurusx.tax.vast;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.taurusx.tax.vast.VastTracker;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public class VastAbsoluteProgressTracker extends VastTracker implements Comparable<VastAbsoluteProgressTracker> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final Pattern f74291f = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");
    @SerializedName("tracking_ms")
    @Expose

    /* renamed from: e */
    public final int f74292e;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        public final String f74293a;

        /* renamed from: b */
        public final int f74294b;
        @NotNull

        /* renamed from: c */
        public VastTracker.MessageType f74295c;

        /* renamed from: d */
        public boolean f74296d;

        public Builder(@NotNull String content, int i) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f74293a = content;
            this.f74294b = i;
            this.f74295c = VastTracker.MessageType.TRACKING_URL;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = builder.f74293a;
            }
            if ((i2 & 2) != 0) {
                i = builder.f74294b;
            }
            return builder.copy(str, i);
        }

        @NotNull
        public final VastAbsoluteProgressTracker build() {
            return new VastAbsoluteProgressTracker(this.f74294b, this.f74293a, this.f74295c, this.f74296d);
        }

        @NotNull
        public final Builder copy(@NotNull String content, int i) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Builder(content, i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (Intrinsics.m17075f(this.f74293a, builder.f74293a) && this.f74294b == builder.f74294b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f74293a.hashCode() * 31) + Integer.hashCode(this.f74294b);
        }

        @NotNull
        public final Builder isRepeatable(boolean z) {
            this.f74296d = z;
            return this;
        }

        @NotNull
        public final Builder messageType(@NotNull VastTracker.MessageType messageType) {
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            this.f74295c = messageType;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(content=" + this.f74293a + ", trackingMilliseconds=" + this.f74294b + ')';
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isAbsoluteTracker(@Nullable String str) {
            boolean z;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z || !VastAbsoluteProgressTracker.f74291f.matcher(str).matches()) {
                return false;
            }
            return true;
        }

        @Nullable
        public final Integer parseAbsoluteOffset(@Nullable String str) {
            List m16611C0;
            boolean z;
            if (str != null) {
                m16611C0 = C37690r.m16611C0(str, new String[]{":"}, false, 0, 6, null);
            } else {
                m16611C0 = null;
            }
            if (m16611C0 == null) {
                return null;
            }
            if (m16611C0.size() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m16611C0 = null;
            }
            if (m16611C0 == null) {
                return null;
            }
            return Integer.valueOf((Integer.parseInt((String) m16611C0.get(0)) * 60 * 60 * 1000) + (Integer.parseInt((String) m16611C0.get(1)) * 60 * 1000) + ((int) (Float.parseFloat((String) m16611C0.get(2)) * 1000)));
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VastAbsoluteProgressTracker(int i, @NotNull String content, @NotNull VastTracker.MessageType messageType, boolean z) {
        super(content, messageType, z);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        this.f74292e = i;
    }

    public final int getTrackingMilliseconds() {
        return this.f74292e;
    }

    @Override // com.taurusx.tax.vast.VastTracker
    @NotNull
    public String toString() {
        return this.f74292e + "ms: " + getContent();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull VastAbsoluteProgressTracker other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.m17071j(this.f74292e, other.f74292e);
    }
}
