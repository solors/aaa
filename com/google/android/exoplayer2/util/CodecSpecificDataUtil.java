package com.google.android.exoplayer2.util;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.p552ot.pubsub.p553a.C26485b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class CodecSpecificDataUtil {

    /* renamed from: a */
    private static final byte[] f36046a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f36047b = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, C26485b.f69244a, "C"};

    private CodecSpecificDataUtil() {
    }

    /* renamed from: a */
    private static int m72669a(byte[] bArr, int i) {
        int length = bArr.length - f36046a.length;
        while (i <= length) {
            if (m72668b(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    private static boolean m72668b(byte[] bArr, int i) {
        if (bArr.length - i <= f36046a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f36046a;
            if (i2 < bArr2.length) {
                if (bArr[i + i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            } else {
                return true;
            }
        }
    }

    public static String buildAvcCodecString(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String buildHevcCodecString(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        char c;
        Object[] objArr = new Object[5];
        objArr[0] = f36047b[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        if (z) {
            c = 'H';
        } else {
            c = 'L';
        }
        objArr[3] = Character.valueOf(c);
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb2 = new StringBuilder(Util.formatInvariant("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb2.toString();
    }

    public static byte[] buildNalUnit(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f36046a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 3;
            if (i3 < bArr.length) {
                if (parsableByteArray.readUnsignedInt24() == 1 && (bArr[i3] & 240) == 32) {
                    z = true;
                    break;
                }
                parsableByteArray.setPosition(parsableByteArray.getPosition() - 2);
                i2++;
            } else {
                z = false;
                break;
            }
        }
        Assertions.checkArgument(z, "Invalid input: VOL not found.");
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.skipBits((i2 + 4) * 8);
        parsableBitArray.skipBits(1);
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        if (parsableBitArray.readBits(4) == 15) {
            parsableBitArray.skipBits(8);
            parsableBitArray.skipBits(8);
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(79);
            }
        }
        if (parsableBitArray.readBits(2) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2, "Only supports rectangular video object layer shape.");
        Assertions.checkArgument(parsableBitArray.readBit());
        int readBits = parsableBitArray.readBits(16);
        Assertions.checkArgument(parsableBitArray.readBit());
        if (parsableBitArray.readBit()) {
            if (readBits > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            Assertions.checkArgument(z3);
            for (int i4 = readBits - 1; i4 > 0; i4 >>= 1) {
                i++;
            }
            parsableBitArray.skipBits(i);
        }
        Assertions.checkArgument(parsableBitArray.readBit());
        int readBits2 = parsableBitArray.readBits(13);
        Assertions.checkArgument(parsableBitArray.readBit());
        int readBits3 = parsableBitArray.readBits(13);
        Assertions.checkArgument(parsableBitArray.readBit());
        parsableBitArray.skipBits(1);
        return Pair.create(Integer.valueOf(readBits2), Integer.valueOf(readBits3));
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.setPosition(9);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return Pair.create(Integer.valueOf(parsableByteArray.readUnsignedIntToInt()), Integer.valueOf(readUnsignedByte));
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        if (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1) {
            return false;
        }
        return true;
    }

    @Nullable
    public static byte[][] splitNalUnits(byte[] bArr) {
        int length;
        if (!m72668b(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(i));
            i = m72669a(bArr, i + f36046a.length);
        } while (i != -1);
        byte[][] bArr2 = new byte[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            if (i2 < arrayList.size() - 1) {
                length = ((Integer) arrayList.get(i2 + 1)).intValue();
            } else {
                length = bArr.length;
            }
            int i3 = length - intValue;
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, intValue, bArr3, 0, i3);
            bArr2[i2] = bArr3;
        }
        return bArr2;
    }
}
