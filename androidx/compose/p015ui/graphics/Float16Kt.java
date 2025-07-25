package androidx.compose.p015ui.graphics;

import kotlin.Metadata;

/* compiled from: Float16.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.Float16Kt */
/* loaded from: classes.dex */
public final class Float16Kt {
    /* renamed from: max-AoSsdG0  reason: not valid java name */
    public static final short m107659maxAoSsdG0(short s, short s2) {
        if (!Float16.m107632isNaNimpl(s) && !Float16.m107632isNaNimpl(s2)) {
            if (Float16.m107619compareTo41bOqos(s, s2) < 0) {
                return s2;
            }
            return s;
        }
        return Float16.Companion.m107654getNaNslo4al4();
    }

    /* renamed from: min-AoSsdG0  reason: not valid java name */
    public static final short m107660minAoSsdG0(short s, short s2) {
        if (!Float16.m107632isNaNimpl(s) && !Float16.m107632isNaNimpl(s2)) {
            if (Float16.m107619compareTo41bOqos(s, s2) > 0) {
                return s2;
            }
            return s;
        }
        return Float16.Companion.m107654getNaNslo4al4();
    }
}
