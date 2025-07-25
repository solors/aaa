package androidx.core.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.core.graphics.PaintKt */
/* loaded from: classes.dex */
public final class Paint {
    public static final boolean setBlendMode(@NotNull android.graphics.Paint paint, @Nullable BlendModeCompat blendModeCompat) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return PaintCompat.setBlendMode(paint, blendModeCompat);
    }
}
