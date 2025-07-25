package androidx.compose.material.ripple;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RippleTheme.kt */
@Metadata
/* loaded from: classes.dex */
public interface RippleTheme {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: RippleTheme.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        /* renamed from: defaultRippleAlpha-DxMtmZc  reason: not valid java name */
        public final RippleAlpha m107162defaultRippleAlphaDxMtmZc(long j, boolean z) {
            if (z) {
                if (ColorKt.m107580luminance8_81llA(j) > 0.5d) {
                    return RippleThemeKt.access$getLightThemeHighContrastRippleAlpha$p();
                }
                return RippleThemeKt.access$getLightThemeLowContrastRippleAlpha$p();
            }
            return RippleThemeKt.access$getDarkThemeRippleAlpha$p();
        }

        /* renamed from: defaultRippleColor-5vOe2sY  reason: not valid java name */
        public final long m107163defaultRippleColor5vOe2sY(long j, boolean z) {
            float m107580luminance8_81llA = ColorKt.m107580luminance8_81llA(j);
            if (!z && m107580luminance8_81llA < 0.5d) {
                return Color.Companion.m107564getWhite0d7_KjU();
            }
            return j;
        }
    }

    @Composable
    /* renamed from: defaultColor-WaAFU9c */
    long mo106977defaultColorWaAFU9c(@Nullable Composer composer, int i);

    @Composable
    @NotNull
    RippleAlpha rippleAlpha(@Nullable Composer composer, int i);
}
