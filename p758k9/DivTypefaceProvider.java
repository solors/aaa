package p758k9;

import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.Nullable;

/* renamed from: k9.a */
/* loaded from: classes8.dex */
public interface DivTypefaceProvider {

    /* renamed from: b */
    public static final DivTypefaceProvider f98716b = new C37409a();

    /* compiled from: DivTypefaceProvider.java */
    /* renamed from: k9.a$a */
    /* loaded from: classes8.dex */
    class C37409a implements DivTypefaceProvider {
        C37409a() {
        }

        @Override // p758k9.DivTypefaceProvider
        @Nullable
        public Typeface getBold() {
            return null;
        }

        @Override // p758k9.DivTypefaceProvider
        @Nullable
        public Typeface getLight() {
            return null;
        }

        @Override // p758k9.DivTypefaceProvider
        @Nullable
        public Typeface getMedium() {
            return null;
        }

        @Override // p758k9.DivTypefaceProvider
        @Nullable
        public Typeface getRegular() {
            return null;
        }

        @Override // p758k9.DivTypefaceProvider
        @Nullable
        public Typeface getTypefaceFor(int i) {
            Typeface create;
            if (Build.VERSION.SDK_INT >= 28) {
                create = Typeface.create(Typeface.DEFAULT, i, false);
                return create;
            }
            return super.getTypefaceFor(i);
        }
    }

    @Nullable
    Typeface getBold();

    @Nullable
    Typeface getLight();

    @Nullable
    Typeface getMedium();

    @Nullable
    Typeface getRegular();

    @Nullable
    @Deprecated
    default Typeface getRegularLegacy() {
        return getRegular();
    }

    @Nullable
    default Typeface getTypefaceFor(int i) {
        if (i >= 0 && i < 350) {
            return getLight();
        }
        if (i >= 350 && i < 450) {
            return getRegular();
        }
        if (i >= 450 && i < 600) {
            return getMedium();
        }
        return getBold();
    }
}
