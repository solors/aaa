package io.appmetrica.analytics.impl;

import android.database.Cursor;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kn */
/* loaded from: classes9.dex */
public abstract class AbstractC34679kn {
    /* renamed from: a */
    public static boolean m21472a(Object obj) {
        return obj != null;
    }

    /* renamed from: a */
    public static void m21473a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m21474a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* renamed from: a */
    public static boolean m21471a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static boolean m21469a(Map map) {
        return map == null || map.size() == 0;
    }

    /* renamed from: a */
    public static boolean m21470a(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static BigDecimal m21475a(long j) {
        return new BigDecimal(j).divide(new BigDecimal(1000000), 6, 6);
    }

    /* renamed from: a */
    public static double m21476a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return 0.0d;
        }
        return d;
    }
}
