package com.bytedance.sdk.component.ldr.p261bg.p262IL.p263IL;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7691iR;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7692ldr;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.ldr.bg.IL.IL.IL */
/* loaded from: classes3.dex */
public class C7644IL {

    /* renamed from: bg */
    public static InterfaceC7711ldr f16674bg;

    /* renamed from: IL */
    public static void m88285IL() {
        if (C7659Kg.m88154iR().ldr() == null) {
            return;
        }
        try {
            InterfaceC7711ldr m88282bg = m88282bg(C7659Kg.m88154iR().ldr());
            if (m88282bg != null) {
                m88282bg.mo83050bg(Uri.parse(eqN() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    private static String eqN() {
        return C7691iR.f16825IL + "/ad_log_event/";
    }

    /* renamed from: bX */
    public String m88284bX() {
        return "ad_log_event";
    }

    /* renamed from: bg */
    public int m88279bg(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: bg */
    public int m88278bg(Uri uri, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: bg */
    public Cursor m88277bg(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* renamed from: bg */
    public Uri m88280bg(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* renamed from: bg */
    public static InterfaceC7711ldr m88282bg(Context context) {
        try {
            if (f16674bg == null) {
                f16674bg = C7659Kg.m88154iR().m88153vb().mo83364VB();
            }
        } catch (Exception unused) {
        }
        return f16674bg;
    }

    /* renamed from: bg */
    public static void m88283bg() {
        if (C7659Kg.m88154iR().ldr() == null) {
            return;
        }
        try {
            InterfaceC7711ldr m88282bg = m88282bg(C7659Kg.m88154iR().ldr());
            if (m88282bg != null) {
                m88282bg.mo83050bg(Uri.parse(eqN() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public static void m88276bg(InterfaceC7706bg interfaceC7706bg) {
        if (interfaceC7706bg == null) {
            return;
        }
        try {
            InterfaceC7711ldr m88282bg = m88282bg(C7659Kg.m88154iR().ldr());
            if (m88282bg != null) {
                String m88031bg = C7692ldr.m88031bg(interfaceC7706bg.ldr());
                m88282bg.mo83050bg(Uri.parse(eqN() + "adLogDispatch?event=" + m88031bg));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* renamed from: bg */
    public static void m88275bg(String str, List<String> list, boolean z, int i, String str2) {
        if (list != null && !list.isEmpty()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (String str3 : list) {
                    sb2.append(C7692ldr.m88031bg(str3));
                    sb2.append(",");
                }
                String m88031bg = C7692ldr.m88031bg(sb2.toString());
                String str4 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(m88031bg) + "&replace=" + String.valueOf(z) + "&urlType=" + String.valueOf(i) + "&adId=" + str2;
                InterfaceC7711ldr m88282bg = m88282bg(C7659Kg.m88154iR().ldr());
                if (m88282bg == null) {
                    return;
                }
                m88282bg.mo83050bg(Uri.parse(eqN() + "trackAdUrl" + str4));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: bg */
    public static void m88274bg(String str, boolean z) {
        if (C7659Kg.m88154iR().m88153vb().ldr() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            InterfaceC7711ldr m88282bg = m88282bg(C7659Kg.m88154iR().ldr());
            if (m88282bg != null) {
                m88282bg.mo83050bg(Uri.parse(eqN() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r0.equals("adLogStop") == false) goto L3;
     */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m88281bg(android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ldr.p261bg.p262IL.p263IL.C7644IL.m88281bg(android.net.Uri):java.lang.String");
    }
}
