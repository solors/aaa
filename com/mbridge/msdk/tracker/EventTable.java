package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* renamed from: com.mbridge.msdk.tracker.i */
/* loaded from: classes6.dex */
public final class EventTable implements Serializable {

    /* renamed from: a */
    static String f59675a = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_count INTEGER)";

    /* renamed from: b */
    static String f59676b = "DROP TABLE IF EXISTS %s";

    /* renamed from: c */
    private final C22885e f59677c;

    /* renamed from: d */
    private int f59678d;

    /* renamed from: e */
    private int f59679e;

    /* renamed from: f */
    private final String f59680f;

    /* renamed from: g */
    private long f59681g;

    /* renamed from: h */
    private boolean f59682h = false;

    /* renamed from: i */
    private boolean f59683i = false;

    public EventTable(C22885e c22885e) {
        this.f59677c = c22885e;
        this.f59680f = c22885e.m49593e();
    }

    /* renamed from: a */
    public final void m49576a(boolean z) {
        this.f59682h = z;
    }

    /* renamed from: b */
    public final void m49573b(boolean z) {
        this.f59683i = z;
    }

    /* renamed from: c */
    public final C22885e m49572c() {
        return this.f59677c;
    }

    /* renamed from: d */
    public final int m49571d() {
        return this.f59678d;
    }

    /* renamed from: e */
    public final int m49570e() {
        return this.f59679e;
    }

    /* renamed from: f */
    public final String m49569f() {
        return this.f59680f;
    }

    /* renamed from: g */
    public final long m49568g() {
        return this.f59681g;
    }

    /* renamed from: a */
    public final boolean m49579a() {
        return this.f59682h;
    }

    /* renamed from: b */
    public final boolean m49575b() {
        return this.f59683i;
    }

    /* renamed from: a */
    public final void m49578a(int i) {
        this.f59678d = i;
    }

    /* renamed from: b */
    public final void m49574b(int i) {
        this.f59679e = i;
    }

    /* renamed from: a */
    public final void m49577a(long j) {
        this.f59681g = j;
    }
}
