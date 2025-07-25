package androidx.compose.p015ui.graphics;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidRenderEffect.android.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.RenderEffect */
/* loaded from: classes.dex */
public abstract class RenderEffect {
    @Nullable
    private android.graphics.RenderEffect internalRenderEffect;

    public /* synthetic */ RenderEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @RequiresApi(31)
    @NotNull
    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect == null) {
            android.graphics.RenderEffect createRenderEffect = createRenderEffect();
            this.internalRenderEffect = createRenderEffect;
            return createRenderEffect;
        }
        return renderEffect;
    }

    @RequiresApi(31)
    @NotNull
    protected abstract android.graphics.RenderEffect createRenderEffect();

    public boolean isSupported() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    private RenderEffect() {
    }
}
