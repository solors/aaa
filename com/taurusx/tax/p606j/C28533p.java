package com.taurusx.tax.p606j;

import androidx.annotation.NonNull;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.C28206a;
import java.lang.Thread;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.p */
/* loaded from: classes7.dex */
public class C28533p implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public static C28533p f73984b;

    /* renamed from: a */
    public Thread.UncaughtExceptionHandler f73985a = Thread.getDefaultUncaughtExceptionHandler();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        StackTraceElement[] stackTrace;
        StackTraceElement[] stackTrace2;
        StringFogImpl stringFogImpl = C28162a.f73047a;
        LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{-49, 1, -50, 18, -50, 19, -61, 77, -55, 5, -41, 5, -38, 19, -34}, new byte[]{-69, 96}), stringFogImpl.m23824a(new byte[]{108, 107, 122, 100, 108, 98, 113, 113, 92, 125, 122, 96, 105, 113, 112, 106, 119}, new byte[]{25, 5}));
        if (th != null) {
            String str = thread.getName() + stringFogImpl.m23824a(new byte[]{33, 27, 96, 7, 96, 95, 109, 16, 111, 22, 47, 35, 116, 31, 117, 24, 108, 20, 68, 9, 98, 20, 113, 5, 104, 30, 111, 75, 33}, new byte[]{1, 113}) + th.getMessage();
            Throwable cause = th.getCause();
            if (cause != null) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    str = str + C28162a.f73047a.m23824a(new byte[]{16, 103, 123, 51, 32, 103}, new byte[]{26, 71}) + stackTraceElement.toString();
                }
            } else {
                for (StackTraceElement stackTraceElement2 : th.getStackTrace()) {
                    str = str + C28162a.f73047a.m23824a(new byte[]{102, -74, 13, -30, 86, -74}, new byte[]{108, -106}) + stackTraceElement2.toString();
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                jSONObject.put(stringFogImpl2.m23824a(new byte[]{104, 45, 104, 53, 121, 4, 99, 58, 96, 62}, new byte[]{13, 91}), stringFogImpl2.m23824a(new byte[]{19, -91, 18, -83}, new byte[]{34, -107}));
                jSONObject.put(stringFogImpl2.m23824a(new byte[]{123, -22, 121, -21, 112, -57, 123, -7, 109, -21, 125}, new byte[]{24, -104}), str);
                jSONObject.put(stringFogImpl2.m23824a(new byte[]{21, 124, 21, 100, 4, 85, 4, 99, 29, 111}, new byte[]{112, 10}), System.currentTimeMillis());
                C28206a.m38470e().f73193i.m38312a(jSONObject);
            } catch (Exception unused) {
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f73985a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
