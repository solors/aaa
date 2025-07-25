package androidx.compose.p015ui.graphics;

import android.graphics.PathEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidPathEffect.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidPathEffect */
/* loaded from: classes.dex */
public final class AndroidPathEffect implements PathEffect {
    @NotNull
    private final PathEffect nativePathEffect;

    public AndroidPathEffect(@NotNull PathEffect nativePathEffect) {
        Intrinsics.checkNotNullParameter(nativePathEffect, "nativePathEffect");
        this.nativePathEffect = nativePathEffect;
    }

    @NotNull
    public final PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }
}
