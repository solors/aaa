package com.bytedance.sdk.component.ldr.p261bg.p262IL.p263IL;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7691iR;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7692ldr;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.ldr.bg.IL.IL.bg */
/* loaded from: classes3.dex */
public class C7645bg {
    /* renamed from: IL */
    public static void m88273IL() {
        if (C7659Kg.m88154iR().ldr() == null) {
            return;
        }
        try {
            ContentResolver m88272bX = m88272bX();
            if (m88272bX != null) {
                m88272bX.getType(Uri.parse(eqN() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bX */
    private static ContentResolver m88272bX() {
        try {
            if (C7659Kg.m88154iR().ldr() != null) {
                return C7659Kg.m88154iR().ldr().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public static void m88271bg() {
        if (C7659Kg.m88154iR().ldr() == null) {
            return;
        }
        try {
            ContentResolver m88272bX = m88272bX();
            if (m88272bX != null) {
                m88272bX.getType(Uri.parse(eqN() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    private static String eqN() {
        return C7691iR.f16825IL + "/ad_log_event/";
    }

    /* renamed from: bg */
    public static void m88270bg(InterfaceC7706bg interfaceC7706bg) {
        if (interfaceC7706bg == null) {
            return;
        }
        try {
            ContentResolver m88272bX = m88272bX();
            if (m88272bX != null) {
                String m88031bg = C7692ldr.m88031bg(interfaceC7706bg.ldr());
                m88272bX.getType(Uri.parse(eqN() + "adLogDispatch?event=" + m88031bg));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* renamed from: bg */
    public static void m88268bg(String str, List<String> list, boolean z) {
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (String str2 : list) {
                    sb2.append(C7692ldr.m88031bg(str2));
                    sb2.append(",");
                }
                String m88031bg = C7692ldr.m88031bg(sb2.toString());
                String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(m88031bg) + "&replace=" + String.valueOf(z);
                ContentResolver m88272bX = m88272bX();
                if (m88272bX == null) {
                    return;
                }
                m88272bX.getType(Uri.parse(eqN() + "trackAdUrl" + str3));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: bg */
    public static void m88269bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver m88272bX = m88272bX();
            if (m88272bX != null) {
                m88272bX.getType(Uri.parse(eqN() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
