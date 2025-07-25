package com.bytedance.adsdk.p195bg.p196IL.p202zx.p203bg;

/* renamed from: com.bytedance.adsdk.bg.IL.zx.bg.bX */
/* loaded from: classes3.dex */
public class C6963bX {
    /* renamed from: bg */
    private static Object m90425bg(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i > number.intValue());
        } else if (number instanceof Long) {
            return Boolean.valueOf(((long) i) > number.longValue());
        } else if (number instanceof Float) {
            return Boolean.valueOf(((float) i) > number.floatValue());
        } else if (number instanceof Double) {
            return Boolean.valueOf(((double) i) > number.doubleValue());
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    private static Object m90424bg(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j > ((long) number.intValue()));
        } else if (number instanceof Long) {
            return Boolean.valueOf(j > number.longValue());
        } else if (number instanceof Float) {
            return Boolean.valueOf(((float) j) > number.floatValue());
        } else if (number instanceof Double) {
            return Boolean.valueOf(((double) j) > number.doubleValue());
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    private static Object m90426bg(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f > ((float) number.intValue()));
        } else if (number instanceof Long) {
            return Boolean.valueOf(f > ((float) number.longValue()));
        } else if (number instanceof Float) {
            return Boolean.valueOf(f > number.floatValue());
        } else if (number instanceof Double) {
            return Boolean.valueOf(((double) f) > number.doubleValue());
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    private static Object m90427bg(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d > ((double) number.intValue()));
        } else if (number instanceof Long) {
            return Boolean.valueOf(d > ((double) number.longValue()));
        } else if (number instanceof Float) {
            return Boolean.valueOf(d > ((double) number.floatValue()));
        } else if (number instanceof Double) {
            return Boolean.valueOf(d > number.doubleValue());
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    public static Object m90423bg(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return m90424bg(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return m90426bg(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return m90427bg(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return m90426bg(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
        }
        return m90425bg(((Number) obj).intValue(), number);
    }
}
