package com.apm.insight.entity;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.AppDataCenter;
import com.apm.insight.CrashType;
import com.apm.insight.MonitorCrashHandler;
import com.apm.insight.p130l.C3822f;
import com.apm.insight.p130l.Stack;
import com.apm.insight.runtime.ApmConfig;
import com.ironsource.C21018tj;
import com.p552ot.pubsub.p559g.C26542f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.b */
/* loaded from: classes2.dex */
public final class CustomBody {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<MonitorCrashHandler> f3743a = new ConcurrentLinkedQueue<>();

    /* compiled from: CustomBody.java */
    /* renamed from: com.apm.insight.entity.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC3789a {
        /* renamed from: a */
        void mo101826a(JSONObject jSONObject);
    }

    static {
        new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static void m101938a(@NonNull MonitorCrashHandler monitorCrashHandler) {
        f3743a.add(monitorCrashHandler);
    }

    @NonNull
    /* renamed from: b */
    public static JSONArray m101929b() {
        MonitorCrashHandler next;
        JSONArray jSONArray = new JSONArray();
        Iterator<MonitorCrashHandler> it = f3743a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.m102045a((CrashType) null, (JSONArray) null));
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static int m101927c() {
        return f3743a.size();
    }

    /* renamed from: d */
    public static List<String> m101926d() {
        MonitorCrashHandler next;
        ArrayList arrayList = new ArrayList();
        Iterator<MonitorCrashHandler> it = f3743a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            arrayList.add(next.m102036b());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static File m101937a(File file) {
        return new File(file, "all_data.json");
    }

    @Nullable
    /* renamed from: a */
    public static JSONArray m101931a(Throwable th, Thread thread, @Nullable File file) {
        MonitorCrashHandler next;
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] m101620b = Stack.m101620b(th);
        Iterator<MonitorCrashHandler> it = f3743a.iterator();
        while (true) {
            if (!it.hasNext() || (next = it.next()) == null) {
                break;
            } else if (!ApmConfig.m101518a(next.m102036b())) {
                AppDataCenter.m102179a((Object) ("not enable javaCrash aid: " + next.m102036b()));
            } else {
                JSONArray m102038a = next.m102038a(m101620b, th, thread != null ? thread.getName() : null);
                if (!AppDataCenter.m102171a(m102038a)) {
                    jSONArray.put(next.m102045a(CrashType.JAVA, m102038a));
                }
            }
        }
        if (AppDataCenter.m102171a(jSONArray)) {
            return null;
        }
        try {
            C3822f.m101719a(new File(file, "all_data.json"), jSONArray);
        } catch (IOException unused) {
        }
        return jSONArray;
    }

    @Nullable
    /* renamed from: b */
    public static String m101928b(Object obj) {
        Iterator<MonitorCrashHandler> it = f3743a.iterator();
        while (it.hasNext()) {
            MonitorCrashHandler next = it.next();
            if (next != null && next.m102042a(obj)) {
                return next.m102036b();
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public static JSONArray m101934a(String str) {
        MonitorCrashHandler next;
        JSONArray jSONArray = new JSONArray();
        String[] split = str.split("\n");
        Iterator<MonitorCrashHandler> it = f3743a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (ApmConfig.m101511b(next.m102036b())) {
                JSONArray m102037a = next.m102037a(split);
                if (!AppDataCenter.m102171a(m102037a)) {
                    jSONArray.put(next.m102045a(CrashType.ANR, m102037a));
                }
            }
        }
        return jSONArray;
    }

    @NonNull
    /* renamed from: a */
    public static JSONArray m101939a() {
        MonitorCrashHandler next;
        JSONArray jSONArray = new JSONArray();
        Iterator<MonitorCrashHandler> it = f3743a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.m102035c());
        }
        return jSONArray;
    }

    @NonNull
    /* renamed from: a */
    public static JSONArray m101936a(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<MonitorCrashHandler> it = f3743a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MonitorCrashHandler next = it.next();
            if (next != null && next.m102042a(obj)) {
                jSONArray.put(next.m102045a(CrashType.JAVA, (JSONArray) null));
                break;
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m101935a(Object obj, Throwable th, StackTraceElement[] stackTraceElementArr) {
        Iterator<MonitorCrashHandler> it = f3743a.iterator();
        while (it.hasNext()) {
            MonitorCrashHandler next = it.next();
            if (next != null && next.m102042a(obj)) {
                JSONArray m102039a = next.m102039a(stackTraceElementArr, th);
                JSONArray jSONArray = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C21018tj.f53565b, next.m102036b());
                    jSONObject.put("lines", m102039a);
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
                return jSONArray;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public static JSONArray m101933a(String str, String str2, JSONArray jSONArray) {
        JSONObject optJSONObject;
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject2 = jSONArray.optJSONObject(i);
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("header")) != null && ApmConfig.m101509c(String.valueOf(optJSONObject.opt(C21018tj.f53565b)))) {
                if (TextUtils.isEmpty(optJSONObject.optString(C26542f.C26543a.f69507e))) {
                    jSONArray2.put(optJSONObject2);
                } else if (m101932a(str, optJSONObject.optJSONArray("so_list"), str2, optJSONObject.optJSONArray("so_list"))) {
                    jSONArray2.put(optJSONObject2);
                }
            }
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static boolean m101932a(String str, JSONArray jSONArray, String str2, JSONArray jSONArray2) {
        if (!AppDataCenter.m102171a(jSONArray)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (str.contains(jSONArray.optString(i))) {
                    return true;
                }
            }
        }
        if (!AppDataCenter.m102171a(jSONArray2)) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String optString = jSONArray2.optString(i2);
                if (optString != null && optString.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m101930a(JSONObject jSONObject, JSONArray jSONArray, InterfaceC3789a interfaceC3789a) {
        JSONObject optJSONObject;
        AppDataCenter.m102179a((Object) "uploadFromFile with allData ".concat(String.valueOf(jSONArray)));
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length() && (optJSONObject = jSONArray.optJSONObject(i)) != null; i++) {
            if (AppDataCenter.m102169a(optJSONObject, 0, "header", "single_upload") == 1) {
                JSONObject jSONObject2 = new JSONObject();
                CrashBody.m101945b(jSONObject2, jSONObject);
                CrashBody.m101945b(jSONObject2, optJSONObject);
                interfaceC3789a.mo101826a(jSONObject2);
            } else {
                jSONArray2.put(optJSONObject);
            }
        }
        if (jSONArray2.length() == 0) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        CrashBody.m101945b(jSONObject3, jSONObject);
        try {
            jSONObject3.put("all_data", jSONArray2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        interfaceC3789a.mo101826a(jSONObject3);
    }
}
