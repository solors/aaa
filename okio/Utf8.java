package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: okio.d1 */
/* loaded from: classes10.dex */
public final class Utf8 {
    /* renamed from: a */
    public static final long m13611a(@NotNull String str, int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        char c;
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (z3) {
                    long j = 0;
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            j++;
                        } else {
                            if (charAt < 2048) {
                                i3 = 2;
                            } else if (charAt >= 55296 && charAt <= 57343) {
                                int i4 = i + 1;
                                if (i4 < i2) {
                                    c = str.charAt(i4);
                                } else {
                                    c = 0;
                                }
                                if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                    j += 4;
                                    i += 2;
                                } else {
                                    j++;
                                    i = i4;
                                }
                            } else {
                                i3 = 3;
                            }
                            j += i3;
                        }
                        i++;
                    }
                    return j;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ long m13610b(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m13611a(str, i, i2);
    }
}
