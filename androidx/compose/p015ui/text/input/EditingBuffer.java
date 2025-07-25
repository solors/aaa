package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.AnnotatedString;
import androidx.compose.p015ui.text.TextRange;
import androidx.compose.p015ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EditingBuffer.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.EditingBuffer */
/* loaded from: classes.dex */
public final class EditingBuffer {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    @NotNull
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;

    /* compiled from: EditingBuffer.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.input.EditingBuffer$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j);
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int i, int i2) {
        long TextRange = TextRangeKt.TextRange(i, i2);
        this.gapBuffer.replace(i, i2, "");
        long m109504updateRangeAfterDeletepWDy79M = EditingBufferKt.m109504updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        this.selectionStart = TextRange.m109380getMinimpl(m109504updateRangeAfterDeletepWDy79M);
        this.selectionEnd = TextRange.m109379getMaximpl(m109504updateRangeAfterDeletepWDy79M);
        if (hasComposition$ui_text_release()) {
            long m109504updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m109504updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (TextRange.m109376getCollapsedimpl(m109504updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
                return;
            }
            this.compositionStart = TextRange.m109380getMinimpl(m109504updateRangeAfterDeletepWDy79M2);
            this.compositionEnd = TextRange.m109379getMaximpl(m109504updateRangeAfterDeletepWDy79M2);
        }
    }

    public final char get$ui_text_release(int i) {
        return this.gapBuffer.get(i);
    }

    @Nullable
    /* renamed from: getComposition-MzsxiRA$ui_text_release  reason: not valid java name */
    public final TextRange m109502getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m109370boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i != i2) {
            return -1;
        }
        return i2;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release  reason: not valid java name */
    public final long m109503getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        if (this.compositionStart != -1) {
            return true;
        }
        return false;
    }

    public final void replace$ui_text_release(int i, int i2, @NotNull AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        replace$ui_text_release(i, i2, text.getText());
    }

    public final void setComposition$ui_text_release(int i, int i2) {
        if (i >= 0 && i <= this.gapBuffer.getLength()) {
            if (i2 >= 0 && i2 <= this.gapBuffer.getLength()) {
                if (i < i2) {
                    this.compositionStart = i;
                    this.compositionEnd = i2;
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed or empty range: " + i + " > " + i2);
            }
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.gapBuffer.getLength());
    }

    public final void setCursor$ui_text_release(int i) {
        setSelection$ui_text_release(i, i);
    }

    public final void setSelection$ui_text_release(int i, int i2) {
        if (i >= 0 && i <= this.gapBuffer.getLength()) {
            if (i2 >= 0 && i2 <= this.gapBuffer.getLength()) {
                if (i <= i2) {
                    this.selectionStart = i;
                    this.selectionEnd = i2;
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
            }
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.gapBuffer.getLength());
    }

    @NotNull
    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    @NotNull
    public String toString() {
        return this.gapBuffer.toString();
    }

    public /* synthetic */ EditingBuffer(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    public final void replace$ui_text_release(int i, int i2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (i >= 0 && i <= this.gapBuffer.getLength()) {
            if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
                throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
            } else if (i <= i2) {
                this.gapBuffer.replace(i, i2, text);
                this.selectionStart = text.length() + i;
                this.selectionEnd = i + text.length();
                this.compositionStart = -1;
                this.compositionEnd = -1;
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
            }
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.gapBuffer.getLength());
    }

    private EditingBuffer(AnnotatedString annotatedString, long j) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m109380getMinimpl(j);
        this.selectionEnd = TextRange.m109379getMaximpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int m109380getMinimpl = TextRange.m109380getMinimpl(j);
        int m109379getMaximpl = TextRange.m109379getMaximpl(j);
        if (m109380getMinimpl >= 0 && m109380getMinimpl <= annotatedString.length()) {
            if (m109379getMaximpl < 0 || m109379getMaximpl > annotatedString.length()) {
                throw new IndexOutOfBoundsException("end (" + m109379getMaximpl + ") offset is outside of text region " + annotatedString.length());
            } else if (m109380getMinimpl <= m109379getMaximpl) {
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + m109380getMinimpl + " > " + m109379getMaximpl);
            }
        }
        throw new IndexOutOfBoundsException("start (" + m109380getMinimpl + ") offset is outside of text region " + annotatedString.length());
    }

    private EditingBuffer(String str, long j) {
        this(new AnnotatedString(str, null, null, 6, null), j, (DefaultConstructorMarker) null);
    }
}
