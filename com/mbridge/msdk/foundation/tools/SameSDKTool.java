package com.mbridge.msdk.foundation.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.CommonClickControl;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p437b.MBridgeDir;
import com.mbridge.msdk.foundation.same.p437b.MBridgeDirManager;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.same.report.p452d.ParameterWrapper;
import com.mbridge.msdk.foundation.webview.BackPointBrowserViewListener;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.tools.aj */
/* loaded from: classes6.dex */
public final class SameSDKTool extends DomainSameSDKTool {

    /* renamed from: a */
    public static char[] f56920a = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* renamed from: b */
    public static boolean f56921b = false;

    /* renamed from: c */
    public static LinearLayout f56922c;

    /* compiled from: SameSDKTool.java */
    /* renamed from: com.mbridge.msdk.foundation.tools.aj$a */
    /* loaded from: classes6.dex */
    public static class C22043a {
        /* renamed from: a */
        public static boolean m51780a(Context context, String str, NativeListener.NativeTrackingListener nativeTrackingListener) {
            try {
                List<ResolveInfo> m51781a = m51781a(context);
                if (m51781a != null && m51781a.size() > 0) {
                    if (!m51779a(str)) {
                        if (m51776c(str)) {
                            str = "market://" + str.substring(str.indexOf("details?id="));
                        } else {
                            str = null;
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        return false;
                    }
                    Intent m51778b = m51778b(context);
                    m51778b.setData(Uri.parse(str));
                    m51778b.addFlags(268435456);
                    Iterator<ResolveInfo> it = m51781a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                            m51778b.setPackage("com.android.vending");
                            break;
                        }
                    }
                    context.startActivity(m51778b);
                    SameSDKTool.m51786a(nativeTrackingListener);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                SameLogTool.m51824b("SDKUtil", Log.getStackTraceString(th));
                return false;
            }
        }

        /* renamed from: b */
        private static Intent m51778b(Context context) {
            return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.package.name"));
        }

        /* renamed from: c */
        private static boolean m51776c(String str) {
            Uri parse;
            try {
                if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || TextUtils.isEmpty(parse.getHost())) {
                    return false;
                }
                if (!parse.getHost().equals("play.google.com")) {
                    if (!parse.getHost().equals("market.android.com")) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                SameLogTool.m51824b("SDKUtil", Log.getStackTraceString(th));
            }
            return false;
        }

        /* renamed from: b */
        public static boolean m51777b(String str) {
            return m51779a(str) || m51776c(str);
        }

        /* renamed from: a */
        private static List<ResolveInfo> m51781a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(m51778b(context), 0);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: a */
        public static boolean m51779a(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals(ApsAdWebViewSupportClient.MARKET_SCHEME);
            } catch (Throwable th) {
                SameLogTool.m51824b("SDKUtil", Log.getStackTraceString(th));
                return false;
            }
        }
    }

    /* renamed from: a */
    public static String m51783a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File m52271b = MBridgeDirManager.m52271b(MBridgeDir.MBRIDGE_700_IMG);
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            if (str.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING) == -1) {
                str2 = str.hashCode() + "";
            } else {
                str2 = (str.hashCode() + str.substring(str.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING) + 1).hashCode()) + "";
            }
        }
        return new File(m52271b, str2).getAbsolutePath();
    }

    /* renamed from: b */
    public static void m51782b(Campaign campaign, ViewGroup viewGroup) {
        m51784a(campaign, viewGroup, 0, 0);
    }

    /* renamed from: a */
    public static void m51787a(Context context, String str, NativeListener.NativeTrackingListener nativeTrackingListener) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z = queryIntentActivities.size() > 0;
            if (!str.startsWith("market://")) {
                if (str.startsWith("https://play.google.com/")) {
                    String replace = str.replace("https://play.google.com/store/apps/details?id=", "");
                    m51787a(context, "market://details?id=" + replace, nativeTrackingListener);
                }
            } else if (!z) {
                String replace2 = str.replace("market://details?id=", "");
                m51789a(context, "https://play.google.com/store/apps/details?id=" + replace2, (BaseTrackingListener) nativeTrackingListener);
            } else {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (resolveInfo.activityInfo.packageName.equals("com.android.vending")) {
                        intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
                        break;
                    }
                }
                try {
                    context.startActivity(intent);
                    m51786a(nativeTrackingListener);
                } catch (Exception unused) {
                    String replace3 = str.replace("market://details?id=", "");
                    m51789a(context, "https://play.google.com/store/apps/details?id=" + replace3, (BaseTrackingListener) nativeTrackingListener);
                }
            }
        } catch (Exception e) {
            SameLogTool.m51824b("SDKUtil", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m51785a(Campaign campaign, ViewGroup viewGroup) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    SameLogTool.m51820d("SDKUtil", "hide linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    LinearLayout linearLayout = f56922c;
                    if (linearLayout == null) {
                        return;
                    }
                    viewGroup.removeView(linearLayout);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m51789a(Context context, String str, BaseTrackingListener baseTrackingListener) {
        m51788a(context, str, baseTrackingListener, (CampaignEx) null, new ArrayList());
    }

    /* renamed from: a */
    public static void m51790a(Context context, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        Intent intent;
        if (context == null) {
            return;
        }
        ParameterWrapper parameterWrapper = new ParameterWrapper();
        if (list != null) {
            list.add("web_view");
        }
        if (f56921b) {
            m51788a(context, str, nativeTrackingListener, campaignEx, list);
            return;
        }
        try {
            int i = MBCommonActivity.f55061d;
            intent = new Intent(context, MBCommonActivity.class);
        } catch (Exception unused) {
            parameterWrapper.m52024a("result", 2);
            m51788a(context, str, nativeTrackingListener, campaignEx, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (C22043a.m51779a(str)) {
            str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
        }
        intent.putExtra("url", str);
        SameLogTool.m51822c("url", "webview url = " + str);
        intent.setFlags(268435456);
        intent.putExtra("mvcommon", campaignEx);
        context.startActivity(intent);
        parameterWrapper.m52024a("result", 1);
        parameterWrapper.m52024a("type", 9);
        if (list != null) {
            parameterWrapper.m52024a("click_path", list.toString());
        }
        C22011d.m52050a().m52044a("2000150", campaignEx, parameterWrapper);
    }

    /* renamed from: a */
    public static void m51788a(Context context, String str, BaseTrackingListener baseTrackingListener, CampaignEx campaignEx, List<String> list) {
        if (str == null || context == null) {
            return;
        }
        if (list != null) {
            list.add("browser");
        }
        ParameterWrapper parameterWrapper = new ParameterWrapper();
        try {
            if (C22043a.m51779a(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setComponent(null);
            intent.setSelector(null);
            intent.addFlags(268435456);
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
            m51786a(baseTrackingListener);
            parameterWrapper.m52024a("result", 1);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268468224);
                context.startActivity(intent2);
                m51786a(baseTrackingListener);
                parameterWrapper.m52024a("result", 1);
            } catch (Exception e2) {
                e2.printStackTrace();
                parameterWrapper.m52024a("result", 2);
            }
        }
        try {
            parameterWrapper.m52024a("type", 5);
            if (list != null) {
                parameterWrapper.m52024a("click_path", list.toString());
            }
            C22011d.m52050a().m52044a("2000150", campaignEx, parameterWrapper);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m51786a(BaseTrackingListener baseTrackingListener) {
        if (baseTrackingListener instanceof NativeListener.TrackingExListener) {
            ((NativeListener.TrackingExListener) baseTrackingListener).onLeaveApp();
        }
    }

    /* renamed from: a */
    public static void m51791a(Context context, String str, CampaignEx campaignEx, CommonClickControl commonClickControl, BaseTrackingListener baseTrackingListener, List<String> list) {
        ParameterWrapper parameterWrapper = new ParameterWrapper();
        parameterWrapper.m52024a("type", 9);
        try {
            BrowserView browserView = new BrowserView(MBSDKContext.m52746m().m52792c(), campaignEx);
            browserView.setLayoutParams(new LinearLayout.LayoutParams(SameDiTool.m51882j(context), SameDiTool.m51886h(context)));
            browserView.setListener(new BackPointBrowserViewListener(context, campaignEx, commonClickControl, browserView, baseTrackingListener));
            browserView.loadUrl(str);
            parameterWrapper.m52024a("result", "1");
        } catch (Exception e) {
            SameLogTool.m51824b("SDKUtil", e.getMessage());
            parameterWrapper.m52024a("result", "2");
        }
        if (list != null) {
            parameterWrapper.m52024a("click_path", list.toString());
        }
        C22011d.m52050a().m52044a("2000150", campaignEx, parameterWrapper);
    }

    /* renamed from: a */
    public static void m51784a(Campaign campaign, ViewGroup viewGroup, int i, int i2) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    SameLogTool.m51820d("SDKUtil", "show linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    if (f56922c == null) {
                        Context m52792c = MBSDKContext.m52746m().m52792c();
                        if (m52792c instanceof Activity) {
                            f56922c = (LinearLayout) LayoutInflater.from(m52792c.getApplicationContext()).inflate(ResourceUtil.m51605a(m52792c.getApplicationContext(), "mbridge_cm_loading_layout", "layout"), (ViewGroup) null);
                        } else {
                            f56922c = (LinearLayout) LayoutInflater.from(m52792c).inflate(ResourceUtil.m51605a(m52792c, "mbridge_cm_loading_layout", "layout"), (ViewGroup) null);
                        }
                    }
                    int min = Math.min(viewGroup.getWidth(), viewGroup.getHeight());
                    int min2 = Math.min(Math.max(min / 4, 70), min);
                    if (viewGroup instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(min2, min2);
                        layoutParams.gravity = 17;
                        ViewUtil.m51671a(f56922c);
                        viewGroup.addView(f56922c, layoutParams);
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(min2, min2);
                    if (i2 == 0 && i == 0) {
                        layoutParams2.addRule(13);
                    } else {
                        layoutParams2.leftMargin = i2;
                        layoutParams2.topMargin = i;
                    }
                    ViewUtil.m51671a(f56922c);
                    viewGroup.addView(f56922c, layoutParams2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
