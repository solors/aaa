package androidx.compose.p015ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidRenderEffect.android.kt */
@RequiresApi(31)
@Metadata
/* renamed from: androidx.compose.ui.graphics.RenderEffectVerificationHelper */
/* loaded from: classes.dex */
final class RenderEffectVerificationHelper {
    @NotNull
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    @DoNotInline
    @NotNull
    /* renamed from: createBlurEffect-8A-3gB4  reason: not valid java name */
    public final RenderEffect m107797createBlurEffect8A3gB4(@Nullable RenderEffect renderEffect, float f, float f2, int i) {
        RenderEffect createBlurEffect;
        RenderEffect createBlurEffect2;
        if (renderEffect == null) {
            createBlurEffect2 = RenderEffect.createBlurEffect(f, f2, AndroidTileMode_androidKt.m107434toAndroidTileMode0vamqd0(i));
            Intrinsics.checkNotNullExpressionValue(createBlurEffect2, "{\n            android.gr…)\n            )\n        }");
            return createBlurEffect2;
        }
        createBlurEffect = RenderEffect.createBlurEffect(f, f2, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m107434toAndroidTileMode0vamqd0(i));
        Intrinsics.checkNotNullExpressionValue(createBlurEffect, "{\n            android.gr…)\n            )\n        }");
        return createBlurEffect;
    }

    @DoNotInline
    @NotNull
    /* renamed from: createOffsetEffect-Uv8p0NA  reason: not valid java name */
    public final RenderEffect m107798createOffsetEffectUv8p0NA(@Nullable RenderEffect renderEffect, long j) {
        RenderEffect createOffsetEffect;
        RenderEffect createOffsetEffect2;
        if (renderEffect == null) {
            createOffsetEffect2 = RenderEffect.createOffsetEffect(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j));
            Intrinsics.checkNotNullExpressionValue(createOffsetEffect2, "{\n            android.gr…et.x, offset.y)\n        }");
            return createOffsetEffect2;
        }
        createOffsetEffect = RenderEffect.createOffsetEffect(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j), renderEffect.asAndroidRenderEffect());
        Intrinsics.checkNotNullExpressionValue(createOffsetEffect, "{\n            android.gr…)\n            )\n        }");
        return createOffsetEffect;
    }
}
