package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.MonitorCrash;
import com.apm.insight.entity.CustomBody;
import com.apm.insight.nativecrash.NativeFileParser;
import com.apm.insight.p128j.CommonParamsTask;
import com.apm.insight.p129k.NpthConfigFetcher;
import com.apm.insight.p130l.Stack;
import com.appsflyer.AppsFlyerProperties;
import com.ironsource.C21018tj;
import com.p552ot.pubsub.p559g.C26542f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.d */
/* loaded from: classes2.dex */
public final class MonitorCrashHandler {

    /* renamed from: a */
    protected static MonitorCrash f3697a;

    /* renamed from: c */
    private static volatile ConcurrentHashMap<String, MonitorCrashHandler> f3698c = new ConcurrentHashMap<>();

    /* renamed from: b */
    private MonitorCrash f3699b;

    private MonitorCrashHandler(MonitorCrash monitorCrash) {
        this.f3699b = monitorCrash;
        CustomBody.m101938a(this);
        CommonParamsTask.m101857c();
        NpthConfigFetcher.m101767e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    /* renamed from: d */
    public JSONObject m102034d() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f3699b.mConfig.mPackageName == null) {
                Context m102011g = NpthBus.m102011g();
                PackageInfo packageInfo = m102011g.getPackageManager().getPackageInfo(m102011g.getPackageName(), 128);
                if (packageInfo != null) {
                    MonitorCrash.Config config = this.f3699b.mConfig;
                    if (config.mVersionInt == -1) {
                        config.mVersionInt = packageInfo.versionCode;
                    }
                    if (config.mVersionStr == null) {
                        config.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f3699b.mConfig.mDeviceId) || "0".equals(this.f3699b.mConfig.mDeviceId)) {
            this.f3699b.mConfig.mDeviceId = NpthBus.m102017c().m101405a();
        }
        try {
            jSONObject.put(C21018tj.f53565b, String.valueOf(this.f3699b.mConfig.mAid));
            jSONObject.put("update_version_code", this.f3699b.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f3699b.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f3699b.mConfig.mVersionStr);
            jSONObject.put(AppsFlyerProperties.CHANNEL, this.f3699b.mConfig.mChannel);
            jSONObject.put(C26542f.C26543a.f69507e, AppDataCenter.m102165a(this.f3699b.mConfig.mPackageName));
            jSONObject.put("device_id", this.f3699b.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f3699b.mConfig.mUID);
            jSONObject.put("ssid", this.f3699b.mConfig.mSSID);
            jSONObject.put("os", "Android");
            jSONObject.put("so_list", AppDataCenter.m102165a(this.f3699b.mConfig.mSoList));
            jSONObject.put("thread_list", AppDataCenter.m102165a(this.f3699b.mConfig.mThreadList));
            jSONObject.put("single_upload", 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final String m102036b() {
        return this.f3699b.mConfig.mAid;
    }

    /* renamed from: c */
    public final JSONObject m102035c() {
        return m102034d();
    }

    /* renamed from: a */
    public final boolean m102042a(Object obj) {
        return this.f3699b == obj;
    }

    /* renamed from: a */
    public static Object m102047a() {
        return f3697a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m102046a(Context context, final MonitorCrash monitorCrash) {
        f3697a = monitorCrash;
        MonitorCrashHandler monitorCrashHandler = new MonitorCrashHandler(monitorCrash);
        final NativeFileParser m102029a = NpthBus.m102029a();
        Npth.init(context, new ICommonParams() { // from class: com.apm.insight.d.1
            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() {
                JSONObject m102034d = MonitorCrashHandler.this.m102034d();
                HashMap hashMap = new HashMap();
                if (m102034d != null) {
                    Iterator<String> keys = m102034d.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, m102034d.opt(next));
                    }
                }
                return hashMap;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                if (TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId)) {
                    return m102029a.m101534d();
                }
                return monitorCrash.mConfig.mDeviceId;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m102044a(MonitorCrash monitorCrash) {
        MonitorCrashHandler monitorCrashHandler = new MonitorCrashHandler(monitorCrash);
        if (monitorCrash.mConfig != null) {
            f3698c.put(monitorCrash.mConfig.mAid, monitorCrashHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static MonitorCrashHandler m102041a(String str) {
        return f3698c.get(str);
    }

    @Nullable
    /* renamed from: a */
    public final JSONArray m102039a(StackTraceElement[] stackTraceElementArr, Throwable th) {
        return m102038a(stackTraceElementArr, th, null);
    }

    @Nullable
    /* renamed from: a */
    public final JSONArray m102038a(StackTraceElement[] stackTraceElementArr, Throwable th, String str) {
        String[] strArr = this.f3699b.mConfig.mPackageName;
        if (strArr == null) {
            return new JSONArray().put(new Stack.C3827a(0, stackTraceElementArr.length).m101615a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        JSONArray m101623a = Stack.m101623a(stackTraceElementArr, strArr);
        if (str != null && this.f3699b.mConfig.mThreadList != null && AppDataCenter.m102171a(m101623a)) {
            for (String str2 : this.f3699b.mConfig.mThreadList) {
                if (TextUtils.equals(str2, str)) {
                    m101623a.put(new Stack.C3827a(0, stackTraceElementArr.length).m101615a());
                }
            }
        }
        return m101623a;
    }

    /* renamed from: a */
    public final JSONArray m102037a(String[] strArr) {
        if (this.f3699b.config().mPackageName == null) {
            return new JSONArray().put(new Stack.C3827a(0, strArr.length).m101615a());
        }
        return Stack.m101622a(strArr, this.f3699b.mConfig.mPackageName);
    }

    /* renamed from: a */
    public final boolean m102040a(String str, String str2) {
        if (this.f3699b.config().mPackageName == null) {
            return true;
        }
        return CustomBody.m101932a(str, AppDataCenter.m102165a(this.f3699b.mConfig.mSoList), str2, AppDataCenter.m102165a(this.f3699b.mConfig.mThreadList));
    }

    /* renamed from: a */
    public final JSONObject m102045a(CrashType crashType, JSONArray jSONArray) {
        Map<? extends String, ? extends String> userData;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", m102034d());
            if (crashType != null) {
                AttachUserData attachUserData = this.f3699b.mCustomData;
                jSONObject.put("custom", (attachUserData == null || (userData = attachUserData.getUserData(crashType)) == null) ? null : new JSONObject(userData));
                jSONObject.put("filters", new JSONObject(this.f3699b.mTagMap));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
