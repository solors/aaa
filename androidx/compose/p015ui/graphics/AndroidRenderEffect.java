package androidx.compose.p015ui.graphics;

import android.graphics.RenderEffect;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidRenderEffect.android.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidRenderEffect */
/* loaded from: classes.dex */
public final class AndroidRenderEffect extends RenderEffect {
    @NotNull
    private final RenderEffect androidRenderEffect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRenderEffect(@NotNull RenderEffect androidRenderEffect) {
        super(null);
        Intrinsics.checkNotNullParameter(androidRenderEffect, "androidRenderEffect");
        this.androidRenderEffect = androidRenderEffect;
    }

    @Override // androidx.compose.p015ui.graphics.RenderEffect
    @NotNull
    protected RenderEffect createRenderEffect() {
        return this.androidRenderEffect;
    }

    @NotNull
    public final RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
