package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DrawModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.draw.DrawContentCacheModifier */
/* loaded from: classes.dex */
final class DrawContentCacheModifier implements DrawCacheModifier {
    @NotNull
    private final CacheDrawScope cacheDrawScope;
    @NotNull
    private final Function1<CacheDrawScope, DrawResult> onBuildDrawCache;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawContentCacheModifier(@NotNull CacheDrawScope cacheDrawScope, @NotNull Function1<? super CacheDrawScope, DrawResult> onBuildDrawCache) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        this.cacheDrawScope = cacheDrawScope;
        this.onBuildDrawCache = onBuildDrawCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawContentCacheModifier copy$default(DrawContentCacheModifier drawContentCacheModifier, CacheDrawScope cacheDrawScope, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            cacheDrawScope = drawContentCacheModifier.cacheDrawScope;
        }
        if ((i & 2) != 0) {
            function1 = drawContentCacheModifier.onBuildDrawCache;
        }
        return drawContentCacheModifier.copy(cacheDrawScope, function1);
    }

    @NotNull
    public final CacheDrawScope component1() {
        return this.cacheDrawScope;
    }

    @NotNull
    public final Function1<CacheDrawScope, DrawResult> component2() {
        return this.onBuildDrawCache;
    }

    @NotNull
    public final DrawContentCacheModifier copy(@NotNull CacheDrawScope cacheDrawScope, @NotNull Function1<? super CacheDrawScope, DrawResult> onBuildDrawCache) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        return new DrawContentCacheModifier(cacheDrawScope, onBuildDrawCache);
    }

    @Override // androidx.compose.p015ui.draw.DrawModifier
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        DrawResult drawResult$ui_release = this.cacheDrawScope.getDrawResult$ui_release();
        Intrinsics.m17074g(drawResult$ui_release);
        drawResult$ui_release.getBlock$ui_release().invoke(contentDrawScope);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawContentCacheModifier)) {
            return false;
        }
        DrawContentCacheModifier drawContentCacheModifier = (DrawContentCacheModifier) obj;
        if (Intrinsics.m17075f(this.cacheDrawScope, drawContentCacheModifier.cacheDrawScope) && Intrinsics.m17075f(this.onBuildDrawCache, drawContentCacheModifier.onBuildDrawCache)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final CacheDrawScope getCacheDrawScope() {
        return this.cacheDrawScope;
    }

    @NotNull
    public final Function1<CacheDrawScope, DrawResult> getOnBuildDrawCache() {
        return this.onBuildDrawCache;
    }

    public int hashCode() {
        return (this.cacheDrawScope.hashCode() * 31) + this.onBuildDrawCache.hashCode();
    }

    @Override // androidx.compose.p015ui.draw.DrawCacheModifier
    public void onBuildCache(@NotNull BuildDrawCacheParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        CacheDrawScope cacheDrawScope = this.cacheDrawScope;
        cacheDrawScope.setCacheParams$ui_release(params);
        cacheDrawScope.setDrawResult$ui_release(null);
        this.onBuildDrawCache.invoke(cacheDrawScope);
        if (cacheDrawScope.getDrawResult$ui_release() != null) {
            return;
        }
        throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
    }

    @NotNull
    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.cacheDrawScope + ", onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }
}
