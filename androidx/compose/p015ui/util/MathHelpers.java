package androidx.compose.p015ui.util;

import be.MathJVM;
import kotlin.Metadata;

@Metadata
/* renamed from: androidx.compose.ui.util.MathHelpersKt */
/* loaded from: classes.dex */
public final class MathHelpers {
    public static final float lerp(float f, float f2, float f3) {
        return ((1 - f3) * f) + (f3 * f2);
    }

    public static final int lerp(int i, int i2, float f) {
        int m103792c;
        m103792c = MathJVM.m103792c((i2 - i) * f);
        return i + m103792c;
    }

    public static final long lerp(long j, long j2, float f) {
        long m103790e;
        m103790e = MathJVM.m103790e((j2 - j) * f);
        return j + m103790e;
    }
}
