package sg.bigo.ads.common.p906aa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.C43595b;
import sg.bigo.ads.common.p910d.C43602a;
import sg.bigo.ads.common.p910d.InterfaceC43609e;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43818c;

/* renamed from: sg.bigo.ads.common.aa.b */
/* loaded from: classes10.dex */
public final class C43588b {

    /* renamed from: a */
    private static int f114151a;

    /* renamed from: b */
    private static final List<InterfaceC43591a> f114152b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private static boolean f114153c = false;

    /* renamed from: d */
    private static String f114154d = "-1";

    /* renamed from: e */
    private static String f114155e = "-1";

    /* renamed from: f */
    private static int f114156f = 0;

    /* renamed from: g */
    private static final AtomicBoolean f114157g = new AtomicBoolean(false);

    /* renamed from: sg.bigo.ads.common.aa.b$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43591a {
        /* renamed from: a */
        void mo3291a(int i);
    }

    /* renamed from: c */
    public static String m5343c(Context context) {
        if ("-1".equals(f114154d)) {
            f114154d = "";
            if (!C43818c.m4934a(context, "android.permission.READ_PHONE_STATE")) {
                return f114154d;
            }
            try {
                f114154d = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
            } catch (Exception unused) {
            }
        }
        return f114154d;
    }

    /* renamed from: d */
    public static String m5341d(Context context) {
        if ("-1".equals(f114155e)) {
            f114155e = "";
            if (!C43818c.m4934a(context, "android.permission.READ_PHONE_STATE")) {
                return f114155e;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                f114155e = networkCountryIso;
                if (TextUtils.isEmpty(networkCountryIso)) {
                    f114155e = telephonyManager.getSimCountryIso();
                }
            } catch (Exception unused) {
            }
        }
        return f114155e;
    }

    /* renamed from: h */
    private static boolean m5335h() {
        return true;
    }

    /* renamed from: a */
    public static int m5350a(@NonNull Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i = activity.getResources().getConfiguration().orientation;
        if (1 == i) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        } else if (2 == i) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        } else {
            C43782a.m5009a(0, "DeviceUtil", "Unknown orientation. return portrait by default");
            return 9;
        }
    }

    /* renamed from: b */
    public static String m5345b(Context context) {
        Resources resources;
        Locale locale;
        return (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) ? "zz" : locale.getCountry();
    }

    /* renamed from: c */
    public static boolean m5344c() {
        return m5335h() && f114156f == 1;
    }

    /* renamed from: d */
    public static C43595b m5342d() {
        try {
            Context context = C43617a.f114190a;
            Intent registerReceiver = context != null ? context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) : null;
            if (registerReceiver != null) {
                return new C43595b(registerReceiver.getIntExtra("level", -1), registerReceiver.getIntExtra("scale", -1), registerReceiver.getIntExtra("status", -1));
            }
        } catch (Exception e) {
            C43782a.m5010a(0, 3, "DeviceUtil", "getBatteryLevel exception: " + e.getMessage());
        }
        return null;
    }

    /* renamed from: e */
    public static String m5339e(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        try {
            if (TextUtils.isEmpty(str)) {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                return !TextUtils.isEmpty(defaultUserAgent) ? defaultUserAgent.substring(defaultUserAgent.indexOf("Chrome/") + 7, defaultUserAgent.indexOf("Mobile")).trim() : defaultUserAgent;
            }
            return str;
        } catch (Exception unused2) {
            return str;
        }
    }

    @WorkerThread
    /* renamed from: f */
    public static void m5337f(Context context) {
        if (!f114157g.getAndSet(true) && m5335h()) {
            C43782a.m5010a(0, 3, "DeviceUtil", "Register display listener");
            final DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: sg.bigo.ads.common.aa.b.2
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayChanged(int i) {
                    if (i == 0) {
                        try {
                            int unused = C43588b.f114156f = displayManager.getDisplay(i).getState();
                        } catch (Throwable unused2) {
                        }
                    }
                    C43782a.m5010a(0, 3, "DeviceUtil", "onDisplayChanged: " + i + ", sDefaultDisplayState: " + C43588b.f114156f);
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayAdded(int i) {
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayRemoved(int i) {
                }
            }, null);
        }
    }

    /* renamed from: a */
    public static String m5349a(Context context) {
        Resources resources;
        Locale locale;
        if (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) {
            return Locale.US.getLanguage();
        }
        String language = locale.getLanguage();
        return language.equals("iw") ? "he" : language.equals("in") ? "id" : language.equals("ji") ? "yi" : language;
    }

    /* renamed from: b */
    public static void m5347b() {
        f114154d = "-1";
        f114155e = "-1";
    }

    /* renamed from: a */
    public static synchronized void m5348a(@NonNull InterfaceC43591a interfaceC43591a) {
        synchronized (C43588b.class) {
            List<InterfaceC43591a> list = f114152b;
            if (!list.contains(interfaceC43591a)) {
                list.add(interfaceC43591a);
            }
            if (!f114153c) {
                f114153c = true;
                C43782a.m5010a(0, 3, "DeviceUtil", "registerScreenListener");
                C43602a.m5323a().m5321a(C43617a.f114190a, new InterfaceC43609e() { // from class: sg.bigo.ads.common.aa.b.1
                    /* JADX WARN: Removed duplicated region for block: B:37:0x0041  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x005d A[ORIG_RETURN, RETURN] */
                    @Override // sg.bigo.ads.common.p910d.InterfaceC43606b
                    /* renamed from: a */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void mo3527a(android.content.Context r5, android.content.Intent r6) {
                        /*
                            r4 = this;
                            java.lang.String r5 = r6.getAction()
                            boolean r6 = sg.bigo.ads.common.utils.C43836q.m4837a(r5)
                            if (r6 == 0) goto Lb
                            return
                        Lb:
                            int r6 = sg.bigo.ads.common.p906aa.C43588b.m5340e()
                            java.lang.String r0 = java.lang.String.valueOf(r5)
                            java.lang.String r1 = "action = "
                            java.lang.String r0 = r1.concat(r0)
                            r1 = 0
                            r2 = 3
                            java.lang.String r3 = "DeviceUtil"
                            sg.bigo.ads.common.p932t.C43782a.m5010a(r1, r2, r3, r0)
                            r5.hashCode()
                            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
                            boolean r0 = r5.equals(r0)
                            if (r0 != 0) goto L39
                            java.lang.String r0 = "android.intent.action.USER_PRESENT"
                            boolean r5 = r5.equals(r0)
                            if (r5 != 0) goto L34
                            goto L3b
                        L34:
                            r5 = 1
                        L35:
                            sg.bigo.ads.common.p906aa.C43588b.m5351a(r5)
                            goto L3b
                        L39:
                            r5 = 2
                            goto L35
                        L3b:
                            int r5 = sg.bigo.ads.common.p906aa.C43588b.m5340e()
                            if (r6 == r5) goto L5d
                            java.util.List r5 = sg.bigo.ads.common.p906aa.C43588b.m5338f()
                            java.util.Iterator r5 = r5.iterator()
                        L49:
                            boolean r6 = r5.hasNext()
                            if (r6 == 0) goto L5d
                            java.lang.Object r6 = r5.next()
                            sg.bigo.ads.common.aa.b$a r6 = (sg.bigo.ads.common.p906aa.C43588b.InterfaceC43591a) r6
                            int r0 = sg.bigo.ads.common.p906aa.C43588b.m5340e()
                            r6.mo3291a(r0)
                            goto L49
                        L5d:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.p906aa.C43588b.C435891.mo3527a(android.content.Context, android.content.Intent):void");
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static boolean m5352a() {
        if (f114151a == 0) {
            PowerManager powerManager = (PowerManager) C43617a.f114190a.getSystemService("power");
            f114151a = powerManager == null || powerManager.isScreenOn() ? 1 : 2;
        }
        return f114151a == 1;
    }
}
