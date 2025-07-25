package com.bytedance.adsdk.p195bg.p196IL.p202zx.p203bg;

/* renamed from: com.bytedance.adsdk.bg.IL.zx.bg.bg */
/* loaded from: classes3.dex */
public class C6964bg {
    /* renamed from: bg */
    private static Object m90420bg(int i, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(i / number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(i / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(i / number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Integer.valueOf(i / number.intValue());
    }

    /* renamed from: bg */
    private static Object m90419bg(long j, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j / number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(((float) j) / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j / number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Long.valueOf(j / number.intValue());
    }

    /* renamed from: bg */
    private static Object m90421bg(float f, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f / ((float) number.longValue()));
            }
            if (number instanceof Float) {
                return Float.valueOf(f / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(f / number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Float.valueOf(f / number.intValue());
    }

    /* renamed from: bg */
    private static Object m90422bg(double d, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d / number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(d / number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Double.valueOf(d / number.intValue());
    }

    /* renamed from: bg */
    public static Object m90418bg(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return m90419bg(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return m90421bg(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return m90422bg(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return m90420bg(number.intValue(), number2);
    }
}
