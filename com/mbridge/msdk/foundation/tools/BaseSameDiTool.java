package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.controller.authoritycontroller.BaseSDKAuthorityController;
import com.mbridge.msdk.foundation.controller.authoritycontroller.SDKAuthorityController;
import com.mbridge.msdk.foundation.tools.AdvertisingIdClient;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.f */
/* loaded from: classes6.dex */
public class BaseSameDiTool {

    /* renamed from: a */
    public static volatile String f56983a = null;

    /* renamed from: b */
    public static String f56984b = null;

    /* renamed from: c */
    public static boolean f56985c = false;

    /* renamed from: d */
    public static int f56986d = 0;

    /* renamed from: e */
    private static String f56987e = "";

    /* renamed from: f */
    private static boolean f56988f = false;

    /* renamed from: g */
    private static String f56989g = "";

    /* renamed from: h */
    private static boolean f56990h = false;

    /* renamed from: i */
    private static boolean f56991i = false;

    /* renamed from: a */
    public static int m51661a() {
        return f56986d;
    }

    /* renamed from: b */
    public static String m51656b() {
        if (SDKAuthorityController.m52750k() && SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            if (!BaseSDKAuthorityController.m52776a()) {
                return TextUtils.isEmpty(f56984b) ? "" : f56984b;
            } else if (TextUtils.isEmpty(f56984b)) {
                if (!f56985c) {
                    m51659a(MBSDKContext.m52746m().m52792c());
                    f56985c = true;
                }
                return "";
            } else if (BaseSDKAuthorityController.m52767b()) {
                return f56984b;
            } else {
                return f56986d == 0 ? f56984b : "";
            }
        }
        return "";
    }

    /* renamed from: c */
    public static String m51654c() {
        if (SDKAuthorityController.m52750k() && SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            if (!BaseSDKAuthorityController.m52776a()) {
                return TextUtils.isEmpty(f56983a) ? "" : f56983a;
            } else if (TextUtils.isEmpty(f56983a)) {
                SameDiTool.m51883j();
                if (!f56985c) {
                    m51659a(MBSDKContext.m52746m().m52792c());
                    f56985c = true;
                }
                return TextUtils.isEmpty(f56983a) ? "" : f56983a;
            } else if (BaseSDKAuthorityController.m52767b()) {
                return f56983a;
            } else {
                return f56986d == 0 ? f56983a : "";
            }
        }
        return "";
    }

    /* renamed from: d */
    public static String m51652d() {
        if (TextUtils.isEmpty(f56989g) && !f56988f) {
            m51651e();
        }
        return f56989g;
    }

    /* renamed from: e */
    public static String m51651e() {
        if (!SDKAuthorityController.m52750k() || !SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f56988f) {
            return f56987e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = MBSDKContext.m52746m().m52792c().getContentResolver();
                int i = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING);
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i);
                jSONObject.put("amazonId", string);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    f56989g = jSONObject2;
                    f56987e = SameBase64Tool.m51602b(jSONObject2);
                }
            } catch (Settings.SettingNotFoundException e) {
                SameLogTool.m51824b("DomainSameDiTool", e.getMessage());
            }
        } catch (Throwable th) {
            SameLogTool.m51824b("DomainSameDiTool", th.getMessage());
        }
        f56988f = true;
        return f56987e;
    }

    /* renamed from: a */
    public static void m51660a(int i) {
        f56986d = i;
    }

    /* renamed from: a */
    public static void m51659a(final Context context) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.f.1
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_DEVICE_ID) && BaseSDKAuthorityController.m52776a()) {
                    int i2 = 1;
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        BaseSameDiTool.m51657a(advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        BaseSameDiTool.f56986d = i;
                        BaseSameDiTool.m51658a(context, advertisingIdInfo.getId(), BaseSameDiTool.f56986d);
                    } catch (Exception unused) {
                        SameLogTool.m51820d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                        try {
                            AdvertisingIdClient.C22051a m51670a = new AdvertisingIdClient().m51670a(context);
                            BaseSameDiTool.m51657a(m51670a.m51669a());
                            if (!m51670a.m51668b()) {
                                i2 = 0;
                            }
                            BaseSameDiTool.f56986d = i2;
                            BaseSameDiTool.m51658a(context, m51670a.m51669a(), BaseSameDiTool.f56986d);
                        } catch (Exception unused2) {
                            SameLogTool.m51820d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                        }
                    } catch (Throwable th) {
                        SameLogTool.m51824b("DomainSameDiTool", th.getMessage());
                    }
                }
            }
        }).start();
    }

    /* renamed from: a */
    public static void m51657a(String str) {
        f56984b = SameBase64Tool.m51602b(str);
        f56983a = str;
    }

    /* renamed from: a */
    static /* synthetic */ void m51658a(Context context, String str, int i) {
        try {
            if (C22047ap.m51692b(str)) {
                SharedPreferencesUtils.m51697b(context, MBridgeConstans.SP_GA_ID, str);
            }
            SharedPreferencesUtils.m51697b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i));
        } catch (Exception e) {
            SameLogTool.m51824b("DomainSameDiTool", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m51655b(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static boolean m51653c(Context context) {
        try {
        } catch (Exception unused) {
            f56990h = false;
        }
        if (f56991i) {
            return f56990h;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            f56990h = context.getPackageManager().checkPermission(SameBase64Tool.m51603a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
        } else {
            f56990h = true;
        }
        f56991i = true;
        return f56990h;
    }
}
