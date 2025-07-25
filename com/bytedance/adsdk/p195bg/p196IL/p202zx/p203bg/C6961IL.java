package com.bytedance.adsdk.p195bg.p196IL.p202zx.p203bg;

/* renamed from: com.bytedance.adsdk.bg.IL.zx.bg.IL */
/* loaded from: classes3.dex */
public class C6961IL {
    /* renamed from: bg */
    private static boolean m90435bg(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i == number.intValue();
        } else if (number instanceof Long) {
            return ((long) i) == number.longValue();
        } else if (number instanceof Float) {
            return ((float) i) == number.floatValue();
        } else if (number instanceof Double) {
            return ((double) i) == number.doubleValue();
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    private static boolean m90434bg(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j == ((long) number.intValue());
        } else if (number instanceof Long) {
            return j == number.longValue();
        } else if (number instanceof Float) {
            return ((float) j) == number.floatValue();
        } else if (number instanceof Double) {
            return ((double) j) == number.doubleValue();
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    private static boolean m90436bg(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f == ((float) number.intValue());
        } else if (number instanceof Long) {
            return f == ((float) number.longValue());
        } else if (number instanceof Float) {
            return f == number.floatValue();
        } else if (number instanceof Double) {
            return ((double) f) == number.doubleValue();
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    private static boolean m90437bg(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d == ((double) number.intValue());
        } else if (number instanceof Long) {
            return d == ((double) number.longValue());
        } else if (number instanceof Float) {
            return d == ((double) number.floatValue());
        } else if (number instanceof Double) {
            return d == number.doubleValue();
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    public static boolean m90433bg(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return m90434bg(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return m90436bg(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return m90437bg(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return m90435bg(number.intValue(), number2);
    }
}
