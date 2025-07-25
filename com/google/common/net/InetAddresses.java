package com.google.common.net;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.hash.Hashing;
import com.google.common.p384io.ByteStreams;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C21114v8;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class InetAddresses {

    /* renamed from: a */
    private static final CharMatcher f41389a = CharMatcher.m70091is('.');

    /* renamed from: b */
    private static final CharMatcher f41390b = CharMatcher.m70091is(':');

    /* renamed from: c */
    private static final Inet4Address f41391c = (Inet4Address) forString("127.0.0.1");

    /* renamed from: d */
    private static final Inet4Address f41392d = (Inet4Address) forString("0.0.0.0");

    /* loaded from: classes4.dex */
    public static final class TeredoInfo {

        /* renamed from: a */
        private final Inet4Address f41393a;

        /* renamed from: b */
        private final Inet4Address f41394b;

        /* renamed from: c */
        private final int f41395c;

        /* renamed from: d */
        private final int f41396d;

        public TeredoInfo(Inet4Address inet4Address, Inet4Address inet4Address2, int i, int i2) {
            boolean z;
            boolean z2 = true;
            if (i >= 0 && i <= 65535) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "port '%s' is out of range (0 <= port <= 0xffff)", i);
            Preconditions.checkArgument((i2 < 0 || i2 > 65535) ? false : z2, "flags '%s' is out of range (0 <= flags <= 0xffff)", i2);
            this.f41393a = (Inet4Address) MoreObjects.firstNonNull(inet4Address, InetAddresses.f41392d);
            this.f41394b = (Inet4Address) MoreObjects.firstNonNull(inet4Address2, InetAddresses.f41392d);
            this.f41395c = i;
            this.f41396d = i2;
        }

        public Inet4Address getClient() {
            return this.f41394b;
        }

        public int getFlags() {
            return this.f41396d;
        }

        public int getPort() {
            return this.f41395c;
        }

        public Inet4Address getServer() {
            return this.f41393a;
        }
    }

    private InetAddresses() {
    }

    /* renamed from: b */
    private static InetAddress m68112b(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    private static void m68111c(int[] iArr) {
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < iArr.length + 1; i4++) {
            if (i4 < iArr.length && iArr[i4] == 0) {
                if (i3 < 0) {
                    i3 = i4;
                }
            } else if (i3 >= 0) {
                int i5 = i4 - i3;
                if (i5 > i) {
                    i2 = i3;
                    i = i5;
                }
                i3 = -1;
            }
        }
        if (i >= 2) {
            Arrays.fill(iArr, i2, i + i2, -1);
        }
    }

    public static int coerceToInteger(InetAddress inetAddress) {
        return ByteStreams.newDataInput(getCoercedIPv4Address(inetAddress).getAddress()).readInt();
    }

    /* renamed from: d */
    private static String m68110d(String str) {
        int lastIndexOf = str.lastIndexOf(58) + 1;
        String substring = str.substring(0, lastIndexOf);
        byte[] m68101m = m68101m(str.substring(lastIndexOf));
        if (m68101m == null) {
            return null;
        }
        String hexString = Integer.toHexString(((m68101m[0] & 255) << 8) | (m68101m[1] & 255));
        String hexString2 = Integer.toHexString((m68101m[3] & 255) | ((m68101m[2] & 255) << 8));
        StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(hexString).length() + String.valueOf(hexString2).length());
        sb2.append(substring);
        sb2.append(hexString);
        sb2.append(":");
        sb2.append(hexString2);
        return sb2.toString();
    }

    public static InetAddress decrement(InetAddress inetAddress) {
        boolean z;
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == 0) {
            address[length] = -1;
            length--;
        }
        if (length >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Decrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] - 1);
        return m68112b(address);
    }

    /* renamed from: e */
    private static InetAddress m68109e(String str) {
        int i;
        Preconditions.checkNotNull(str);
        if (str.startsWith(C21114v8.C21123i.f54137d) && str.endsWith(C21114v8.C21123i.f54139e)) {
            str = str.substring(1, str.length() - 1);
            i = 16;
        } else {
            i = 4;
        }
        byte[] m68104j = m68104j(str);
        if (m68104j != null && m68104j.length == i) {
            return m68112b(m68104j);
        }
        return null;
    }

    /* renamed from: f */
    private static IllegalArgumentException m68108f(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    @CanIgnoreReturnValue
    public static InetAddress forString(String str) {
        byte[] m68104j = m68104j(str);
        if (m68104j != null) {
            return m68112b(m68104j);
        }
        throw m68108f("'%s' is not an IP string literal.", str);
    }

    public static InetAddress forUriString(String str) {
        InetAddress m68109e = m68109e(str);
        if (m68109e != null) {
            return m68109e;
        }
        throw m68108f("Not a valid URI IP literal: '%s'", str);
    }

    public static Inet4Address fromIPv4BigInteger(BigInteger bigInteger) {
        return (Inet4Address) m68107g(bigInteger, false);
    }

    public static Inet6Address fromIPv6BigInteger(BigInteger bigInteger) {
        return (Inet6Address) m68107g(bigInteger, true);
    }

    public static Inet4Address fromInteger(int i) {
        return m68106h(Ints.toByteArray(i));
    }

    public static InetAddress fromLittleEndianByteArray(byte[] bArr) throws UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }

    /* renamed from: g */
    private static InetAddress m68107g(BigInteger bigInteger, boolean z) {
        boolean z2;
        int i;
        if (bigInteger.signum() >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "BigInteger must be greater than or equal to 0");
        if (z) {
            i = 16;
        } else {
            i = 4;
        }
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i];
        int max = Math.max(0, byteArray.length - i);
        int length = byteArray.length - max;
        int i2 = i - length;
        for (int i3 = 0; i3 < max; i3++) {
            if (byteArray[i3] != 0) {
                throw m68108f("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i), bigInteger);
            }
        }
        System.arraycopy(byteArray, max, bArr, i2, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(is6to4Address(inet6Address), "Address '%s' is not a 6to4 address.", toAddrString(inet6Address));
        return m68106h(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress inetAddress) {
        boolean z;
        long j;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i = 0;
        while (true) {
            if (i < 15) {
                if (address[i] != 0) {
                    z = false;
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z && address[15] == 1) {
            return f41391c;
        }
        if (z && address[15] == 0) {
            return f41392d;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        if (hasEmbeddedIPv4ClientAddress(inet6Address)) {
            j = getEmbeddedIPv4ClientAddress(inet6Address).hashCode();
        } else {
            j = ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong();
        }
        int asInt = Hashing.murmur3_32_fixed().hashLong(j).asInt() | (-536870912);
        if (asInt == -1) {
            asInt = -2;
        }
        return m68106h(Ints.toByteArray(asInt));
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isCompatIPv4Address(inet6Address), "Address '%s' is not IPv4-compatible.", toAddrString(inet6Address));
        return m68106h(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        if (isCompatIPv4Address(inet6Address)) {
            return getCompatIPv4Address(inet6Address);
        }
        if (is6to4Address(inet6Address)) {
            return get6to4IPv4Address(inet6Address);
        }
        if (isTeredoAddress(inet6Address)) {
            return getTeredoInfo(inet6Address).getClient();
        }
        throw m68108f("'%s' has no embedded IPv4 address.", toAddrString(inet6Address));
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isIsatapAddress(inet6Address), "Address '%s' is not an ISATAP address.", toAddrString(inet6Address));
        return m68106h(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static TeredoInfo getTeredoInfo(Inet6Address inet6Address) {
        Preconditions.checkArgument(isTeredoAddress(inet6Address), "Address '%s' is not a Teredo address.", toAddrString(inet6Address));
        byte[] address = inet6Address.getAddress();
        Inet4Address m68106h = m68106h(Arrays.copyOfRange(address, 4, 8));
        int readShort = ByteStreams.newDataInput(address, 8).readShort() & 65535;
        int i = 65535 & (~ByteStreams.newDataInput(address, 10).readShort());
        byte[] copyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i2 = 0; i2 < copyOfRange.length; i2++) {
            copyOfRange[i2] = (byte) (~copyOfRange[i2]);
        }
        return new TeredoInfo(m68106h, m68106h(copyOfRange), i, readShort);
    }

    /* renamed from: h */
    private static Inet4Address m68106h(byte[] bArr) {
        boolean z;
        if (bArr.length == 4) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Byte array has invalid length for an IPv4 address: %s != 4.", bArr.length);
        return (Inet4Address) m68112b(bArr);
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        if (!isCompatIPv4Address(inet6Address) && !is6to4Address(inet6Address) && !isTeredoAddress(inet6Address)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static String m68105i(int[] iArr) {
        boolean z;
        StringBuilder sb2 = new StringBuilder(39);
        int i = 0;
        boolean z2 = false;
        while (i < iArr.length) {
            if (iArr[i] >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (z2) {
                    sb2.append(':');
                }
                sb2.append(Integer.toHexString(iArr[i]));
            } else if (i == 0 || z2) {
                sb2.append("::");
            }
            i++;
            z2 = z;
        }
        return sb2.toString();
    }

    public static InetAddress increment(InetAddress inetAddress) {
        boolean z;
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (true) {
            z = false;
            if (length < 0 || address[length] != -1) {
                break;
            }
            address[length] = 0;
            length--;
        }
        if (length >= 0) {
            z = true;
        }
        Preconditions.checkArgument(z, "Incrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] + 1);
        return m68112b(address);
    }

    public static boolean is6to4Address(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        if (address[0] != 32 || address[1] != 2) {
            return false;
        }
        return true;
    }

    public static boolean isCompatIPv4Address(Inet6Address inet6Address) {
        byte b;
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        if (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b = address[15]) == 0 || b == 1)) {
            return false;
        }
        return true;
    }

    public static boolean isInetAddress(String str) {
        if (m68104j(str) != null) {
            return true;
        }
        return false;
    }

    public static boolean isIsatapAddress(Inet6Address inet6Address) {
        if (isTeredoAddress(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        if ((address[8] | 3) != 3 || address[9] != 0 || address[10] != 94 || address[11] != -2) {
            return false;
        }
        return true;
    }

    public static boolean isMappedIPv4Address(String str) {
        byte[] m68104j = m68104j(str);
        if (m68104j == null || m68104j.length != 16) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i < 10) {
                if (m68104j[i] != 0) {
                    return false;
                }
                i++;
            } else {
                for (int i2 = 10; i2 < 12; i2++) {
                    if (m68104j[i2] != -1) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static boolean isMaximum(InetAddress inetAddress) {
        for (byte b : inetAddress.getAddress()) {
            if (b != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTeredoAddress(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        if (address[0] != 32 || address[1] != 1 || address[2] != 0 || address[3] != 0) {
            return false;
        }
        return true;
    }

    public static boolean isUriInetAddress(String str) {
        if (m68109e(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (r3 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
        r9 = m68110d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (r9 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
        if (r1 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
        return m68100n(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
        if (r2 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (r1 == (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
        return m68101m(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
        return null;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m68104j(java.lang.String r9) {
        /*
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r9.length()
            r5 = 0
            r6 = -1
            if (r1 >= r4) goto L31
            char r4 = r9.charAt(r1)
            r7 = 46
            r8 = 1
            if (r4 != r7) goto L17
            r2 = r8
            goto L2e
        L17:
            r7 = 58
            if (r4 != r7) goto L20
            if (r2 == 0) goto L1e
            return r5
        L1e:
            r3 = r8
            goto L2e
        L20:
            r7 = 37
            if (r4 != r7) goto L25
            goto L32
        L25:
            r7 = 16
            int r4 = java.lang.Character.digit(r4, r7)
            if (r4 != r6) goto L2e
            return r5
        L2e:
            int r1 = r1 + 1
            goto L4
        L31:
            r1 = r6
        L32:
            if (r3 == 0) goto L48
            if (r2 == 0) goto L3d
            java.lang.String r9 = m68110d(r9)
            if (r9 != 0) goto L3d
            return r5
        L3d:
            if (r1 == r6) goto L43
            java.lang.String r9 = r9.substring(r0, r1)
        L43:
            byte[] r9 = m68100n(r9)
            return r9
        L48:
            if (r2 == 0) goto L52
            if (r1 == r6) goto L4d
            return r5
        L4d:
            byte[] r9 = m68101m(r9)
            return r9
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.InetAddresses.m68104j(java.lang.String):byte[]");
    }

    /* renamed from: k */
    private static short m68103k(String str, int i, int i2) {
        int i3 = i2 - i;
        if (i3 > 0 && i3 <= 4) {
            int i4 = 0;
            while (i < i2) {
                i4 = (i4 << 4) | Character.digit(str.charAt(i), 16);
                i++;
            }
            return (short) i4;
        }
        throw new NumberFormatException();
    }

    /* renamed from: l */
    private static byte m68102l(String str, int i, int i2) {
        int i3 = i2 - i;
        if (i3 > 0 && i3 <= 3) {
            if (i3 > 1 && str.charAt(i) == '0') {
                throw new NumberFormatException();
            }
            int i4 = 0;
            while (i < i2) {
                int i5 = i4 * 10;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i4 = i5 + digit;
                    i++;
                } else {
                    throw new NumberFormatException();
                }
            }
            if (i4 <= 255) {
                return (byte) i4;
            }
            throw new NumberFormatException();
        }
        throw new NumberFormatException();
    }

    /* renamed from: m */
    private static byte[] m68101m(String str) {
        if (f41389a.countIn(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int indexOf = str.indexOf(46, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                bArr[i2] = m68102l(str, i, indexOf);
                i = indexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    /* renamed from: n */
    private static byte[] m68100n(String str) {
        int countIn = f41390b.countIn(str);
        if (countIn >= 2 && countIn <= 8) {
            int i = 1;
            int i2 = countIn + 1;
            int i3 = 8 - i2;
            boolean z = false;
            for (int i4 = 0; i4 < str.length() - 1; i4++) {
                if (str.charAt(i4) == ':' && str.charAt(i4 + 1) == ':') {
                    if (z) {
                        return null;
                    }
                    i3++;
                    if (i4 == 0) {
                        i3++;
                    }
                    if (i4 == str.length() - 2) {
                        i3++;
                    }
                    z = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z && i3 <= 0) {
                return null;
            }
            if (!z && i2 != 8) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i = 0;
                }
                while (i < str.length()) {
                    int indexOf = str.indexOf(58, i);
                    if (indexOf == -1) {
                        indexOf = str.length();
                    }
                    if (str.charAt(i) == ':') {
                        for (int i5 = 0; i5 < i3; i5++) {
                            allocate.putShort((short) 0);
                        }
                    } else {
                        allocate.putShort(m68103k(str, i, indexOf));
                    }
                    i = indexOf + 1;
                }
                return allocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String toAddrString(InetAddress inetAddress) {
        Preconditions.checkNotNull(inetAddress);
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        Preconditions.checkArgument(inetAddress instanceof Inet6Address);
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            int i2 = i * 2;
            iArr[i] = Ints.fromBytes((byte) 0, (byte) 0, address[i2], address[i2 + 1]);
        }
        m68111c(iArr);
        return m68105i(iArr);
    }

    public static BigInteger toBigInteger(InetAddress inetAddress) {
        return new BigInteger(1, inetAddress.getAddress());
    }

    public static String toUriString(InetAddress inetAddress) {
        if (inetAddress instanceof Inet6Address) {
            String addrString = toAddrString(inetAddress);
            StringBuilder sb2 = new StringBuilder(String.valueOf(addrString).length() + 2);
            sb2.append(C21114v8.C21123i.f54137d);
            sb2.append(addrString);
            sb2.append(C21114v8.C21123i.f54139e);
            return sb2.toString();
        }
        return toAddrString(inetAddress);
    }
}
