package p1006v2;

import android.app.LocaleManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.facebook.internal.AnalyticsEvents;
import com.helpshift.log.HSLogger;
import java.util.Locale;
import java.util.UUID;
import p648e3.InterfaceC32918a;
import p693h3.HSPersistentStorage;
import p752k3.C37383m;
import p752k3.ValuePair;

/* renamed from: v2.a */
/* loaded from: classes5.dex */
public class AndroidDevice implements InterfaceC32918a {

    /* renamed from: a */
    private final Context f116779a;

    /* renamed from: b */
    private HSPersistentStorage f116780b;

    public AndroidDevice(Context context, HSPersistentStorage hSPersistentStorage) {
        this.f116779a = context;
        this.f116780b = hSPersistentStorage;
    }

    @Override // p648e3.InterfaceC32918a
    /* renamed from: a */
    public boolean mo2787a() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f116779a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (!activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            HSLogger.m65438e("Device", "Exception while getting system connectivity service", e);
            return false;
        }
    }

    @Override // p648e3.InterfaceC32918a
    /* renamed from: b */
    public String mo2786b(String str) {
        return Base64.encodeToString(str.getBytes(), 2);
    }

    @Override // p648e3.InterfaceC32918a
    /* renamed from: c */
    public String mo2785c() {
        return System.getProperty("os.version") + ":" + Build.FINGERPRINT;
    }

    @Override // p648e3.InterfaceC32918a
    /* renamed from: d */
    public String mo2784d() {
        return "10.3.1";
    }

    @Override // p648e3.InterfaceC32918a
    /* renamed from: e */
    public String mo2783e() {
        return Build.VERSION.RELEASE;
    }

    @Override // p648e3.InterfaceC32918a
    /* renamed from: f */
    public String mo2782f() {
        return this.f116779a.getPackageName();
    }

    @Override // p648e3.InterfaceC32918a
    /* renamed from: g */
    public String mo2781g() {
        try {
            return this.f116779a.getPackageManager().getPackageInfo(mo2782f(), 0).versionName;
        } catch (Exception e) {
            HSLogger.m65440d("Device", "Error getting app version", e);
            return null;
        }
    }

    @Override // p648e3.InterfaceC32918a
    public String getAppName() {
        String str;
        try {
            str = this.f116779a.getPackageManager().getApplicationLabel(this.f116779a.getApplicationInfo()).toString();
        } catch (Exception e) {
            HSLogger.m65440d("Device", "Error getting application name", e);
            str = null;
        }
        if (str == null) {
            return "Support";
        }
        return str;
    }

    @Override // p648e3.InterfaceC32918a
    public String getBatteryLevel() {
        Intent registerReceiver = this.f116779a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return "";
        }
        int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1)) * 100.0f);
        return intExtra + "%";
    }

    @Override // p648e3.InterfaceC32918a
    public String getBatteryStatus() {
        boolean z;
        Intent registerReceiver = this.f116779a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return "Not charging";
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra != 2 && intExtra != 5) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return "Not charging";
        }
        return "Charging";
    }

    @Override // p648e3.InterfaceC32918a
    public String getCarrierName() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f116779a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkOperatorName();
    }

    @Override // p648e3.InterfaceC32918a
    public String getCountryCode() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f116779a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getSimCountryIso();
    }

    @Override // p648e3.InterfaceC32918a
    public String getDeviceId() {
        String m23753o = this.f116780b.m23753o();
        if (C37383m.m18236d(m23753o)) {
            String uuid = UUID.randomUUID().toString();
            this.f116780b.m23774d0(uuid);
            return uuid;
        }
        return m23753o;
    }

    @Override // p648e3.InterfaceC32918a
    public String getDeviceModel() {
        return Build.MODEL;
    }

    @Override // p648e3.InterfaceC32918a
    public String getLanguage() {
        String languageTag;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                LocaleList applicationLocales = ((LocaleManager) this.f116779a.getSystemService(LocaleManager.class)).getApplicationLocales();
                if (applicationLocales != null && !applicationLocales.isEmpty()) {
                    languageTag = applicationLocales.get(0).toLanguageTag();
                } else {
                    languageTag = Locale.getDefault().toLanguageTag();
                }
            } else {
                languageTag = Locale.getDefault().toLanguageTag();
            }
            return languageTag;
        } catch (Exception e) {
            HSLogger.m65438e("Device", "Error getting app language", e);
            return "unknown";
        }
    }

    @Override // p648e3.InterfaceC32918a
    public String getNetworkType() {
        NetworkInfo activeNetworkInfo;
        String str = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f116779a.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                str = activeNetworkInfo.getTypeName();
            }
        } catch (SecurityException unused) {
        }
        if (str == null) {
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        return str;
    }

    @Override // p648e3.InterfaceC32918a
    /* renamed from: h */
    public ValuePair<String, String> mo2780h() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return new ValuePair<>((Math.round(((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1.073741824E9d) * 100.0d) / 100.0d) + " GB", (Math.round(((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1.073741824E9d) * 100.0d) / 100.0d) + " GB");
    }

    @Override // p648e3.InterfaceC32918a
    /* renamed from: i */
    public String mo2779i() {
        return "android";
    }
}
