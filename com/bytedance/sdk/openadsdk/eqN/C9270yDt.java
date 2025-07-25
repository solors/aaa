package com.bytedance.sdk.openadsdk.eqN;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.yDt */
/* loaded from: classes3.dex */
public class C9270yDt {
    /* renamed from: IL */
    public static String m83236IL() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }

    /* renamed from: bg */
    public static String m83235bg() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }
}
