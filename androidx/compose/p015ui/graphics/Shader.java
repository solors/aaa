package androidx.compose.p015ui.graphics;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.ui.graphics.ShaderKt */
/* loaded from: classes.dex */
public final class Shader {
    @NotNull
    /* renamed from: ImageShader-F49vj9s  reason: not valid java name */
    public static final android.graphics.Shader m107799ImageShaderF49vj9s(@NotNull ImageBitmap image, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        return AndroidShader_androidKt.m107429ActualImageShaderF49vj9s(image, i, i2);
    }

    /* renamed from: ImageShader-F49vj9s$default  reason: not valid java name */
    public static /* synthetic */ android.graphics.Shader m107800ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = TileMode.Companion.m107851getClamp3opZhB0();
        }
        if ((i3 & 4) != 0) {
            i2 = TileMode.Companion.m107851getClamp3opZhB0();
        }
        return m107799ImageShaderF49vj9s(imageBitmap, i, i2);
    }

    @NotNull
    /* renamed from: LinearGradientShader-VjE6UOU  reason: not valid java name */
    public static final android.graphics.Shader m107801LinearGradientShaderVjE6UOU(long j, long j2, @NotNull List<Color> colors, @Nullable List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return AndroidShader_androidKt.m107430ActualLinearGradientShaderVjE6UOU(j, j2, colors, list, i);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default  reason: not valid java name */
    public static /* synthetic */ android.graphics.Shader m107802LinearGradientShaderVjE6UOU$default(long j, long j2, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = TileMode.Companion.m107851getClamp3opZhB0();
        }
        return m107801LinearGradientShaderVjE6UOU(j, j2, list, list3, i);
    }

    @NotNull
    /* renamed from: RadialGradientShader-8uybcMk  reason: not valid java name */
    public static final android.graphics.Shader m107803RadialGradientShader8uybcMk(long j, float f, @NotNull List<Color> colors, @Nullable List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return AndroidShader_androidKt.m107431ActualRadialGradientShader8uybcMk(j, f, colors, list, i);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default  reason: not valid java name */
    public static /* synthetic */ android.graphics.Shader m107804RadialGradientShader8uybcMk$default(long j, float f, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = TileMode.Companion.m107851getClamp3opZhB0();
        }
        return m107803RadialGradientShader8uybcMk(j, f, list, list3, i);
    }

    @NotNull
    /* renamed from: SweepGradientShader-9KIMszo  reason: not valid java name */
    public static final android.graphics.Shader m107805SweepGradientShader9KIMszo(long j, @NotNull List<Color> colors, @Nullable List<Float> list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return AndroidShader_androidKt.m107432ActualSweepGradientShader9KIMszo(j, colors, list);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default  reason: not valid java name */
    public static /* synthetic */ android.graphics.Shader m107806SweepGradientShader9KIMszo$default(long j, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = null;
        }
        return m107805SweepGradientShader9KIMszo(j, list, list2);
    }
}
