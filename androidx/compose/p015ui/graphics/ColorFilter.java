package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFilter.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.ColorFilter */
/* loaded from: classes.dex */
public final class ColorFilter {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final android.graphics.ColorFilter nativeColorFilter;

    /* compiled from: ColorFilter.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.ColorFilter$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: tint-xETnrds$default  reason: not valid java name */
        public static /* synthetic */ ColorFilter m107568tintxETnrds$default(Companion companion, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = BlendMode.Companion.m107469getSrcIn0nO6VwU();
            }
            return companion.m107571tintxETnrds(j, i);
        }

        @Stable
        @NotNull
        /* renamed from: colorMatrix-jHG-Opc  reason: not valid java name */
        public final ColorFilter m107569colorMatrixjHGOpc(@NotNull float[] colorMatrix) {
            Intrinsics.checkNotNullParameter(colorMatrix, "colorMatrix");
            return AndroidColorFilter_androidKt.m107396actualColorMatrixColorFilterjHGOpc(colorMatrix);
        }

        @Stable
        @NotNull
        /* renamed from: lighting--OWjLjI  reason: not valid java name */
        public final ColorFilter m107570lightingOWjLjI(long j, long j2) {
            return AndroidColorFilter_androidKt.m107397actualLightingColorFilterOWjLjI(j, j2);
        }

        @Stable
        @NotNull
        /* renamed from: tint-xETnrds  reason: not valid java name */
        public final ColorFilter m107571tintxETnrds(long j, int i) {
            return AndroidColorFilter_androidKt.m107398actualTintColorFilterxETnrds(j, i);
        }
    }

    public ColorFilter(@NotNull android.graphics.ColorFilter nativeColorFilter) {
        Intrinsics.checkNotNullParameter(nativeColorFilter, "nativeColorFilter");
        this.nativeColorFilter = nativeColorFilter;
    }

    @NotNull
    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.nativeColorFilter;
    }
}
