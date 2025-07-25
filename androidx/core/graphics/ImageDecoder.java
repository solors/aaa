package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

@Metadata
@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.graphics.ImageDecoderKt */
/* loaded from: classes.dex */
public final class ImageDecoder {
    @RequiresApi(28)
    @NotNull
    public static final Bitmap decodeBitmap(@NotNull ImageDecoder.Source source, @NotNull final InterfaceC45268n<? super android.graphics.ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, Unit> action) {
        Bitmap decodeBitmap;
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        decodeBitmap = android.graphics.ImageDecoder.decodeBitmap(source, new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeBitmap$1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(@NotNull ImageDecoder decoder, @NotNull ImageDecoder.ImageInfo info, @NotNull ImageDecoder.Source source2) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                Intrinsics.checkNotNullParameter(info, "info");
                Intrinsics.checkNotNullParameter(source2, "source");
                action.invoke(decoder, info, source2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(decodeBitmap, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeBitmap;
    }

    @RequiresApi(28)
    @NotNull
    public static final Drawable decodeDrawable(@NotNull ImageDecoder.Source source, @NotNull final InterfaceC45268n<? super android.graphics.ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, Unit> action) {
        Drawable decodeDrawable;
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        decodeDrawable = android.graphics.ImageDecoder.decodeDrawable(source, new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeDrawable$1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(@NotNull ImageDecoder decoder, @NotNull ImageDecoder.ImageInfo info, @NotNull ImageDecoder.Source source2) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                Intrinsics.checkNotNullParameter(info, "info");
                Intrinsics.checkNotNullParameter(source2, "source");
                action.invoke(decoder, info, source2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(decodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeDrawable;
    }
}
