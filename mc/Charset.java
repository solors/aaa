package mc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: mc.i */
/* loaded from: classes9.dex */
public final class Charset {
    /* renamed from: a */
    public static final boolean m15233a(char c) {
        if (Character.toLowerCase(c) == c) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: b */
    public static final char[] m15232b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
        }
        return cArr;
    }
}
