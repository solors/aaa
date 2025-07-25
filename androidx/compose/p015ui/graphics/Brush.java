package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Brush.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.Brush */
/* loaded from: classes.dex */
public abstract class Brush {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    /* compiled from: Brush.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.Brush$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: horizontalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m107476horizontalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m107851getClamp3opZhB0();
            }
            return companion.m107486horizontalGradient8A3gB4(list, f, f2, i);
        }

        /* renamed from: linearGradient-mHitzGk$default  reason: not valid java name */
        public static /* synthetic */ Brush m107479linearGradientmHitzGk$default(Companion companion, Tuples[] tuplesArr, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m107307getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.Companion.m107305getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m107851getClamp3opZhB0();
            }
            return companion.m107489linearGradientmHitzGk(tuplesArr, j3, j4, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default  reason: not valid java name */
        public static /* synthetic */ Brush m107481radialGradientP_VxKs$default(Companion companion, Tuples[] tuplesArr, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m107306getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m107851getClamp3opZhB0();
            }
            return companion.m107491radialGradientP_VxKs(tuplesArr, j2, f2, i);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default  reason: not valid java name */
        public static /* synthetic */ Brush m107483sweepGradientUv8p0NA$default(Companion companion, Tuples[] tuplesArr, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m107306getUnspecifiedF1C5BW0();
            }
            return companion.m107493sweepGradientUv8p0NA(tuplesArr, j);
        }

        /* renamed from: verticalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m107484verticalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m107851getClamp3opZhB0();
            }
            return companion.m107494verticalGradient8A3gB4(list, f, f2, i);
        }

        @Stable
        @NotNull
        /* renamed from: horizontalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m107486horizontalGradient8A3gB4(@NotNull List<Color> colors, float f, float f2, int i) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return m107488linearGradientmHitzGk(colors, OffsetKt.Offset(f, 0.0f), OffsetKt.Offset(f2, 0.0f), i);
        }

        @Stable
        @NotNull
        /* renamed from: linearGradient-mHitzGk  reason: not valid java name */
        public final Brush m107489linearGradientmHitzGk(@NotNull Tuples<Float, Color>[] colorStops, long j, long j2, int i) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Tuples<Float, Color> tuples : colorStops) {
                arrayList.add(Color.m107517boximpl(tuples.m17629d().m107537unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Tuples<Float, Color> tuples2 : colorStops) {
                arrayList2.add(Float.valueOf(tuples2.m17630c().floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, j, j2, i, null);
        }

        @Stable
        @NotNull
        /* renamed from: radialGradient-P_Vx-Ks  reason: not valid java name */
        public final Brush m107491radialGradientP_VxKs(@NotNull Tuples<Float, Color>[] colorStops, long j, float f, int i) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Tuples<Float, Color> tuples : colorStops) {
                arrayList.add(Color.m107517boximpl(tuples.m17629d().m107537unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Tuples<Float, Color> tuples2 : colorStops) {
                arrayList2.add(Float.valueOf(tuples2.m17630c().floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, j, f, i, null);
        }

        @Stable
        @NotNull
        /* renamed from: sweepGradient-Uv8p0NA  reason: not valid java name */
        public final Brush m107493sweepGradientUv8p0NA(@NotNull Tuples<Float, Color>[] colorStops, long j) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Tuples<Float, Color> tuples : colorStops) {
                arrayList.add(Color.m107517boximpl(tuples.m17629d().m107537unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Tuples<Float, Color> tuples2 : colorStops) {
                arrayList2.add(Float.valueOf(tuples2.m17630c().floatValue()));
            }
            return new SweepGradient(j, arrayList, arrayList2, null);
        }

        @Stable
        @NotNull
        /* renamed from: verticalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m107494verticalGradient8A3gB4(@NotNull List<Color> colors, float f, float f2, int i) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return m107488linearGradientmHitzGk(colors, OffsetKt.Offset(0.0f, f), OffsetKt.Offset(0.0f, f2), i);
        }

        @Stable
        @NotNull
        /* renamed from: horizontalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m107487horizontalGradient8A3gB4(@NotNull Tuples<Float, Color>[] colorStops, float f, float f2, int i) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            return m107489linearGradientmHitzGk((Tuples[]) Arrays.copyOf(colorStops, colorStops.length), OffsetKt.Offset(f, 0.0f), OffsetKt.Offset(f2, 0.0f), i);
        }

        @Stable
        @NotNull
        /* renamed from: verticalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m107495verticalGradient8A3gB4(@NotNull Tuples<Float, Color>[] colorStops, float f, float f2, int i) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            return m107489linearGradientmHitzGk((Tuples[]) Arrays.copyOf(colorStops, colorStops.length), OffsetKt.Offset(0.0f, f), OffsetKt.Offset(0.0f, f2), i);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m107477horizontalGradient8A3gB4$default(Companion companion, Tuples[] tuplesArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m107851getClamp3opZhB0();
            }
            return companion.m107487horizontalGradient8A3gB4(tuplesArr, f, f2, i);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default  reason: not valid java name */
        public static /* synthetic */ Brush m107482sweepGradientUv8p0NA$default(Companion companion, List list, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m107306getUnspecifiedF1C5BW0();
            }
            return companion.m107492sweepGradientUv8p0NA(list, j);
        }

        /* renamed from: verticalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m107485verticalGradient8A3gB4$default(Companion companion, Tuples[] tuplesArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m107851getClamp3opZhB0();
            }
            return companion.m107495verticalGradient8A3gB4(tuplesArr, f, f2, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default  reason: not valid java name */
        public static /* synthetic */ Brush m107480radialGradientP_VxKs$default(Companion companion, List list, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m107306getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m107851getClamp3opZhB0();
            }
            return companion.m107490radialGradientP_VxKs(list, j2, f2, i);
        }

        @Stable
        @NotNull
        /* renamed from: linearGradient-mHitzGk  reason: not valid java name */
        public final Brush m107488linearGradientmHitzGk(@NotNull List<Color> colors, long j, long j2, int i) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new LinearGradient(colors, null, j, j2, i, null);
        }

        @Stable
        @NotNull
        /* renamed from: radialGradient-P_Vx-Ks  reason: not valid java name */
        public final Brush m107490radialGradientP_VxKs(@NotNull List<Color> colors, long j, float f, int i) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new RadialGradient(colors, null, j, f, i, null);
        }

        @Stable
        @NotNull
        /* renamed from: sweepGradient-Uv8p0NA  reason: not valid java name */
        public final Brush m107492sweepGradientUv8p0NA(@NotNull List<Color> colors, long j) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new SweepGradient(j, colors, null, null);
        }

        /* renamed from: linearGradient-mHitzGk$default  reason: not valid java name */
        public static /* synthetic */ Brush m107478linearGradientmHitzGk$default(Companion companion, List list, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m107307getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.Companion.m107305getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m107851getClamp3opZhB0();
            }
            return companion.m107488linearGradientmHitzGk(list, j3, j4, i);
        }
    }

    public /* synthetic */ Brush(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI  reason: not valid java name */
    public abstract void mo107474applyToPq9zytI(long j, @NotNull Paint paint, float f);

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long mo107475getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    private Brush() {
        this.intrinsicSize = Size.Companion.m107368getUnspecifiedNHjbRc();
    }
}
