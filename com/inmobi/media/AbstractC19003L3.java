package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: com.inmobi.media.L3 */
/* loaded from: classes6.dex */
public abstract class AbstractC19003L3 {

    /* renamed from: a */
    public static final /* synthetic */ int f47423a = 0;

    /* renamed from: a */
    public static final ArrayList m60930a(Context context) {
        File databasePath;
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        String[] databaseList = context.databaseList();
        if (databaseList != null) {
            if (!(databaseList.length == 0)) {
                for (String str : databaseList) {
                    Intrinsics.m17074g(str);
                    if (new Regex("com\\.im_([0-9]+\\.){3}db").m16766e(str)) {
                        int i = C19068Q2.f47629a;
                        if (!Intrinsics.m17075f(str, "com.im_10.7.8.db") && (databasePath = context.getDatabasePath(str)) != null && databasePath.exists() && !context.deleteDatabase(str)) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m60928b(Context context) {
        List<String> m17163p;
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        Intrinsics.checkNotNullParameter("carb_store", "fileKey");
        Intrinsics.checkNotNullParameter("aes_key_store", "fileKey");
        Intrinsics.checkNotNullParameter("mraid_js_store", "fileKey");
        Intrinsics.checkNotNullParameter("omid_js_store", "fileKey");
        Intrinsics.checkNotNullParameter("user_info_store", "fileKey");
        Intrinsics.checkNotNullParameter("coppa_store", "fileKey");
        Intrinsics.checkNotNullParameter("gesture_info_store", "fileKey");
        Intrinsics.checkNotNullParameter("display_info_store", "fileKey");
        Intrinsics.checkNotNullParameter("unified_id_info_store", "fileKey");
        Intrinsics.checkNotNullParameter("app_bundle_store", "fileKey");
        Intrinsics.checkNotNullParameter("pub_signals_store", "fileKey");
        m17163p = C37563v.m17163p("com.im.keyValueStore.carb_store", "com.im.keyValueStore.aes_key_store", "com.im.keyValueStore.mraid_js_store", "com.im.keyValueStore.omid_js_store", "com.im.keyValueStore.user_info_store", "com.im.keyValueStore.coppa_store", "com.im.keyValueStore.gesture_info_store", "com.im.keyValueStore.display_info_store", "com.im.keyValueStore.unified_id_info_store", "com.im.keyValueStore.app_bundle_store", "com.im.keyValueStore.pub_signals_store");
        for (String str : m17163p) {
            context.deleteSharedPreferences(str);
        }
        return !m60930a(context).isEmpty();
    }

    /* renamed from: a */
    public static final void m60929a(File path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            if (path.exists()) {
                File[] listFiles = path.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            Intrinsics.m17074g(file);
                            m60929a(file);
                        } else if (file.delete()) {
                            Intrinsics.checkNotNullExpressionValue("L3", "TAG");
                            file.getName();
                        }
                    }
                }
                if (path.delete()) {
                    Intrinsics.checkNotNullExpressionValue("L3", "TAG");
                    path.getName();
                }
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("L3", "TAG");
        }
    }
}
