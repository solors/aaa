package nf;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import okio.C39200e;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: nf.b */
/* loaded from: classes10.dex */
public final class utf8 {
    /* renamed from: a */
    public static final boolean m14033a(@NotNull C39200e c39200e) {
        long m16911k;
        Intrinsics.checkNotNullParameter(c39200e, "<this>");
        try {
            C39200e c39200e2 = new C39200e();
            m16911k = _Ranges.m16911k(c39200e.size(), 64L);
            c39200e.m13593i(c39200e2, 0L, m16911k);
            int i = 0;
            while (i < 16) {
                i++;
                if (!c39200e2.exhausted()) {
                    int readUtf8CodePoint = c39200e2.readUtf8CodePoint();
                    if (Character.isISOControl(readUtf8CodePoint) && !Character.isWhitespace(readUtf8CodePoint)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
