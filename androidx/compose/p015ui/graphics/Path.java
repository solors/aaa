package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.geometry.RoundRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Path.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.Path */
/* loaded from: classes.dex */
public interface Path {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: Path.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.Path$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        /* renamed from: combine-xh6zSI8 */
        public final Path m107760combinexh6zSI8(int i, @NotNull Path path1, @NotNull Path path2) {
            Intrinsics.checkNotNullParameter(path1, "path1");
            Intrinsics.checkNotNullParameter(path2, "path2");
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo107424opN5in7k0(path1, path2, i)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    /* compiled from: Path.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.Path$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void arcToRad(@NotNull Path path, @NotNull Rect rect, float f, float f2, boolean z) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            Path.super.arcToRad(rect, f, f2, z);
        }
    }

    /* renamed from: addPath-Uv8p0NA$default */
    static /* synthetic */ void m107759addPathUv8p0NA$default(Path path, Path path2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m107307getZeroF1C5BW0();
            }
            path.mo107422addPathUv8p0NA(path2, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
    }

    void addArc(@NotNull Rect rect, float f, float f2);

    void addArcRad(@NotNull Rect rect, float f, float f2);

    void addOval(@NotNull Rect rect);

    /* renamed from: addPath-Uv8p0NA */
    void mo107422addPathUv8p0NA(@NotNull Path path, long j);

    void addRect(@NotNull Rect rect);

    void addRoundRect(@NotNull RoundRect roundRect);

    void arcTo(@NotNull Rect rect, float f, float f2, boolean z);

    default void arcToRad(@NotNull Rect rect, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        arcTo(rect, Degrees.degrees(f), Degrees.degrees(f2), z);
    }

    void close();

    void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    @NotNull
    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo107423getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float f, float f2);

    void moveTo(float f, float f2);

    /* renamed from: op-N5in7k0 */
    boolean mo107424opN5in7k0(@NotNull Path path, @NotNull Path path2, int i);

    void quadraticBezierTo(float f, float f2, float f3, float f4);

    void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    void relativeLineTo(float f, float f2);

    void relativeMoveTo(float f, float f2);

    void relativeQuadraticBezierTo(float f, float f2, float f3, float f4);

    void reset();

    /* renamed from: setFillType-oQ8Xj4U */
    void mo107425setFillTypeoQ8Xj4U(int i);

    /* renamed from: translate-k-4lQ0M */
    void mo107426translatek4lQ0M(long j);
}
