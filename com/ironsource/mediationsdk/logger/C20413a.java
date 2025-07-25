package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.C21114v8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* renamed from: com.ironsource.mediationsdk.logger.a */
/* loaded from: classes6.dex */
public class C20413a extends IronSourceLogger {

    /* renamed from: c */
    public static final String f51656c = "console";

    /* renamed from: d */
    public static final String f51657d = "ironSourceSDK: ";

    private C20413a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        boolean z;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UIThread: ");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        sb2.append(z);
        sb2.append(" ");
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Activity: ");
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null) {
            obj = Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode());
        } else {
            obj = Boolean.FALSE;
        }
        sb4.append(obj);
        sb4.append(" ");
        String sb5 = sb4.toString();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        Log.e(f51657d + ironSourceTag, str);
                        return;
                    }
                    return;
                }
                Log.w(f51657d + ironSourceTag, str);
                return;
            }
            Log.i(f51657d + ironSourceTag, str);
            return;
        }
        Log.v(f51657d + ironSourceTag, sb3 + sb5 + str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        log(ironSourceTag, str + ":stacktrace[" + Log.getStackTraceString(th) + C21114v8.C21123i.f54139e, 3);
    }

    public C20413a(int i) {
        super("console", i);
    }
}
