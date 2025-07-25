package net.pubnative.lite.sdk.views.shape.path.parser;

import android.graphics.Matrix;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public class TransformParser {
    private static final String TAG = SvgToPath.class.getSimpleName();

    TransformParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Matrix parseTransform(String str) {
        int i;
        Matrix matrix = new Matrix();
        while (true) {
            parseTransformItem(str, matrix);
            int indexOf = str.indexOf(")");
            if (indexOf <= 0 || str.length() <= (i = indexOf + 1)) {
                break;
            }
            str = str.substring(i).replaceFirst("[\\s,]*", "");
        }
        return matrix;
    }

    private static void parseTransformItem(String str, Matrix matrix) {
        float f;
        NumberParse parseNumbers;
        NumberParse parseNumbers2;
        float f2;
        float f3 = 0.0f;
        if (str.startsWith("matrix(")) {
            NumberParse parseNumbers3 = NumberParse.parseNumbers(str.substring(7));
            if (parseNumbers3.numbers.size() == 6) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{parseNumbers3.numbers.get(0).floatValue(), parseNumbers3.numbers.get(2).floatValue(), parseNumbers3.numbers.get(4).floatValue(), parseNumbers3.numbers.get(1).floatValue(), parseNumbers3.numbers.get(3).floatValue(), parseNumbers3.numbers.get(5).floatValue(), 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            }
        } else if (str.startsWith("translate(")) {
            NumberParse parseNumbers4 = NumberParse.parseNumbers(str.substring(10));
            if (parseNumbers4.numbers.size() > 0) {
                float floatValue = parseNumbers4.numbers.get(0).floatValue();
                if (parseNumbers4.numbers.size() > 1) {
                    f3 = parseNumbers4.numbers.get(1).floatValue();
                }
                matrix.preTranslate(floatValue, f3);
            }
        } else if (str.startsWith("scale(")) {
            NumberParse parseNumbers5 = NumberParse.parseNumbers(str.substring(6));
            if (parseNumbers5.numbers.size() > 0) {
                float floatValue2 = parseNumbers5.numbers.get(0).floatValue();
                if (parseNumbers5.numbers.size() > 1) {
                    f2 = parseNumbers5.numbers.get(1).floatValue();
                } else {
                    f2 = floatValue2;
                }
                matrix.preScale(floatValue2, f2);
            }
        } else if (str.startsWith("skewX(")) {
            if (NumberParse.parseNumbers(str.substring(6)).numbers.size() > 0) {
                matrix.preSkew((float) Math.tan(parseNumbers2.numbers.get(0).floatValue()), 0.0f);
            }
        } else if (str.startsWith("skewY(")) {
            if (NumberParse.parseNumbers(str.substring(6)).numbers.size() > 0) {
                matrix.preSkew(0.0f, (float) Math.tan(parseNumbers.numbers.get(0).floatValue()));
            }
        } else if (str.startsWith("rotate(")) {
            NumberParse parseNumbers6 = NumberParse.parseNumbers(str.substring(7));
            if (parseNumbers6.numbers.size() > 0) {
                float floatValue3 = parseNumbers6.numbers.get(0).floatValue();
                if (parseNumbers6.numbers.size() > 2) {
                    f3 = parseNumbers6.numbers.get(1).floatValue();
                    f = parseNumbers6.numbers.get(2).floatValue();
                } else {
                    f = 0.0f;
                }
                matrix.preTranslate(f3, f);
                matrix.preRotate(floatValue3);
                matrix.preTranslate(-f3, -f);
            }
        } else {
            Log.w(TAG, "Invalid transform (" + str + ")");
        }
    }
}
