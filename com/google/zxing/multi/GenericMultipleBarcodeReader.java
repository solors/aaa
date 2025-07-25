package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {

    /* renamed from: a */
    private final Reader f44465a;

    public GenericMultipleBarcodeReader(Reader reader) {
        this.f44465a = reader;
    }

    /* renamed from: a */
    private void m65896a(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, List<Result> list, int i, int i2, int i3) {
        boolean z;
        float f;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i3 > 4) {
            return;
        }
        try {
            Result decode = this.f44465a.decode(binaryBitmap, map);
            Iterator<Result> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getText().equals(decode.getText())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                list.add(m65895b(decode, i, i2));
            }
            ResultPoint[] resultPoints = decode.getResultPoints();
            if (resultPoints != null && resultPoints.length != 0) {
                int width = binaryBitmap.getWidth();
                int height = binaryBitmap.getHeight();
                float f3 = width;
                float f4 = 0.0f;
                float f5 = height;
                float f6 = 0.0f;
                for (ResultPoint resultPoint : resultPoints) {
                    if (resultPoint != null) {
                        float x = resultPoint.getX();
                        float y = resultPoint.getY();
                        if (x < f3) {
                            f3 = x;
                        }
                        if (y < f5) {
                            f5 = y;
                        }
                        if (x > f6) {
                            f6 = x;
                        }
                        if (y > f4) {
                            f4 = y;
                        }
                    }
                }
                if (f3 > 100.0f) {
                    f = f6;
                    f2 = f5;
                    i4 = height;
                    i5 = width;
                    m65896a(binaryBitmap.crop(0, 0, (int) f3, height), map, list, i, i2, i3 + 1);
                } else {
                    f = f6;
                    f2 = f5;
                    i4 = height;
                    i5 = width;
                }
                if (f2 > 100.0f) {
                    int i8 = (int) f2;
                    i6 = i5;
                    m65896a(binaryBitmap.crop(0, 0, i6, i8), map, list, i, i2, i3 + 1);
                } else {
                    i6 = i5;
                }
                float f7 = f;
                if (f7 < i6 - 100) {
                    int i9 = (int) f7;
                    i7 = i4;
                    m65896a(binaryBitmap.crop(i9, 0, i6 - i9, i7), map, list, i + i9, i2, i3 + 1);
                } else {
                    i7 = i4;
                }
                if (f4 < i7 - 100) {
                    int i10 = (int) f4;
                    m65896a(binaryBitmap.crop(0, i10, i6, i7 - i10), map, list, i, i2 + i10, i3 + 1);
                }
            }
        } catch (ReaderException unused) {
        }
    }

    /* renamed from: b */
    private static Result m65895b(Result result, int i, int i2) {
        ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        ResultPoint[] resultPointArr = new ResultPoint[resultPoints.length];
        for (int i3 = 0; i3 < resultPoints.length; i3++) {
            ResultPoint resultPoint = resultPoints[i3];
            if (resultPoint != null) {
                resultPointArr[i3] = new ResultPoint(resultPoint.getX() + i, resultPoint.getY() + i2);
            }
        }
        Result result2 = new Result(result.getText(), result.getRawBytes(), result.getNumBits(), resultPointArr, result.getBarcodeFormat(), result.getTimestamp());
        result2.putAllMetadata(result.getResultMetadata());
        return result2;
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        m65896a(binaryBitmap, map, arrayList, 0, 0, 0);
        if (!arrayList.isEmpty()) {
            return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
