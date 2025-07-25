package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes4.dex */
final class ProjectionDecoder {
    private ProjectionDecoder() {
    }

    /* renamed from: a */
    private static int m72356a(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* renamed from: b */
    private static boolean m72355b(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        if (readInt != 1886547818) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: c */
    private static Projection.Mesh m72354c(ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (readInt > 10000) {
            return null;
        }
        float[] fArr = new float[readInt];
        for (int i = 0; i < readInt; i++) {
            fArr[i] = parsableByteArray.readFloat();
        }
        int readInt2 = parsableByteArray.readInt();
        if (readInt2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(readInt * 2.0d) / log);
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        int i2 = 8;
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        float[] fArr2 = new float[readInt2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < readInt2) {
            int i6 = 0;
            while (i6 < i3) {
                int m72356a = iArr[i6] + m72356a(parsableBitArray.readBits(ceil));
                if (m72356a >= readInt || m72356a < 0) {
                    return null;
                }
                fArr2[i5] = fArr[m72356a];
                iArr[i6] = m72356a;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i7 = 32;
        int readBits = parsableBitArray.readBits(32);
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[readBits];
        int i8 = 0;
        while (i8 < readBits) {
            int readBits2 = parsableBitArray.readBits(i2);
            int readBits3 = parsableBitArray.readBits(i2);
            int readBits4 = parsableBitArray.readBits(i7);
            if (readBits4 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(readInt2 * d) / log);
            float[] fArr3 = new float[readBits4 * 3];
            float[] fArr4 = new float[readBits4 * 2];
            int i9 = 0;
            for (int i10 = 0; i10 < readBits4; i10++) {
                i9 += m72356a(parsableBitArray.readBits(ceil2));
                if (i9 < 0 || i9 >= readInt2) {
                    return null;
                }
                int i11 = i10 * 3;
                int i12 = i9 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i10 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
            }
            subMeshArr[i8] = new Projection.SubMesh(readBits2, fArr3, fArr4, readBits3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new Projection.Mesh(subMeshArr);
    }

    @Nullable
    /* renamed from: d */
    private static ArrayList<Projection.Mesh> m72353d(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0) {
            return null;
        }
        parsableByteArray.skipBytes(7);
        int readInt = parsableByteArray.readInt();
        if (readInt == 1684433976) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.inflate(parsableByteArray, parsableByteArray2, inflater)) {
                    return null;
                }
                inflater.end();
                parsableByteArray = parsableByteArray2;
            } finally {
                inflater.end();
            }
        } else if (readInt != 1918990112) {
            return null;
        }
        return m72351f(parsableByteArray);
    }

    @Nullable
    public static Projection decode(byte[] bArr, int i) {
        ArrayList<Projection.Mesh> arrayList;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            if (m72355b(parsableByteArray)) {
                arrayList = m72352e(parsableByteArray);
            } else {
                arrayList = m72353d(parsableByteArray);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                return null;
            }
            return new Projection(arrayList.get(0), arrayList.get(1), i);
        }
        return new Projection(arrayList.get(0), i);
    }

    @Nullable
    /* renamed from: e */
    private static ArrayList<Projection.Mesh> m72352e(ParsableByteArray parsableByteArray) {
        int readInt;
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit && (readInt = parsableByteArray.readInt() + position) > position && readInt <= limit) {
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 != 2037673328 && readInt2 != 1836279920) {
                parsableByteArray.setPosition(readInt);
                position = readInt;
            } else {
                parsableByteArray.setLimit(readInt);
                return m72353d(parsableByteArray);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    private static ArrayList<Projection.Mesh> m72351f(ParsableByteArray parsableByteArray) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit) {
            int readInt = parsableByteArray.readInt() + position;
            if (readInt <= position || readInt > limit) {
                return null;
            }
            if (parsableByteArray.readInt() == 1835365224) {
                Projection.Mesh m72354c = m72354c(parsableByteArray);
                if (m72354c == null) {
                    return null;
                }
                arrayList.add(m72354c);
            }
            parsableByteArray.setPosition(readInt);
            position = readInt;
        }
        return arrayList;
    }
}
