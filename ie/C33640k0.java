package ie;

import kotlin.Metadata;
import kotlin.text.StringNumberConversions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemProps.common.kt */
@Metadata
/* renamed from: ie.k0 */
/* loaded from: classes8.dex */
public final /* synthetic */ class C33640k0 {
    /* renamed from: a */
    public static final int m22958a(@NotNull String str, int i, int i2, int i3) {
        return (int) C33638i0.m22978c(str, i, i2, i3);
    }

    /* renamed from: b */
    public static final long m22957b(@NotNull String str, long j, long j2, long j3) {
        Long m16638o;
        String m22977d = C33638i0.m22977d(str);
        if (m22977d != null) {
            m16638o = StringNumberConversions.m16638o(m22977d);
            if (m16638o != null) {
                long longValue = m16638o.longValue();
                boolean z = false;
                if (j2 <= longValue && longValue <= j3) {
                    z = true;
                }
                if (z) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m22977d + '\'').toString());
        }
        return j;
    }

    @NotNull
    /* renamed from: c */
    public static final String m22956c(@NotNull String str, @NotNull String str2) {
        String m22977d = C33638i0.m22977d(str);
        if (m22977d != null) {
            return m22977d;
        }
        return str2;
    }

    /* renamed from: d */
    public static final boolean m22955d(@NotNull String str, boolean z) {
        String m22977d = C33638i0.m22977d(str);
        if (m22977d != null) {
            return Boolean.parseBoolean(m22977d);
        }
        return z;
    }

    /* renamed from: e */
    public static /* synthetic */ int m22954e(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C33638i0.m22979b(str, i, i2, i3);
    }

    /* renamed from: f */
    public static /* synthetic */ long m22953f(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C33638i0.m22978c(str, j, j4, j3);
    }
}
