package com.bytedance.sdk.openadsdk.eqN;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.WR */
/* loaded from: classes3.dex */
public class C9164WR extends C9260eqN {
    /* renamed from: bX */
    public static String m83449bX() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public static String eqN() {
        return "ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0";
    }
}
