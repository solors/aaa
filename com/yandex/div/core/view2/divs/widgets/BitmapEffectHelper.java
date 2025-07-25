package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.InterfaceC0152Px;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.yandex.div.core.view2.divs.widgets.a */
/* loaded from: classes8.dex */
public final class BitmapEffectHelper {
    @NotNull

    /* renamed from: a */
    private final RenderScript f75633a;

    public BitmapEffectHelper(@NotNull RenderScript renderScript) {
        Intrinsics.checkNotNullParameter(renderScript, "renderScript");
        this.f75633a = renderScript;
    }

    @NotNull
    /* renamed from: a */
    public final Bitmap m37018a(@NotNull Bitmap bitmap, @InterfaceC0152Px int i) {
        float f;
        boolean z;
        Bitmap result;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (i == 0) {
            return bitmap;
        }
        if (i > 25) {
            f = (i * 1.0f) / 25;
            i = 25;
        } else {
            f = 1.0f;
        }
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            result = bitmap.copy(bitmap.getConfig(), false);
        } else {
            result = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f), (int) (bitmap.getHeight() / f), false);
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f75633a, result);
        Allocation createTyped = Allocation.createTyped(this.f75633a, createFromBitmap.getType());
        RenderScript renderScript = this.f75633a;
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        create.setRadius(i);
        create.setInput(createFromBitmap);
        create.forEach(createTyped);
        createTyped.copyTo(result);
        createFromBitmap.destroy();
        createTyped.destroy();
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    @NotNull
    /* renamed from: b */
    public final Bitmap m37017b(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …lter = */ false\n        )");
        createBitmap.setDensity(160);
        return createBitmap;
    }
}
