package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7742Ta;
import com.bytedance.sdk.openadsdk.VzQ.p293bg.p294IL.C7933bg;
import com.bytedance.sdk.openadsdk.core.C8617PX;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.C8879bX;
import com.bytedance.sdk.openadsdk.core.act.C8874bg;
import com.bytedance.sdk.openadsdk.core.p332WR.C8850bX;
import com.bytedance.sdk.openadsdk.core.settings.AbstractC8995Lq;
import com.bytedance.sdk.openadsdk.core.settings.C9008eqN;
import com.bytedance.sdk.openadsdk.core.settings.C9011xxp;
import com.bytedance.sdk.openadsdk.core.settings.InterfaceC9010ldr;
import com.bytedance.sdk.openadsdk.p289PX.InterfaceC7900iR;
import com.bytedance.sdk.openadsdk.utils.C9568zx;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.C19577ad;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.smaato.sdk.video.vast.model.Verification;
import com.unity3d.player.UnityPlayer;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class DeviceUtils {

    /* renamed from: Kg */
    private static int f21128Kg = 0;

    /* renamed from: PX */
    private static int f21129PX = 0;

    /* renamed from: Ta */
    private static int f21130Ta = 0;

    /* renamed from: VB */
    private static int f21131VB = 0;

    /* renamed from: WR */
    private static int f21132WR = 0;

    /* renamed from: bg */
    public static String f21134bg = "";

    /* renamed from: eo */
    private static int f21135eo;

    /* renamed from: IL */
    private static volatile long f21127IL = System.currentTimeMillis();

    /* renamed from: bX */
    private static volatile boolean f21133bX = false;
    private static volatile boolean eqN = false;

    /* renamed from: zx */
    private static volatile boolean f21137zx = false;
    private static volatile boolean ldr = true;

    /* renamed from: iR */
    private static long f21136iR = 0;
    private static AtomicBoolean yDt = new AtomicBoolean(false);

    /* loaded from: classes3.dex */
    public static class AudioInfoReceiver extends BroadcastReceiver {

        /* renamed from: bg */
        static final CopyOnWriteArrayList<InterfaceC7900iR> f21140bg = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: IL */
        public static void m82674IL(Context context) {
            if (!DeviceUtils.eqN && context != null) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    context.registerReceiver(new AudioInfoReceiver(), intentFilter);
                    boolean unused = DeviceUtils.eqN = true;
                } catch (Throwable unused2) {
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = DeviceUtils.f21135eo = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        Iterator<InterfaceC7900iR> it = f21140bg.iterator();
                        while (it.hasNext()) {
                            it.next().mo86162bg(DeviceUtils.f21135eo);
                        }
                        if (DeviceUtils.f21132WR != 0) {
                            int unused2 = DeviceUtils.f21131VB = (int) ((DeviceUtils.f21135eo / DeviceUtils.f21132WR) * 100.0d);
                        }
                    }
                } else if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = DeviceUtils.f21129PX = intent.getIntExtra("state", 0);
                }
            } catch (Exception unused4) {
            }
        }

        /* renamed from: bg */
        public static void m82671bg(InterfaceC7900iR interfaceC7900iR) {
            if (interfaceC7900iR != null) {
                CopyOnWriteArrayList<InterfaceC7900iR> copyOnWriteArrayList = f21140bg;
                if (copyOnWriteArrayList.contains(interfaceC7900iR)) {
                    return;
                }
                copyOnWriteArrayList.add(interfaceC7900iR);
            }
        }

        /* renamed from: IL */
        public static void m82673IL(InterfaceC7900iR interfaceC7900iR) {
            if (interfaceC7900iR == null) {
                return;
            }
            f21140bg.remove(interfaceC7900iR);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.DeviceUtils$IL */
    /* loaded from: classes3.dex */
    static class C9493IL extends BroadcastReceiver {
        C9493IL() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.ldr = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.ldr = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.f21127IL = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.DeviceUtils$bX */
    /* loaded from: classes3.dex */
    public static class RunnableC9494bX implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            int i;
            try {
                final AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(C8838VzQ.m84740bg());
                if (advertisingIdInfo != null) {
                    if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    DeviceUtils.m82708IL(advertisingIdInfo);
                    C9011xxp.m83775bg(new AbstractC8995Lq.InterfaceC8998bg() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.bX.1
                        @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC8995Lq.InterfaceC8998bg
                        /* renamed from: IL */
                        public void mo82670IL() {
                            DeviceUtils.m82708IL(advertisingIdInfo);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC8995Lq.InterfaceC8998bg
                        /* renamed from: bg */
                        public void mo82669bg() {
                            DeviceUtils.m82708IL(advertisingIdInfo);
                        }
                    });
                } else {
                    i = -1;
                }
                if (i != -1) {
                    C8879bX.m84507bg(C8838VzQ.m84740bg()).m84506bg("limit_ad_track", i);
                }
            } catch (IOException e) {
                C7741PX.m87871bg("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e);
            } catch (Throwable th) {
                C7741PX.m87873bg("TTAD.DeviceUtils", th.getMessage());
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.DeviceUtils$bg */
    /* loaded from: classes3.dex */
    private static class C9496bg extends BroadcastReceiver {
        private C9496bg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: IL */
        public static void m82668IL(Context context) {
            int i = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i >= 33) {
                    context.registerReceiver(new C9496bg(), intentFilter, 2);
                } else {
                    context.registerReceiver(new C9496bg(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && context != null) {
                if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                    DeviceUtils.tuV(context);
                } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                    int i = 0;
                    if (intent.getIntExtra("state", 0) == 1) {
                        i = 1;
                    }
                    int unused = DeviceUtils.f21130Ta = i;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fy */
    public static int m82712Fy(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                if (!((PowerManager) context.getSystemService("power")).isPowerSaveMode()) {
                    return 0;
                }
                return 1;
            }
            return m82703LZ(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: Kg */
    public static int m82704Kg(Context context) {
        return f21128Kg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (android.provider.Settings.System.getInt(r4.getContentResolver(), "SmartModeStatus") == 4) goto L7;
     */
    /* renamed from: LZ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m82703LZ(android.content.Context r4) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "XIAOMI"
            boolean r1 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L33
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "POWER_SAVE_MODE_OPEN"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch: java.lang.Throwable -> L33
            if (r4 != r2) goto L19
            goto L1a
        L19:
            r2 = r3
        L1a:
            r3 = r2
            goto L32
        L1c:
            java.lang.String r1 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L32
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "SmartModeStatus"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch: java.lang.Throwable -> L33
            r0 = 4
            if (r4 != r0) goto L19
            goto L1a
        L32:
            return r3
        L33:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.DeviceUtils.m82703LZ(android.content.Context):int");
    }

    /* renamed from: Lq */
    private static int m82702Lq(Context context) {
        return f21129PX;
    }

    /* renamed from: VB */
    public static void m82697VB() {
        try {
            int ringerMode = ((AudioManager) C8838VzQ.m84740bg().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                f21128Kg = 1;
            } else if (ringerMode == 1) {
                f21128Kg = 2;
            } else {
                f21128Kg = 0;
            }
        } catch (Throwable unused) {
        }
    }

    private static void VzQ(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            f21132WR = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            f21135eo = streamVolume;
            f21131VB = (int) ((streamVolume / f21132WR) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: WR */
    public static int m82695WR() {
        return f21132WR;
    }

    @JProtect
    /* renamed from: eo */
    public static void m82682eo() {
        new RunnableC9494bX().run();
        Context m84740bg = C8838VzQ.m84740bg();
        if (m84740bg != null) {
            C8879bX.m84507bg(m84740bg).m84506bg("cpu_count", C9556iR.m82409bg());
            C8879bX.m84507bg(m84740bg).m84506bg("cpu_max_frequency", C9556iR.m82408bg(C9556iR.m82409bg()));
            C8879bX.m84507bg(m84740bg).m84506bg("cpu_min_frequency", C9556iR.m82412IL(C9556iR.m82409bg()));
            String m82479WR = ayS.m82479WR();
            if (m82479WR != null) {
                C8879bX.m84507bg(m84740bg).m84504bg("total_memory", m82479WR);
            }
            C8879bX.m84507bg(m84740bg).m84505bg("total_internal_storage", ayS.m82448eo());
            C8879bX.m84507bg(m84740bg).m84505bg("free_internal_storage", C7742Ta.m87868bg());
            C8879bX.m84507bg(m84740bg).m84505bg("total_sdcard_storage", ayS.m82482VB());
            C8879bX.m84507bg(m84740bg).m84506bg("is_root", ayS.m82487PX() ? 1 : 0);
            if (TextUtils.isEmpty(m82694WR(m84740bg))) {
                try {
                    Activity activity = UnityPlayer.currentActivity;
                    f21134bg = "unity";
                } catch (ClassNotFoundException unused) {
                    f21134bg = "native";
                }
                C8879bX.m84507bg(m84740bg).m84504bg("framework_name", f21134bg);
            }
            m82697VB();
            VzQ(m84740bg);
            f21130Ta = m82712Fy(m84740bg);
        }
    }

    /* renamed from: iR */
    public static int m82679iR(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int ldr() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) C8838VzQ.m84740bg().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    /* renamed from: tC */
    private static void m82678tC(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                DeviceUtils.tuV(applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tuV(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        C9519VJ.m82591IL(new AbstractRunnableC7227Kg("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.f21130Ta = DeviceUtils.m82712Fy(applicationContext);
            }
        });
    }

    /* renamed from: vb */
    private static float m82677vb(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static int xxp(Context context) {
        return f21130Ta;
    }

    /* renamed from: zx */
    public static JSONObject m82675zx(Context context) {
        return m82686bg(context, false);
    }

    /* renamed from: Kg */
    public static int m82705Kg() {
        return f21131VB;
    }

    /* renamed from: WR */
    public static String m82694WR(Context context) {
        if (TextUtils.isEmpty(f21134bg)) {
            f21134bg = C8879bX.m84507bg(context).m84508IL("framework_name", "");
        }
        return f21134bg;
    }

    /* renamed from: bX */
    public static boolean m82691bX(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int eqN(Context context) {
        if (m82691bX(context)) {
            return 3;
        }
        return m82709IL(context) ? 2 : 1;
    }

    /* renamed from: iR */
    public static int m82680iR() {
        return f21135eo;
    }

    private static int yDt(Context context) {
        int i;
        try {
            i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i == 32) {
            return 1;
        }
        return i == 16 ? 0 : -1;
    }

    /* renamed from: zx */
    public static float m82676zx() {
        int i = -1;
        try {
            Context m84740bg = C8838VzQ.m84740bg();
            if (m84740bg != null) {
                i = Settings.System.getInt(m84740bg.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            C7741PX.m87873bg("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return Math.round((i / 255.0f) * 10.0f) / 10.0f;
    }

    @JProtect
    /* renamed from: IL */
    public static boolean m82711IL() {
        if (SystemClock.elapsedRealtime() - f21136iR >= 20000) {
            f21136iR = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) C8838VzQ.m84740bg().getSystemService("power");
                if (powerManager != null) {
                    ldr = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                C7741PX.m87873bg("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return ldr;
    }

    /* renamed from: bX */
    public static int m82693bX() {
        return C8879bX.m84507bg(C8838VzQ.m84740bg()).m84510IL("limit_ad_track", -1);
    }

    public static int ldr(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            C7741PX.m87873bg("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    public static String eqN() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    /* renamed from: bg */
    public static void m82687bg(Context context) {
        if (f21133bX) {
            return;
        }
        try {
            C9493IL c9493il = new C9493IL();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(c9493il, intentFilter);
            f21133bX = true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: VB */
    public static void m82696VB(Context context) {
        Context applicationContext;
        if (f21137zx || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                C9496bg.m82668IL(applicationContext);
            } else {
                m82678tC(applicationContext);
            }
            f21137zx = true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: IL */
    public static boolean m82709IL(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: IL */
    private static void m82707IL(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        if (C8838VzQ.eqN().DDQ(C19577ad.f49047D0)) {
            jSONObject.put(C19577ad.f49047D0, C7933bg.m87401bg().m87403IL());
        }
    }

    /* renamed from: bg */
    public static long m82690bg() {
        return f21127IL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public static void m82708IL(AdvertisingIdClient.Info info) {
        if (!C8838VzQ.eqN().DDQ(C19577ad.f49047D0) || yDt.getAndSet(true)) {
            return;
        }
        String id2 = info.getId();
        if (TextUtils.isEmpty(id2)) {
            return;
        }
        C7933bg.m87401bg().m87402IL(id2);
        C7933bg.m87400bg(id2);
        C8850bX.m84676bg(id2);
    }

    /* renamed from: bg */
    private static void m82684bg(JSONObject jSONObject) throws JSONException {
        m82707IL(jSONObject);
    }

    @JProtect
    /* renamed from: bg */
    public static JSONObject m82686bg(Context context, boolean z) {
        String m82499IL;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", ldr(context));
            m82684bg(jSONObject);
            jSONObject.put("type", eqN(context));
            jSONObject.put("os", 1);
            jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject.put(Verification.VENDOR, Build.MANUFACTURER);
            jSONObject.put("conn_type", ayS.m82486PX(context));
            jSONObject.put(CommonUrlParts.APP_SET_ID, C9008eqN.m83829bX());
            jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, C9008eqN.m83831IL());
            jSONObject.put("installed_source", C9008eqN.eqN());
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, ZQc.m82538bX(context));
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, ZQc.eqN(context));
            jSONObject.put("sec_did", C8850bX.ldr());
            InterfaceC9010ldr eqN2 = C8838VzQ.eqN();
            if (eqN2.DDQ("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put(CommonUrlParts.UUID, C8617PX.m85534bX(context));
            jSONObject.put("rom_version", JAA.m82644bg());
            jSONObject.put("sys_compiling_time", C8617PX.m85535IL(context));
            jSONObject.put("timezone", ayS.VzQ());
            jSONObject.put("language", C8617PX.m85533bg());
            jSONObject.put("carrier_name", C9516Uw.m82595bg());
            if (z) {
                m82499IL = ayS.m82467bg(context);
            } else {
                m82499IL = ayS.m82499IL(context);
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(m82499IL) * 1024));
            jSONObject.put("locale_language", eqN());
            jSONObject.put("screen_bright", Math.ceil(m82676zx() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", m82711IL() ? 0 : 1);
            jSONObject.put("cpu_num", C9556iR.m82407bg(context));
            jSONObject.put("cpu_max_freq", C9556iR.m82411IL(context));
            jSONObject.put("cpu_min_freq", C9556iR.m82410bX(context));
            C9568zx.C9569bg m82383bg = C9568zx.m82383bg();
            jSONObject.put("battery_remaining_pct", (int) m82383bg.f21337IL);
            jSONObject.put("is_charging", m82383bg.f21338bg);
            jSONObject.put("total_space", String.valueOf(ayS.m82474bX(context)));
            jSONObject.put("free_space_in", String.valueOf(ayS.eqN(context)));
            jSONObject.put("sdcard_size", String.valueOf(ayS.m82437zx(context)));
            jSONObject.put("rooted", ayS.ldr(context));
            jSONObject.put("enable_assisted_clicking", ldr());
            jSONObject.put("force_language", C7730Fy.m87917bg(context, "tt_choose_language"));
            jSONObject.put("airplane", m82679iR(context));
            jSONObject.put("darkmode", yDt(context));
            jSONObject.put("headset", m82702Lq(context));
            jSONObject.put("ringmute", m82704Kg(context));
            jSONObject.put("screenscale", m82677vb(context));
            jSONObject.put("volume", m82705Kg());
            jSONObject.put("low_power_mode", xxp(context));
            if (eqN2.DDQ("mnc")) {
                jSONObject.put("mnc", C9516Uw.m82596bX());
            }
            if (eqN2.DDQ("mcc")) {
                jSONObject.put("mcc", C9516Uw.m82597IL());
            }
            jSONObject.put(KeyConstants.RequestBody.KEY_ACT, C8874bg.m84522IL(context));
            jSONObject.put("act_event", C8874bg.m84519bg());
            String m84680bX = C8850bX.m84680bX();
            C8850bX.eqN();
            if (!TextUtils.isEmpty(m84680bX)) {
                jSONObject.put("sof_chara", m84680bX);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: eo */
    public static void m82681eo(Context context) {
        AudioInfoReceiver.m82674IL(context);
    }
}
