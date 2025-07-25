package androidx.compose.p015ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextRange.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.TextRangeKt */
/* loaded from: classes.dex */
public final class TextRangeKt {
    public static final long TextRange(int i, int i2) {
        return TextRange.m109371constructorimpl(packWithCheck(i, i2));
    }

    /* renamed from: constrain-8ffj60Q  reason: not valid java name */
    public static final long m109388constrain8ffj60Q(long j, int i, int i2) {
        int m16908n;
        int m16908n2;
        m16908n = _Ranges.m16908n(TextRange.m109382getStartimpl(j), i, i2);
        m16908n2 = _Ranges.m16908n(TextRange.m109377getEndimpl(j), i, i2);
        if (m16908n == TextRange.m109382getStartimpl(j) && m16908n2 == TextRange.m109377getEndimpl(j)) {
            return j;
        }
        return TextRange(m16908n, m16908n2);
    }

    private static final long packWithCheck(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 < 0) {
                z2 = false;
            }
            if (z2) {
                return (i2 & 4294967295L) | (i << 32);
            }
            throw new IllegalArgumentException(("end cannot negative. [end: " + i2 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ']').toString());
    }

    @NotNull
    /* renamed from: substring-FDrldGo  reason: not valid java name */
    public static final String m109389substringFDrldGo(@NotNull CharSequence substring, long j) {
        Intrinsics.checkNotNullParameter(substring, "$this$substring");
        return substring.subSequence(TextRange.m109380getMinimpl(j), TextRange.m109379getMaximpl(j)).toString();
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }
}
