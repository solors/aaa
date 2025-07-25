package androidx.compose.material;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Colors.kt */
@Metadata
/* loaded from: classes.dex */
public final class ColorsKt {
    @NotNull
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(ColorsKt$LocalColors$1.INSTANCE);

    /* renamed from: contentColorFor-4WTKRHQ  reason: not valid java name */
    public static final long m106892contentColorFor4WTKRHQ(@NotNull Colors contentColorFor, long j) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        if (Color.m107528equalsimpl0(j, contentColorFor.m106875getPrimary0d7_KjU())) {
            return contentColorFor.m106872getOnPrimary0d7_KjU();
        }
        if (Color.m107528equalsimpl0(j, contentColorFor.m106876getPrimaryVariant0d7_KjU())) {
            return contentColorFor.m106872getOnPrimary0d7_KjU();
        }
        if (Color.m107528equalsimpl0(j, contentColorFor.m106877getSecondary0d7_KjU())) {
            return contentColorFor.m106873getOnSecondary0d7_KjU();
        }
        if (Color.m107528equalsimpl0(j, contentColorFor.m106878getSecondaryVariant0d7_KjU())) {
            return contentColorFor.m106873getOnSecondary0d7_KjU();
        }
        if (Color.m107528equalsimpl0(j, contentColorFor.m106868getBackground0d7_KjU())) {
            return contentColorFor.m106870getOnBackground0d7_KjU();
        }
        if (Color.m107528equalsimpl0(j, contentColorFor.m106879getSurface0d7_KjU())) {
            return contentColorFor.m106874getOnSurface0d7_KjU();
        }
        if (Color.m107528equalsimpl0(j, contentColorFor.m106869getError0d7_KjU())) {
            return contentColorFor.m106871getOnError0d7_KjU();
        }
        return Color.Companion.m107563getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U  reason: not valid java name */
    public static final long m106893contentColorForek8zF_U(long j, @Nullable Composer composer, int i) {
        boolean z;
        long m106892contentColorFor4WTKRHQ = m106892contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j);
        if (m106892contentColorFor4WTKRHQ != Color.Companion.m107563getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return ((Color) composer.consume(ContentColor.getLocalContentColor())).m107537unboximpl();
        }
        return m106892contentColorFor4WTKRHQ;
    }

    @NotNull
    /* renamed from: darkColors-2qZNXz8  reason: not valid java name */
    public static final Colors m106894darkColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, null);
    }

    /* renamed from: darkColors-2qZNXz8$default  reason: not valid java name */
    public static /* synthetic */ Colors m106895darkColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        if ((i & 1) != 0) {
            j13 = ColorKt.Color(4290479868L);
        } else {
            j13 = j;
        }
        if ((i & 2) != 0) {
            j14 = ColorKt.Color(4281794739L);
        } else {
            j14 = j2;
        }
        if ((i & 4) != 0) {
            j15 = ColorKt.Color(4278442694L);
        } else {
            j15 = j3;
        }
        if ((i & 8) != 0) {
            j16 = j15;
        } else {
            j16 = j4;
        }
        if ((i & 16) != 0) {
            j17 = ColorKt.Color(4279374354L);
        } else {
            j17 = j5;
        }
        if ((i & 32) != 0) {
            j18 = ColorKt.Color(4279374354L);
        } else {
            j18 = j6;
        }
        if ((i & 64) != 0) {
            j19 = ColorKt.Color(4291782265L);
        } else {
            j19 = j7;
        }
        if ((i & 128) != 0) {
            j20 = Color.Companion.m107553getBlack0d7_KjU();
        } else {
            j20 = j8;
        }
        if ((i & 256) != 0) {
            j21 = Color.Companion.m107553getBlack0d7_KjU();
        } else {
            j21 = j9;
        }
        if ((i & 512) != 0) {
            j22 = Color.Companion.m107564getWhite0d7_KjU();
        } else {
            j22 = j10;
        }
        if ((i & 1024) != 0) {
            j23 = Color.Companion.m107564getWhite0d7_KjU();
        } else {
            j23 = j11;
        }
        if ((i & 2048) != 0) {
            j24 = Color.Companion.m107553getBlack0d7_KjU();
        } else {
            j24 = j12;
        }
        return m106894darkColors2qZNXz8(j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24);
    }

    @NotNull
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(@NotNull Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        if (colors.isLight()) {
            return colors.m106875getPrimary0d7_KjU();
        }
        return colors.m106879getSurface0d7_KjU();
    }

    @NotNull
    /* renamed from: lightColors-2qZNXz8  reason: not valid java name */
    public static final Colors m106896lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    /* renamed from: lightColors-2qZNXz8$default  reason: not valid java name */
    public static /* synthetic */ Colors m106897lightColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        if ((i & 1) != 0) {
            j13 = ColorKt.Color(4284612846L);
        } else {
            j13 = j;
        }
        if ((i & 2) != 0) {
            j14 = ColorKt.Color(4281794739L);
        } else {
            j14 = j2;
        }
        if ((i & 4) != 0) {
            j15 = ColorKt.Color(4278442694L);
        } else {
            j15 = j3;
        }
        if ((i & 8) != 0) {
            j16 = ColorKt.Color(4278290310L);
        } else {
            j16 = j4;
        }
        if ((i & 16) != 0) {
            j17 = Color.Companion.m107564getWhite0d7_KjU();
        } else {
            j17 = j5;
        }
        if ((i & 32) != 0) {
            j18 = Color.Companion.m107564getWhite0d7_KjU();
        } else {
            j18 = j6;
        }
        if ((i & 64) != 0) {
            j19 = ColorKt.Color(4289724448L);
        } else {
            j19 = j7;
        }
        if ((i & 128) != 0) {
            j20 = Color.Companion.m107564getWhite0d7_KjU();
        } else {
            j20 = j8;
        }
        long j25 = j20;
        if ((i & 256) != 0) {
            j21 = Color.Companion.m107553getBlack0d7_KjU();
        } else {
            j21 = j9;
        }
        long j26 = j21;
        if ((i & 512) != 0) {
            j22 = Color.Companion.m107553getBlack0d7_KjU();
        } else {
            j22 = j10;
        }
        long j27 = j22;
        if ((i & 1024) != 0) {
            j23 = Color.Companion.m107553getBlack0d7_KjU();
        } else {
            j23 = j11;
        }
        if ((i & 2048) != 0) {
            j24 = Color.Companion.m107564getWhite0d7_KjU();
        } else {
            j24 = j12;
        }
        return m106896lightColors2qZNXz8(j13, j14, j15, j16, j17, j18, j19, j25, j26, j27, j23, j24);
    }

    public static final void updateColorsFrom(@NotNull Colors colors, @NotNull Colors other) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colors.m106887setPrimary8_81llA$material_release(other.m106875getPrimary0d7_KjU());
        colors.m106888setPrimaryVariant8_81llA$material_release(other.m106876getPrimaryVariant0d7_KjU());
        colors.m106889setSecondary8_81llA$material_release(other.m106877getSecondary0d7_KjU());
        colors.m106890setSecondaryVariant8_81llA$material_release(other.m106878getSecondaryVariant0d7_KjU());
        colors.m106880setBackground8_81llA$material_release(other.m106868getBackground0d7_KjU());
        colors.m106891setSurface8_81llA$material_release(other.m106879getSurface0d7_KjU());
        colors.m106881setError8_81llA$material_release(other.m106869getError0d7_KjU());
        colors.m106884setOnPrimary8_81llA$material_release(other.m106872getOnPrimary0d7_KjU());
        colors.m106885setOnSecondary8_81llA$material_release(other.m106873getOnSecondary0d7_KjU());
        colors.m106882setOnBackground8_81llA$material_release(other.m106870getOnBackground0d7_KjU());
        colors.m106886setOnSurface8_81llA$material_release(other.m106874getOnSurface0d7_KjU());
        colors.m106883setOnError8_81llA$material_release(other.m106871getOnError0d7_KjU());
        colors.setLight$material_release(other.isLight());
    }
}
