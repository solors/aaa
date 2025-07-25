package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.TextRange;
import androidx.compose.p015ui.text.TextRangeKt;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.EditingBufferKt */
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M  reason: not valid java name */
    public static final long m109504updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m109378getLengthimpl;
        int m109380getMinimpl = TextRange.m109380getMinimpl(j);
        int m109379getMaximpl = TextRange.m109379getMaximpl(j);
        if (TextRange.m109384intersects5zctL8(j2, j)) {
            if (TextRange.m109372contains5zctL8(j2, j)) {
                m109380getMinimpl = TextRange.m109380getMinimpl(j2);
                m109379getMaximpl = m109380getMinimpl;
            } else {
                if (TextRange.m109372contains5zctL8(j, j2)) {
                    m109378getLengthimpl = TextRange.m109378getLengthimpl(j2);
                } else if (TextRange.m109373containsimpl(j2, m109380getMinimpl)) {
                    m109380getMinimpl = TextRange.m109380getMinimpl(j2);
                    m109378getLengthimpl = TextRange.m109378getLengthimpl(j2);
                } else {
                    m109379getMaximpl = TextRange.m109380getMinimpl(j2);
                }
                m109379getMaximpl -= m109378getLengthimpl;
            }
        } else if (m109379getMaximpl > TextRange.m109380getMinimpl(j2)) {
            m109380getMinimpl -= TextRange.m109378getLengthimpl(j2);
            m109378getLengthimpl = TextRange.m109378getLengthimpl(j2);
            m109379getMaximpl -= m109378getLengthimpl;
        }
        return TextRangeKt.TextRange(m109380getMinimpl, m109379getMaximpl);
    }
}
