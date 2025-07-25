package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Shadow.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.Shadow */
/* loaded from: classes.dex */
public final class Shadow {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    public /* synthetic */ Shadow(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }

    /* renamed from: copy-qcb84PM$default  reason: not valid java name */
    public static /* synthetic */ Shadow m107807copyqcb84PM$default(Shadow shadow, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = shadow.color;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = shadow.offset;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = shadow.blurRadius;
        }
        return shadow.m107810copyqcb84PM(j3, j4, f);
    }

    @NotNull
    /* renamed from: copy-qcb84PM  reason: not valid java name */
    public final Shadow m107810copyqcb84PM(long j, long j2, float f) {
        return new Shadow(j, j2, f, null);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        if (!Color.m107528equalsimpl0(this.color, shadow.color) || !Offset.m107288equalsimpl0(this.offset, shadow.offset)) {
            return false;
        }
        if (this.blurRadius == shadow.blurRadius) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m107811getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-F1C5BW0  reason: not valid java name */
    public final long m107812getOffsetF1C5BW0() {
        return this.offset;
    }

    public int hashCode() {
        return (((Color.m107534hashCodeimpl(this.color) * 31) + Offset.m107293hashCodeimpl(this.offset)) * 31) + Float.hashCode(this.blurRadius);
    }

    @NotNull
    public String toString() {
        return "Shadow(color=" + ((Object) Color.m107535toStringimpl(this.color)) + ", offset=" + ((Object) Offset.m107299toStringimpl(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    private Shadow(long j, long j2, float f) {
        this.color = j;
        this.offset = j2;
        this.blurRadius = f;
    }

    public /* synthetic */ Shadow(long j, long j2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ColorKt.Color(4278190080L) : j, (i & 2) != 0 ? Offset.Companion.m107307getZeroF1C5BW0() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }

    /* compiled from: Shadow.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.Shadow$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Shadow getNone() {
            return Shadow.None;
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    @Stable
    /* renamed from: getColor-0d7_KjU$annotations  reason: not valid java name */
    public static /* synthetic */ void m107808getColor0d7_KjU$annotations() {
    }

    @Stable
    /* renamed from: getOffset-F1C5BW0$annotations  reason: not valid java name */
    public static /* synthetic */ void m107809getOffsetF1C5BW0$annotations() {
    }
}
