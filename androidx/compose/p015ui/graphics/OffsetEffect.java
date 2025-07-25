package androidx.compose.p015ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidRenderEffect.android.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.OffsetEffect */
/* loaded from: classes.dex */
public final class OffsetEffect extends RenderEffect {
    private final long offset;
    @Nullable
    private final RenderEffect renderEffect;

    public /* synthetic */ OffsetEffect(RenderEffect renderEffect, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, j);
    }

    @Override // androidx.compose.p015ui.graphics.RenderEffect
    @RequiresApi(31)
    @NotNull
    protected RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m107798createOffsetEffectUv8p0NA(this.renderEffect, this.offset);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) obj;
        if (Intrinsics.m17075f(this.renderEffect, offsetEffect.renderEffect) && Offset.m107288equalsimpl0(this.offset, offsetEffect.offset)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        RenderEffect renderEffect = this.renderEffect;
        if (renderEffect != null) {
            i = renderEffect.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + Offset.m107293hashCodeimpl(this.offset);
    }

    @NotNull
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((Object) Offset.m107299toStringimpl(this.offset)) + ')';
    }

    private OffsetEffect(RenderEffect renderEffect, long j) {
        super(null);
        this.renderEffect = renderEffect;
        this.offset = j;
    }
}
