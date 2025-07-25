package androidx.compose.p015ui.graphics.painter;

import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.graphics.ColorFilter;
import androidx.compose.p015ui.graphics.FilterQuality;
import androidx.compose.p015ui.graphics.ImageBitmap;
import androidx.compose.p015ui.graphics.drawscope.DrawScope;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BitmapPainter.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.painter.BitmapPainter */
/* loaded from: classes.dex */
public final class BitmapPainter extends Painter {
    private float alpha;
    @Nullable
    private ColorFilter colorFilter;
    private int filterQuality;
    @NotNull
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, j, j2);
    }

    /* renamed from: validateSize-N5eqBDc  reason: not valid java name */
    private final long m108088validateSizeN5eqBDc(long j, long j2) {
        boolean z;
        if (IntOffset.m109852getXimpl(j) >= 0 && IntOffset.m109853getYimpl(j) >= 0 && IntSize.m109894getWidthimpl(j2) >= 0 && IntSize.m109893getHeightimpl(j2) >= 0 && IntSize.m109894getWidthimpl(j2) <= this.image.getWidth() && IntSize.m109893getHeightimpl(j2) <= this.image.getHeight()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // androidx.compose.p015ui.graphics.painter.Painter
    protected boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.p015ui.graphics.painter.Painter
    protected boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        if (Intrinsics.m17075f(this.image, bitmapPainter.image) && IntOffset.m109851equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m109892equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m107608equalsimpl0(this.filterQuality, bitmapPainter.filterQuality)) {
            return true;
        }
        return false;
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics_release  reason: not valid java name */
    public final int m108089getFilterQualityfv9h1I$ui_graphics_release() {
        return this.filterQuality;
    }

    @Override // androidx.compose.p015ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long mo108090getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m109904toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + IntOffset.m109854hashCodeimpl(this.srcOffset)) * 31) + IntSize.m109895hashCodeimpl(this.srcSize)) * 31) + FilterQuality.m107609hashCodeimpl(this.filterQuality);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.p015ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        int m103791d;
        int m103791d2;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        ImageBitmap imageBitmap = this.image;
        long j = this.srcOffset;
        long j2 = this.srcSize;
        m103791d = MathJVM.m103791d(Size.m107360getWidthimpl(drawScope.mo108021getSizeNHjbRc()));
        m103791d2 = MathJVM.m103791d(Size.m107357getHeightimpl(drawScope.mo108021getSizeNHjbRc()));
        DrawScope.m108005drawImageAZ2fEMs$default(drawScope, imageBitmap, j, j2, 0L, IntSizeKt.IntSize(m103791d, m103791d2), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics_release  reason: not valid java name */
    public final void m108091setFilterQualityvDHp3xo$ui_graphics_release(int i) {
        this.filterQuality = i;
    }

    @NotNull
    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m109859toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m109897toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m107610toStringimpl(this.filterQuality)) + ')';
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, (i & 2) != 0 ? IntOffset.Companion.m109862getZeronOccac() : j, (i & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2, null);
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j, long j2) {
        this.image = imageBitmap;
        this.srcOffset = j;
        this.srcSize = j2;
        this.filterQuality = FilterQuality.Companion.m107613getLowfv9h1I();
        this.size = m108088validateSizeN5eqBDc(j, j2);
        this.alpha = 1.0f;
    }
}
