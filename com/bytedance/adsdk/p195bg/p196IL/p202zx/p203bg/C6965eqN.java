package com.bytedance.adsdk.p195bg.p196IL.p202zx.p203bg;

/* renamed from: com.bytedance.adsdk.bg.IL.zx.bg.eqN */
/* loaded from: classes3.dex */
public class C6965eqN {
    /* renamed from: bg */
    private static Object m90415bg(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i < number.intValue());
        } else if (number instanceof Long) {
            return Boolean.valueOf(((long) i) < number.longValue());
        } else if (number instanceof Float) {
            return Boolean.valueOf(((float) i) < number.floatValue());
        } else if (number instanceof Double) {
            return Boolean.valueOf(((double) i) < number.doubleValue());
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    private static Object m90414bg(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j < ((long) number.intValue()));
        } else if (number instanceof Long) {
            return Boolean.valueOf(j < number.longValue());
        } else if (number instanceof Float) {
            return Boolean.valueOf(((float) j) < number.floatValue());
        } else if (number instanceof Double) {
            return Boolean.valueOf(((double) j) < number.doubleValue());
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    private static Object m90416bg(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f < ((float) number.intValue()));
        } else if (number instanceof Long) {
            return Boolean.valueOf(f < ((float) number.longValue()));
        } else if (number instanceof Float) {
            return Boolean.valueOf(f < number.floatValue());
        } else if (number instanceof Double) {
            return Boolean.valueOf(((double) f) < number.doubleValue());
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    private static Object m90417bg(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d < ((double) number.intValue()));
        } else if (number instanceof Long) {
            return Boolean.valueOf(d < ((double) number.longValue()));
        } else if (number instanceof Float) {
            return Boolean.valueOf(d < ((double) number.floatValue()));
        } else if (number instanceof Double) {
            return Boolean.valueOf(d < number.doubleValue());
        } else {
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
    }

    /* renamed from: bg */
    public static Object m90413bg(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return m90414bg(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return m90416bg(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return m90417bg(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return m90416bg(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
        }
        return m90415bg(((Number) obj).intValue(), number);
    }
}
