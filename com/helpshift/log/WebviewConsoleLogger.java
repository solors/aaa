package com.helpshift.log;

import android.webkit.ConsoleMessage;

/* loaded from: classes5.dex */
public class WebviewConsoleLogger {

    /* renamed from: com.helpshift.log.WebviewConsoleLogger$a */
    /* loaded from: classes5.dex */
    static /* synthetic */ class C17732a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44769a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            f44769a = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44769a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44769a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44769a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44769a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void log(ConsoleMessage.MessageLevel messageLevel, String str, String str2) {
        if (messageLevel == null) {
            HSLogger.m65441d(str, str2);
            return;
        }
        int i = C17732a.f44769a[messageLevel.ordinal()];
        if (i != 1) {
            if (i != 2) {
                HSLogger.m65441d(str, str2);
                return;
            } else {
                HSLogger.m65437w(str, str2);
                return;
            }
        }
        HSLogger.m65439e(str, str2);
    }
}
