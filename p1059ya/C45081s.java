package p1059ya;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: Views.java */
/* renamed from: ya.s */
/* loaded from: classes8.dex */
public class C45081s {

    /* renamed from: a */
    private static final int[] f118567a = new int[2];

    @Nullable
    /* renamed from: a */
    public static <T extends View> T m965a(@NonNull View view, @IdRes int i) {
        return (T) view.findViewById(i);
    }

    @NonNull
    /* renamed from: b */
    public static <T extends View> T m964b(@NonNull View view, @IdRes int i) {
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("View with id [" + view.getResources().getResourceName(i) + "] doesn't exist");
    }

    @MainThread
    /* renamed from: c */
    public static boolean m963c(@NonNull View view, float f, float f2) {
        int[] iArr = f118567a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        if (f < i || f > i + view.getWidth()) {
            return false;
        }
        int i2 = iArr[1];
        if (f2 < i2 || f2 > i2 + view.getHeight()) {
            return false;
        }
        return true;
    }
}
