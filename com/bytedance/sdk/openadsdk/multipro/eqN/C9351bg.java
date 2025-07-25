package com.bytedance.sdk.openadsdk.multipro.eqN;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.C7170IL;
import com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;
import com.bytedance.sdk.openadsdk.multipro.C9348eqN;
import com.bytedance.sdk.openadsdk.multipro.p353bg.C9347bg;
import com.ironsource.C19577ad;
import com.maticoo.sdk.utils.constant.KeyConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashSet;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.eqN.bg */
/* loaded from: classes3.dex */
public class C9351bg {

    /* renamed from: bg */
    public static HashSet<String> f20869bg = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.eqN.bg.1
        {
            add(KeyConstants.RequestBody.KEY_DID);
            add("app_id");
            add("global_coppa");
            add("tt_gdpr");
            add("global_ccpa");
            add("keywords");
            add("extra_data");
            add(C19577ad.f49047D0);
            add("sdk_app_sha1");
            add(CommonUrlParts.UUID);
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    /* renamed from: IL */
    private static InterfaceC7711ldr m83006IL() {
        try {
            if (m83001bg()) {
                return C9347bg.m83029bg(C8838VzQ.m84740bg());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bX */
    private static Context m83002bX() {
        return C8838VzQ.m84740bg();
    }

    /* renamed from: bg */
    public static boolean m83001bg() {
        if (C8838VzQ.m84740bg() == null) {
            C7741PX.m87880IL("The context of SPHelper is null, please initialize sdk in main process");
            return false;
        }
        return true;
    }

    private static String eqN() {
        return C9348eqN.f20865IL + "/t_sp/";
    }

    /* renamed from: IL */
    private static String m83005IL(String str) {
        return TextUtils.isEmpty(str) ? "" : "?sp_file_name=".concat(String.valueOf(str));
    }

    /* renamed from: bg */
    public static synchronized void m82991bg(String str, String str2, Boolean bool) {
        synchronized (C9351bg.class) {
            if (m83001bg()) {
                try {
                    if (!C9307IL.m83088bX()) {
                        C9349IL.m83014bg(m83002bX(), str, str2, bool);
                        return;
                    }
                    InterfaceC7711ldr m83006IL = m83006IL();
                    if (m83006IL != null) {
                        Uri parse = Uri.parse(eqN() + "boolean/" + str2 + m83005IL(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", bool);
                        m83006IL.mo83048bg(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: IL */
    public static String m83003IL(String str, String str2, String str3) {
        if (m83001bg()) {
            if (!C9307IL.m83088bX()) {
                return m82997bg(m83002bX(), str, str2, str3);
            }
            InterfaceC7711ldr m83006IL = m83006IL();
            if (m83006IL != null) {
                String mo83050bg = m83006IL.mo83050bg(Uri.parse(eqN() + "string/" + str2 + m83005IL(str)));
                if (mo83050bg != null && !mo83050bg.equals("null")) {
                    return mo83050bg;
                }
            }
            return str3;
        }
        return str3;
    }

    /* renamed from: IL */
    public static void m83004IL(String str, String str2) {
        if (m83001bg()) {
            try {
                if (!C9307IL.m83088bX()) {
                    C9349IL.m83020IL(m83002bX(), str, str2);
                    return;
                }
                InterfaceC7711ldr m83006IL = m83006IL();
                if (m83006IL != null) {
                    m83006IL.mo83047bg(Uri.parse(eqN() + "long/" + str2 + m83005IL(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: bg */
    public static synchronized void m82987bg(String str, String str2, String str3) {
        synchronized (C9351bg.class) {
            if (m83001bg()) {
                try {
                    if (!C9307IL.m83088bX()) {
                        C9349IL.m83014bg(m83002bX(), str, str2, str3);
                        return;
                    }
                    InterfaceC7711ldr m83006IL = m83006IL();
                    if (m83006IL != null) {
                        Uri parse = Uri.parse(eqN() + "string/" + str2 + m83005IL(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", str3);
                        m83006IL.mo83048bg(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: bg */
    public static synchronized void m82989bg(String str, String str2, Integer num) {
        synchronized (C9351bg.class) {
            if (m83001bg()) {
                try {
                    if (!C9307IL.m83088bX()) {
                        C9349IL.m83014bg(m83002bX(), str, str2, num);
                        return;
                    }
                    InterfaceC7711ldr m83006IL = m83006IL();
                    if (m83006IL != null) {
                        Uri parse = Uri.parse(eqN() + "int/" + str2 + m83005IL(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", num);
                        m83006IL.mo83048bg(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: bg */
    public static synchronized void m82988bg(String str, String str2, Long l) {
        synchronized (C9351bg.class) {
            if (m83001bg()) {
                try {
                    if (!C9307IL.m83088bX()) {
                        C9349IL.m83014bg(m83002bX(), str, str2, l);
                        return;
                    }
                    InterfaceC7711ldr m83006IL = m83006IL();
                    if (m83006IL != null) {
                        Uri parse = Uri.parse(eqN() + "long/" + str2 + m83005IL(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", l);
                        m83006IL.mo83048bg(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: bg */
    public static synchronized void m82990bg(String str, String str2, Float f) {
        synchronized (C9351bg.class) {
            if (m83001bg()) {
                try {
                    if (!C9307IL.m83088bX()) {
                        C9349IL.m83014bg(m83002bX(), str, str2, f);
                        return;
                    }
                    InterfaceC7711ldr m83006IL = m83006IL();
                    if (m83006IL != null) {
                        Uri parse = Uri.parse(eqN() + "float/" + str2 + m83005IL(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", f);
                        m83006IL.mo83048bg(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: bg */
    public static String m82997bg(Context context, String str, String str2, String str3) {
        String m82994bg = m82994bg(str, str2);
        if (C8840WR.m84699iR(m82994bg)) {
            return C7170IL.m89731bg(context, m82994bg).m89720bg(str2, str3);
        }
        SharedPreferences m83016bg = C9349IL.m83016bg(context, m82994bg);
        return m83016bg == null ? str3 : m83016bg.getString(str2, str3);
    }

    /* renamed from: bg */
    public static String m82994bg(String str, String str2) {
        return f20869bg.contains(str2) ? "pag_sp_bad_par" : str;
    }

    /* renamed from: bg */
    public static int m82993bg(String str, String str2, int i) {
        if (m83001bg()) {
            if (!C9307IL.m83088bX()) {
                return m82999bg(m83002bX(), str, str2, i);
            }
            InterfaceC7711ldr m83006IL = m83006IL();
            if (m83006IL != null) {
                String mo83050bg = m83006IL.mo83050bg(Uri.parse(eqN() + "int/" + str2 + m83005IL(str)));
                if (mo83050bg != null && !mo83050bg.equals("null")) {
                    return Integer.parseInt(mo83050bg);
                }
            }
            return i;
        }
        return i;
    }

    /* renamed from: bg */
    public static int m82999bg(Context context, String str, String str2, int i) {
        String m82994bg = m82994bg(str, str2);
        if (C8840WR.m84699iR(m82994bg)) {
            return C7170IL.m89731bg(context, m82994bg).m89722bg(str2, i);
        }
        SharedPreferences m83016bg = C9349IL.m83016bg(context, m82994bg);
        return m83016bg == null ? i : m83016bg.getInt(str2, i);
    }

    /* renamed from: bg */
    public static float m83000bg(Context context, String str, String str2, float f) {
        String m82994bg = m82994bg(str, str2);
        if (C8840WR.m84699iR(m82994bg)) {
            return C7170IL.m89731bg(context, m82994bg).m89723bg(str2, f);
        }
        SharedPreferences m83016bg = C9349IL.m83016bg(context, m82994bg);
        return m83016bg == null ? f : m83016bg.getFloat(str2, f);
    }

    /* renamed from: bg */
    public static boolean m82986bg(String str, String str2, boolean z) {
        if (m83001bg()) {
            if (!C9307IL.m83088bX()) {
                return m82996bg(m83002bX(), str, str2, z);
            }
            InterfaceC7711ldr m83006IL = m83006IL();
            if (m83006IL != null) {
                String mo83050bg = m83006IL.mo83050bg(Uri.parse(eqN() + "boolean/" + str2 + m83005IL(str)));
                if (mo83050bg != null && !mo83050bg.equals("null")) {
                    return Boolean.parseBoolean(mo83050bg);
                }
            }
            return z;
        }
        return z;
    }

    /* renamed from: bg */
    public static boolean m82996bg(Context context, String str, String str2, boolean z) {
        String m82994bg = m82994bg(str, str2);
        if (C8840WR.m84699iR(m82994bg)) {
            return C7170IL.m89731bg(context, m82994bg).m89719bg(str2, z);
        }
        SharedPreferences m83016bg = C9349IL.m83016bg(context, m82994bg);
        return m83016bg == null ? z : m83016bg.getBoolean(str2, z);
    }

    /* renamed from: bg */
    public static long m82992bg(String str, String str2, long j) {
        if (m83001bg()) {
            if (!C9307IL.m83088bX()) {
                return m82998bg(m83002bX(), str, str2, j);
            }
            InterfaceC7711ldr m83006IL = m83006IL();
            if (m83006IL != null) {
                String mo83050bg = m83006IL.mo83050bg(Uri.parse(eqN() + "long/" + str2 + m83005IL(str)));
                if (mo83050bg != null && !mo83050bg.equals("null")) {
                    return Long.parseLong(mo83050bg);
                }
            }
            return j;
        }
        return j;
    }

    /* renamed from: bg */
    public static long m82998bg(Context context, String str, String str2, long j) {
        String m82994bg = m82994bg(str, str2);
        if (C8840WR.m84699iR(m82994bg)) {
            return C7170IL.m89731bg(context, m82994bg).m89721bg(str2, j);
        }
        SharedPreferences m83016bg = C9349IL.m83016bg(context, m82994bg);
        return m83016bg == null ? j : m83016bg.getLong(str2, j);
    }

    /* renamed from: bg */
    public static void m82995bg(String str) {
        if (m83001bg()) {
            try {
                if (!C9307IL.m83088bX()) {
                    C9349IL.m83021IL(m83002bX(), str);
                    return;
                }
                InterfaceC7711ldr m83006IL = m83006IL();
                if (m83006IL != null) {
                    m83006IL.mo83047bg(Uri.parse(eqN() + "clean" + m83005IL(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
