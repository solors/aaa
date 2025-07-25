package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.bytedance.sdk.openadsdk.core.p332WR.C8850bX;
import com.maticoo.sdk.utils.constant.KeyConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX */
/* loaded from: classes3.dex */
public class C8617PX {

    /* renamed from: IL */
    private static String f19003IL;

    /* renamed from: bX */
    private static String f19004bX;

    /* renamed from: bg */
    private static String f19005bg;
    private static boolean eqN;

    /* renamed from: IL */
    public static String m85535IL(Context context) {
        if (f19003IL == null && !eqN) {
            synchronized (C8617PX.class) {
                if (!eqN) {
                    m85530zx(context);
                }
            }
        }
        return f19003IL;
    }

    /* renamed from: bX */
    public static String m85534bX(Context context) {
        if (TextUtils.isEmpty(f19004bX) && !eqN) {
            synchronized (C8617PX.class) {
                if (!eqN) {
                    m85530zx(context);
                }
            }
        }
        return f19004bX;
    }

    /* renamed from: bg */
    public static String m85532bg(Context context) {
        if (!TextUtils.isEmpty(f19005bg)) {
            return f19005bg;
        }
        ldr(context);
        return f19005bg;
    }

    private static Context eqN(Context context) {
        if (context == null) {
            return C8838VzQ.m84740bg();
        }
        return context;
    }

    private static void ldr(Context context) {
        Context eqN2 = eqN(context);
        if (eqN2 == null) {
            return;
        }
        f19005bg = C8879bX.m84507bg(eqN2).m84508IL(KeyConstants.RequestBody.KEY_DID, (String) null);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_WIFI_STATE"})
    @SuppressLint({"HardwareIds"})
    /* renamed from: zx */
    private static void m85530zx(Context context) {
        Context eqN2;
        if (eqN || (eqN2 = eqN(context)) == null) {
            return;
        }
        f19003IL = String.valueOf(Build.TIME);
        f19004bX = C8879bX.m84507bg(eqN2).m84508IL(CommonUrlParts.UUID, (String) null);
        eqN = true;
    }

    /* renamed from: bg */
    public static void m85531bg(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f19005bg)) {
            C8879bX.m84507bg(context).m84504bg(KeyConstants.RequestBody.KEY_DID, str);
            f19005bg = str;
        }
        if (TextUtils.isEmpty(f19005bg)) {
            return;
        }
        C8850bX.m84681IL(f19005bg);
        C8758VB.m84940bg(f19005bg);
    }

    /* renamed from: bg */
    public static String m85533bg() {
        try {
            Locale locale = LocaleList.getDefault().get(0);
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String locale2 = locale.toString();
            if (locale.toString().length() >= 5) {
                locale2 = locale2.substring(0, 5);
            }
            return Locale.SIMPLIFIED_CHINESE.toString().equals(locale2) ? "zh" : "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
