package p822of;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C39200e;
import okio.C39208h;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: of.b */
/* loaded from: classes10.dex */
public final class ByteString {
    @NotNull

    /* renamed from: a */
    private static final char[] f102883a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:553:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0081 A[EDGE_INSN: B:556:0x0081->B:350:0x0081 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x00da A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m13714c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p822of.ByteString.m13714c(byte[], int):int");
    }

    /* renamed from: d */
    public static final void m13713d(@NotNull C39208h c39208h, @NotNull C39200e buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(c39208h, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(c39208h.m13561h(), i, i2);
    }

    /* renamed from: e */
    public static final int m13712e(char c) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if ('0' <= c && c < ':') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' <= c && c < 'g') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    @NotNull
    /* renamed from: f */
    public static final char[] m13711f() {
        return f102883a;
    }
}
