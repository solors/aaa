package androidx.compose.foundation.text;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.geometry.Rect;
import kotlin.Metadata;

/* compiled from: TextLayoutResultProxy.kt */
@Metadata
/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k  reason: not valid java name */
    public static final long m106671coerceIn3MmeM6k(long j, Rect rect) {
        float m107291getXimpl;
        float m107292getYimpl;
        if (Offset.m107291getXimpl(j) < rect.getLeft()) {
            m107291getXimpl = rect.getLeft();
        } else if (Offset.m107291getXimpl(j) > rect.getRight()) {
            m107291getXimpl = rect.getRight();
        } else {
            m107291getXimpl = Offset.m107291getXimpl(j);
        }
        if (Offset.m107292getYimpl(j) < rect.getTop()) {
            m107292getYimpl = rect.getTop();
        } else if (Offset.m107292getYimpl(j) > rect.getBottom()) {
            m107292getYimpl = rect.getBottom();
        } else {
            m107292getYimpl = Offset.m107292getYimpl(j);
        }
        return OffsetKt.Offset(m107291getXimpl, m107292getYimpl);
    }
}
