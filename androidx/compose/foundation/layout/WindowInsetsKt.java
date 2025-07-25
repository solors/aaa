package androidx.compose.foundation.layout;

import androidx.compose.p015ui.platform.CompositionLocals;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInsets.kt */
@Metadata
/* loaded from: classes.dex */
public final class WindowInsetsKt {
    @NotNull
    public static final WindowInsets WindowInsets(int i, int i2, int i3, int i4) {
        return new FixedIntInsets(i, i2, i3, i4);
    }

    public static /* synthetic */ WindowInsets WindowInsets$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return WindowInsets(i, i2, i3, i4);
    }

    @NotNull
    /* renamed from: WindowInsets-a9UjIt4  reason: not valid java name */
    public static final WindowInsets m106375WindowInsetsa9UjIt4(float f, float f2, float f3, float f4) {
        return new FixedDpInsets(f, f2, f3, f4, null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ WindowInsets m106376WindowInsetsa9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1059Dp.m109734constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C1059Dp.m109734constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = C1059Dp.m109734constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = C1059Dp.m109734constructorimpl(0);
        }
        return m106375WindowInsetsa9UjIt4(f, f2, f3, f4);
    }

    @NotNull
    public static final WindowInsets add(@NotNull WindowInsets windowInsets, @NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return new AddedInsets(windowInsets, insets);
    }

    @NotNull
    public static final WindowInsets asInsets(@NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        return new PaddingValuesInsets(paddingValues);
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final PaddingValues asPaddingValues(@NotNull WindowInsets windowInsets, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        return new InsetsPaddingValues(windowInsets, (Density) composer.consume(CompositionLocals.getLocalDensity()));
    }

    @NotNull
    public static final WindowInsets exclude(@NotNull WindowInsets windowInsets, @NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return new ExcludeInsets(windowInsets, insets);
    }

    @NotNull
    /* renamed from: only-bOOhFvg  reason: not valid java name */
    public static final WindowInsets m106377onlybOOhFvg(@NotNull WindowInsets only, int i) {
        Intrinsics.checkNotNullParameter(only, "$this$only");
        return new LimitInsets(only, i, null);
    }

    @NotNull
    public static final WindowInsets union(@NotNull WindowInsets windowInsets, @NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return new UnionInsets(windowInsets, insets);
    }

    @NotNull
    public static final PaddingValues asPaddingValues(@NotNull WindowInsets windowInsets, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        return new InsetsPaddingValues(windowInsets, density);
    }
}
