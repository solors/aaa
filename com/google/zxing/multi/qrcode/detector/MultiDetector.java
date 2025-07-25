package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.qrcode.detector.Detector;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes5.dex */
public final class MultiDetector extends Detector {

    /* renamed from: c */
    private static final DetectorResult[] f44468c = new DetectorResult[0];

    public MultiDetector(BitMatrix bitMatrix) {
        super(bitMatrix);
    }

    public DetectorResult[] detectMulti(Map<DecodeHintType, ?> map) throws NotFoundException {
        ResultPointCallback resultPointCallback;
        BitMatrix m65530f = m65530f();
        if (map == null) {
            resultPointCallback = null;
        } else {
            resultPointCallback = (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        }
        FinderPatternInfo[] findMulti = new MultiFinderPatternFinder(m65530f, resultPointCallback).findMulti(map);
        if (findMulti.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (FinderPatternInfo finderPatternInfo : findMulti) {
                try {
                    arrayList.add(m65529g(finderPatternInfo));
                } catch (ReaderException unused) {
                }
            }
            if (arrayList.isEmpty()) {
                return f44468c;
            }
            return (DetectorResult[]) arrayList.toArray(new DetectorResult[arrayList.size()]);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
