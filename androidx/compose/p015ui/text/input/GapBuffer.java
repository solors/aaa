package androidx.compose.p015ui.text.input;

import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GapBuffer.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.GapBuffer */
/* loaded from: classes.dex */
public final class GapBuffer {
    @NotNull
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(@NotNull char[] initBuffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initBuffer, "initBuffer");
        this.capacity = initBuffer.length;
        this.buffer = initBuffer;
        this.gapStart = i;
        this.gapEnd = i2;
    }

    private final void delete(int i, int i2) {
        int i3 = this.gapStart;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.buffer;
            _ArraysJvm.m17397h(cArr, cArr, this.gapEnd - i4, i2, i3);
            this.gapStart = i;
            this.gapEnd -= i4;
        } else if (i < i3 && i2 >= i3) {
            this.gapEnd = i2 + gapLength();
            this.gapStart = i;
        } else {
            int gapLength = i + gapLength();
            int gapLength2 = i2 + gapLength();
            int i5 = this.gapEnd;
            int i6 = gapLength - i5;
            char[] cArr2 = this.buffer;
            _ArraysJvm.m17397h(cArr2, cArr2, this.gapStart, i5, gapLength);
            this.gapStart += i6;
            this.gapEnd = gapLength2;
        }
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int i) {
        if (i <= gapLength()) {
            return;
        }
        int gapLength = i - gapLength();
        int i2 = this.capacity;
        do {
            i2 *= 2;
        } while (i2 - this.capacity < gapLength);
        char[] cArr = new char[i2];
        _ArraysJvm.m17397h(this.buffer, cArr, 0, 0, this.gapStart);
        int i3 = this.capacity;
        int i4 = this.gapEnd;
        int i5 = i3 - i4;
        int i6 = i2 - i5;
        _ArraysJvm.m17397h(this.buffer, cArr, i6, i4, i5 + i4);
        this.buffer = cArr;
        this.capacity = i2;
        this.gapEnd = i6;
    }

    public final void append(@NotNull StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i = this.gapEnd;
        builder.append(cArr, i, this.capacity - i);
    }

    public final char get(int i) {
        int i2 = this.gapStart;
        if (i < i2) {
            return this.buffer[i];
        }
        return this.buffer[(i - i2) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int i, int i2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        makeSureAvailableSpace(text.length() - (i2 - i));
        delete(i, i2);
        GapBufferKt.toCharArray$default(text, this.buffer, this.gapStart, 0, 0, 12, null);
        this.gapStart += text.length();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply { append(this) }.toString()");
        return sb3;
    }
}
