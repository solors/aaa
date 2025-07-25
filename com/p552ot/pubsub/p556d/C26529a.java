package com.p552ot.pubsub.p556d;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.ot.pubsub.d.a */
/* loaded from: classes7.dex */
public class C26529a {

    /* renamed from: a */
    private long f69423a;

    /* renamed from: b */
    private String f69424b;

    /* renamed from: c */
    private String f69425c;

    /* renamed from: d */
    private Map<String, String> f69426d;

    public C26529a(long j, String str, String str2, Map<String, String> map) {
        this.f69423a = j;
        this.f69424b = str;
        this.f69425c = str2;
        this.f69426d = map;
    }

    /* renamed from: a */
    public boolean m41317a() {
        return (TextUtils.isEmpty(this.f69424b) || TextUtils.isEmpty(this.f69425c)) ? false : true;
    }

    /* renamed from: b */
    public long m41313b() {
        return this.f69423a;
    }

    /* renamed from: c */
    public String m41311c() {
        return this.f69424b;
    }

    /* renamed from: d */
    public String m41310d() {
        return this.f69425c;
    }

    /* renamed from: e */
    public Map<String, String> m41309e() {
        return this.f69426d;
    }

    public String toString() {
        return "Message{mId=" + this.f69423a + ", mTopic='" + this.f69424b + "', mData='" + this.f69425c + "', mAttributes=" + this.f69426d + '}';
    }

    /* renamed from: a */
    public void m41316a(long j) {
        this.f69423a = j;
    }

    /* renamed from: b */
    public void m41312b(String str) {
        this.f69425c = str;
    }

    /* renamed from: a */
    public void m41315a(String str) {
        this.f69424b = str;
    }

    /* renamed from: a */
    public void m41314a(Map<String, String> map) {
        this.f69426d = map;
    }
}
