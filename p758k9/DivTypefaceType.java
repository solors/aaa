package p758k9;

import android.graphics.Typeface;
import androidx.annotation.NonNull;

/* renamed from: k9.b */
/* loaded from: classes8.dex */
public enum DivTypefaceType {
    REGULAR,
    MEDIUM,
    BOLD,
    LIGHT;

    /* compiled from: DivTypefaceType.java */
    /* renamed from: k9.b$a */
    /* loaded from: classes8.dex */
    static /* synthetic */ class C37410a {

        /* renamed from: a */
        static final /* synthetic */ int[] f98722a;

        static {
            int[] iArr = new int[DivTypefaceType.values().length];
            f98722a = iArr;
            try {
                iArr[DivTypefaceType.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98722a[DivTypefaceType.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98722a[DivTypefaceType.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: c */
    public Typeface m18133c(@NonNull DivTypefaceProvider divTypefaceProvider) {
        int i = C37410a.f98722a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return divTypefaceProvider.getRegular();
                }
                return divTypefaceProvider.getLight();
            }
            return divTypefaceProvider.getMedium();
        }
        return divTypefaceProvider.getBold();
    }
}
