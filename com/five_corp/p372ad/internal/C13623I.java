package com.five_corp.p372ad.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.five_corp.p372ad.internal.system.AbstractC14102i;

/* renamed from: com.five_corp.ad.internal.I */
/* loaded from: classes4.dex */
public final class C13623I {

    /* renamed from: a */
    public final String f25159a;

    /* renamed from: b */
    public final String f25160b;

    /* renamed from: c */
    public final String f25161c;

    /* renamed from: d */
    public final String f25162d;

    /* renamed from: e */
    public final String f25163e;

    /* renamed from: f */
    public final String f25164f;

    public C13623I(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f25159a = str;
        this.f25160b = str2;
        this.f25161c = str3;
        this.f25162d = str4;
        this.f25163e = str5;
        this.f25164f = str6;
    }

    /* renamed from: a */
    public static C13623I m78477a(Context context) {
        String str;
        TelephonyManager telephonyManager;
        String str2 = "";
        String str3 = "0";
        try {
            str = context.getPackageName();
            try {
                PackageManager packageManager = context.getPackageManager();
                try {
                    str3 = AbstractC14102i.m78100a(context, str).versionName;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (packageManager.checkPermission("android.permission.READ_PHONE_STATE", str) == 0 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                    str2 = telephonyManager.getSimOperatorName();
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            str = "";
        }
        return new C13623I(Build.VERSION.RELEASE, Build.MODEL, Build.MANUFACTURER, str2, str, str3);
    }
}
