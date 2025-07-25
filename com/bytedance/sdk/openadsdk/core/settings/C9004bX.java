package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.component.utils.C7756ldr;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;
import com.bytedance.sdk.openadsdk.multipro.eqN.C9351bg;
import com.bytedance.sdk.openadsdk.utils.aGH;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.settings.bX */
/* loaded from: classes3.dex */
public class C9004bX {

    /* renamed from: bg */
    private static final ConcurrentHashMap<String, C8993IL> f20097bg = new ConcurrentHashMap<>();

    @NonNull
    /* renamed from: IL */
    private static HashMap<String, C8993IL> m83837IL(JSONArray jSONArray) {
        HashMap<String, C8993IL> hashMap = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                C8993IL m83833bg = m83833bg(jSONArray.getJSONObject(i));
                if (m83833bg != null) {
                    hashMap.put(m83833bg.f20063bg, m83833bg);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    @WorkerThread
    /* renamed from: bg */
    public static void m83832bg(boolean z) {
        String m82503bg;
        File m83839IL = m83839IL();
        if (!m83839IL.exists()) {
            if (C9307IL.m83088bX()) {
                m82503bg = C9351bg.m83003IL("tt_sdk_settings", "ad_slot_conf", null);
            } else {
                m82503bg = aGH.m82504bg("tt_sdk_settings", C8838VzQ.m84740bg()).m82503bg("ad_slot_conf", (String) null);
            }
            if (TextUtils.isEmpty(m82503bg)) {
                return;
            }
            try {
                HashMap<String, C8993IL> m83837IL = m83837IL(new JSONArray(m82503bg));
                if (m83837IL.isEmpty()) {
                    return;
                }
                ConcurrentHashMap<String, C8993IL> concurrentHashMap = f20097bg;
                concurrentHashMap.clear();
                concurrentHashMap.putAll(m83837IL);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            HashMap<String, C8993IL> m83837IL2 = m83837IL(new JSONArray(new String(C7756ldr.eqN(m83839IL))));
            if (m83837IL2.isEmpty()) {
                return;
            }
            for (Map.Entry<String, C8993IL> entry : m83837IL2.entrySet()) {
                String key = entry.getKey();
                C8993IL value = entry.getValue();
                if (value.ayS && !z) {
                    C8993IL c8993il = f20097bg.get(key);
                    if (c8993il != null) {
                        c8993il.f20061bN = value.Dxa;
                    }
                } else {
                    f20097bg.put(key, value);
                }
            }
        } catch (Exception unused2) {
        }
    }

    @NonNull
    /* renamed from: IL */
    private static File m83839IL() {
        return new File(C8838VzQ.m84740bg().getFilesDir(), "tt_ads_conf");
    }

    /* renamed from: IL */
    private static C8993IL m83838IL(String str) {
        return new C8993IL(str, 1);
    }

    /* renamed from: bg */
    private static C8993IL m83833bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C8993IL(jSONObject);
    }

    @NonNull
    /* renamed from: bg */
    public static C8993IL m83835bg(String str) {
        C8993IL c8993il = f20097bg.get(str);
        return c8993il == null ? m83838IL(str) : c8993il;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[ORIG_RETURN, RETURN] */
    @androidx.annotation.WorkerThread
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m83834bg(org.json.JSONArray r5) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            java.io.File r0 = m83839IL()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r0.getParent()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getName()
            r3.append(r4)
            java.lang.String r4 = ".tmp"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r2 = 0
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            if (r3 == 0) goto L2f
            r1.delete()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
        L2f:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r3.write(r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r0 = "tt_sdk_settings"
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.C8838VzQ.m84740bg()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            com.bytedance.sdk.openadsdk.utils.aGH r0 = com.bytedance.sdk.openadsdk.utils.aGH.m82504bg(r0, r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r2 = "ad_slot_conf"
            r0.m82505bg(r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            boolean r0 = r1.exists()
            if (r0 == 0) goto L56
            r1.delete()
        L56:
            com.bytedance.sdk.openadsdk.utils.C9554eo.m82414bg(r3)
            goto L76
        L5a:
            r5 = move-exception
            r2 = r3
            goto Lba
        L5d:
            r0 = move-exception
            r2 = r3
            goto L63
        L60:
            r5 = move-exception
            goto Lba
        L62:
            r0 = move-exception
        L63:
            java.lang.String r3 = "SdkSettings.AdSlot"
            java.lang.String r4 = "saveAdSlotToLocal: "
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L60
            boolean r0 = r1.exists()
            if (r0 == 0) goto L73
            r1.delete()
        L73:
            com.bytedance.sdk.openadsdk.utils.C9554eo.m82414bg(r2)
        L76:
            java.util.HashMap r5 = m83837IL(r5)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lb9
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L88:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.bytedance.sdk.openadsdk.core.settings.IL r0 = (com.bytedance.sdk.openadsdk.core.settings.C8993IL) r0
            boolean r2 = r0.ayS
            if (r2 == 0) goto Lb3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.IL> r2 = com.bytedance.sdk.openadsdk.core.settings.C9004bX.f20097bg
            java.lang.Object r1 = r2.get(r1)
            com.bytedance.sdk.openadsdk.core.settings.IL r1 = (com.bytedance.sdk.openadsdk.core.settings.C8993IL) r1
            if (r1 == 0) goto L88
            java.lang.String r0 = r0.Dxa
            r1.f20061bN = r0
            goto L88
        Lb3:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.IL> r2 = com.bytedance.sdk.openadsdk.core.settings.C9004bX.f20097bg
            r2.put(r1, r0)
            goto L88
        Lb9:
            return
        Lba:
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lc3
            r1.delete()
        Lc3:
            com.bytedance.sdk.openadsdk.utils.C9554eo.m82414bg(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.C9004bX.m83834bg(org.json.JSONArray):void");
    }

    /* renamed from: bg */
    public static void m83836bg() {
        File m83839IL = m83839IL();
        if (m83839IL.exists()) {
            m83839IL.delete();
        }
    }
}
