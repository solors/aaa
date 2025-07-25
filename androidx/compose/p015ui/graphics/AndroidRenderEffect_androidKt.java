package androidx.compose.p015ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidRenderEffect.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidRenderEffect_androidKt */
/* loaded from: classes.dex */
public final class AndroidRenderEffect_androidKt {
    @NotNull
    public static final RenderEffect asComposeRenderEffect(@NotNull RenderEffect renderEffect) {
        Intrinsics.checkNotNullParameter(renderEffect, "<this>");
        return new AndroidRenderEffect(renderEffect);
    }
}
