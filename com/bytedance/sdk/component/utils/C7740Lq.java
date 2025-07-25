package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.C20747r8;

/* renamed from: com.bytedance.sdk.component.utils.Lq */
/* loaded from: classes3.dex */
public class C7740Lq {
    /* renamed from: IL */
    public static int m87888IL(Context context) {
        int m87886bX = m87886bX(context);
        if (m87886bX != 1) {
            if (m87886bX == 4) {
                return 1;
            }
            if (m87886bX == 5) {
                return 4;
            }
            if (m87886bX == 6) {
                return 6;
            }
            return m87886bX;
        }
        return 0;
    }

    /* renamed from: Kg */
    public static boolean m87887Kg(Context context) {
        if (context == null) {
            return false;
        }
        int m87886bX = m87886bX(context);
        char c = 2;
        if (m87886bX != 2) {
            c = 3;
            if (m87886bX != 3) {
                c = 4;
                if (m87886bX != 4) {
                    if (m87886bX != 5) {
                        if (m87886bX != 6) {
                            c = 0;
                        } else {
                            c = 5;
                        }
                    }
                } else {
                    c = 1;
                }
            }
        }
        if (c == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: bX */
    public static int m87886bX(Context context) {
        return C7759rri.m87808bg(context, 60000L);
    }

    /* renamed from: bg */
    public static boolean m87885bg(Context context) {
        return m87886bX(context) != 0;
    }

    public static boolean eqN(Context context) {
        if (m87886bX(context) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: iR */
    public static String m87883iR(Context context) {
        int m87886bX = m87886bX(context);
        if (m87886bX != 2) {
            if (m87886bX != 3) {
                if (m87886bX != 4) {
                    if (m87886bX != 5) {
                        if (m87886bX != 6) {
                            return DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY;
                        }
                        return "5g";
                    }
                    return "4g";
                }
                return C20747r8.f52730b;
            }
            return C20747r8.f52729a;
        }
        return "2g";
    }

    public static boolean ldr(Context context) {
        if (m87886bX(context) == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: zx */
    public static boolean m87882zx(Context context) {
        if (m87886bX(context) == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public static boolean m87884bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS);
    }
}
