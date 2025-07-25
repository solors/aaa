package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.amazon.device.ads.DtbConstants;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6493IL;
import com.bytedance.sdk.component.p238WR.C7268eqN;
import com.bytedance.sdk.component.utils.C7732IL;
import com.bytedance.sdk.component.utils.C7740Lq;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7759rri;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.common.C8206bX;
import com.bytedance.sdk.openadsdk.common.C8215eqN;
import com.bytedance.sdk.openadsdk.core.C8615Lq;
import com.bytedance.sdk.openadsdk.core.C8836VJ;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import com.bytedance.sdk.openadsdk.core.C8879bX;
import com.bytedance.sdk.openadsdk.core.C9095yDt;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.model.C8989zx;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;
import com.bytedance.sdk.openadsdk.multipro.C9343bX;
import com.bytedance.sdk.openadsdk.multipro.eqN.C9351bg;
import com.bytedance.sdk.openadsdk.p284Fy.C7862bg;
import com.bytedance.sdk.openadsdk.yDt.C9601bX;
import com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL;
import com.bytedance.sdk.openadsdk.yDt.p365bg.C9635eqN;
import com.bytedance.sdk.openadsdk.yDt.p365bg.InterfaceC9632bX;
import com.ironsource.C21018tj;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p552ot.pubsub.util.C26601v;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ayS {

    /* renamed from: Lq */
    private static String f21283Lq;

    /* renamed from: PX */
    private static final byte[] f21284PX;

    /* renamed from: Ta */
    private static final byte[] f21285Ta;

    /* renamed from: VB */
    private static final HashSet<String> f21286VB;

    /* renamed from: bg */
    public static Integer f21289bg;
    private static String yDt;

    /* renamed from: IL */
    private static final ExecutorService f21281IL = Executors.newSingleThreadExecutor();

    /* renamed from: bX */
    private static volatile boolean f21288bX = false;
    private static final AtomicInteger eqN = new AtomicInteger(0);

    /* renamed from: zx */
    private static volatile String f21292zx = "";
    private static final ReentrantLock ldr = new ReentrantLock();

    /* renamed from: iR */
    private static String f21291iR = null;

    /* renamed from: Kg */
    private static String f21282Kg = null;

    /* renamed from: WR */
    private static String f21287WR = null;

    /* renamed from: eo */
    private static final HashSet<String> f21290eo = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* renamed from: com.bytedance.sdk.openadsdk.utils.ayS$1 */
    /* loaded from: classes3.dex */
    static class RunnableC95391 implements Runnable {
        RunnableC95391() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(ayS.f21292zx)) {
                    C7268eqN c7268eqN = new C7268eqN(C8838VzQ.m84740bg());
                    c7268eqN.setWebViewClient(new C7268eqN.C7272bg());
                    String unused = ayS.f21292zx = c7268eqN.getUserAgentString();
                }
            } catch (Exception e) {
                C7741PX.m87871bg("TTAD.ToolUtils", "", e);
            } catch (NoClassDefFoundError e2) {
                C7741PX.m87871bg("TTAD.ToolUtils", "", e2);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.ayS$IL */
    /* loaded from: classes3.dex */
    public static class C9541IL {

        /* renamed from: IL */
        public final int f21294IL;

        /* renamed from: bg */
        public final ComponentName f21295bg;

        public C9541IL(ComponentName componentName, int i) {
            this.f21295bg = componentName;
            this.f21294IL = i;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.ayS$bg */
    /* loaded from: classes3.dex */
    public static class CallableC9542bg implements Callable<String> {

        /* renamed from: bg */
        private final int f21296bg;

        CallableC9542bg(int i) {
            this.f21296bg = i;
        }

        /* renamed from: IL */
        private String m82435IL() {
            String str;
            Throwable th;
            try {
                str = System.getProperty("http.agent");
                if (str != null) {
                    try {
                        if (!"unKnow".equals(str)) {
                            if (C9307IL.m83088bX()) {
                                C9351bg.m82987bg("sp_multi_ua_data", "android_system_ua", str);
                            } else {
                                C8879bX.m84507bg(C8838VzQ.m84740bg()).m84504bg("android_system_ua", str);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C7741PX.m87873bg("getUA", "e:" + th.getMessage());
                        return str;
                    }
                }
            } catch (Throwable th3) {
                str = "unKnow";
                th = th3;
            }
            return str;
        }

        /* renamed from: bX */
        private synchronized String m82434bX() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.ayS.bg.1
                {
                    CallableC9542bg.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = ayS.rri();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                C7741PX.m87873bg("TTAD.ToolUtils", e.getMessage());
            }
            return strArr[0];
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: bg */
        public synchronized String call() throws Exception {
            String str;
            str = "unKnow";
            int i = this.f21296bg;
            if (i == 1) {
                str = m82434bX();
            } else if (i == 2) {
                str = m82435IL();
            }
            return str;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f21286VB = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        f21289bg = null;
        f21284PX = new byte[]{108, 111, 97, 100, 105, 110, 103};
        f21285Ta = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    /* renamed from: Fy */
    public static String m82502Fy() {
        String str = yDt;
        if (TextUtils.isEmpty(str)) {
            String str2 = new String(f21284PX);
            yDt = str2;
            return str2;
        }
        return str;
    }

    /* renamed from: IL */
    public static String m82500IL(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? "unknow" : "rewarded_video_landingpage" : "fullscreen_interstitial_ad" : "splash_ad_landingpage" : "interaction_landingpage" : "banner_ad_landingpage" : "embeded_ad_landingpage";
    }

    private static String JAA() {
        try {
            WebView webView = new WebView(C8838VzQ.m84740bg());
            webView.setWebViewClient(new C7268eqN.C7272bg());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (C9307IL.m83088bX()) {
                    C9351bg.m82987bg("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    C8879bX.m84507bg(C8838VzQ.m84740bg()).m84504bg("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th) {
            C7741PX.m87873bg("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    /* renamed from: Ja */
    private static boolean m82494Ja() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: Kg */
    public static String m82493Kg() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) C8838VzQ.m84740bg().getSystemService("activity")).getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            if (j > 0) {
                return String.valueOf(j / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: LZ */
    public static String m82489LZ() {
        String str = f21283Lq;
        if (TextUtils.isEmpty(str)) {
            String str2 = new String(f21285Ta);
            f21283Lq = str2;
            return str2;
        }
        return str;
    }

    /* renamed from: Lq */
    public static String m82488Lq() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e) {
            C7741PX.m87873bg("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    /* renamed from: PX */
    public static boolean m82487PX() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: Ta */
    public static String m82484Ta() {
        return String.format("https://%s", "log.byteoversea.com/service/2/app_log_test/");
    }

    public static String VzQ() {
        int i = -xxp();
        if (i >= 0) {
            return "Etc/GMT+".concat(String.valueOf(i));
        }
        return "Etc/GMT".concat(String.valueOf(i));
    }

    /* renamed from: WR */
    public static String m82479WR() {
        return m82470bX("MemTotal");
    }

    /* renamed from: bX */
    public static String m82475bX(int i) {
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? "open_ad" : i != 7 ? i != 8 ? "embeded_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    /* renamed from: bg */
    public static String m82468bg(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 7) {
                                return null;
                            }
                            return "rewarded_video";
                        }
                        return "fullscreen_interstitial_ad";
                    }
                    return "open_ad";
                }
                return "interaction";
            }
            return "banner_ad";
        }
        return "embeded_ad";
    }

    /* renamed from: eo */
    public static long m82448eo() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static boolean eqN(int i) {
        return i == 4;
    }

    /* renamed from: iR */
    public static int m82444iR(int i) {
        if (i != 1) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return i;
                    }
                    return 5;
                }
                return 4;
            }
            return 1;
        }
        return 0;
    }

    public static boolean ldr(int i) {
        return i == 6;
    }

    static /* synthetic */ String rri() {
        return JAA();
    }

    public static boolean tuV() {
        if (eqN.get() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: vb */
    public static int m82440vb() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (f21290eo.contains(id2)) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Asia/")) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Europe/")) {
                return 4;
            }
            if (id2 != null && id2.startsWith("America/")) {
                if (!f21286VB.contains(id2)) {
                    return 5;
                }
            }
            return 3;
        } catch (Throwable th) {
            C7741PX.m87873bg("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static int xxp() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / C26601v.f69837d;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static String yDt() {
        int m82440vb = m82440vb();
        return (m82440vb == 1 || m82440vb == 2) ? "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    /* renamed from: zx */
    public static boolean m82438zx(int i) {
        return i == 5;
    }

    /* renamed from: IL */
    public static boolean m82497IL(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: PX */
    private static String m82485PX(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(C21018tj.f53565b, "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", ldr()).toString();
        } catch (Exception e) {
            C7741PX.m87873bg("TTAD.ToolUtils", e.getMessage());
            return str;
        }
    }

    /* renamed from: Ta */
    public static void m82483Ta(Context context) {
        try {
            AtomicInteger atomicInteger = eqN;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (isEnabled && isTouchExplorationEnabled) {
                atomicInteger.set(1);
                C9601bX.m82293bg().m82297bX();
                return;
            }
            atomicInteger.set(2);
        } catch (Exception unused) {
            eqN.set(2);
        }
    }

    /* renamed from: VB */
    public static long m82482VB() {
        try {
            if (m82494Ja()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getBlockCount() * statFs.getBlockSize();
            }
            return 0L;
        } catch (Throwable th) {
            C7741PX.m87873bg("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    /* renamed from: WR */
    public static boolean m82478WR(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: bX */
    public static int m82473bX(Context context, Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return context.getPackageManager().queryIntentActivities(intent, 65536).size();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: bg */
    public static void m82460bg(@NonNull AbstractC8967tuV abstractC8967tuV, @NonNull View view) {
    }

    public static String eqN() {
        return C9561rri.m82393bg();
    }

    /* renamed from: iR */
    public static synchronized String m82445iR() {
        String str;
        synchronized (ayS.class) {
            if (TextUtils.isEmpty(f21287WR) && C8838VzQ.m84740bg() != null) {
                PackageInfo packageInfo = C8838VzQ.m84740bg().getPackageManager().getPackageInfo(m82439zx(), 0);
                f21282Kg = String.valueOf(packageInfo.versionCode);
                f21287WR = packageInfo.versionName;
            }
            str = f21287WR;
        }
        return str;
    }

    public static synchronized String ldr() {
        String str;
        synchronized (ayS.class) {
            if (TextUtils.isEmpty(f21282Kg) && C8838VzQ.m84740bg() != null) {
                PackageInfo packageInfo = C8838VzQ.m84740bg().getPackageManager().getPackageInfo(m82439zx(), 0);
                f21282Kg = String.valueOf(packageInfo.versionCode);
                f21287WR = packageInfo.versionName;
            }
            str = f21282Kg;
        }
        return str;
    }

    public static int yDt(Context context) {
        List<ResolveInfo> queryIntentActivities;
        Integer num = f21289bg;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(queryIntentActivities.size());
        f21289bg = valueOf;
        return valueOf.intValue();
    }

    /* renamed from: zx */
    public static synchronized String m82439zx() {
        String str;
        Context m84740bg;
        synchronized (ayS.class) {
            if (TextUtils.isEmpty(f21291iR) && (m84740bg = C8838VzQ.m84740bg()) != null) {
                f21291iR = m84740bg.getPackageName();
            }
            str = f21291iR;
        }
        return str;
    }

    public static long eqN(Context context) {
        return C8879bX.m84507bg(context).m84509IL("free_internal_storage", 0L).longValue();
    }

    /* renamed from: WR */
    public static boolean m82477WR(String str) {
        if (C9095yDt.m83545zx()) {
            return true;
        }
        C7741PX.m87880IL("You must use method '" + str + "' after initialization, please check.");
        return false;
    }

    /* renamed from: bg */
    public static Intent m82465bg(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static String eqN(String str) {
        return m82454bg(str, false);
    }

    @NonNull
    /* renamed from: IL */
    public static C9541IL m82498IL(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
            if (activityInfo != null && !TextUtils.isEmpty(activityInfo.packageName) && !TextUtils.isEmpty(activityInfo.name)) {
                return new C9541IL(new ComponentName(activityInfo.packageName, activityInfo.name), queryIntentActivities.size());
            }
            return new C9541IL(null, queryIntentActivities.size());
        }
        return new C9541IL(null, 0);
    }

    /* renamed from: bX */
    public static boolean m82472bX(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                C7732IL.m87908bg(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: eo */
    public static int m82447eo(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            C7741PX.m87873bg("TTAD.ToolUtils", th.getMessage());
            return -1;
        }
    }

    public static boolean eqN(AbstractC8967tuV abstractC8967tuV) {
        return abstractC8967tuV != null && abstractC8967tuV.mo84003jz() == 3 && abstractC8967tuV.mo84092RJ() && (abstractC8967tuV.txA() == 4 || abstractC8967tuV.txA() == 5);
    }

    /* renamed from: Kg */
    public static boolean m82491Kg(Context context) {
        if (context != null) {
            return !(context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30);
        }
        throw new IllegalArgumentException("params context is null");
    }

    /* renamed from: zx */
    public static long m82437zx(Context context) {
        return C8879bX.m84507bg(context).m84509IL("total_sdcard_storage", 0L).longValue();
    }

    /* renamed from: PX */
    public static int m82486PX(Context context) {
        return m82444iR(C7759rri.m87808bg(context, 0L));
    }

    /* renamed from: VB */
    public static long m82481VB(Context context) {
        int i;
        try {
            i = context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th) {
            C7741PX.m87873bg("TTAD.ToolUtils", th.getMessage());
            i = -1;
        }
        return i;
    }

    /* renamed from: eo */
    public static void m82446eo(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        C7741PX.m87880IL("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
    }

    /* renamed from: zx */
    public static String m82436zx(String str) {
        if (TextUtils.isEmpty(str)) {
            str = C8838VzQ.eqN().mo83792VJ();
        }
        return TextUtils.isEmpty(str) ? m82440vb() == 2 ? "https://log.sgsnssdk.com/service/2/app_log/" : "https://log-mva.isnssdk.com/service/2/app_log/" : !str.startsWith("http") ? DtbConstants.HTTPS.concat(str) : str;
    }

    /* renamed from: bg */
    public static boolean m82466bg(Context context, Intent intent) {
        return m82473bX(context, intent) > 0;
    }

    /* renamed from: Kg */
    public static void m82490Kg(final String str) {
        C9601bX.m82293bg();
        C9601bX.m82278bg("reportMultiLog", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.utils.ayS.2
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                if (!ayS.f21288bX && C8838VzQ.eqN().ApA()) {
                    boolean unused = ayS.f21288bX = true;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", str);
                    return C9635eqN.m82211IL().m82197bg("reportMultiLog").m82209IL(jSONObject.toString());
                }
                return null;
            }
        });
    }

    /* renamed from: bX */
    public static String m82476bX() {
        if (!TextUtils.isEmpty(f21292zx)) {
            return f21292zx;
        }
        C9343bX.m83040bg(C8838VzQ.m84740bg());
        String m84706bg = C8840WR.m84706bg("sdk_local_web_ua", 86400000L);
        f21292zx = m84706bg;
        if (TextUtils.isEmpty(m84706bg)) {
            ReentrantLock reentrantLock = ldr;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(f21292zx)) {
                            f21292zx = WebSettings.getDefaultUserAgent(C8838VzQ.m84740bg());
                        }
                        C8840WR.m84704bg("sdk_local_web_ua", f21292zx);
                        reentrantLock.unlock();
                    } catch (Exception e) {
                        C7741PX.m87871bg("TTAD.ToolUtils", "", e);
                        return f21292zx;
                    } catch (NoClassDefFoundError e2) {
                        C7741PX.m87871bg("TTAD.ToolUtils", "", e2);
                        return f21292zx;
                    }
                }
            } finally {
                ldr.unlock();
            }
        }
        return f21292zx;
    }

    /* renamed from: bg */
    public static boolean m82469bg() {
        return (C8615Lq.m85539bg() == null || C8615Lq.m85539bg().eqN()) ? false : true;
    }

    /* renamed from: iR */
    public static String m82443iR(@NonNull Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e) {
            C7741PX.m87873bg("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int ldr(Context context) {
        return C8879bX.m84507bg(context).m84510IL("is_root", -1);
    }

    /* renamed from: Kg */
    public static boolean m82492Kg(int i) {
        if (i <= 0) {
            return false;
        }
        return i >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i;
    }

    /* renamed from: bg */
    public static String m82462bg(AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null) {
            return null;
        }
        try {
            return m82475bX(abstractC8967tuV.mo84135Fx());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean ldr(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: IL */
    public static int m82496IL(AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null) {
            return -1;
        }
        int mo84135Fx = abstractC8967tuV.mo84135Fx();
        int i = 1;
        if (mo84135Fx != 1) {
            if (mo84135Fx != 3) {
                if (mo84135Fx != 5) {
                    i = 7;
                    if (mo84135Fx != 7) {
                        return mo84135Fx != 8 ? -1 : 5;
                    }
                }
                return i;
            }
            return 4;
        }
        return 2;
    }

    /* renamed from: bg */
    public static int m82456bg(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c = 3;
                    break;
                }
                break;
            case 564365438:
                if (str.equals("cache_splash_ad")) {
                    c = 4;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 7;
            case 2:
            case 4:
                return 4;
            case 3:
                return 5;
            case 5:
                return 3;
            default:
                return 1;
        }
    }

    /* renamed from: iR */
    public static String m82442iR(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    /* renamed from: IL */
    public static String m82501IL() {
        String m84508IL;
        String str = "unKnow";
        C9343bX.m83040bg(C8838VzQ.m84740bg());
        try {
            if (C9307IL.m83088bX()) {
                m84508IL = C9351bg.m83003IL("sp_multi_ua_data", "android_system_ua", "unKnow");
            } else {
                m84508IL = C8879bX.m84507bg(C8838VzQ.m84740bg()).m84508IL("android_system_ua", "unKnow");
            }
        } catch (Exception unused) {
        }
        if (m84508IL == null || "unKnow".equals(m84508IL)) {
            FutureTask futureTask = new FutureTask(new CallableC9542bg(2));
            f21281IL.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
            C7741PX.m87873bg("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
            return str;
        }
        return m84508IL;
    }

    /* renamed from: bg */
    public static String m82467bg(Context context) {
        String m84508IL = C8879bX.m84507bg(context).m84508IL("total_memory", (String) null);
        if (m84508IL == null || m82495IL(m84508IL) <= 0) {
            m84508IL = m82470bX("MemTotal");
            if (m82495IL(m84508IL) <= 0) {
                m84508IL = m82493Kg();
            }
            C8879bX.m84507bg(context).m84504bg("total_memory", m84508IL);
        }
        return m84508IL;
    }

    /* renamed from: bg */
    public static String m82454bg(@NonNull String str, boolean z) {
        String str2;
        String mo83791VW = C8838VzQ.eqN().mo83791VW();
        if (TextUtils.isEmpty(mo83791VW)) {
            int m82440vb = m82440vb();
            if (m82440vb == 1) {
                str2 = DtbConstants.HTTPS + "pangolin16.sgsnssdk.com" + str;
            } else if (m82440vb == 2) {
                str2 = DtbConstants.HTTPS + "pangolin16.sgsnssdk.com" + str;
            } else {
                str2 = DtbConstants.HTTPS + "pangolin16.isnssdk.com" + str;
            }
            if (!z) {
                return C9531VW.m82560bg(str2);
            }
            return m82485PX(str2);
        }
        String str3 = DtbConstants.HTTPS + mo83791VW + str;
        if (C9531VW.m82561bg() && !z) {
            str3 = C9531VW.m82560bg(str3);
        }
        return z ? m82485PX(str3) : str3;
    }

    /* renamed from: IL */
    public static long m82495IL(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: bX */
    public static String m82470bX(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            C7741PX.m87873bg("TTAD.ToolUtils", th.getMessage());
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            return null;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    }
                } while (!readLine.contains(str));
                if (readLine == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused4) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused5) {
                    }
                    return null;
                }
                String str2 = readLine.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused6) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused7) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    /* renamed from: IL */
    public static String m82499IL(Context context) {
        return C8879bX.m84507bg(context).m84508IL("total_memory", "0");
    }

    /* renamed from: bg */
    public static JSONObject m82449bg(boolean z, AbstractC8967tuV abstractC8967tuV, long j, long j2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", abstractC8967tuV.mo84069Ys());
            jSONObject.put("load_time", j);
            C6493IL Dxa = abstractC8967tuV.Dxa();
            if (Dxa != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Dxa.m91726zx());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, Dxa.m91742WR());
            }
            if (!z) {
                jSONObject.put("error_code", j2);
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                jSONObject.put("error_message", str);
            }
        } catch (JSONException e) {
            C7741PX.m87871bg("TTAD.ToolUtils", "getVideoDownload json error", e);
        }
        return jSONObject;
    }

    /* renamed from: bX */
    public static long m82474bX(Context context) {
        return C8879bX.m84507bg(context).m84509IL("total_internal_storage", 0L).longValue();
    }

    /* renamed from: bX */
    public static boolean m82471bX(AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null) {
            return true;
        }
        int mo83820IL = C8838VzQ.eqN().mo83820IL(abstractC8967tuV.IGR());
        int m87886bX = C7740Lq.m87886bX(C8838VzQ.m84740bg());
        if (mo83820IL != 1) {
            if (mo83820IL == 2) {
                return m82438zx(m87886bX) || eqN(m87886bX) || ldr(m87886bX);
            } else if (mo83820IL != 3) {
                return mo83820IL != 5 || eqN(m87886bX) || ldr(m87886bX);
            } else {
                return false;
            }
        }
        return eqN(m87886bX);
    }

    /* renamed from: bg */
    public static JSONObject m82461bg(AbstractC8967tuV abstractC8967tuV, long j, InterfaceC6496bg interfaceC6496bg) {
        if (abstractC8967tuV == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", abstractC8967tuV.mo84069Ys());
            jSONObject.put("buffers_time", j);
            C6493IL Dxa = abstractC8967tuV.Dxa();
            if (Dxa != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Dxa.m91726zx());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, Dxa.m91742WR());
            }
            m82451bg(jSONObject, interfaceC6496bg);
        } catch (JSONException e) {
            C7741PX.m87871bg("TTAD.ToolUtils", "getVideoAction json error", e);
        }
        return jSONObject;
    }

    /* renamed from: bg */
    private static void m82451bg(JSONObject jSONObject, InterfaceC6496bg interfaceC6496bg) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || interfaceC6496bg == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(interfaceC6496bg.eqN()), Integer.valueOf(interfaceC6496bg.mo86451zx())));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public static void m82457bg(AbstractC8967tuV abstractC8967tuV, String str) {
        if (abstractC8967tuV != null) {
            try {
                String GvG = abstractC8967tuV.GvG();
                if (TextUtils.isEmpty(GvG) && abstractC8967tuV.mo84137Dt() != null && abstractC8967tuV.mo84137Dt().m84282bX() == 1 && !TextUtils.isEmpty(abstractC8967tuV.mo84137Dt().m84284IL())) {
                    GvG = abstractC8967tuV.mo84137Dt().m84284IL();
                }
                String str2 = GvG;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                C8836VJ.m84755bg(C8838VzQ.m84740bg(), str2, abstractC8967tuV, m82456bg(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: bg */
    public static void m82455bg(String str, String str2, Context context) {
        int i;
        if (TextUtils.isEmpty(str2) || !m82478WR(context)) {
            return;
        }
        int length = str2.length();
        int i2 = 1;
        if (length % 3572 == 0) {
            i = length / 3572;
        } else {
            i = (length / 3572) + 1;
        }
        int i3 = 3572;
        int i4 = 0;
        while (i2 <= i) {
            if (i3 < length) {
                Log.d(str, i + "-" + i2 + ":" + str2.substring(i4, i3));
                i2++;
                i4 = i3;
                i3 += 3572;
            } else {
                Log.d(str, i + "-" + i2 + ":" + str2.substring(i4));
                return;
            }
        }
    }

    /* renamed from: bg */
    public static void m82453bg(StringBuilder sb2, String str, String str2) {
        int indexOf;
        if (sb2 == null || TextUtils.isEmpty(str) || (indexOf = sb2.indexOf(str)) <= 0) {
            return;
        }
        sb2.replace(indexOf, str.length() + indexOf, str2);
    }

    /* renamed from: bg */
    public static C8215eqN m82458bg(AbstractC8967tuV abstractC8967tuV, C7268eqN c7268eqN, Context context, String str) {
        int txA = abstractC8967tuV.txA();
        if (abstractC8967tuV.mo84092RJ() && (txA == 1 || txA == 3)) {
            c7268eqN.m89388bg(true, (View) new C8206bX(context));
            return new C8215eqN(abstractC8967tuV, c7268eqN, str, false);
        }
        return null;
    }

    /* renamed from: bg */
    public static void m82452bg(JSONObject jSONObject) {
        int intValue;
        try {
            Pair<String, Long> eqN2 = C8840WR.eqN("oem_store");
            int i = -1;
            if (eqN2 != null && ((intValue = Integer.valueOf((String) eqN2.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) eqN2.second).longValue() < C7862bg.m87505bg("oem_store_state_time", 259200000))) {
                i = intValue;
            }
            jSONObject.put("oem_store", i);
        } catch (Throwable th) {
            C7741PX.m87873bg("TTAD.ToolUtils", th.getMessage());
        }
    }

    /* renamed from: bg */
    public static void m82459bg(AbstractC8967tuV abstractC8967tuV, C7268eqN c7268eqN) {
        C8989zx mo84020eo;
        if (abstractC8967tuV == null || c7268eqN == null) {
            return;
        }
        int txA = abstractC8967tuV.txA();
        if (abstractC8967tuV.mo84092RJ()) {
            if ((txA == 2 || txA == 3 || txA == 5) && (mo84020eo = abstractC8967tuV.mo84020eo()) != null) {
                c7268eqN.m89389bg(true, mo84020eo.eqN(), mo84020eo.m83870zx(), mo84020eo.ldr(), mo84020eo.m83871iR(), mo84020eo.m83876bX());
            }
        }
    }

    /* renamed from: bg */
    public static int m82464bg(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            int size = copyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th) {
            C7741PX.m87873bg("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }

    /* renamed from: bg */
    public static JSONObject m82463bg(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
