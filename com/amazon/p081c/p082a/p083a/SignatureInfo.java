package com.amazon.p081c.p082a.p083a;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/* renamed from: com.amazon.c.a.a.e */
/* loaded from: classes2.dex */
public class SignatureInfo {

    /* renamed from: a */
    private static final String f2946a = String.format("A valid instance of %s is required to have at least one non-blank ID, either developerId or certificateId, and at least one non-blank name, either developerName or commonName.", SignatureInfo.class.getSimpleName());

    /* renamed from: b */
    private static final String f2947b = String.format("A valid instance of %s is required to have a certificate ID.", SignatureInfo.class.getSimpleName());

    /* renamed from: c */
    private String f2948c;

    /* renamed from: d */
    private String f2949d;

    /* renamed from: e */
    private String f2950e;

    /* renamed from: f */
    private String f2951f;

    /* renamed from: a */
    public static String m102642a() {
        return f2946a;
    }

    /* renamed from: b */
    public static String m102640b() {
        return f2947b;
    }

    /* renamed from: c */
    public boolean m102638c() {
        return (StringUtils.isBlank(m102634e()) || StringUtils.isBlank(m102632f())) ? false : true;
    }

    /* renamed from: d */
    public boolean m102636d() {
        return !StringUtils.isBlank(m102634e());
    }

    /* renamed from: e */
    public String m102634e() {
        if (StringUtils.isBlank(this.f2950e)) {
            return this.f2948c;
        }
        return this.f2950e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        SignatureInfo signatureInfo = (SignatureInfo) obj;
        return new EqualsBuilder().append(this.f2950e, signatureInfo.f2950e).append(this.f2951f, signatureInfo.f2951f).append(this.f2948c, signatureInfo.f2948c).append(this.f2949d, signatureInfo.f2949d).isEquals();
    }

    /* renamed from: f */
    public String m102632f() {
        if (StringUtils.isBlank(this.f2951f)) {
            return this.f2949d;
        }
        return this.f2951f;
    }

    /* renamed from: g */
    public String m102630g() {
        return this.f2948c;
    }

    /* renamed from: h */
    public String m102628h() {
        return this.f2949d;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(this.f2950e).append(this.f2951f).append(this.f2948c).append(this.f2949d).toHashCode();
    }

    /* renamed from: i */
    public String m102626i() {
        return this.f2950e;
    }

    /* renamed from: j */
    public String m102625j() {
        return this.f2951f;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /* renamed from: a */
    public SignatureInfo m102641a(String str) {
        this.f2948c = str;
        return this;
    }

    /* renamed from: b */
    public void m102639b(String str) {
        this.f2948c = str;
    }

    /* renamed from: c */
    public SignatureInfo m102637c(String str) {
        this.f2949d = str;
        return this;
    }

    /* renamed from: d */
    public void m102635d(String str) {
        this.f2949d = str;
    }

    /* renamed from: g */
    public SignatureInfo m102629g(String str) {
        this.f2951f = str;
        return this;
    }

    /* renamed from: h */
    public void m102627h(String str) {
        this.f2951f = str;
    }

    /* renamed from: e */
    public SignatureInfo m102633e(String str) {
        this.f2950e = str;
        return this;
    }

    /* renamed from: f */
    public void m102631f(String str) {
        this.f2950e = str;
    }
}
