package com.meevii.adsdk.common.util;

/* loaded from: classes6.dex */
public class LogTxtUtil {
    private static volatile boolean isLogToTxt;
    private static final StringBuffer sSBuffer = new StringBuffer();

    public static void addLog(String str, String str2) {
        if (!isLogToTxt) {
            return;
        }
        StringBuffer stringBuffer = sSBuffer;
        stringBuffer.append(str);
        stringBuffer.append("：");
        stringBuffer.append(str2);
        stringBuffer.append("\n");
    }

    public static String getAllLog() {
        return sSBuffer.toString();
    }

    public static void setIsLogToTxt(boolean z) {
        isLogToTxt = z;
    }
}
