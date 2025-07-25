package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Defaults {

    /* renamed from: a */
    private static final Double f39371a = Double.valueOf(0.0d);

    /* renamed from: b */
    private static final Float f39372b = Float.valueOf(0.0f);

    private Defaults() {
    }

    public static <T> T defaultValue(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return (T) Boolean.FALSE;
            }
            if (cls == Character.TYPE) {
                return (T) (char) 0;
            }
            if (cls == Byte.TYPE) {
                return (T) (byte) 0;
            }
            if (cls == Short.TYPE) {
                return (T) (short) 0;
            }
            if (cls == Integer.TYPE) {
                return (T) 0;
            }
            if (cls == Long.TYPE) {
                return (T) 0L;
            }
            if (cls == Float.TYPE) {
                return (T) f39372b;
            }
            if (cls == Double.TYPE) {
                return (T) f39371a;
            }
            return null;
        }
        return null;
    }
}
