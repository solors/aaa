package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class Encoder {

    /* renamed from: a */
    private static final int[] f44744a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.zxing.qrcode.encoder.Encoder$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C177281 {

        /* renamed from: a */
        static final /* synthetic */ int[] f44745a;

        static {
            int[] iArr = new int[Mode.values().length];
            f44745a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44745a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44745a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44745a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private Encoder() {
    }

    /* renamed from: a */
    static void m65506a(String str, BitArray bitArray, String str2) throws WriterException {
        try {
            for (byte b : str.getBytes(str2)) {
                bitArray.appendBits(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* renamed from: b */
    static void m65505b(CharSequence charSequence, BitArray bitArray) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int m65492o = m65492o(charSequence.charAt(i));
            if (m65492o != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int m65492o2 = m65492o(charSequence.charAt(i2));
                    if (m65492o2 != -1) {
                        bitArray.appendBits((m65492o * 45) + m65492o2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    bitArray.appendBits(m65492o, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: c */
    static void m65504c(String str, Mode mode, BitArray bitArray, String str2) throws WriterException {
        int i = C177281.f44745a[mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        m65502e(str, bitArray);
                        return;
                    }
                    throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
                }
                m65506a(str, bitArray, str2);
                return;
            }
            m65505b(str, bitArray);
            return;
        }
        m65499h(str, bitArray);
    }

    public static Mode chooseMode(String str) {
        return m65495l(str, null);
    }

    /* renamed from: d */
    private static void m65503d(CharacterSetECI characterSetECI, BitArray bitArray) {
        bitArray.appendBits(Mode.ECI.getBits(), 4);
        bitArray.appendBits(characterSetECI.getValue(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044 A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m65502e(java.lang.String r6, com.google.zxing.common.BitArray r7) throws com.google.zxing.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L4c
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L24
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L24
        L22:
            int r2 = r2 - r3
            goto L33
        L24:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L32
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L32
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L22
        L32:
            r2 = r4
        L33:
            if (r2 == r4) goto L44
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.appendBits(r3, r2)
            int r1 = r1 + 2
            goto L8
        L44:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.Encoder.m65502e(java.lang.String, com.google.zxing.common.BitArray):void");
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        return encode(str, errorCorrectionLevel, null);
    }

    /* renamed from: f */
    static void m65501f(int i, Version version, Mode mode, BitArray bitArray) throws WriterException {
        int characterCountBits = mode.getCharacterCountBits(version);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            bitArray.appendBits(i, characterCountBits);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: g */
    static void m65500g(Mode mode, BitArray bitArray) {
        bitArray.appendBits(mode.getBits(), 4);
    }

    /* renamed from: h */
    static void m65499h(CharSequence charSequence, BitArray bitArray) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                bitArray.appendBits((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    bitArray.appendBits((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    bitArray.appendBits(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    private static int m65498i(Mode mode, BitArray bitArray, BitArray bitArray2, Version version) {
        return bitArray.getSize() + mode.getCharacterCountBits(version) + bitArray2.getSize();
    }

    /* renamed from: j */
    private static int m65497j(ByteMatrix byteMatrix) {
        return MaskUtil.m65485a(byteMatrix) + MaskUtil.m65483c(byteMatrix) + MaskUtil.m65482d(byteMatrix) + MaskUtil.m65481e(byteMatrix);
    }

    /* renamed from: k */
    private static int m65496k(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, ByteMatrix byteMatrix) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            MatrixUtil.m65477a(bitArray, errorCorrectionLevel, version, i3, byteMatrix);
            int m65497j = m65497j(byteMatrix);
            if (m65497j < i) {
                i2 = i3;
                i = m65497j;
            }
        }
        return i2;
    }

    /* renamed from: l */
    private static Mode m65495l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m65489r(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m65492o(charAt) != -1) {
                z = true;
            } else {
                return Mode.BYTE;
            }
        }
        if (z) {
            return Mode.ALPHANUMERIC;
        }
        if (z2) {
            return Mode.NUMERIC;
        }
        return Mode.BYTE;
    }

    /* renamed from: m */
    private static Version m65494m(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            Version versionForNumber = Version.getVersionForNumber(i2);
            if (m65486u(i, versionForNumber, errorCorrectionLevel)) {
                return versionForNumber;
            }
        }
        throw new WriterException("Data too big");
    }

    /* renamed from: n */
    static byte[] m65493n(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new ReedSolomonEncoder(GenericGF.QR_CODE_FIELD_256).encode(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: o */
    static int m65492o(int i) {
        int[] iArr = f44744a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: p */
    static void m65491p(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 == i12) {
                if (i3 == i6 + i5) {
                    if (i == ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                        if (i4 < i6) {
                            iArr[0] = i9;
                            iArr2[0] = i11;
                            return;
                        }
                        iArr[0] = i10;
                        iArr2[0] = i12;
                        return;
                    }
                    throw new WriterException("Total bytes mismatch");
                }
                throw new WriterException("RS blocks mismatch");
            }
            throw new WriterException("EC bytes mismatch");
        }
        throw new WriterException("Block ID too large");
    }

    /* renamed from: q */
    static BitArray m65490q(BitArray bitArray, int i, int i2, int i3) throws WriterException {
        if (bitArray.getSizeInBytes() == i2) {
            ArrayList<BlockPair> arrayList = new ArrayList(i3);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m65491p(i, i2, i3, i7, iArr, iArr2);
                int i8 = iArr[0];
                byte[] bArr = new byte[i8];
                bitArray.toBytes(i4 << 3, bArr, 0, i8);
                byte[] m65493n = m65493n(bArr, iArr2[0]);
                arrayList.add(new BlockPair(bArr, m65493n));
                i5 = Math.max(i5, i8);
                i6 = Math.max(i6, m65493n.length);
                i4 += iArr[0];
            }
            if (i2 == i4) {
                BitArray bitArray2 = new BitArray();
                for (int i9 = 0; i9 < i5; i9++) {
                    for (BlockPair blockPair : arrayList) {
                        byte[] dataBytes = blockPair.getDataBytes();
                        if (i9 < dataBytes.length) {
                            bitArray2.appendBits(dataBytes[i9], 8);
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (BlockPair blockPair2 : arrayList) {
                        byte[] errorCorrectionBytes = blockPair2.getErrorCorrectionBytes();
                        if (i10 < errorCorrectionBytes.length) {
                            bitArray2.appendBits(errorCorrectionBytes[i10], 8);
                        }
                    }
                }
                if (i == bitArray2.getSizeInBytes()) {
                    return bitArray2;
                }
                throw new WriterException("Interleaving error: " + i + " and " + bitArray2.getSizeInBytes() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    /* renamed from: r */
    private static boolean m65489r(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private static Version m65488s(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, BitArray bitArray, BitArray bitArray2) throws WriterException {
        return m65494m(m65498i(mode, bitArray, bitArray2, m65494m(m65498i(mode, bitArray, bitArray2, Version.getVersionForNumber(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    /* renamed from: t */
    static void m65487t(int i, BitArray bitArray) throws WriterException {
        int i2;
        int i3 = i << 3;
        if (bitArray.getSize() <= i3) {
            for (int i4 = 0; i4 < 4 && bitArray.getSize() < i3; i4++) {
                bitArray.appendBit(false);
            }
            int size = bitArray.getSize() & 7;
            if (size > 0) {
                while (size < 8) {
                    bitArray.appendBit(false);
                    size++;
                }
            }
            int sizeInBytes = i - bitArray.getSizeInBytes();
            for (int i5 = 0; i5 < sizeInBytes; i5++) {
                if ((i5 & 1) == 0) {
                    i2 = 236;
                } else {
                    i2 = 17;
                }
                bitArray.appendBits(i2, 8);
            }
            if (bitArray.getSize() == i3) {
                return;
            }
            throw new WriterException("Bits size does not equal capacity");
        }
        throw new WriterException("data bits cannot fit in the QR Code" + bitArray.getSize() + " > " + i3);
    }

    /* renamed from: u */
    private static boolean m65486u(int i, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        if (version.getTotalCodewords() - version.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (i + 7) / 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.zxing.qrcode.encoder.QRCode encode(java.lang.String r7, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r8, java.util.Map<com.google.zxing.EncodeHintType, ?> r9) throws com.google.zxing.WriterException {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto Le
            com.google.zxing.EncodeHintType r2 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto Le
            r2 = r0
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L1c
            com.google.zxing.EncodeHintType r3 = com.google.zxing.EncodeHintType.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L1e
        L1c:
            java.lang.String r3 = "ISO-8859-1"
        L1e:
            com.google.zxing.qrcode.decoder.Mode r4 = m65495l(r7, r3)
            com.google.zxing.common.BitArray r5 = new com.google.zxing.common.BitArray
            r5.<init>()
            com.google.zxing.qrcode.decoder.Mode r6 = com.google.zxing.qrcode.decoder.Mode.BYTE
            if (r4 != r6) goto L36
            if (r2 == 0) goto L36
            com.google.zxing.common.CharacterSetECI r2 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByName(r3)
            if (r2 == 0) goto L36
            m65503d(r2, r5)
        L36:
            if (r9 == 0) goto L41
            com.google.zxing.EncodeHintType r2 = com.google.zxing.EncodeHintType.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L41
            goto L42
        L41:
            r0 = r1
        L42:
            if (r0 == 0) goto L5d
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5d
            com.google.zxing.qrcode.decoder.Mode r0 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION
            m65500g(r0, r5)
        L5d:
            m65500g(r4, r5)
            com.google.zxing.common.BitArray r0 = new com.google.zxing.common.BitArray
            r0.<init>()
            m65504c(r7, r4, r0, r3)
            if (r9 == 0) goto L95
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L95
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            com.google.zxing.qrcode.decoder.Version r9 = com.google.zxing.qrcode.decoder.Version.getVersionForNumber(r9)
            int r1 = m65498i(r4, r5, r0, r9)
            boolean r1 = m65486u(r1, r9, r8)
            if (r1 == 0) goto L8d
            goto L99
        L8d:
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>(r8)
            throw r7
        L95:
            com.google.zxing.qrcode.decoder.Version r9 = m65488s(r8, r4, r5, r0)
        L99:
            com.google.zxing.common.BitArray r1 = new com.google.zxing.common.BitArray
            r1.<init>()
            r1.appendBitArray(r5)
            if (r4 != r6) goto La8
            int r7 = r0.getSizeInBytes()
            goto Lac
        La8:
            int r7 = r7.length()
        Lac:
            m65501f(r7, r9, r4, r1)
            r1.appendBitArray(r0)
            com.google.zxing.qrcode.decoder.Version$ECBlocks r7 = r9.getECBlocksForLevel(r8)
            int r0 = r9.getTotalCodewords()
            int r2 = r7.getTotalECCodewords()
            int r0 = r0 - r2
            m65487t(r0, r1)
            int r2 = r9.getTotalCodewords()
            int r7 = r7.getNumBlocks()
            com.google.zxing.common.BitArray r7 = m65490q(r1, r2, r0, r7)
            com.google.zxing.qrcode.encoder.QRCode r0 = new com.google.zxing.qrcode.encoder.QRCode
            r0.<init>()
            r0.setECLevel(r8)
            r0.setMode(r4)
            r0.setVersion(r9)
            int r1 = r9.getDimensionForVersion()
            com.google.zxing.qrcode.encoder.ByteMatrix r2 = new com.google.zxing.qrcode.encoder.ByteMatrix
            r2.<init>(r1, r1)
            int r1 = m65496k(r7, r8, r9, r2)
            r0.setMaskPattern(r1)
            com.google.zxing.qrcode.encoder.MatrixUtil.m65477a(r7, r8, r9, r1, r2)
            r0.setMatrix(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.Encoder.encode(java.lang.String, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):com.google.zxing.qrcode.encoder.QRCode");
    }
}
