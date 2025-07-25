package com.maticoo.sdk.utils.crash;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.maticoo.sdk.utils.JSONUtil;
import com.maticoo.sdk.utils.WorkExecutor;
import com.maticoo.sdk.utils.event.Event;
import com.maticoo.sdk.utils.event.EventReportManager;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class CrashUtil implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler mDefaultEh;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class CrashUtilHolder {
        private static final CrashUtil INSTANCE = new CrashUtil();

        private CrashUtilHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getErrorType(String str) {
        String str2;
        String str3 = "";
        try {
            Matcher matcher = Pattern.compile(".*?(Exception|Error|Death)", 2).matcher(str);
            if (!matcher.find()) {
                str2 = "";
            } else {
                str2 = matcher.group(0);
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                return str2.replaceAll("Caused by:", "").replaceAll(" ", "");
            }
            return str2;
        } catch (Exception e2) {
            str3 = str2;
            e = e2;
            DeveloperLog.LogD("CrashUtil", e);
            return str3;
        }
    }

    public static CrashUtil getSingleton() {
        return CrashUtilHolder.INSTANCE;
    }

    private static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = new Throwable("1.8.1.1", th); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public void init() {
        try {
            if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof CrashUtil)) {
                this.mDefaultEh = Thread.getDefaultUncaughtExceptionHandler();
            }
            Thread.setDefaultUncaughtExceptionHandler(this);
        } catch (Exception e) {
            DeveloperLog.LogD("CrashUtil", e);
        }
    }

    public void reportException(int i, Throwable th, String str) {
        if (th == null) {
            return;
        }
        reportException(i, getStackTraceString(th), str);
    }

    public void reportSDKException(Throwable th) {
        reportSDKException(th, (String) null);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        long j;
        if (th != null) {
            try {
                if (!(th instanceof UndeclaredThrowableException)) {
                    if (thread != null) {
                        j = thread.getId();
                    } else {
                        j = 0;
                    }
                    DeveloperLog.LogD("CrashUtil", "uncaughtException thread=" + j);
                    reportException(502, th, (String) null);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mDefaultEh;
                    if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this && !(uncaughtExceptionHandler instanceof CrashUtil)) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            } catch (Exception e) {
                DeveloperLog.LogD("CrashUtil", e);
            }
        }
    }

    private CrashUtil() {
    }

    public void reportSDKException(String str, String str2) {
        reportException(501, str, str2);
    }

    public void reportException(final int i, final String str, final String str2) {
        if (str == null) {
            return;
        }
        WorkExecutor.execute(new Runnable() { // from class: com.maticoo.sdk.utils.crash.CrashUtil.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                int i2 = i;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    String str3 = str2;
                    if (str3 != null) {
                        sb2.append(str3);
                        sb2.append(" : ");
                    }
                    sb2.append(str);
                    String sb3 = sb2.toString();
                    DeveloperLog.LogD("CrashUtil", "saveException:" + sb3);
                    if (!TextUtils.isEmpty(sb3)) {
                        String errorType = CrashUtil.getErrorType(sb3);
                        if (TextUtils.isEmpty(errorType)) {
                            errorType = NativeProtocol.ERROR_UNKNOWN_ERROR;
                        }
                        DeveloperLog.LogD("CrashUtil", "saveException:errorType = " + errorType);
                        String replaceAll = sb3.replaceAll("\u0001", " ");
                        if (i2 == 501) {
                            z = true;
                        } else {
                            if (replaceAll.contains("maticoo")) {
                                i2 = 501;
                            }
                            z = false;
                        }
                        JSONObject jSONObject = new JSONObject();
                        JSONUtil.put(jSONObject, "error_type", errorType);
                        JSONUtil.put(jSONObject, "error_info", replaceAll);
                        if (i2 == 501) {
                            JSONUtil.put(jSONObject, "is_try_catch", Boolean.valueOf(z));
                        }
                        EventReportManager.getInstance().reportEvent(new Event(i2, jSONObject));
                    }
                } catch (Throwable th) {
                    DeveloperLog.LogD("CrashUtil", th);
                }
            }
        });
    }

    public void reportSDKException(Throwable th, String str) {
        if (th == null) {
            return;
        }
        reportException(501, getStackTraceString(th), str);
    }
}
