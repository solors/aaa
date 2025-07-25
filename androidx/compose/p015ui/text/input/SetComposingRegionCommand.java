package androidx.compose.p015ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EditCommand.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.SetComposingRegionCommand */
/* loaded from: classes.dex */
public final class SetComposingRegionCommand implements EditCommand {
    private final int end;
    private final int start;

    public SetComposingRegionCommand(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    @Override // androidx.compose.p015ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        int m16908n;
        int m16908n2;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.hasComposition$ui_text_release()) {
            buffer.commitComposition$ui_text_release();
        }
        m16908n = _Ranges.m16908n(this.start, 0, buffer.getLength$ui_text_release());
        m16908n2 = _Ranges.m16908n(this.end, 0, buffer.getLength$ui_text_release());
        if (m16908n != m16908n2) {
            if (m16908n < m16908n2) {
                buffer.setComposition$ui_text_release(m16908n, m16908n2);
            } else {
                buffer.setComposition$ui_text_release(m16908n2, m16908n);
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingRegionCommand)) {
            return false;
        }
        SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) obj;
        if (this.start == setComposingRegionCommand.start && this.end == setComposingRegionCommand.end) {
            return true;
        }
        return false;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    @NotNull
    public String toString() {
        return "SetComposingRegionCommand(start=" + this.start + ", end=" + this.end + ')';
    }
}
