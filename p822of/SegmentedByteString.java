package p822of;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C39231y0;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: of.e */
/* loaded from: classes10.dex */
public final class SegmentedByteString {
    /* renamed from: a */
    public static final int m13688a(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 > i) {
                i4 = i5 - 1;
            } else {
                return i5;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m13687b(@NotNull C39231y0 c39231y0, int i) {
        Intrinsics.checkNotNullParameter(c39231y0, "<this>");
        int m13688a = m13688a(c39231y0.m13402J(), i + 1, 0, c39231y0.m13401K().length);
        if (m13688a < 0) {
            return ~m13688a;
        }
        return m13688a;
    }
}
