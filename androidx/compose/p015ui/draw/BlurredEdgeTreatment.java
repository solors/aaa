package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.graphics.RectangleShape;
import androidx.compose.p015ui.graphics.Shape;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Blur.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.draw.BlurredEdgeTreatment */
/* loaded from: classes.dex */
public final class BlurredEdgeTreatment {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Shape Rectangle = m107205constructorimpl(RectangleShape.getRectangleShape());
    @NotNull
    private static final Shape Unbounded = m107205constructorimpl(null);
    @Nullable
    private final Shape shape;

    /* compiled from: Blur.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.draw.BlurredEdgeTreatment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: getRectangle---Goahg  reason: not valid java name */
        public final Shape m107211getRectangleGoahg() {
            return BlurredEdgeTreatment.Rectangle;
        }

        @NotNull
        /* renamed from: getUnbounded---Goahg  reason: not valid java name */
        public final Shape m107212getUnboundedGoahg() {
            return BlurredEdgeTreatment.Unbounded;
        }
    }

    private /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m107204boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107206equalsimpl(Shape shape, Object obj) {
        if (!(obj instanceof BlurredEdgeTreatment) || !Intrinsics.m17075f(shape, ((BlurredEdgeTreatment) obj).m107210unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107207equalsimpl0(Shape shape, Shape shape2) {
        return Intrinsics.m17075f(shape, shape2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107208hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107209toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    public boolean equals(Object obj) {
        return m107206equalsimpl(this.shape, obj);
    }

    @Nullable
    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return m107208hashCodeimpl(this.shape);
    }

    public String toString() {
        return m107209toStringimpl(this.shape);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Shape m107210unboximpl() {
        return this.shape;
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static Shape m107205constructorimpl(@Nullable Shape shape) {
        return shape;
    }
}
