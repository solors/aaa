package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class Android {
    private static final boolean IS_ROBOLECTRIC;
    private static final Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");

    static {
        boolean z;
        if (getClassForName("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        IS_ROBOLECTRIC = z;
    }

    Android() {
    }

    private static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isOnAndroidDevice() {
        if (MEMORY_CLASS != null && !IS_ROBOLECTRIC) {
            return true;
        }
        return false;
    }
}
