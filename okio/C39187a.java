package okio;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C39208h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Base64.kt */
@Metadata
/* renamed from: okio.a */
/* loaded from: classes10.dex */
public final class C39187a {
    @NotNull

    /* renamed from: a */
    private static final byte[] f102928a;
    @NotNull

    /* renamed from: b */
    private static final byte[] f102929b;

    static {
        C39208h.C39209a c39209a = C39208h.f102952f;
        f102928a = c39209a.m13547d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m13561h();
        f102929b = c39209a.m13547d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m13561h();
    }

    @Nullable
    /* renamed from: a */
    public static final byte[] m13638a(@NotNull String str) {
        boolean z;
        boolean z2;
        int i;
        char charAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 < length) {
                char charAt2 = str.charAt(i3);
                if ('A' <= charAt2 && charAt2 < '[') {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = charAt2 - 'A';
                } else {
                    if ('a' <= charAt2 && charAt2 < '{') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i = charAt2 - 'G';
                    } else {
                        if (('0' > charAt2 || charAt2 >= ':') ? false : false) {
                            i = charAt2 + 4;
                        } else if (charAt2 != '+' && charAt2 != '-') {
                            if (charAt2 != '/' && charAt2 != '_') {
                                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                                    return null;
                                }
                                i3++;
                            } else {
                                i = 63;
                            }
                        } else {
                            i = 62;
                        }
                    }
                }
                i5 = (i5 << 6) | i;
                i4++;
                if (i4 % 4 == 0) {
                    int i7 = i6 + 1;
                    bArr[i6] = (byte) (i5 >> 16);
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) (i5 >> 8);
                    bArr[i8] = (byte) i5;
                    i6 = i8 + 1;
                }
                i3++;
            } else {
                int i9 = i4 % 4;
                if (i9 == 1) {
                    return null;
                }
                if (i9 != 2) {
                    if (i9 == 3) {
                        int i10 = i5 << 6;
                        int i11 = i6 + 1;
                        bArr[i6] = (byte) (i10 >> 16);
                        i6 = i11 + 1;
                        bArr[i11] = (byte) (i10 >> 8);
                    }
                } else {
                    bArr[i6] = (byte) ((i5 << 12) >> 16);
                    i6++;
                }
                if (i6 == i2) {
                    return bArr;
                }
                byte[] copyOf = Arrays.copyOf(bArr, i6);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                return copyOf;
            }
        }
    }

    @NotNull
    /* renamed from: b */
    public static final String m13637b(@NotNull byte[] bArr, @NotNull byte[] map) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr2[i2] = map[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr2[i6] = map[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr2[i7] = map[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr2[i8] = map[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i9 = i + 1;
                byte b4 = bArr[i];
                byte b5 = bArr[i9];
                int i10 = i2 + 1;
                bArr2[i2] = map[(b4 & 255) >> 2];
                int i11 = i10 + 1;
                bArr2[i10] = map[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr2[i11] = map[(b5 & 15) << 2];
                bArr2[i11 + 1] = 61;
            }
        } else {
            byte b6 = bArr[i];
            int i12 = i2 + 1;
            bArr2[i2] = map[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr2[i12] = map[(b6 & 3) << 4];
            bArr2[i13] = 61;
            bArr2[i13 + 1] = 61;
        }
        return C39206f1.m13573c(bArr2);
    }

    /* renamed from: c */
    public static /* synthetic */ String m13636c(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f102928a;
        }
        return m13637b(bArr, bArr2);
    }
}
