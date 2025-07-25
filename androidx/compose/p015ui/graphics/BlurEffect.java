package androidx.compose.p015ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidRenderEffect.android.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.BlurEffect */
/* loaded from: classes.dex */
public final class BlurEffect extends RenderEffect {
    private final int edgeTreatment;
    private final float radiusX;
    private final float radiusY;
    @Nullable
    private final RenderEffect renderEffect;

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, f, f2, i);
    }

    @Override // androidx.compose.p015ui.graphics.RenderEffect
    @RequiresApi(31)
    @NotNull
    protected RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m107797createBlurEffect8A3gB4(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        if (this.radiusX == blurEffect.radiusX) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.radiusY == blurEffect.radiusY) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && TileMode.m107847equalsimpl0(this.edgeTreatment, blurEffect.edgeTreatment) && Intrinsics.m17075f(this.renderEffect, blurEffect.renderEffect)) {
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
        return (((((i * 31) + Float.hashCode(this.radiusX)) * 31) + Float.hashCode(this.radiusY)) * 31) + TileMode.m107848hashCodeimpl(this.edgeTreatment);
    }

    @NotNull
    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) TileMode.m107849toStringimpl(this.edgeTreatment)) + ')';
    }

    private BlurEffect(RenderEffect renderEffect, float f, float f2, int i) {
        super(null);
        this.renderEffect = renderEffect;
        this.radiusX = f;
        this.radiusY = f2;
        this.edgeTreatment = i;
    }

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, f, (i2 & 4) != 0 ? f : f2, (i2 & 8) != 0 ? TileMode.Companion.m107851getClamp3opZhB0() : i, null);
    }
}
