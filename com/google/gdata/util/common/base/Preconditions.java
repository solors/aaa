package com.google.gdata.util.common.base;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C21114v8;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static <T extends Iterable<?>> T checkContentsNotNull(T t) {
        if (containsOrIsNull(t)) {
            throw null;
        }
        return t;
    }

    public static void checkElementIndex(int i, int i2) {
        checkElementIndex(i, i2, FirebaseAnalytics.Param.INDEX);
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static void checkPositionIndex(int i, int i2) {
        checkPositionIndex(i, i2, FirebaseAnalytics.Param.INDEX);
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        checkPositionIndex(i, i3, "start index");
        checkPositionIndex(i2, i3, "end index");
        if (i2 >= i) {
            return;
        }
        throw new IndexOutOfBoundsException(format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    private static boolean containsOrIsNull(Iterable<?> iterable) {
        if (iterable == null) {
            return true;
        }
        if (iterable instanceof Collection) {
            try {
                return ((Collection) iterable).contains(null);
            } catch (NullPointerException unused) {
                return false;
            }
        }
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                return true;
            }
        }
        return false;
    }

    static String format(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb2.append(str.substring(i2, indexOf));
            sb2.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb2.append(str.substring(i2));
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb2.append(", ");
                sb2.append(objArr[i3]);
            }
            sb2.append(C21114v8.C21123i.f54139e);
        }
        return sb2.toString();
    }

    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void checkElementIndex(int i, int i2, String str) {
        checkArgument(i2 >= 0, "negative size: %s", Integer.valueOf(i2));
        if (i < 0) {
            throw new IndexOutOfBoundsException(format("%s (%s) must not be negative", str, Integer.valueOf(i)));
        }
        if (i >= i2) {
            throw new IndexOutOfBoundsException(format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkPositionIndex(int i, int i2, String str) {
        checkArgument(i2 >= 0, "negative size: %s", Integer.valueOf(i2));
        if (i < 0) {
            throw new IndexOutOfBoundsException(format("%s (%s) must not be negative", str, Integer.valueOf(i)));
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException(format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(format(str, objArr));
        }
    }

    public static <T extends Iterable<?>> T checkContentsNotNull(T t, Object obj) {
        if (containsOrIsNull(t)) {
            throw new NullPointerException(String.valueOf(obj));
        }
        return t;
    }

    public static <T> T checkNotNull(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(format(str, objArr));
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(format(str, objArr));
        }
    }

    public static <T extends Iterable<?>> T checkContentsNotNull(T t, String str, Object... objArr) {
        if (containsOrIsNull(t)) {
            throw new NullPointerException(format(str, objArr));
        }
        return t;
    }
}
