package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameBase64Tool;

/* renamed from: com.mbridge.msdk.foundation.same.net.Aa */
/* loaded from: classes6.dex */
public class C21986Aa {
    private static final String C_END = "_mv_end";
    private static final String C_START = "mv_channel_";

    /* renamed from: a */
    private static String f56574a = "";

    /* renamed from: a */
    public static String m52221a() {
        return f56574a;
    }

    /* renamed from: b */
    public static String m52220b() {
        return null;
    }

    /* renamed from: c */
    private static Integer m52218c(String str) {
        Throwable th;
        Integer num;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(C_START);
        int indexOf2 = str.indexOf(C_END);
        if (indexOf == -1 || indexOf2 == -1 || indexOf2 <= indexOf) {
            return null;
        }
        try {
            num = Integer.valueOf(str.substring(indexOf + 11, indexOf2));
        } catch (Throwable th2) {
            th = th2;
            num = null;
        }
        try {
            if (num.intValue() <= 0) {
                return null;
            }
            return num;
        } catch (Throwable th3) {
            th = th3;
            th.printStackTrace();
            return num;
        }
    }

    /* renamed from: g */
    private static void m52217g() {
        new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.Aa.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Process.killProcess(Process.myPid());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }, 500L);
    }

    /* renamed from: b */
    private static void m52219b(String str) {
        String str2;
        Integer m52218c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            str2 = SameBase64Tool.m51603a(str);
        } catch (Throwable th) {
            th.printStackTrace();
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2) && str2.startsWith(C_START) && str2.endsWith(C_END) && (m52218c = m52218c(str2)) != null) {
            f56574a = String.valueOf(m52218c);
        } else if (!MBridgeConstans.DEBUG) {
            f56574a = "";
        } else {
            m52217g();
            throw new RuntimeException("please don't update this value");
        }
    }
}
