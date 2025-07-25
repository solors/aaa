package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EdgeEffectCompat.kt */
@RequiresApi(31)
@Metadata
/* loaded from: classes.dex */
final class Api31Impl {
    @NotNull
    public static final Api31Impl INSTANCE = new Api31Impl();

    private Api31Impl() {
    }

    @DoNotInline
    @NotNull
    public final EdgeEffect create(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    @DoNotInline
    public final float getDistance(@NotNull EdgeEffect edgeEffect) {
        float distance;
        Intrinsics.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            distance = edgeEffect.getDistance();
            return distance;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @DoNotInline
    public final float onPullDistance(@NotNull EdgeEffect edgeEffect, float f, float f2) {
        float onPullDistance;
        Intrinsics.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            onPullDistance = edgeEffect.onPullDistance(f, f2);
            return onPullDistance;
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
