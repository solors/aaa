package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import com.ironsource.C20517nb;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes5.dex */
final class DecodedBitStreamParser {

    /* renamed from: a */
    private static final char[] f44407a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b */
    private static final char[] f44408b;

    /* renamed from: c */
    private static final char[] f44409c;

    /* renamed from: d */
    private static final char[] f44410d;

    /* renamed from: e */
    private static final char[] f44411e;

    /* renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1 */
    /* loaded from: classes5.dex */
    static /* synthetic */ class C177111 {

        /* renamed from: a */
        static final /* synthetic */ int[] f44412a;

        static {
            int[] iArr = new int[Mode.values().length];
            f44412a = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44412a[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44412a[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44412a[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44412a[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', C20517nb.f52173T, '>', '?', '@', '[', '\\', ']', '^', '_'};
        f44408b = cArr;
        f44409c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        f44410d = cArr;
        f44411e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};
    }

    private DecodedBitStreamParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static DecoderResult m65972a(byte[] bArr) throws FormatException {
        BitSource bitSource = new BitSource(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        Mode mode = Mode.ASCII_ENCODE;
        do {
            Mode mode2 = Mode.ASCII_ENCODE;
            if (mode == mode2) {
                mode = m65970c(bitSource, sb2, sb3);
            } else {
                int i = C177111.f44412a[mode.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    m65969d(bitSource, sb2, arrayList);
                                } else {
                                    throw FormatException.getFormatInstance();
                                }
                            } else {
                                m65967f(bitSource, sb2);
                            }
                        } else {
                            m65971b(bitSource, sb2);
                        }
                    } else {
                        m65966g(bitSource, sb2);
                    }
                } else {
                    m65968e(bitSource, sb2);
                }
                mode = mode2;
            }
            if (mode == Mode.PAD_ENCODE) {
                break;
            }
        } while (bitSource.available() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        String sb4 = sb2.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new DecoderResult(bArr, sb4, arrayList, null);
    }

    /* renamed from: b */
    private static void m65971b(BitSource bitSource, StringBuilder sb2) throws FormatException {
        int readBits;
        int[] iArr = new int[3];
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            m65965h(readBits, bitSource.readBits(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 < 14) {
                                    sb2.append((char) (i2 + 44));
                                } else if (i2 < 40) {
                                    sb2.append((char) (i2 + 51));
                                } else {
                                    throw FormatException.getFormatInstance();
                                }
                            } else {
                                sb2.append(' ');
                            }
                        } else {
                            sb2.append('>');
                        }
                    } else {
                        sb2.append('*');
                    }
                } else {
                    sb2.append('\r');
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    private static Mode m65970c(BitSource bitSource, StringBuilder sb2, StringBuilder sb3) throws FormatException {
        boolean z = false;
        do {
            int readBits = bitSource.readBits(8);
            if (readBits != 0) {
                if (readBits <= 128) {
                    if (z) {
                        readBits += 128;
                    }
                    sb2.append((char) (readBits - 1));
                    return Mode.ASCII_ENCODE;
                } else if (readBits == 129) {
                    return Mode.PAD_ENCODE;
                } else {
                    if (readBits <= 229) {
                        int i = readBits - 130;
                        if (i < 10) {
                            sb2.append('0');
                        }
                        sb2.append(i);
                    } else {
                        switch (readBits) {
                            case 230:
                                return Mode.C40_ENCODE;
                            case 231:
                                return Mode.BASE256_ENCODE;
                            case 232:
                                sb2.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z = true;
                                break;
                            case 236:
                                sb2.append("[)>\u001e05\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                sb2.append("[)>\u001e06\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return Mode.ANSIX12_ENCODE;
                            case 239:
                                return Mode.TEXT_ENCODE;
                            case 240:
                                return Mode.EDIFACT_ENCODE;
                            default:
                                if (readBits != 254 || bitSource.available() != 0) {
                                    throw FormatException.getFormatInstance();
                                }
                                break;
                        }
                    }
                }
            } else {
                throw FormatException.getFormatInstance();
            }
        } while (bitSource.available() > 0);
        return Mode.ASCII_ENCODE;
    }

    /* renamed from: d */
    private static void m65969d(BitSource bitSource, StringBuilder sb2, Collection<byte[]> collection) throws FormatException {
        int byteOffset = bitSource.getByteOffset() + 1;
        int i = byteOffset + 1;
        int m65964i = m65964i(bitSource.readBits(8), byteOffset);
        if (m65964i == 0) {
            m65964i = bitSource.available() / 8;
        } else if (m65964i >= 250) {
            m65964i = ((m65964i - 249) * 250) + m65964i(bitSource.readBits(8), i);
            i++;
        }
        if (m65964i >= 0) {
            byte[] bArr = new byte[m65964i];
            int i2 = 0;
            while (i2 < m65964i) {
                if (bitSource.available() >= 8) {
                    bArr[i2] = (byte) m65964i(bitSource.readBits(8), i);
                    i2++;
                    i++;
                } else {
                    throw FormatException.getFormatInstance();
                }
            }
            collection.add(bArr);
            try {
                sb2.append(new String(bArr, "ISO8859_1"));
                return;
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e)));
            }
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: e */
    private static void m65968e(BitSource bitSource, StringBuilder sb2) throws FormatException {
        int readBits;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            m65965h(readBits, bitSource.readBits(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (z) {
                                    sb2.append((char) (i3 + 224));
                                    z = false;
                                    i = 0;
                                } else {
                                    sb2.append((char) (i3 + 96));
                                    i = 0;
                                }
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                        } else {
                            char[] cArr = f44408b;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb2.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb2.append(c);
                                }
                            } else if (i3 != 27) {
                                if (i3 == 30) {
                                    z = true;
                                } else {
                                    throw FormatException.getFormatInstance();
                                }
                            } else {
                                sb2.append((char) 29);
                            }
                            i = 0;
                        }
                    } else if (z) {
                        sb2.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb2.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = f44407a;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            sb2.append((char) (c2 + 128));
                            z = false;
                        } else {
                            sb2.append(c2);
                        }
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m65967f(BitSource bitSource, StringBuilder sb2) {
        while (bitSource.available() > 16) {
            for (int i = 0; i < 4; i++) {
                int readBits = bitSource.readBits(6);
                if (readBits == 31) {
                    int bitOffset = 8 - bitSource.getBitOffset();
                    if (bitOffset != 8) {
                        bitSource.readBits(bitOffset);
                        return;
                    }
                    return;
                }
                if ((readBits & 32) == 0) {
                    readBits |= 64;
                }
                sb2.append((char) readBits);
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    /* renamed from: g */
    private static void m65966g(BitSource bitSource, StringBuilder sb2) throws FormatException {
        int readBits;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            m65965h(readBits, bitSource.readBits(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                char[] cArr = f44411e;
                                if (i3 < cArr.length) {
                                    char c = cArr[i3];
                                    if (z) {
                                        sb2.append((char) (c + 128));
                                        z = false;
                                        i = 0;
                                    } else {
                                        sb2.append(c);
                                        i = 0;
                                    }
                                } else {
                                    throw FormatException.getFormatInstance();
                                }
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                        } else {
                            char[] cArr2 = f44410d;
                            if (i3 < cArr2.length) {
                                char c2 = cArr2[i3];
                                if (z) {
                                    sb2.append((char) (c2 + 128));
                                    z = false;
                                } else {
                                    sb2.append(c2);
                                }
                            } else if (i3 != 27) {
                                if (i3 == 30) {
                                    z = true;
                                } else {
                                    throw FormatException.getFormatInstance();
                                }
                            } else {
                                sb2.append((char) 29);
                            }
                            i = 0;
                        }
                    } else if (z) {
                        sb2.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb2.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = f44409c;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            sb2.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb2.append(c3);
                        }
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    /* renamed from: h */
    private static void m65965h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    private static int m65964i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        if (i3 >= 0) {
            return i3;
        }
        return i3 + 256;
    }
}
