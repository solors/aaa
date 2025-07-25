package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RenderEffect.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.RenderEffectKt */
/* loaded from: classes.dex */
public final class RenderEffectKt {
    @Stable
    @NotNull
    /* renamed from: BlurEffect-3YTHUZs  reason: not valid java name */
    public static final BlurEffect m107795BlurEffect3YTHUZs(float f, float f2, int i) {
        return new BlurEffect(null, f, f2, i, null);
    }

    /* renamed from: BlurEffect-3YTHUZs$default  reason: not valid java name */
    public static /* synthetic */ BlurEffect m107796BlurEffect3YTHUZs$default(float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = TileMode.Companion.m107851getClamp3opZhB0();
        }
        return m107795BlurEffect3YTHUZs(f, f2, i);
    }

    @Stable
    @NotNull
    public static final OffsetEffect OffsetEffect(float f, float f2) {
        return new OffsetEffect(null, OffsetKt.Offset(f, f2), null);
    }
}
