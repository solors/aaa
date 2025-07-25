package androidx.compose.p015ui.graphics.painter;

import androidx.compose.p015ui.graphics.FilterQuality;
import androidx.compose.p015ui.graphics.ImageBitmap;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BitmapPainter.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.painter.BitmapPainterKt */
/* loaded from: classes.dex */
public final class BitmapPainterKt {
    @NotNull
    /* renamed from: BitmapPainter-QZhYCtY  reason: not valid java name */
    public static final BitmapPainter m108092BitmapPainterQZhYCtY(@NotNull ImageBitmap image, long j, long j2, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        BitmapPainter bitmapPainter = new BitmapPainter(image, j, j2, null);
        bitmapPainter.m108091setFilterQualityvDHp3xo$ui_graphics_release(i);
        return bitmapPainter;
    }

    /* renamed from: BitmapPainter-QZhYCtY$default  reason: not valid java name */
    public static /* synthetic */ BitmapPainter m108093BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = IntOffset.Companion.m109862getZeronOccac();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = FilterQuality.Companion.m107613getLowfv9h1I();
        }
        return m108092BitmapPainterQZhYCtY(imageBitmap, j3, j4, i);
    }
}
