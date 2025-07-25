package androidx.compose.p015ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PixelMap.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.PixelMap */
/* loaded from: classes.dex */
public final class PixelMap {
    @NotNull
    private final int[] buffer;
    private final int bufferOffset;
    private final int height;
    private final int stride;
    private final int width;

    public PixelMap(@NotNull int[] buffer, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        this.width = i;
        this.height = i2;
        this.bufferOffset = i3;
        this.stride = i4;
    }

    /* renamed from: get-WaAFU9c  reason: not valid java name */
    public final long m107784getWaAFU9c(int i, int i2) {
        return ColorKt.Color(this.buffer[this.bufferOffset + (i2 * this.stride) + i]);
    }

    @NotNull
    public final int[] getBuffer() {
        return this.buffer;
    }

    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getStride() {
        return this.stride;
    }

    public final int getWidth() {
        return this.width;
    }
}
