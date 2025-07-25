package com.mbridge.msdk.foundation.same.report.p451c;

/* renamed from: com.mbridge.msdk.foundation.same.report.c.a */
/* loaded from: classes6.dex */
public class LogFileController {

    /* renamed from: a */
    public static final String f56723a = "a";

    /* renamed from: b */
    private static LogFileController f56724b;

    private LogFileController() {
    }

    /* renamed from: a */
    public static LogFileController m52106a() {
        if (f56724b == null) {
            synchronized (LogFileController.class) {
                if (f56724b == null) {
                    f56724b = new LogFileController();
                }
            }
        }
        return f56724b;
    }
}
