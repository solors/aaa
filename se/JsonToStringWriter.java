package se;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: se.r0 */
/* loaded from: classes8.dex */
public final class JsonToStringWriter implements InterfaceC42743z0 {
    @NotNull

    /* renamed from: a */
    private char[] f111887a = C42715m.f111862c.m6728d();

    /* renamed from: b */
    private int f111888b;

    /* renamed from: d */
    private final void m6684d(int i, int i2, String str) {
        int i3;
        int length = str.length();
        while (i < length) {
            int m6682f = m6682f(i2, 2);
            char charAt = str.charAt(i);
            if (charAt < StringOps.m6769a().length) {
                byte b = StringOps.m6769a()[charAt];
                if (b == 0) {
                    i3 = m6682f + 1;
                    this.f111887a[m6682f] = charAt;
                } else {
                    if (b == 1) {
                        String str2 = StringOps.m6768b()[charAt];
                        Intrinsics.m17074g(str2);
                        int m6682f2 = m6682f(m6682f, str2.length());
                        str2.getChars(0, str2.length(), this.f111887a, m6682f2);
                        i2 = m6682f2 + str2.length();
                        this.f111888b = i2;
                    } else {
                        char[] cArr = this.f111887a;
                        cArr[m6682f] = '\\';
                        cArr[m6682f + 1] = (char) b;
                        i2 = m6682f + 2;
                        this.f111888b = i2;
                    }
                    i++;
                }
            } else {
                i3 = m6682f + 1;
                this.f111887a[m6682f] = charAt;
            }
            i2 = i3;
            i++;
        }
        int m6682f3 = m6682f(i2, 1);
        this.f111887a[m6682f3] = '\"';
        this.f111888b = m6682f3 + 1;
    }

    /* renamed from: e */
    private final void m6683e(int i) {
        m6682f(this.f111888b, i);
    }

    /* renamed from: f */
    private final int m6682f(int i, int i2) {
        int m16917e;
        int i3 = i2 + i;
        char[] cArr = this.f111887a;
        if (cArr.length <= i3) {
            m16917e = _Ranges.m16917e(i3, i * 2);
            char[] copyOf = Arrays.copyOf(cArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f111887a = copyOf;
        }
        return i;
    }

    @Override // se.InterfaceC42743z0
    /* renamed from: a */
    public void mo6642a(char c) {
        m6683e(1);
        char[] cArr = this.f111887a;
        int i = this.f111888b;
        this.f111888b = i + 1;
        cArr[i] = c;
    }

    @Override // se.InterfaceC42743z0
    /* renamed from: b */
    public void mo6641b(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m6683e(text.length() + 2);
        char[] cArr = this.f111887a;
        int i = this.f111888b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < StringOps.m6769a().length && StringOps.m6769a()[c] != 0) {
                m6684d(i4 - i2, i4, text);
                return;
            }
        }
        cArr[i3] = '\"';
        this.f111888b = i3 + 1;
    }

    @Override // se.InterfaceC42743z0
    /* renamed from: c */
    public void mo6640c(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        m6683e(length);
        text.getChars(0, text.length(), this.f111887a, this.f111888b);
        this.f111888b += length;
    }

    /* renamed from: g */
    public void m6681g() {
        C42715m.f111862c.m6729c(this.f111887a);
    }

    @NotNull
    public String toString() {
        return new String(this.f111887a, 0, this.f111888b);
    }

    @Override // se.InterfaceC42743z0
    public void writeLong(long j) {
        mo6640c(String.valueOf(j));
    }
}
