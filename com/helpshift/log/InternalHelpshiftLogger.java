package com.helpshift.log;

import android.util.Log;
import com.helpshift.log.ILogger;

/* loaded from: classes5.dex */
public class InternalHelpshiftLogger implements ILogger {
    private static final String TAG = "Helpshift";
    private final boolean isAppInDebugMode;
    private LogCollector logCollector;
    private final boolean shouldEnableLogging;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.helpshift.log.InternalHelpshiftLogger$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C17730a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44761a;

        static {
            int[] iArr = new int[ILogger.LEVEL.values().length];
            f44761a = iArr;
            try {
                iArr[ILogger.LEVEL.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44761a[ILogger.LEVEL.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44761a[ILogger.LEVEL.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public InternalHelpshiftLogger(boolean z, boolean z2) {
        this.isAppInDebugMode = z;
        this.shouldEnableLogging = z2;
    }

    private void logMessage(ILogger.LEVEL level, String str, String str2, Throwable th) {
        if (!this.shouldEnableLogging) {
            return;
        }
        String str3 = str + " : " + str2;
        int i = C17730a.f44761a[level.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && this.isAppInDebugMode) {
                    Log.d(TAG, str3, th);
                }
            } else {
                Log.w(TAG, str3, th);
            }
        } else {
            Log.e(TAG, str3, th);
        }
        LogCollector logCollector = this.logCollector;
        if (logCollector != null) {
            logCollector.collectLog(TAG, str3, th, level);
        }
    }

    @Override // com.helpshift.log.ILogger
    /* renamed from: d */
    public void mo65435d(String str, String str2) {
        mo65434d(str, str2, null);
    }

    @Override // com.helpshift.log.ILogger
    /* renamed from: e */
    public void mo65433e(String str, String str2) {
        mo65432e(str, str2, null);
    }

    public void setLogCollector(LogCollector logCollector) {
        this.logCollector = logCollector;
    }

    @Override // com.helpshift.log.ILogger
    /* renamed from: w */
    public void mo65431w(String str, String str2) {
        mo65430w(str, str2, null);
    }

    @Override // com.helpshift.log.ILogger
    /* renamed from: d */
    public void mo65434d(String str, String str2, Throwable th) {
        logMessage(ILogger.LEVEL.DEBUG, str, str2, th);
    }

    @Override // com.helpshift.log.ILogger
    /* renamed from: e */
    public void mo65432e(String str, String str2, Throwable th) {
        logMessage(ILogger.LEVEL.ERROR, str, str2, th);
    }

    @Override // com.helpshift.log.ILogger
    /* renamed from: w */
    public void mo65430w(String str, String str2, Throwable th) {
        logMessage(ILogger.LEVEL.WARN, str, str2, th);
    }
}
