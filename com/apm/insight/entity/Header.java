package com.apm.insight.entity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.apm.insight.AppDataCenter;
import com.apm.insight.NpthBus;
import com.apm.insight.p130l.Device;
import com.apm.insight.p130l.Net;
import com.apm.insight.p130l.RomUtils;
import com.apm.insight.runtime.RuntimeContext;
import com.ironsource.C21018tj;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.p552ot.pubsub.p559g.C26542f;
import com.p552ot.pubsub.util.C26601v;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Header {

    /* renamed from: a */
    private static final String[] f3735a = {"version_code", "manifest_version_code", C21018tj.f53565b, "update_version_code"};

    /* renamed from: d */
    private static String f3736d = null;

    /* renamed from: e */
    private static int f3737e = -1;

    /* renamed from: f */
    private static int f3738f = -1;

    /* renamed from: b */
    private Context f3739b;

    /* renamed from: c */
    private JSONObject f3740c = new JSONObject();

    public Header(Context context) {
        this.f3739b = context;
    }

    /* renamed from: a */
    public static Header m101982a(Context context) {
        Header header = new Header(context);
        JSONObject jSONObject = header.f3740c;
        try {
            jSONObject.put("sdk_version", 1030851);
            jSONObject.put("sdk_version_name", "1.3.8.nourl-rc.1");
        } catch (Exception unused) {
        }
        return header;
    }

    @Keep
    public static void addOtherHeader(JSONObject jSONObject) {
        DisplayMetrics displayMetrics;
        Object obj;
        if (jSONObject == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            if (Device.m101737b()) {
                sb2.append("MIUI-");
            } else if (Device.m101735c()) {
                sb2.append("FLYME-");
            } else {
                String m101739a = Device.m101739a();
                if (Device.m101738a(m101739a)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(m101739a)) {
                    sb2.append(m101739a);
                    sb2.append("-");
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
            if (sb2.length() > 0) {
                jSONObject.put("rom", sb2.toString());
            }
            jSONObject.put("rom_version", RomUtils.m101639a());
        } catch (Throwable unused) {
        }
        try {
            int i = NpthBus.m102011g().getResources().getDisplayMetrics().densityDpi;
            if (i != 120) {
                if (i != 240) {
                    if (i != 320) {
                        obj = "mdpi";
                    } else {
                        obj = "xhdpi";
                    }
                } else {
                    obj = "hdpi";
                }
            } else {
                obj = "ldpi";
            }
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", obj);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused2) {
        }
        try {
            String language = NpthBus.m102011g().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / C26601v.f69837d;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put("os", "Android");
            jSONObject.put("device_id", NpthBus.m102017c().m101405a());
            String str = Build.VERSION.RELEASE;
            if (!str.contains(".")) {
                str = str + ".0";
            }
            jSONObject.put(CommonUrlParts.OS_VERSION, str);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str2 = Build.MODEL;
            String str3 = Build.BRAND;
            if (str2 == null) {
                str2 = str3;
            } else if (str3 != null && !str2.contains(str3)) {
                str2 = str3 + ' ' + str2;
            }
            jSONObject.put("device_model", str2);
            jSONObject.put("device_brand", str3);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put(KeyConstants.Android.KEY_CPU_ABI, m101968g());
            Context m102011g = NpthBus.m102011g();
            String packageName = m102011g.getPackageName();
            jSONObject.put(C26542f.C26543a.f69507e, packageName);
            PackageInfo packageInfo = m102011g.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i2 = applicationInfo.labelRes;
                if (i2 > 0) {
                    jSONObject.put("display_name", m102011g.getString(i2));
                } else {
                    jSONObject.put("display_name", m102011g.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        HeaderCombiner.m101923a(jSONObject);
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        try {
            jSONObject.put("access", Net.m101643a(NpthBus.m102011g()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) NpthBus.m102011g().getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put("carrier", networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (!TextUtils.isEmpty(networkOperator)) {
                    jSONObject.put("mcc_mnc", networkOperator);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public static Header m101977b(Context context) {
        Header m101982a = m101982a(context);
        m101981a(m101982a);
        m101976b(m101982a);
        m101982a.m101974c();
        m101982a.m101972d();
        m101982a.m101970e();
        return m101982a;
    }

    /* renamed from: g */
    private static String m101968g() {
        if (f3736d == null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    int i = 0;
                    while (true) {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (i >= strArr.length) {
                            break;
                        }
                        sb2.append(strArr[i]);
                        if (i != strArr.length - 1) {
                            sb2.append(", ");
                        }
                        i++;
                    }
                } else {
                    sb2 = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb2.toString())) {
                    f3736d = "unknown";
                }
                f3736d = sb2.toString();
            } catch (Exception e) {
                AppDataCenter.m102158b((Throwable) e);
                f3736d = "unknown";
            }
        }
        return f3736d;
    }

    /* renamed from: c */
    public final JSONObject m101974c() {
        return m101980a(NpthBus.m102029a().m101542a());
    }

    /* renamed from: d */
    public final JSONObject m101972d() {
        try {
            this.f3740c.put("device_id", NpthBus.m102017c().m101405a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f3740c;
    }

    /* renamed from: e */
    public final JSONObject m101970e() {
        try {
            long m101532f = NpthBus.m102029a().m101532f();
            if (m101532f > 0) {
                this.f3740c.put("user_id", m101532f);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f3740c;
    }

    /* renamed from: f */
    public final JSONObject m101969f() {
        return this.f3740c;
    }

    /* renamed from: c */
    public static boolean m101973c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    /* renamed from: d */
    public static boolean m101971d(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String optString = jSONObject.optString(C21018tj.f53565b);
            if (TextUtils.isEmpty(optString)) {
                return true;
            }
            try {
                return Integer.parseInt(optString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    /* renamed from: a */
    public static Header m101983a(long j) {
        Header m101982a;
        RuntimeContext m101330a = RuntimeContext.m101330a();
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject m101329a = m101330a.m101329a(j);
        if (m101329a != null && m101329a.length() != 0) {
            m101982a = new Header(NpthBus.m102011g());
        } else {
            m101982a = m101982a(NpthBus.m102011g());
            m101982a.m101974c();
            try {
                m101982a.f3740c.put("errHeader", 1);
            } catch (Throwable unused) {
            }
        }
        m101976b(m101982a);
        m101982a.m101979a(m101329a);
        return m101982a;
    }

    /* renamed from: b */
    public static boolean m101978b() {
        if (f3738f == -1) {
            f3738f = m101968g().contains("86") ? 1 : 0;
        }
        return f3738f == 1;
    }

    /* renamed from: b */
    public static boolean m101975b(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    /* renamed from: b */
    public static void m101976b(Header header) {
        if (header == null) {
            return;
        }
        addOtherHeader(header.f3740c);
    }

    /* renamed from: a */
    public static boolean m101984a() {
        if (f3737e == -1) {
            f3737e = m101968g().contains("64") ? 1 : 0;
        }
        return f3737e == 1;
    }

    /* renamed from: a */
    public final JSONObject m101979a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f3740c;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                this.f3740c.put(next, jSONObject.opt(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return this.f3740c;
    }

    /* renamed from: a */
    public final JSONObject m101980a(@Nullable Map<String, Object> map) {
        if (map == null) {
            return this.f3740c;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!this.f3740c.has(entry.getKey())) {
                this.f3740c.put(entry.getKey(), entry.getValue());
            }
        }
        String[] strArr = f3735a;
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (map.containsKey(str)) {
                this.f3740c.put(str, Integer.parseInt(String.valueOf(map.get(str))));
            }
        }
        if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
            try {
                this.f3740c.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
            } catch (Throwable unused) {
            }
        }
        if (map.containsKey("iid")) {
            this.f3740c.put("udid", map.get("iid"));
            this.f3740c.remove("iid");
        }
        if (map.containsKey("version_name")) {
            this.f3740c.put("app_version", map.get("version_name"));
            this.f3740c.remove("version_name");
        }
        return this.f3740c;
    }

    /* renamed from: a */
    public static Header m101981a(Header header) {
        addRuntimeHeader(header.f3740c);
        return header;
    }
}
