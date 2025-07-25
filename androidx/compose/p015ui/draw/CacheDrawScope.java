package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p015ui.graphics.drawscope.DrawScope;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DrawModifier.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.draw.CacheDrawScope */
/* loaded from: classes.dex */
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;
    @NotNull
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;
    @Nullable
    private DrawResult drawResult;

    @NotNull
    public final BuildDrawCacheParams getCacheParams$ui_release() {
        return this.cacheParams;
    }

    @Override // androidx.compose.p015ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    @Nullable
    public final DrawResult getDrawResult$ui_release() {
        return this.drawResult;
    }

    @Override // androidx.compose.p015ui.unit.Density
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m107214getSizeNHjbRc() {
        return this.cacheParams.mo107213getSizeNHjbRc();
    }

    @NotNull
    public final DrawResult onDrawBehind(@NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return onDrawWithContent(new CacheDrawScope$onDrawBehind$1(block));
    }

    @NotNull
    public final DrawResult onDrawWithContent(@NotNull Function1<? super ContentDrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DrawResult drawResult = new DrawResult(block);
        this.drawResult = drawResult;
        return drawResult;
    }

    public final void setCacheParams$ui_release(@NotNull BuildDrawCacheParams buildDrawCacheParams) {
        Intrinsics.checkNotNullParameter(buildDrawCacheParams, "<set-?>");
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setDrawResult$ui_release(@Nullable DrawResult drawResult) {
        this.drawResult = drawResult;
    }
}
