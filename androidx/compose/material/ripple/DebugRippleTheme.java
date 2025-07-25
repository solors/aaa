package androidx.compose.material.ripple;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RippleTheme.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
final class DebugRippleTheme implements RippleTheme {
    @NotNull
    public static final DebugRippleTheme INSTANCE = new DebugRippleTheme();

    private DebugRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    /* renamed from: defaultColor-WaAFU9c */
    public long mo106977defaultColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(2042140174);
        long m107163defaultRippleColor5vOe2sY = RippleTheme.Companion.m107163defaultRippleColor5vOe2sY(Color.Companion.m107553getBlack0d7_KjU(), true);
        composer.endReplaceableGroup();
        return m107163defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    @NotNull
    public RippleAlpha rippleAlpha(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1629816343);
        RippleAlpha m107162defaultRippleAlphaDxMtmZc = RippleTheme.Companion.m107162defaultRippleAlphaDxMtmZc(Color.Companion.m107553getBlack0d7_KjU(), true);
        composer.endReplaceableGroup();
        return m107162defaultRippleAlphaDxMtmZc;
    }
}
