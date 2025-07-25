package com.pubmatic.sdk.common.models;

import android.content.Context;
import android.location.Address;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.p552ot.pubsub.p553a.C26484a;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBAdvertisingIdClient;
import com.pubmatic.sdk.common.utility.POBLocationDetector;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;

/* loaded from: classes7.dex */
public class POBDeviceInfo {

    /* renamed from: b */
    private int f70138b;
    @Nullable

    /* renamed from: c */
    private String f70139c;
    @Nullable

    /* renamed from: f */
    private String f70142f;
    @Nullable

    /* renamed from: g */
    private String f70143g;
    @Nullable

    /* renamed from: h */
    private String f70144h;
    @Nullable

    /* renamed from: i */
    private String f70145i;
    @Nullable

    /* renamed from: j */
    private String f70146j;
    @Nullable

    /* renamed from: k */
    private String f70147k;
    @Nullable

    /* renamed from: l */
    private String f70148l;
    @Nullable

    /* renamed from: m */
    private String f70149m;
    @NonNull

    /* renamed from: n */
    private final Context f70150n;

    /* renamed from: o */
    private float f70151o;
    @Nullable

    /* renamed from: p */
    private String f70152p;
    @Nullable

    /* renamed from: q */
    private String f70153q;
    @Nullable

    /* renamed from: r */
    private String f70154r;
    public int screenHeight;
    public int screenWidth;

    /* renamed from: a */
    private final String f70137a = "POBDeviceInfo";
    @Nullable

    /* renamed from: d */
    private String f70140d = null;
    @Nullable

    /* renamed from: e */
    private Boolean f70141e = null;

    /* loaded from: classes7.dex */
    public enum DEVICE_ID_TYPE {
        ANDROID_ID("3"),
        ADVERTISING_ID("9");
        

        /* renamed from: b */
        private final String f70156b;

        DEVICE_ID_TYPE(String str) {
            this.f70156b = str;
        }

        public String getValue() {
            return this.f70156b;
        }
    }

    public POBDeviceInfo(@NonNull Context context) {
        this.f70142f = null;
        this.f70148l = null;
        this.f70150n = context;
        updateAdvertisingIdInfo();
        this.f70139c = m40602a(context);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                if (telephonyManager.getPhoneType() != 2) {
                    String networkOperator = telephonyManager.getNetworkOperator();
                    if (!TextUtils.isEmpty(networkOperator)) {
                        int parseInt = Integer.parseInt(networkOperator.substring(0, 3));
                        int parseInt2 = Integer.parseInt(networkOperator.substring(3));
                        this.f70152p = "" + parseInt + "-" + parseInt2;
                    }
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    this.f70153q = networkCountryIso != null ? networkCountryIso.toUpperCase(Locale.ENGLISH) : null;
                }
                m40603a();
                this.f70142f = telephonyManager.getNetworkOperatorName();
            } catch (Exception e) {
                POBLog.warn("POBDeviceInfo", "Unable to fetch carrier name from TelephonyManager or ISO3 or ISO2 country code. Error: %s", e.getMessage());
            }
        }
        this.f70143g = Locale.getDefault().getLanguage();
        this.f70144h = Build.MANUFACTURER;
        this.f70145i = Build.MODEL;
        this.f70146j = "Android";
        this.f70147k = Build.VERSION.RELEASE;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                this.screenWidth = displayMetrics.widthPixels;
                this.screenHeight = displayMetrics.heightPixels;
                this.f70148l = displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
            }
        } catch (Exception e2) {
            POBLog.warn("POBDeviceInfo", "Unable to fetch screen resolution. Error: %s", e2.getMessage());
        }
        this.f70149m = new SimpleDateFormat("ZZZZZ", Locale.getDefault()).format(Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime());
        this.f70151o = this.f70150n.getResources().getDisplayMetrics().density;
        this.f70138b = POBUtils.getTimeOffsetInMinutes();
    }

    /* renamed from: a */
    private String m40602a(Context context) {
        String str;
        try {
            str = Settings.Secure.getString(context.getContentResolver(), C26484a.f69184A);
        } catch (Exception e) {
            POBLog.warn("POBDeviceInfo", "Unable to fetch Device ID. Error: %s", e.getMessage());
            str = null;
        }
        return str == null ? "" : str;
    }

    @Nullable
    public String getAcceptLanguage() {
        return this.f70143g;
    }

    @Nullable
    public String getAdvertisingID() {
        return this.f70140d;
    }

    @Nullable
    public String getAndroidId() {
        return this.f70139c;
    }

    public DEVICE_ID_TYPE getAndroidIdType(boolean z) {
        if (z) {
            return DEVICE_ID_TYPE.ADVERTISING_ID;
        }
        return DEVICE_ID_TYPE.ANDROID_ID;
    }

    @Nullable
    public String getCarrierName() {
        return this.f70142f;
    }

    public String getCurrentTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime());
    }

    @Nullable
    public String getCurrentTimeZone() {
        return this.f70149m;
    }

    @Nullable
    public String getISOAlpha2CountryCode() {
        return this.f70153q;
    }

    @Nullable
    public String getISOAlpha3CountryCode() {
        return this.f70154r;
    }

    @Nullable
    public Boolean getLmtEnabled() {
        return this.f70141e;
    }

    @Nullable
    public String getMake() {
        return this.f70144h;
    }

    @Nullable
    public String getMccmnc() {
        return this.f70152p;
    }

    @Nullable
    public String getModel() {
        return this.f70145i;
    }

    public int getOrientation() {
        return this.f70150n.getResources().getConfiguration().orientation;
    }

    @Nullable
    public String getOsName() {
        return this.f70146j;
    }

    @Nullable
    public String getOsVersion() {
        return this.f70147k;
    }

    public float getPxratio() {
        return this.f70151o;
    }

    public int getScreenHeight() {
        return this.screenHeight;
    }

    @Nullable
    public String getScreenResolution() {
        return this.f70148l;
    }

    public int getScreenWidth() {
        return this.screenWidth;
    }

    public int getTimeZoneOffsetInMinutes() {
        return this.f70138b;
    }

    @WorkerThread
    public String getUserAgent() {
        return POBInstanceProvider.getCacheManager(this.f70150n).fetchUserAgent();
    }

    public void updateAdvertisingIdInfo() {
        POBAdvertisingIdClient pOBAdvertisingIdClient = POBAdvertisingIdClient.getInstance(this.f70150n);
        pOBAdvertisingIdClient.updateAAID();
        String storedAdvertisingId = pOBAdvertisingIdClient.getStoredAdvertisingId();
        this.f70140d = storedAdvertisingId;
        if (storedAdvertisingId != null) {
            this.f70141e = Boolean.valueOf(pOBAdvertisingIdClient.getStoredLMTState());
        }
    }

    /* renamed from: a */
    private void m40603a() {
        Address address;
        String str = this.f70153q;
        if (str != null) {
            this.f70154r = m40601a(str);
        }
        if (!TextUtils.isEmpty(this.f70154r) || (address = new POBLocationDetector(this.f70150n).getAddress()) == null) {
            return;
        }
        String countryCode = address.getCountryCode();
        if (TextUtils.isEmpty(countryCode)) {
            return;
        }
        this.f70154r = m40601a(countryCode);
    }

    @Nullable
    /* renamed from: a */
    private String m40601a(@NonNull String str) {
        try {
            return new Locale(Locale.ENGLISH.getLanguage(), str).getISO3Country();
        } catch (MissingResourceException unused) {
            POBLog.warn("POBDeviceInfo", "Unable to get ISO 3 country code from ISO2 for input value as %s", str);
            return null;
        }
    }
}
