package com.bytedance.sdk.openadsdk.multipro.eqN;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.C7170IL;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.eqN.eqN */
/* loaded from: classes3.dex */
public class C9353eqN {
    /* renamed from: IL */
    private static String m82985IL(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    /* renamed from: bg */
    private static boolean m82983bg() {
        return C8838VzQ.m84740bg() == null;
    }

    /* renamed from: IL */
    public static String m82984IL(String str, String str2, String str3) {
        if (m82983bg()) {
            return str3;
        }
        if (C9307IL.m83088bX()) {
            return C9351bg.m83003IL(m82985IL(str), str2, str3);
        }
        return C9351bg.m82997bg(C8838VzQ.m84740bg(), m82985IL(str), str2, str3);
    }

    /* renamed from: bg */
    public static void m82978bg(String str, String str2, Boolean bool) {
        if (m82983bg()) {
            return;
        }
        if (C9307IL.m83088bX()) {
            C9351bg.m82991bg(m82985IL(str), str2, bool);
        } else {
            m82975bg(m82985IL(str), str2, bool);
        }
    }

    /* renamed from: bg */
    public static void m82976bg(String str, String str2, Long l) {
        if (m82983bg()) {
            return;
        }
        if (C9307IL.m83088bX()) {
            C9351bg.m82988bg(m82985IL(str), str2, l);
        } else {
            m82975bg(m82985IL(str), str2, l);
        }
    }

    /* renamed from: bg */
    public static void m82974bg(String str, String str2, String str3) {
        if (m82983bg()) {
            return;
        }
        if (C9307IL.m83088bX()) {
            C9351bg.m82987bg(m82985IL(str), str2, str3);
        } else {
            m82975bg(m82985IL(str), str2, str3);
        }
    }

    /* renamed from: bg */
    public static void m82977bg(String str, String str2, Integer num) {
        if (m82983bg()) {
            return;
        }
        if (C9307IL.m83088bX()) {
            C9351bg.m82989bg(m82985IL(str), str2, num);
        } else {
            m82975bg(m82985IL(str), str2, num);
        }
    }

    /* renamed from: bg */
    public static int m82980bg(String str, String str2, int i) {
        if (m82983bg()) {
            return i;
        }
        if (C9307IL.m83088bX()) {
            return C9351bg.m82993bg(m82985IL(str), str2, i);
        }
        return C9351bg.m82999bg(C8838VzQ.m84740bg(), m82985IL(str), str2, i);
    }

    /* renamed from: bg */
    public static boolean m82973bg(String str, String str2, boolean z) {
        if (m82983bg()) {
            return z;
        }
        if (C9307IL.m83088bX()) {
            return C9351bg.m82986bg(m82985IL(str), str2, z);
        }
        return C9351bg.m82996bg(C8838VzQ.m84740bg(), m82985IL(str), str2, z);
    }

    /* renamed from: bg */
    public static long m82979bg(String str, String str2, long j) {
        if (m82983bg()) {
            return j;
        }
        if (C9307IL.m83088bX()) {
            return C9351bg.m82992bg(m82985IL(str), str2, j);
        }
        return C9351bg.m82998bg(C8838VzQ.m84740bg(), m82985IL(str), str2, j);
    }

    /* renamed from: bg */
    public static void m82981bg(String str, String str2) {
        if (m82983bg()) {
            return;
        }
        try {
            if (C9307IL.m83088bX()) {
                C9351bg.m83004IL(m82985IL(str), str2);
            } else {
                C9349IL.m83020IL(C8838VzQ.m84740bg(), m82985IL(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public static void m82982bg(String str) {
        if (m82983bg()) {
            return;
        }
        if (C9307IL.m83088bX()) {
            C9351bg.m82995bg(m82985IL(str));
        } else {
            C9349IL.m83021IL(C8838VzQ.m84740bg(), m82985IL(str));
        }
    }

    /* renamed from: bg */
    private static <T> void m82975bg(String str, String str2, T t) {
        String m82994bg = C9351bg.m82994bg(str, str2);
        if (C8840WR.m84699iR(m82994bg)) {
            C7170IL.SharedPreferences$EditorC7175bX m89740IL = C7170IL.m89731bg(C8838VzQ.m84740bg(), m82985IL(m82994bg)).m89740IL();
            C9349IL.m83011bg(m89740IL, str2, (Object) t);
            m89740IL.apply();
            return;
        }
        SharedPreferences m83016bg = C9349IL.m83016bg(C8838VzQ.m84740bg(), m82985IL(m82994bg));
        if (m83016bg == null) {
            return;
        }
        SharedPreferences.Editor edit = m83016bg.edit();
        C9349IL.m83012bg(edit, str2, t);
        edit.apply();
    }
}
