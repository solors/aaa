package com.mbridge.msdk.newreward.function.p495h;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.CommonConst;
import com.mbridge.msdk.foundation.tools.SameBase64Tool;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import com.mbridge.msdk.p411c.SettingManager;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.newreward.function.h.c */
/* loaded from: classes6.dex */
public final class MBridgeCommonUtils {
    /* renamed from: a */
    public static String m50257a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: b */
    public static boolean m50255b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return SameTool.m51714i(str);
    }

    /* renamed from: c */
    public static boolean m50254c(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String[] split2 = str.split("_");
            if (split2.length < 4) {
                return false;
            }
            String str2 = split2[3];
            if (!TextUtils.isEmpty(str2) && (split = SameBase64Tool.m51603a(str2).split("\\|")) != null) {
                if (split.length != 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: d */
    public static double m50253d(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            split = str.split("_");
        } catch (Exception unused) {
        }
        if (split.length < 4) {
            return 0.0d;
        }
        String str2 = split[3];
        if (TextUtils.isEmpty(str2)) {
            return 0.0d;
        }
        String[] split2 = SameBase64Tool.m51603a(str2).split("\\|");
        if (split2.length > 0) {
            return Double.parseDouble(split2[0]);
        }
        return 0.0d;
    }

    /* renamed from: a */
    public static String m50258a(File file) {
        StringBuilder sb2 = new StringBuilder();
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        for (int read = fileInputStream2.read(bArr); read > 0; read = fileInputStream2.read(bArr)) {
                            sb2.append(new String(bArr, 0, read));
                        }
                        fileInputStream2.close();
                    } catch (Exception unused) {
                        fileInputStream = fileInputStream2;
                        sb2.setLength(0);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return sb2.toString();
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static void m50256a(final String str, final int i, final int i2, final int i3) {
        MBridgeTaskManager.commonExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.h.c.1
            @Override // java.lang.Runnable
            public final void run() {
                int i4;
                try {
                    JSONObject jSONObject = new JSONObject();
                    int i5 = 1;
                    jSONObject.put("ivRewardEnable", 1);
                    if (i == CommonConst.f56439H) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    jSONObject.put("ivRewardMode", i4);
                    if (i2 == CommonConst.f56441J) {
                        i5 = 0;
                    }
                    jSONObject.put("ivRewardPlayValueMode", i5);
                    jSONObject.put("ivRewardPlayValue", i3);
                    SettingManager.m53286a().m53270f(str, jSONObject.toString());
                } catch (Exception unused) {
                }
            }
        });
    }
}
