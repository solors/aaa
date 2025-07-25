package com.mbridge.msdk.click;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;
import com.mbridge.msdk.foundation.same.report.ReportController;
import com.mbridge.msdk.foundation.tools.MiaUtil;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.p411c.BaseSetting;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.p426e.CommonUtils;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.click.c */
/* loaded from: classes6.dex */
public final class CommonClickUtil {

    /* renamed from: a */
    static Handler f55356a = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.click.c.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String str;
            String str2;
            String str3;
            super.handleMessage(message);
            try {
                if (message.what == 1000) {
                    int i = message.arg1;
                    int i2 = message.arg2;
                    Bundle data = message.getData();
                    if (data != null) {
                        String string = data.getString("rid");
                        String string2 = data.getString("rid_n");
                        str3 = data.getString("cid");
                        str = string;
                        str2 = string2;
                    } else {
                        str = "";
                        str2 = str;
                        str3 = str2;
                    }
                    new ReportController(MBSDKContext.m52746m().m52792c()).m51979a(i, i2, str, str2, str3);
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    };

    /* renamed from: a */
    public static boolean m53169a(CampaignEx campaignEx) {
        return true;
    }

    /* renamed from: b */
    public static void m53166b(Context context, String str) {
        Intent launchIntentForPackage;
        List<ResolveInfo> queryIntentActivities;
        ResolveInfo next;
        try {
            if (!TextUtils.isEmpty(str) && m53165c(context, str) && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) != null && (queryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0)) != null && queryIntentActivities.size() > 0 && (next = queryIntentActivities.iterator().next()) != null) {
                ActivityInfo activityInfo = next.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent();
                intent.setComponent(componentName);
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (Exception e) {
            if (CommonUtils.m52903a()) {
                Toast.makeText(context, "The app connot start up", 0).show();
            }
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static boolean m53165c(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8192);
                if (packageInfo != null) {
                    return str.equals(packageInfo.packageName);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public static void m53164d(Context context, String str) {
        if (str != null && context != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                if (resolveActivity != null) {
                    ActivityInfo activityInfo = resolveActivity.activityInfo;
                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                }
                context.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: e */
    public static boolean m53163e(Context context, String str) {
        Intent intent;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            if (parse.getScheme().equals(SDKConstants.PARAM_INTENT)) {
                intent = Intent.parseUri(str, 1);
            } else if (parse.getScheme().equals("android-app")) {
                intent = Intent.parseUri(str, 2);
            } else {
                intent = new Intent("android.intent.action.VIEW", parse);
                intent.setData(parse);
            }
            if (intent == null) {
                return false;
            }
            intent.setComponent(null);
            intent.setSelector(null);
            if (m53171a(context, intent)) {
                return true;
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            SameLogTool.m51823b("CommonClickUtil", th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: f */
    public static void m53162f(Context context, String str) {
        if (context != null && str != null) {
            try {
                int i = MBCommonActivity.f55061d;
                Intent intent = new Intent(context, MBCommonActivity.class);
                intent.putExtra("url", str);
                if (!(context instanceof ContextThemeWrapper)) {
                    intent.setFlags(268435456);
                }
                context.startActivity(intent);
            } catch (ClassNotFoundException e) {
                SameLogTool.m51824b("CommonClickUtil", e.getMessage());
            } catch (Throwable th) {
                SameLogTool.m51824b("CommonClickUtil", th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static String m53168a(String str, String str2, String str3) {
        Map<String, BaseSetting.C21777a> m53388s;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String host = Uri.parse(str).getHost();
            Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
            if (m53279b == null || (m53388s = m53279b.m53388s()) == null || TextUtils.isEmpty(host)) {
                return str;
            }
            for (Map.Entry<String, BaseSetting.C21777a> entry : m53388s.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key) && host.contains(key)) {
                    BaseSetting.C21777a c21777a = m53388s.get(key);
                    return c21777a != null ? m53167a(m53167a(m53167a(m53167a(str, c21777a.m53371a(), String.valueOf(SameDiTool.m51886h(MBSDKContext.m52746m().m52792c()))), c21777a.m53366b(), String.valueOf(SameDiTool.m51882j(MBSDKContext.m52746m().m52792c()))), c21777a.m53363c(), str2), c21777a.m53362d(), str3) : str;
                }
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    private static String m53167a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String str3 : list) {
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replaceAll(str3, str2);
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m53170a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z = queryIntentActivities.size() > 0;
            if (!str.startsWith("market://")) {
                if (str.startsWith("https://play.google.com/")) {
                    String replace = str.replace("https://play.google.com/store/apps/details?id=", "");
                    m53170a(context, "market://details?id=" + replace);
                }
            } else if (!z) {
                String replace2 = str.replace("market://details?id=", "");
                m53164d(context, "https://play.google.com/store/apps/details?id=" + replace2);
            } else {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (resolveInfo.activityInfo.packageName.equals("com.android.vending")) {
                        intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
                        break;
                    }
                }
                try {
                    context.startActivity(intent);
                } catch (Exception unused) {
                    String replace3 = str.replace("market://details?id=", "");
                    m53164d(context, "https://play.google.com/store/apps/details?id=" + replace3);
                }
            }
        } catch (Exception e) {
            SameLogTool.m51823b("CommonClickUtil", "Exception", e);
        }
    }

    /* renamed from: a */
    private static boolean m53171a(Context context, Intent intent) {
        try {
        } catch (Throwable th) {
            SameLogTool.m51823b("CommonClickUtil", th.getMessage(), th);
        }
        if (context instanceof Activity) {
            context.startActivity(intent);
            return true;
        }
        if (MBSDKContext.m52746m().m52787e() != null) {
            Context m52787e = MBSDKContext.m52746m().m52787e();
            if (m52787e instanceof Activity) {
                m52787e.startActivity(intent);
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public static void m53172a(final Context context, int i, final String str) {
        if (i == 0) {
            return;
        }
        try {
            ThreadPoolUtils.m52227b().execute(new Runnable() { // from class: com.mbridge.msdk.click.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Method method = MiaUtil.class.getMethod("mia", Context.class, String.class);
                        Context context2 = context;
                        if (context2 != null) {
                            method.invoke(null, context2, str);
                        } else {
                            SameLogTool.m51824b("CommonClickUtil", "Context is null");
                        }
                    } catch (Throwable th) {
                        SameLogTool.m51824b("CommonClickUtil", th.getMessage());
                    }
                }
            });
        } catch (Throwable th) {
            SameLogTool.m51824b("CommonClickUtil", th.getMessage());
        }
    }
}
