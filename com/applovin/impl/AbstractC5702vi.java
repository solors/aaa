package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.C5434n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C20517nb;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.applovin.impl.vi */
/* loaded from: classes2.dex */
public abstract class AbstractC5702vi {

    /* renamed from: a */
    private static final byte[] f11493a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* renamed from: b */
    private static final byte[] f11494b;

    /* renamed from: com.applovin.impl.vi$a */
    /* loaded from: classes2.dex */
    public enum EnumC5703a {
        NONE(-1),
        DEFAULT(0),
        V2(1);
        

        /* renamed from: a */
        private final int f11499a;

        EnumC5703a(int i) {
            this.f11499a = i;
        }

        /* renamed from: b */
        public int m93872b() {
            return this.f11499a;
        }

        /* renamed from: a */
        public static EnumC5703a m93873a(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i == 1) {
                return V2;
            }
            return DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f11494b = bArr;
        System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    /* renamed from: a */
    private static String m93887a(String str, String str2, C5416j c5416j) {
        String[] split = str.split(":");
        char c = 0;
        try {
            if ("1".equals(split[0]) && split.length == 4) {
                String str3 = split[1];
                String str4 = split[2];
                byte[] m93880b = m93880b(split[3]);
                if (str2.endsWith(str4)) {
                    byte[] bArr = f11493a;
                    if (m93882a(bArr, c5416j).equals(str3)) {
                        char c2 = ' ';
                        byte[] m93886a = m93886a(str2.substring(0, 32), bArr, c5416j);
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m93880b);
                        char c3 = '\b';
                        long read = (((byteArrayInputStream.read() ^ m93886a[1]) & 255) << 8) | ((byteArrayInputStream.read() ^ m93886a[0]) & 255) | (((byteArrayInputStream.read() ^ m93886a[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ m93886a[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ m93886a[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ m93886a[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ m93886a[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ m93886a[7]) & 255) << 56);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[8];
                        int read2 = byteArrayInputStream.read(bArr2);
                        int i = 0;
                        while (read2 >= 0) {
                            ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                            long j = i + read;
                            long j2 = (j ^ (j >> 33)) * (-4417276706812531889L);
                            long j3 = (j2 ^ (j2 >> 29)) * (-8796714831421723037L);
                            long j4 = j3 ^ (j3 >> c2);
                            byteArrayOutputStream.write((byte) ((bArr2[c] ^ m93886a[i % m93886a.length]) ^ (j4 & 255)));
                            byteArrayOutputStream.write((byte) ((m93886a[(i + 1) % m93886a.length] ^ bArr2[1]) ^ ((j4 >> c3) & 255)));
                            byteArrayOutputStream.write((byte) ((m93886a[(i + 2) % m93886a.length] ^ bArr2[2]) ^ ((j4 >> 16) & 255)));
                            byteArrayOutputStream.write((byte) ((bArr2[3] ^ m93886a[(i + 3) % m93886a.length]) ^ ((j4 >> 24) & 255)));
                            byteArrayOutputStream.write((byte) ((m93886a[(i + 4) % m93886a.length] ^ bArr2[4]) ^ ((j4 >> 32) & 255)));
                            byteArrayOutputStream.write((byte) ((m93886a[(i + 5) % m93886a.length] ^ bArr2[5]) ^ ((j4 >> 40) & 255)));
                            byteArrayOutputStream.write((byte) ((m93886a[(i + 6) % m93886a.length] ^ bArr2[6]) ^ ((j4 >> 48) & 255)));
                            byteArrayOutputStream.write((byte) ((bArr2[7] ^ m93886a[(i + 7) % m93886a.length]) ^ ((j4 >> 56) & 255)));
                            i += 8;
                            byteArrayInputStream = byteArrayInputStream2;
                            read2 = byteArrayInputStream2.read(bArr2);
                            read = read;
                            c3 = '\b';
                            c = 0;
                            c2 = ' ';
                        }
                        return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                    }
                    return null;
                }
                return null;
            }
            return null;
        } catch (UnsupportedEncodingException e) {
            c5416j.m95196D().m97731a("AppLovinSdk", "decode", e);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            C5434n.m94906b("AppLovinSdk", "Failed to read bytes", e2);
            c5416j.m95196D().m97731a("AppLovinSdk", "decode", e2);
            return null;
        }
    }

    /* renamed from: b */
    public static String m93879b(String str, long j, EnumC5703a enumC5703a, String str2, C5416j c5416j) {
        byte[] m93889a;
        if (str2 != null) {
            if (str2.length() >= 86) {
                if (TextUtils.isEmpty(str) || EnumC5703a.NONE == enumC5703a) {
                    return str;
                }
                if (EnumC5703a.V2 == enumC5703a) {
                    m93889a = m93888a(str, j, true, str2, c5416j);
                } else {
                    m93889a = m93889a(str, j, str2, c5416j);
                }
                if (m93889a != null) {
                    return new String(m93889a);
                }
                return null;
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    /* renamed from: c */
    private static int m93875c(byte[] bArr, String str, C5416j c5416j) {
        int m93884a;
        int i;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (m93884a = m93884a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = m93882a(f11494b, c5416j).getBytes();
        int i2 = m93884a + 1;
        int length = bytes.length + i2;
        if (bArr.length > length && bArr[length] == 58 && bArr.length > (i = length + 55) && bArr[i] == 58 && Arrays.equals(Arrays.copyOfRange(bArr, i2, bytes.length + i2), bytes)) {
            int i3 = length + 56;
            if (length + 64 > bArr.length) {
                return 0;
            }
            return i3;
        }
        return 0;
    }

    /* renamed from: b */
    public static EnumC5703a m93878b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c = (char) bArr[0];
            if (c == '2') {
                return EnumC5703a.V2;
            }
            if (c == '{') {
                return EnumC5703a.NONE;
            }
            return EnumC5703a.DEFAULT;
        }
        return EnumC5703a.NONE;
    }

    /* renamed from: c */
    private static String m93876c(byte[] bArr) {
        return m93885a(Base64.encode(bArr, 2));
    }

    /* renamed from: b */
    public static String m93877b(byte[] bArr, String str, C5416j c5416j) {
        if (str != null) {
            if (str.length() >= 86) {
                if (bArr == null) {
                    return null;
                }
                if (bArr.length == 0) {
                    return "";
                }
                EnumC5703a m93878b = m93878b(bArr);
                if (EnumC5703a.NONE == m93878b) {
                    return new String(bArr);
                }
                if (m93878b == EnumC5703a.V2) {
                    return m93881a(bArr, str, c5416j);
                }
                return m93887a(new String(bArr), str, c5416j);
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    /* renamed from: b */
    private static byte[] m93880b(String str) {
        return Base64.decode(m93891a(str), 0);
    }

    /* renamed from: a */
    private static String m93891a(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', C20517nb.f52173T);
    }

    /* renamed from: a */
    private static String m93881a(byte[] bArr, String str, C5416j c5416j) {
        try {
            int m93875c = m93875c(bArr, str, c5416j);
            if (m93875c == 0) {
                return null;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, m93875c, bArr.length);
            if (copyOfRange.length < 16) {
                return null;
            }
            long m92664a = AbstractC5927yp.m92664a(copyOfRange, 8);
            byte[] m93886a = m93886a(str.substring(0, 32), f11494b, c5416j);
            return new String(AbstractC5927yp.m92637d(m93883a(Arrays.copyOfRange(copyOfRange, 16, copyOfRange.length), m92664a ^ AbstractC5927yp.m92643c(m93886a), m93886a)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            c5416j.m95196D().m97731a("AppLovinSdk", "decode2", e);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            C5434n.m94906b("AppLovinSdk", "Failed to ungzip decode", e2);
            c5416j.m95196D().m97731a("AppLovinSdk", "decode2", e2);
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m93889a(String str, long j, String str2, C5416j c5416j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c = ' ';
        try {
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] m93886a = m93886a(substring2, f11493a, c5416j);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j & 255)) ^ m93886a[0]);
            byteArrayOutputStream.write(((byte) ((j >> 8) & 255)) ^ m93886a[1]);
            byteArrayOutputStream.write(((byte) ((j >> 16) & 255)) ^ m93886a[2]);
            byteArrayOutputStream.write(((byte) ((j >> 24) & 255)) ^ m93886a[3]);
            byteArrayOutputStream.write(((byte) ((j >> 32) & 255)) ^ m93886a[4]);
            byteArrayOutputStream.write(((byte) ((j >> 40) & 255)) ^ m93886a[5]);
            byteArrayOutputStream.write(((byte) ((j >> 48) & 255)) ^ m93886a[6]);
            byteArrayOutputStream.write(((byte) ((j >> 56) & 255)) ^ m93886a[7]);
            int i8 = 0;
            while (i8 < bytes.length) {
                long j2 = j + i8;
                long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                long j5 = j4 ^ (j4 >> c);
                String str3 = substring;
                byteArrayOutputStream.write((byte) (((i8 >= bytes.length ? (byte) 0 : bytes[i8]) ^ m93886a[i8 % m93886a.length]) ^ (j5 & 255)));
                byteArrayOutputStream.write((byte) ((m93886a[i % m93886a.length] ^ (i8 + 1 >= bytes.length ? (byte) 0 : bytes[i])) ^ ((j5 >> 8) & 255)));
                byteArrayOutputStream.write((byte) ((m93886a[i2 % m93886a.length] ^ (i8 + 2 >= bytes.length ? (byte) 0 : bytes[i2])) ^ ((j5 >> 16) & 255)));
                byteArrayOutputStream.write((byte) ((m93886a[i3 % m93886a.length] ^ (i8 + 3 >= bytes.length ? (byte) 0 : bytes[i3])) ^ ((j5 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((m93886a[i4 % m93886a.length] ^ (i8 + 4 >= bytes.length ? (byte) 0 : bytes[i4])) ^ ((j5 >> 32) & 255)));
                byteArrayOutputStream.write((byte) ((m93886a[i5 % m93886a.length] ^ (i8 + 5 >= bytes.length ? (byte) 0 : bytes[i5])) ^ ((j5 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((m93886a[i6 % m93886a.length] ^ (i8 + 6 >= bytes.length ? (byte) 0 : bytes[i6])) ^ ((j5 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((m93886a[i7 % m93886a.length] ^ (i8 + 7 >= bytes.length ? (byte) 0 : bytes[i7])) ^ ((j5 >> 56) & 255)));
                i8 += 8;
                substring = str3;
                c = ' ';
            }
            String str4 = substring;
            String m93876c = m93876c(byteArrayOutputStream.toByteArray());
            return ("1:" + m93882a(f11493a, c5416j) + ":" + str4 + ":" + m93876c).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            c5416j.m95196D().m97731a("AppLovinSdk", "encode", e);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m93890a(String str, long j, EnumC5703a enumC5703a, String str2, C5416j c5416j) {
        if (str2 != null) {
            if (str2.length() >= 86) {
                if (TextUtils.isEmpty(str)) {
                    return new byte[0];
                }
                if (EnumC5703a.NONE == enumC5703a) {
                    return str.getBytes();
                }
                if (EnumC5703a.V2 == enumC5703a) {
                    return m93888a(str, j, false, str2, c5416j);
                }
                return m93889a(str, j, str2, c5416j);
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    /* renamed from: a */
    private static byte[] m93883a(byte[] bArr, long j, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        long j2 = j;
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i % 8;
            if (i2 == 0) {
                long j3 = i + j;
                long j4 = (j3 ^ (j3 >>> 33)) * (-4417276706812531889L);
                long j5 = (j4 ^ (j4 >>> 29)) * (-8796714831421723037L);
                j2 = j5 ^ (j5 >>> 32);
            }
            copyOf[i] = (byte) (copyOf[i] ^ (((j2 >> (i2 * 8)) & 255) ^ bArr2[i % bArr2.length]));
        }
        return copyOf;
    }

    /* renamed from: a */
    private static byte[] m93888a(String str, long j, boolean z, String str2, C5416j c5416j) {
        ByteBuffer allocate;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bArr = f11494b;
            byte[] m93886a = m93886a(substring2, bArr, c5416j);
            byte[] bytes2 = String.format("2:%s:%s:", m93882a(bArr, c5416j), substring).getBytes();
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.putLong(length);
            allocate2.putLong(AbstractC5927yp.m92643c(m93886a) ^ j);
            allocate2.flip();
            byte[] m93883a = m93883a(AbstractC5927yp.m92665a(bytes), j, m93886a);
            if (z) {
                byte[] bytes3 = m93876c(allocate2.array()).getBytes();
                byte[] bytes4 = m93876c(m93883a).getBytes();
                allocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                allocate.put(bytes2);
                allocate.put(bytes3);
                allocate.put(bytes4);
            } else {
                allocate = ByteBuffer.allocate(bytes2.length + allocate2.remaining() + m93883a.length);
                allocate.put(bytes2);
                allocate.put(allocate2);
                allocate.put(m93883a);
            }
            allocate.flip();
            return allocate.array();
        } catch (UnsupportedEncodingException e) {
            c5416j.m95196D().m97731a("AppLovinSdk", "encode2", e);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            c5416j.m95196D().m97731a("AppLovinSdk", "encode2", e2);
            return null;
        }
    }

    /* renamed from: a */
    private static int m93884a(byte[] bArr, byte b) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == b) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static byte[] m93886a(String str, byte[] bArr, C5416j c5416j) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            c5416j.m95196D().m97731a("AppLovinSdk", "SHA256", e);
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }

    /* renamed from: a */
    private static String m93882a(byte[] bArr, C5416j c5416j) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            c5416j.m95196D().m97731a("AppLovinSdk", "SHA1", e);
            throw new RuntimeException("SHA-1 algorithm not found", e);
        }
    }

    /* renamed from: a */
    private static String m93885a(byte[] bArr) {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace(C20517nb.f52173T, '*');
    }
}
