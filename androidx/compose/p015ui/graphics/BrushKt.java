package androidx.compose.p015ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Brush.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.BrushKt */
/* loaded from: classes.dex */
public final class BrushKt {
    @NotNull
    public static final ShaderBrush ShaderBrush(@NotNull final Shader shader) {
        Intrinsics.checkNotNullParameter(shader, "shader");
        return new ShaderBrush() { // from class: androidx.compose.ui.graphics.BrushKt$ShaderBrush$1
            @Override // androidx.compose.p015ui.graphics.ShaderBrush
            @NotNull
            /* renamed from: createShader-uvyYCjk  reason: not valid java name */
            public Shader mo107496createShaderuvyYCjk(long j) {
                return shader;
            }
        };
    }
}
