package okio;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p822of.ByteString;

/* compiled from: ByteString.kt */
@Metadata
/* renamed from: okio.h */
/* loaded from: classes10.dex */
public class C39208h implements Serializable, Comparable<C39208h> {
    @NotNull

    /* renamed from: f */
    public static final C39209a f102952f = new C39209a(null);
    @NotNull

    /* renamed from: g */
    public static final C39208h f102953g = new C39208h(new byte[0]);
    @NotNull

    /* renamed from: b */
    private final byte[] f102954b;

    /* renamed from: c */
    private transient int f102955c;
    @Nullable

    /* renamed from: d */
    private transient String f102956d;

    /* compiled from: ByteString.kt */
    @Metadata
    /* renamed from: okio.h$a */
    /* loaded from: classes10.dex */
    public static final class C39209a {
        private C39209a() {
        }

        public /* synthetic */ C39209a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: g */
        public static /* synthetic */ C39208h m13544g(C39209a c39209a, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = C39189b.m13632c();
            }
            return c39209a.m13545f(bArr, i, i2);
        }

        @Nullable
        /* renamed from: a */
        public final C39208h m13550a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] m13638a = C39187a.m13638a(str);
            if (m13638a != null) {
                return new C39208h(m13638a);
            }
            return null;
        }

        @NotNull
        /* renamed from: b */
        public final C39208h m13549b(@NotNull String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((ByteString.m13715b(str.charAt(i2)) << 4) + ByteString.m13715b(str.charAt(i2 + 1)));
                }
                return new C39208h(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        @NotNull
        /* renamed from: c */
        public final C39208h m13548c(@NotNull String str, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return new C39208h(bytes);
        }

        @NotNull
        /* renamed from: d */
        public final C39208h m13547d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            C39208h c39208h = new C39208h(C39206f1.m13575a(str));
            c39208h.m13551z(str);
            return c39208h;
        }

        @NotNull
        /* renamed from: e */
        public final C39208h m13546e(@NotNull byte... data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            return new C39208h(copyOf);
        }

        @NotNull
        /* renamed from: f */
        public final C39208h m13545f(@NotNull byte[] bArr, int i, int i2) {
            byte[] m17388q;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int m13630e = C39189b.m13630e(bArr, i2);
            C39189b.m13633b(bArr.length, i, m13630e);
            m17388q = _ArraysJvm.m17388q(bArr, i, m13630e + i);
            return new C39208h(m17388q);
        }

        @NotNull
        /* renamed from: h */
        public final C39208h m13543h(@NotNull InputStream inputStream, int i) throws IOException {
            boolean z;
            Intrinsics.checkNotNullParameter(inputStream, "<this>");
            int i2 = 0;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new C39208h(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
        }
    }

    public C39208h(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f102954b = data;
    }

    /* renamed from: F */
    public static /* synthetic */ C39208h m13567F(C39208h c39208h, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = C39189b.m13632c();
            }
            return c39208h.mo13405E(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    @NotNull
    /* renamed from: e */
    public static final C39208h m13564e(@NotNull String str) {
        return f102952f.m13547d(str);
    }

    /* renamed from: o */
    public static /* synthetic */ int m13557o(C39208h c39208h, C39208h c39208h2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return c39208h.m13558m(c39208h2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        C39208h m13543h = f102952f.m13543h(objectInputStream, objectInputStream.readInt());
        Field declaredField = C39208h.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, m13543h.f102954b);
    }

    /* renamed from: t */
    public static /* synthetic */ int m13555t(C39208h c39208h, C39208h c39208h2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = C39189b.m13632c();
            }
            return c39208h.m13556r(c39208h2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    @NotNull
    /* renamed from: v */
    public static final C39208h m13553v(@NotNull byte... bArr) {
        return f102952f.m13546e(bArr);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f102954b.length);
        objectOutputStream.write(this.f102954b);
    }

    @NotNull
    /* renamed from: A */
    public final C39208h m13571A() {
        return mo13397d(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    @NotNull
    /* renamed from: B */
    public final C39208h m13570B() {
        return mo13397d("SHA-256");
    }

    /* renamed from: C */
    public final int m13569C() {
        return mo13396j();
    }

    /* renamed from: D */
    public final boolean m13568D(@NotNull C39208h prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return mo13390w(0, prefix, 0, prefix.m13569C());
    }

    @NotNull
    /* renamed from: E */
    public C39208h mo13405E(int i, int i2) {
        boolean z;
        boolean z2;
        byte[] m17388q;
        int m13631d = C39189b.m13631d(this, i2);
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (m13631d <= m13561h().length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (m13631d - i < 0) {
                    z3 = false;
                }
                if (z3) {
                    if (i != 0 || m13631d != m13561h().length) {
                        m17388q = _ArraysJvm.m17388q(m13561h(), i, m13631d);
                        return new C39208h(m17388q);
                    }
                    return this;
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + m13561h().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    @NotNull
    /* renamed from: G */
    public C39208h mo13404G() {
        for (int i = 0; i < m13561h().length; i++) {
            byte b = m13561h()[i];
            if (b >= 65 && b <= 90) {
                byte[] m13561h = m13561h();
                byte[] copyOf = Arrays.copyOf(m13561h, m13561h.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C39208h(copyOf);
            }
        }
        return this;
    }

    @NotNull
    /* renamed from: H */
    public String m13566H() {
        String m13559k = m13559k();
        if (m13559k == null) {
            String m13573c = C39206f1.m13573c(mo13393p());
            m13551z(m13573c);
            return m13573c;
        }
        return m13559k;
    }

    /* renamed from: I */
    public void mo13403I(@NotNull C39200e buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ByteString.m13713d(this, buffer, i, i2);
    }

    @NotNull
    /* renamed from: b */
    public String mo13398b() {
        return C39187a.m13636c(m13561h(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L12;
     */
    @Override // java.lang.Comparable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(@org.jetbrains.annotations.NotNull okio.C39208h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.m13569C()
            int r1 = r10.m13569C()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.m13562g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m13562g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C39208h.compareTo(okio.h):int");
    }

    @NotNull
    /* renamed from: d */
    public C39208h mo13397d(@NotNull String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f102954b, 0, m13569C());
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new C39208h(digestBytes);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39208h) {
            C39208h c39208h = (C39208h) obj;
            if (c39208h.m13569C() == m13561h().length && c39208h.mo13389x(0, m13561h(), 0, m13561h().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m13563f(@NotNull C39208h suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return mo13390w(m13569C() - suffix.m13569C(), suffix, 0, suffix.m13569C());
    }

    /* renamed from: g */
    public final byte m13562g(int i) {
        return mo13392q(i);
    }

    @NotNull
    /* renamed from: h */
    public final byte[] m13561h() {
        return this.f102954b;
    }

    public int hashCode() {
        int m13560i = m13560i();
        if (m13560i == 0) {
            int hashCode = Arrays.hashCode(m13561h());
            m13552y(hashCode);
            return hashCode;
        }
        return m13560i;
    }

    /* renamed from: i */
    public final int m13560i() {
        return this.f102955c;
    }

    /* renamed from: j */
    public int mo13396j() {
        return m13561h().length;
    }

    @Nullable
    /* renamed from: k */
    public final String m13559k() {
        return this.f102956d;
    }

    @NotNull
    /* renamed from: l */
    public String mo13395l() {
        byte[] m13561h;
        String m16621s;
        char[] cArr = new char[m13561h().length * 2];
        int i = 0;
        for (byte b : m13561h()) {
            int i2 = i + 1;
            cArr[i] = ByteString.m13711f()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = ByteString.m13711f()[b & 15];
        }
        m16621s = StringsJVM.m16621s(cArr);
        return m16621s;
    }

    /* renamed from: m */
    public final int m13558m(@NotNull C39208h other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        return mo13394n(other.mo13393p(), i);
    }

    /* renamed from: n */
    public int mo13394n(@NotNull byte[] other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = m13561h().length - other.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!C39189b.m13634a(m13561h(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    @NotNull
    /* renamed from: p */
    public byte[] mo13393p() {
        return m13561h();
    }

    /* renamed from: q */
    public byte mo13392q(int i) {
        return m13561h()[i];
    }

    /* renamed from: r */
    public final int m13556r(@NotNull C39208h other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        return mo13391s(other.mo13393p(), i);
    }

    /* renamed from: s */
    public int mo13391s(@NotNull byte[] other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int min = Math.min(C39189b.m13631d(this, i), m13561h().length - other.length); -1 < min; min--) {
            if (C39189b.m13634a(m13561h(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    @NotNull
    public String toString() {
        boolean z;
        String m16628I;
        String m16628I2;
        String m16628I3;
        boolean z2;
        C39208h c39208h;
        byte[] m17388q;
        String str;
        boolean z3 = true;
        if (m13561h().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "[size=0]";
        } else {
            int m13716a = ByteString.m13716a(m13561h(), 64);
            if (m13716a == -1) {
                if (m13561h().length <= 64) {
                    str = "[hex=" + mo13395l() + ']';
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[size=");
                    sb2.append(m13561h().length);
                    sb2.append(" hex=");
                    int m13631d = C39189b.m13631d(this, 64);
                    if (m13631d <= m13561h().length) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (m13631d + 0 < 0) {
                            z3 = false;
                        }
                        if (z3) {
                            if (m13631d != m13561h().length) {
                                m17388q = _ArraysJvm.m17388q(m13561h(), 0, m13631d);
                                c39208h = new C39208h(m17388q);
                            } else {
                                c39208h = this;
                            }
                            sb2.append(c39208h.mo13395l());
                            sb2.append("…]");
                            return sb2.toString();
                        }
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    throw new IllegalArgumentException(("endIndex > length(" + m13561h().length + ')').toString());
                }
            } else {
                String m13566H = m13566H();
                String substring = m13566H.substring(0, m13716a);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                m16628I = StringsJVM.m16628I(substring, "\\", "\\\\", false, 4, null);
                m16628I2 = StringsJVM.m16628I(m16628I, "\n", "\\n", false, 4, null);
                m16628I3 = StringsJVM.m16628I(m16628I2, "\r", "\\r", false, 4, null);
                if (m13716a < m13566H.length()) {
                    return "[size=" + m13561h().length + " text=" + m16628I3 + "…]";
                }
                return "[text=" + m16628I3 + ']';
            }
        }
        return str;
    }

    @NotNull
    /* renamed from: u */
    public final C39208h m13554u() {
        return mo13397d(SameMD5.TAG);
    }

    /* renamed from: w */
    public boolean mo13390w(int i, @NotNull C39208h other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.mo13389x(i2, m13561h(), i, i3);
    }

    /* renamed from: x */
    public boolean mo13389x(int i, @NotNull byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i >= 0 && i <= m13561h().length - i3 && i2 >= 0 && i2 <= other.length - i3 && C39189b.m13634a(m13561h(), i, other, i2, i3)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final void m13552y(int i) {
        this.f102955c = i;
    }

    /* renamed from: z */
    public final void m13551z(@Nullable String str) {
        this.f102956d = str;
    }
}
