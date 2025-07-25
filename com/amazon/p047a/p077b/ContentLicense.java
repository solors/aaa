package com.amazon.p047a.p077b;

import com.amazon.p047a.p048a.p071o.StringUtils;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.amazon.p047a.p048a.p071o.p073b.p074a.SignedTokenParseException;
import java.util.Date;

/* renamed from: com.amazon.a.b.b */
/* loaded from: classes2.dex */
public class ContentLicense {

    /* renamed from: a */
    private final String f2798a;

    /* renamed from: b */
    private final String f2799b;

    /* renamed from: c */
    private final String f2800c;

    /* renamed from: d */
    private final Date f2801d;

    /* renamed from: e */
    private final String f2802e;

    public ContentLicense(SignedToken signedToken) throws SignedTokenParseException {
        this.f2798a = m102791a("checksum", signedToken);
        this.f2799b = m102791a("customerId", signedToken);
        this.f2800c = m102791a("deviceId", signedToken);
        this.f2802e = m102791a("packageName", signedToken);
        this.f2801d = m102789b("expiration", signedToken);
    }

    /* renamed from: a */
    private String m102791a(String str, SignedToken signedToken) throws SignedTokenParseException {
        String m102834a = signedToken.m102834a(str);
        if (StringUtils.m102808a(m102834a)) {
            throw SignedTokenParseException.m102857a(str);
        }
        return m102834a;
    }

    /* renamed from: b */
    private Date m102789b(String str, SignedToken signedToken) throws SignedTokenParseException {
        String m102791a = m102791a(str, signedToken);
        try {
            return new Date(Long.parseLong(m102791a));
        } catch (NumberFormatException unused) {
            throw SignedTokenParseException.m102856a(str, m102791a);
        }
    }

    /* renamed from: c */
    public String m102788c() {
        return this.f2800c;
    }

    /* renamed from: d */
    public Date m102787d() {
        return this.f2801d;
    }

    /* renamed from: e */
    public String m102786e() {
        return this.f2802e;
    }

    /* renamed from: a */
    public String m102792a() {
        return this.f2798a;
    }

    /* renamed from: b */
    public String m102790b() {
        return this.f2799b;
    }
}
