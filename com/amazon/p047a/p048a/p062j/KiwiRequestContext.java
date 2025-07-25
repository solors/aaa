package com.amazon.p047a.p048a.p062j;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amazon.a.a.j.b */
/* loaded from: classes2.dex */
public class KiwiRequestContext {

    /* renamed from: a */
    public static final String f2486a = "RESPONSE";

    /* renamed from: b */
    public static final String f2487b = "RESET_OFFSET";

    /* renamed from: d */
    public static final String f2488d = "RECEIPT_STRING";

    /* renamed from: e */
    public static final String f2489e = "KIWI_EXECUTION_RESULT_CODE";

    /* renamed from: f */
    public static final String f2490f = "RECEIPT_DELIVERED";

    /* renamed from: g */
    public static final String f2491g = "PURCHASE_REQUEST_ID";

    /* renamed from: h */
    public static final String f2492h = "userId";

    /* renamed from: i */
    static final /* synthetic */ boolean f2493i = true;

    /* renamed from: c */
    public final Map<String, Object> f2494c = new HashMap();

    /* renamed from: a */
    public Object m103043a(String str) {
        return this.f2494c.get(str);
    }

    /* renamed from: b */
    public boolean m103040b(String str) {
        return this.f2494c.containsKey(str);
    }

    /* renamed from: c */
    public Object m103038c(String str) {
        return this.f2494c.remove(str);
    }

    /* renamed from: a */
    public void m103042a(String str, Object obj) {
        this.f2494c.put(str, obj);
    }

    /* renamed from: b */
    public Object m103041b() {
        return this.f2494c.get(f2486a);
    }

    /* renamed from: c */
    public void m103039c() {
        this.f2494c.remove(f2486a);
    }

    /* renamed from: a */
    public boolean m103045a(Class cls) {
        return m103040b(f2486a) && m103043a(f2486a).getClass().equals(cls);
    }

    /* renamed from: a */
    public void m103046a() {
        this.f2494c.clear();
    }

    /* renamed from: a */
    public void m103044a(Object obj) {
        if (!f2493i && obj == null) {
            throw new AssertionError();
        }
        this.f2494c.put(f2486a, obj);
    }
}
