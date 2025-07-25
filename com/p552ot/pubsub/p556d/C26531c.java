package com.p552ot.pubsub.p556d;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.ot.pubsub.d.c */
/* loaded from: classes7.dex */
public class C26531c {

    /* renamed from: a */
    private long f69431a;

    /* renamed from: b */
    private String f69432b;

    /* renamed from: c */
    private String f69433c;

    /* renamed from: d */
    private String f69434d;

    /* renamed from: e */
    private Map<String, String> f69435e;

    /* renamed from: f */
    private long f69436f;

    /* renamed from: g */
    private int f69437g;

    public C26531c(long j, String str, String str2, String str3, Map<String, String> map, int i, long j2) {
        this.f69431a = j;
        this.f69432b = str;
        this.f69433c = str2;
        this.f69434d = str3;
        this.f69435e = map;
        this.f69437g = i;
        this.f69436f = j2;
    }

    /* renamed from: a */
    public boolean m41308a() {
        return (TextUtils.isEmpty(this.f69432b) || TextUtils.isEmpty(this.f69433c) || TextUtils.isEmpty(this.f69434d)) ? false : true;
    }

    /* renamed from: b */
    public long m41303b() {
        return this.f69431a;
    }

    /* renamed from: c */
    public String m41300c() {
        return this.f69432b;
    }

    /* renamed from: d */
    public String m41298d() {
        return this.f69433c;
    }

    /* renamed from: e */
    public String m41297e() {
        return this.f69434d;
    }

    /* renamed from: f */
    public Map<String, String> m41296f() {
        return this.f69435e;
    }

    /* renamed from: g */
    public long m41295g() {
        return this.f69436f;
    }

    /* renamed from: h */
    public int m41294h() {
        return this.f69437g;
    }

    public String toString() {
        return "PSMessage{mId=" + this.f69431a + ", mProjectID='" + this.f69432b + "', mTopic='" + this.f69433c + "', mData='" + this.f69434d + "', mAttributes=" + this.f69435e + ", mGzipAndEncrypt=" + this.f69437g + ", mTimestamp=" + this.f69436f + '}';
    }

    /* renamed from: a */
    public void m41306a(long j) {
        this.f69431a = j;
    }

    /* renamed from: b */
    public void m41301b(String str) {
        this.f69433c = str;
    }

    /* renamed from: c */
    public void m41299c(String str) {
        this.f69434d = str;
    }

    /* renamed from: a */
    public void m41305a(String str) {
        this.f69432b = str;
    }

    /* renamed from: b */
    public void m41302b(long j) {
        this.f69436f = this.f69436f;
    }

    /* renamed from: a */
    public void m41304a(Map<String, String> map) {
        this.f69435e = map;
    }

    /* renamed from: a */
    public void m41307a(int i) {
        this.f69437g = i;
    }
}
