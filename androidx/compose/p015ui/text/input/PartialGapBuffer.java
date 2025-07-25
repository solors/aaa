package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.InternalTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GapBuffer.kt */
@Metadata
@InternalTextApi
/* renamed from: androidx.compose.ui.text.input.PartialGapBuffer */
/* loaded from: classes.dex */
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private int bufEnd;
    private int bufStart;
    @Nullable
    private GapBuffer buffer;
    @NotNull
    private String text;

    /* compiled from: GapBuffer.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.input.PartialGapBuffer$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PartialGapBuffer(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.bufStart = -1;
        this.bufEnd = -1;
    }

    public final char get(int i) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(i);
        }
        if (i < this.bufStart) {
            return this.text.charAt(i);
        }
        int length = gapBuffer.length();
        int i2 = this.bufStart;
        if (i < length + i2) {
            return gapBuffer.get(i - i2);
        }
        return this.text.charAt(i - ((length - this.bufEnd) + i2));
    }

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.length();
        }
        return (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final void replace(int i, int i2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            int max = Math.max(255, text.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.text.length() - i2, 64);
            int i3 = i - min;
            GapBufferKt.toCharArray(this.text, cArr, 0, i3, i);
            int i4 = max - min2;
            int i5 = i2 + min2;
            GapBufferKt.toCharArray(this.text, cArr, i4, i2, i5);
            GapBufferKt.toCharArray$default(text, cArr, min, 0, 0, 12, null);
            this.buffer = new GapBuffer(cArr, min + text.length(), i4);
            this.bufStart = i3;
            this.bufEnd = i5;
            return;
        }
        int i6 = this.bufStart;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 >= 0 && i8 <= gapBuffer.length()) {
            gapBuffer.replace(i7, i8, text);
            return;
        }
        this.text = toString();
        this.buffer = null;
        this.bufStart = -1;
        this.bufEnd = -1;
        replace(i, i2, text);
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    @NotNull
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.text, 0, this.bufStart);
        gapBuffer.append(sb2);
        String str = this.text;
        sb2.append((CharSequence) str, this.bufEnd, str.length());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
