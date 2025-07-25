package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class UPCEANReader extends OneDReader {

    /* renamed from: d */
    static final int[] f44517d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f44518e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[] f44519f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    static final int[][] f44520g;

    /* renamed from: h */
    static final int[][] f44521h;

    /* renamed from: a */
    private final StringBuilder f44522a = new StringBuilder(20);

    /* renamed from: b */
    private final UPCEANExtensionSupport f44523b = new UPCEANExtensionSupport();

    /* renamed from: c */
    private final EANManufacturerOrgSupport f44524c = new EANManufacturerOrgSupport();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f44520g = iArr;
        int[][] iArr2 = new int[20];
        f44521h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f44520g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f44521h[i] = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m65839f(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        if (m65834n(charSequence.subSequence(0, i)) != Character.digit(charSequence.charAt(i), 10)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m65838g(BitArray bitArray, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        OneDReader.m65854c(bitArray, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float m65855b = OneDReader.m65855b(iArr, iArr2[i3], 0.7f);
            if (m65855b < f) {
                i2 = i3;
                f = m65855b;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int[] m65837j(BitArray bitArray, int i, boolean z, int[] iArr) throws NotFoundException {
        return m65836k(bitArray, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: k */
    private static int[] m65836k(BitArray bitArray, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int nextSet;
        int size = bitArray.getSize();
        if (z) {
            nextSet = bitArray.getNextUnset(i);
        } else {
            nextSet = bitArray.getNextSet(i);
        }
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 == length - 1) {
                    if (OneDReader.m65855b(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i3, nextSet};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int[] m65835l(BitArray bitArray) throws NotFoundException {
        int[] iArr = new int[f44517d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f44517d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m65836k(bitArray, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = bitArray.isRange(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m65834n(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt >= 0 && charAt <= 9) {
                i += charAt;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 >= 0 && charAt2 <= 9) {
                i3 += charAt2;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        return (1000 - i3) % 10;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return decodeRow(i, bitArray, m65835l(bitArray), map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo65833e(String str) throws FormatException {
        return m65839f(str);
    }

    /* renamed from: h */
    int[] mo65832h(BitArray bitArray, int i) throws NotFoundException {
        return m65837j(bitArray, i, false, f44517d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo65831i(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException;

    /* renamed from: m */
    abstract BarcodeFormat mo65830m();

    public Result decodeRow(int i, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int i2;
        String m65864c;
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb2 = this.f44522a;
        sb2.setLength(0);
        int mo65831i = mo65831i(bitArray, iArr, sb2);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint(mo65831i, i));
        }
        int[] mo65832h = mo65832h(bitArray, mo65831i);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((mo65832h[0] + mo65832h[1]) / 2.0f, i));
        }
        int i3 = mo65832h[1];
        int i4 = (i3 - mo65832h[0]) + i3;
        if (i4 < bitArray.getSize() && bitArray.isRange(i3, i4, false)) {
            String sb3 = sb2.toString();
            if (sb3.length() >= 8) {
                if (mo65833e(sb3)) {
                    BarcodeFormat mo65830m = mo65830m();
                    float f = i;
                    Result result = new Result(sb3, null, new ResultPoint[]{new ResultPoint((iArr[1] + iArr[0]) / 2.0f, f), new ResultPoint((mo65832h[1] + mo65832h[0]) / 2.0f, f)}, mo65830m);
                    try {
                        Result m65840a = this.f44523b.m65840a(i, bitArray, mo65832h[1]);
                        result.putMetadata(ResultMetadataType.UPC_EAN_EXTENSION, m65840a.getText());
                        result.putAllMetadata(m65840a.getResultMetadata());
                        result.addResultPoints(m65840a.getResultPoints());
                        i2 = m65840a.getText().length();
                    } catch (ReaderException unused) {
                        i2 = 0;
                    }
                    int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
                    if (iArr2 != null) {
                        int length = iArr2.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                z = false;
                                break;
                            } else if (i2 == iArr2[i5]) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (!z) {
                            throw NotFoundException.getNotFoundInstance();
                        }
                    }
                    if ((mo65830m == BarcodeFormat.EAN_13 || mo65830m == BarcodeFormat.UPC_A) && (m65864c = this.f44524c.m65864c(sb3)) != null) {
                        result.putMetadata(ResultMetadataType.POSSIBLE_COUNTRY, m65864c);
                    }
                    return result;
                }
                throw ChecksumException.getChecksumInstance();
            }
            throw FormatException.getFormatInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
