package com.amazon.p047a.p077b;

import com.amazon.p047a.p048a.p066n.p067a.p068a.MalformedResponseException;
import java.util.Map;

/* renamed from: com.amazon.a.b.g */
/* loaded from: classes2.dex */
public class LicenseResult {

    /* renamed from: a */
    private static final String f2824a = "license";

    /* renamed from: b */
    private static final String f2825b = "customerId";

    /* renamed from: c */
    private static final String f2826c = "deviceId";

    /* renamed from: d */
    private final String f2827d;

    /* renamed from: e */
    private final String f2828e;

    /* renamed from: f */
    private final String f2829f;

    public LicenseResult(Map<String, String> map) throws MalformedResponseException {
        if (map != null) {
            this.f2827d = m102775a(f2824a, map);
            this.f2828e = m102775a(f2825b, map);
            this.f2829f = m102775a(f2826c, map);
            return;
        }
        throw MalformedResponseException.m102982d();
    }

    /* renamed from: a */
    private String m102775a(String str, Map<String, String> map) throws MalformedResponseException {
        String str2 = map.get(str);
        if (m102776a(str2)) {
            throw MalformedResponseException.m102983a(str);
        }
        return str2;
    }

    /* renamed from: b */
    public String m102774b() {
        return this.f2829f;
    }

    /* renamed from: c */
    public String m102773c() {
        return this.f2827d;
    }

    /* renamed from: a */
    private boolean m102776a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    public String m102777a() {
        return this.f2828e;
    }
}
