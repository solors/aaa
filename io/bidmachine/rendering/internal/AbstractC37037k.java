package io.bidmachine.rendering.internal;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C21114v8;
import java.net.UnknownHostException;

/* renamed from: io.bidmachine.rendering.internal.k */
/* loaded from: classes9.dex */
public abstract class AbstractC37037k {

    /* renamed from: a */
    private static boolean f97745a = false;

    /* renamed from: a */
    public static boolean m19169a() {
        return m19163b();
    }

    /* renamed from: b */
    public static boolean m19163b() {
        return f97745a;
    }

    /* renamed from: a */
    public static void m19166a(String str, Object... objArr) {
        m19168a(null, str, true, objArr);
    }

    /* renamed from: b */
    public static void m19162b(Object obj, String str, Object... objArr) {
        m19168a(obj, str, false, objArr);
    }

    /* renamed from: a */
    public static void m19167a(Object obj, String str, Object... objArr) {
        m19168a(obj, str, true, objArr);
    }

    /* renamed from: b */
    public static void m19161b(Throwable th) {
        m19165a(th);
    }

    /* renamed from: a */
    private static void m19168a(Object obj, String str, boolean z, Object... objArr) {
        if (m19169a()) {
            if (objArr != null && objArr.length != 0) {
                try {
                    str = String.format(str, objArr);
                } catch (Throwable unused) {
                }
            }
            if (obj != null) {
                String obj2 = obj.toString();
                if (!TextUtils.isEmpty(obj2)) {
                    str = C21114v8.C21123i.f54137d + obj2 + "] " + str;
                }
            }
            if (z) {
                Log.e("AdaptiveRendering", str);
            } else {
                Log.d("AdaptiveRendering", str);
            }
        }
    }

    /* renamed from: a */
    private static void m19165a(Throwable th) {
        if (m19169a()) {
            if (th instanceof UnknownHostException) {
                th.printStackTrace();
            } else {
                Log.w("AdaptiveRendering", th);
            }
        }
    }

    /* renamed from: a */
    public static void m19164a(boolean z) {
        f97745a = z;
    }
}
