package la;

import kotlin.Metadata;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.o */
/* loaded from: classes8.dex */
public final class C38034o {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final double m15602c(int i) throws IllegalArgumentException {
        boolean z = false;
        if (i >= 0 && i < 256) {
            z = true;
        }
        if (z) {
            return i / 255.0f;
        }
        throw new IllegalArgumentException("Value out of channel range 0..255");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final int m15601d(double d) throws IllegalArgumentException {
        if (d >= 0.0d && d <= 1.0d) {
            return (int) ((d * 255.0f) + 0.5f);
        }
        throw new IllegalArgumentException();
    }
}
