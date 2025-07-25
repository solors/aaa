package com.bytedance.adsdk.p195bg.p196IL.p202zx.p203bg;

/* renamed from: com.bytedance.adsdk.bg.IL.zx.bg.Kg */
/* loaded from: classes3.dex */
public class C6962Kg {
    /* renamed from: bg */
    private static Object m90430bg(int i, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(i + number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(i + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(i + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Integer.valueOf(i + number.intValue());
    }

    /* renamed from: bg */
    private static Object m90429bg(long j, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j + number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(((float) j) + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Long.valueOf(j + number.intValue());
    }

    /* renamed from: bg */
    private static Object m90431bg(float f, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f + ((float) number.longValue()));
            }
            if (number instanceof Float) {
                return Float.valueOf(f + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(f + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Float.valueOf(f + number.intValue());
    }

    /* renamed from: bg */
    private static Object m90432bg(double d, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d + number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(d + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Double.valueOf(d + number.intValue());
    }

    /* renamed from: bg */
    public static Object m90428bg(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return m90429bg(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return m90431bg(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return m90432bg(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return m90430bg(number.intValue(), number2);
    }
}
