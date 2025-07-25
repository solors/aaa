package p696h6;

import android.content.Context;

/* compiled from: Utils.java */
/* renamed from: h6.j */
/* loaded from: classes6.dex */
public class C33484j {
    /* renamed from: a */
    public static String m23659a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
        } catch (Throwable unused) {
            return "unset";
        }
    }

    /* renamed from: b */
    public static String m23658b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
        } catch (Throwable unused) {
            return "unset";
        }
    }
}
