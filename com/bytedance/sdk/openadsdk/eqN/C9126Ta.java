package com.bytedance.sdk.openadsdk.eqN;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.Ta */
/* loaded from: classes3.dex */
public class C9126Ta {
    /* renamed from: IL */
    public static String m83501IL() {
        return "ALTER TABLE logstatsbatch ADD COLUMN encrypt INTEGER default 0";
    }

    /* renamed from: bg */
    public static String m83500bg() {
        return "CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
