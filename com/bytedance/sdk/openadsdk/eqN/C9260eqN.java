package com.bytedance.sdk.openadsdk.eqN;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.eqN */
/* loaded from: classes3.dex */
public class C9260eqN {
    /* renamed from: IL */
    public static String m83275IL() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }

    /* renamed from: bg */
    public static String m83274bg() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)").toString();
    }
}
