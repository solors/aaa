package androidx.compose.p015ui.graphics.drawscope;

import androidx.compose.p015ui.graphics.PathEffect;
import androidx.compose.p015ui.graphics.StrokeCap;
import androidx.compose.p015ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DrawScope.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.drawscope.Stroke */
/* loaded from: classes.dex */
public final class Stroke extends DrawStyle {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int DefaultCap = StrokeCap.Companion.m107831getButtKaPHkGw();
    private static final int DefaultJoin = StrokeJoin.Companion.m107842getMiterLxFBmk8();
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;
    @Nullable
    private final PathEffect pathEffect;
    private final float width;

    /* compiled from: DrawScope.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.drawscope.Stroke$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDefaultCap-KaPHkGw  reason: not valid java name */
        public final int m108086getDefaultCapKaPHkGw() {
            return Stroke.DefaultCap;
        }

        /* renamed from: getDefaultJoin-LxFBmk8  reason: not valid java name */
        public final int m108087getDefaultJoinLxFBmk8() {
            return Stroke.DefaultJoin;
        }
    }

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i, i2, pathEffect);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        if (this.width == stroke.width) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.miter == stroke.miter) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && StrokeCap.m107827equalsimpl0(this.cap, stroke.cap) && StrokeJoin.m107837equalsimpl0(this.join, stroke.join) && Intrinsics.m17075f(this.pathEffect, stroke.pathEffect)) {
            return true;
        }
        return false;
    }

    /* renamed from: getCap-KaPHkGw  reason: not valid java name */
    public final int m108084getCapKaPHkGw() {
        return this.cap;
    }

    /* renamed from: getJoin-LxFBmk8  reason: not valid java name */
    public final int m108085getJoinLxFBmk8() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    @Nullable
    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.miter)) * 31) + StrokeCap.m107828hashCodeimpl(this.cap)) * 31) + StrokeJoin.m107838hashCodeimpl(this.join)) * 31;
        PathEffect pathEffect = this.pathEffect;
        if (pathEffect != null) {
            i = pathEffect.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) StrokeCap.m107829toStringimpl(this.cap)) + ", join=" + ((Object) StrokeJoin.m107839toStringimpl(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0f : f, (i3 & 2) != 0 ? 4.0f : f2, (i3 & 4) != 0 ? StrokeCap.Companion.m107831getButtKaPHkGw() : i, (i3 & 8) != 0 ? StrokeJoin.Companion.m107842getMiterLxFBmk8() : i2, (i3 & 16) != 0 ? null : pathEffect, null);
    }

    private Stroke(float f, float f2, int i, int i2, PathEffect pathEffect) {
        super(null);
        this.width = f;
        this.miter = f2;
        this.cap = i;
        this.join = i2;
        this.pathEffect = pathEffect;
    }
}
