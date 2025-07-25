package com.google.zxing.qrcode.decoder;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.StringUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes5.dex */
final class DecodedBitStreamParser {

    /* renamed from: a */
    private static final char[] f44688a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: com.google.zxing.qrcode.decoder.DecodedBitStreamParser$1 */
    /* loaded from: classes5.dex */
    static /* synthetic */ class C177261 {

        /* renamed from: a */
        static final /* synthetic */ int[] f44689a;

        static {
            int[] iArr = new int[Mode.values().length];
            f44689a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44689a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44689a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44689a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44689a[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44689a[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44689a[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44689a[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44689a[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44689a[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private DecodedBitStreamParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static DecoderResult m65560a(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        Mode forBits;
        Mode mode;
        ArrayList arrayList;
        String obj;
        BitSource bitSource = new BitSource(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        boolean z = true;
        ArrayList arrayList2 = new ArrayList(1);
        int i = -1;
        int i2 = -1;
        boolean z2 = false;
        CharacterSetECI characterSetECI = null;
        while (true) {
            try {
                if (bitSource.available() < 4) {
                    forBits = Mode.TERMINATOR;
                } else {
                    forBits = Mode.forBits(bitSource.readBits(4));
                }
                Mode mode2 = forBits;
                int[] iArr = C177261.f44689a;
                switch (iArr[mode2.ordinal()]) {
                    case 5:
                        mode = mode2;
                        break;
                    case 6:
                    case 7:
                        z2 = z;
                        mode = mode2;
                        break;
                    case 8:
                        if (bitSource.available() >= 16) {
                            int readBits = bitSource.readBits(8);
                            i2 = bitSource.readBits(8);
                            i = readBits;
                            mode = mode2;
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    case 9:
                        characterSetECI = CharacterSetECI.getCharacterSetECIByValue(m65554g(bitSource));
                        if (characterSetECI == null) {
                            throw FormatException.getFormatInstance();
                        }
                        mode = mode2;
                        break;
                    case 10:
                        int readBits2 = bitSource.readBits(4);
                        int readBits3 = bitSource.readBits(mode2.getCharacterCountBits(version));
                        if (readBits2 == z) {
                            m65557d(bitSource, sb2, readBits3);
                        }
                        mode = mode2;
                        break;
                    default:
                        int readBits4 = bitSource.readBits(mode2.getCharacterCountBits(version));
                        int i3 = iArr[mode2.ordinal()];
                        if (i3 != z) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 == 4) {
                                        m65556e(bitSource, sb2, readBits4);
                                        mode = mode2;
                                        break;
                                    } else {
                                        throw FormatException.getFormatInstance();
                                    }
                                } else {
                                    mode = mode2;
                                    m65558c(bitSource, sb2, readBits4, characterSetECI, arrayList2, map);
                                    break;
                                }
                            } else {
                                mode = mode2;
                                m65559b(bitSource, sb2, readBits4, z2);
                                break;
                            }
                        } else {
                            mode = mode2;
                            m65555f(bitSource, sb2, readBits4);
                            break;
                        }
                }
                if (mode == Mode.TERMINATOR) {
                    String sb3 = sb2.toString();
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    if (errorCorrectionLevel == null) {
                        obj = null;
                    } else {
                        obj = errorCorrectionLevel.toString();
                    }
                    return new DecoderResult(bArr, sb3, arrayList, obj, i, i2);
                }
                z = true;
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        }
    }

    /* renamed from: b */
    private static void m65559b(BitSource bitSource, StringBuilder sb2, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (bitSource.available() >= 11) {
                int readBits = bitSource.readBits(11);
                sb2.append(m65553h(readBits / 45));
                sb2.append(m65553h(readBits % 45));
                i -= 2;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i == 1) {
            if (bitSource.available() >= 6) {
                sb2.append(m65553h(bitSource.readBits(6)));
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (z) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i2 = length + 1;
                        if (sb2.charAt(i2) == '%') {
                            sb2.deleteCharAt(i2);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m65558c(BitSource bitSource, StringBuilder sb2, int i, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        String name;
        if ((i << 3) <= bitSource.available()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) bitSource.readBits(8);
            }
            if (characterSetECI == null) {
                name = StringUtils.guessEncoding(bArr, map);
            } else {
                name = characterSetECI.name();
            }
            try {
                sb2.append(new String(bArr, name));
                collection.add(bArr);
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.getFormatInstance();
            }
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: d */
    private static void m65557d(BitSource bitSource, StringBuilder sb2, int i) throws FormatException {
        int i2;
        if (i * 13 <= bitSource.available()) {
            byte[] bArr = new byte[i * 2];
            int i3 = 0;
            while (i > 0) {
                int readBits = bitSource.readBits(13);
                int i4 = (readBits % 96) | ((readBits / 96) << 8);
                if (i4 < 959) {
                    i2 = 41377;
                } else {
                    i2 = 42657;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb2.append(new String(bArr, StringUtils.GB2312));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.getFormatInstance();
            }
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: e */
    private static void m65556e(BitSource bitSource, StringBuilder sb2, int i) throws FormatException {
        int i2;
        if (i * 13 <= bitSource.available()) {
            byte[] bArr = new byte[i * 2];
            int i3 = 0;
            while (i > 0) {
                int readBits = bitSource.readBits(13);
                int i4 = (readBits % 192) | ((readBits / 192) << 8);
                if (i4 < 7936) {
                    i2 = 33088;
                } else {
                    i2 = 49472;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb2.append(new String(bArr, StringUtils.SHIFT_JIS));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.getFormatInstance();
            }
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: f */
    private static void m65555f(BitSource bitSource, StringBuilder sb2, int i) throws FormatException {
        while (i >= 3) {
            if (bitSource.available() >= 10) {
                int readBits = bitSource.readBits(10);
                if (readBits < 1000) {
                    sb2.append(m65553h(readBits / 100));
                    sb2.append(m65553h((readBits / 10) % 10));
                    sb2.append(m65553h(readBits % 10));
                    i -= 3;
                } else {
                    throw FormatException.getFormatInstance();
                }
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i == 2) {
            if (bitSource.available() >= 7) {
                int readBits2 = bitSource.readBits(7);
                if (readBits2 < 100) {
                    sb2.append(m65553h(readBits2 / 10));
                    sb2.append(m65553h(readBits2 % 10));
                    return;
                }
                throw FormatException.getFormatInstance();
            }
            throw FormatException.getFormatInstance();
        } else if (i == 1) {
            if (bitSource.available() >= 4) {
                int readBits3 = bitSource.readBits(4);
                if (readBits3 < 10) {
                    sb2.append(m65553h(readBits3));
                    return;
                }
                throw FormatException.getFormatInstance();
            }
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: g */
    private static int m65554g(BitSource bitSource) throws FormatException {
        int readBits = bitSource.readBits(8);
        if ((readBits & 128) == 0) {
            return readBits & 127;
        }
        if ((readBits & 192) == 128) {
            return bitSource.readBits(8) | ((readBits & 63) << 8);
        }
        if ((readBits & 224) == 192) {
            return bitSource.readBits(16) | ((readBits & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: h */
    private static char m65553h(int i) throws FormatException {
        char[] cArr = f44688a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.getFormatInstance();
    }
}
