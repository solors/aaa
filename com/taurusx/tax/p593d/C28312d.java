package com.taurusx.tax.p593d;

import android.text.TextUtils;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p578b.p580d.C28218b;
import com.taurusx.tax.p583c.p590f.C28292a;
import com.taurusx.tax.p593d.C28307c;
import com.taurusx.tax.p593d.C28313e;
import com.taurusx.tax.p595f.p596a.C28389a;
import com.taurusx.tax.p606j.C28537t;
import com.taurusx.tax.p606j.p607a0.C28468b;
import com.taurusx.tax.p606j.p607a0.C28469c;
import com.taurusx.tax.p606j.p616z.C28564d;
import java.util.Map;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.d.d */
/* loaded from: classes7.dex */
public class C28312d implements C28307c.InterfaceC28310c {

    /* renamed from: a */
    public final /* synthetic */ C28317f f73539a;

    /* renamed from: b */
    public final /* synthetic */ C28313e.InterfaceC28316c f73540b;

    public C28312d(C28317f c28317f, C28313e.InterfaceC28316c interfaceC28316c) {
        this.f73539a = c28317f;
        this.f73540b = interfaceC28316c;
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: a */
    public String mo38248a() {
        String str = this.f73539a.f73541a;
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m23824a = stringFogImpl.m23824a(new byte[]{-113, 30, -114, 13, -114, 12, -125, 82, -119, 26, -105, 26, -102, 12, -98}, new byte[]{-5, Byte.MAX_VALUE});
        LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{38, -84, 37, -68, 49, -70, 32, -23, 33, -69, 56, -23, 110, -23}, new byte[]{84, -55}) + str);
        return str;
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: b */
    public int mo38246b() {
        return C28218b.m38409h();
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: c */
    public C28307c.InterfaceC28310c.EnumC28311a mo38245c() {
        C28307c.InterfaceC28310c.EnumC28311a enumC28311a = this.f73539a.f73543c;
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m23824a = stringFogImpl.m23824a(new byte[]{118, 27, 119, 8, 119, 9, 122, 87, 112, 31, 110, 31, 99, 9, 103}, new byte[]{2, 122});
        LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{-109, -64, -112, -48, -124, -42, -107, -123, -116, -64, -107, -51, -114, -63, -63, -97, -63}, new byte[]{-31, -91}) + enumC28311a);
        return enumC28311a;
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: d */
    public int mo38244d() {
        return C28218b.m38409h();
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: e */
    public String mo38243e() {
        String m23824a;
        String m23824a2;
        C28389a.C28390a c28390a = this.f73539a.f73542b;
        try {
            c28390a.f73757l = C28564d.m37922a(TaurusXAds.getContext());
            c28390a.f73717B = C28537t.m37984b(TaurusXAds.getContext());
            c28390a.f73718C = C28207b.m38435h(TaurusXAds.getContext());
            if (C28564d.m37920c(TaurusXAds.getContext())) {
                m23824a = C28162a.f73047a.m23824a(new byte[]{40}, new byte[]{25, 118});
            } else {
                m23824a = C28162a.f73047a.m23824a(new byte[]{-59}, new byte[]{-11, 105});
            }
            c28390a.f73720E = m23824a;
            C28469c m38074a = C28468b.m38074a(TaurusXAds.getContext());
            if (m38074a != null && !TextUtils.isEmpty(m38074a.f73903a)) {
                c28390a.f73758m = m38074a.f73903a;
                if (m38074a.f73904b) {
                    m23824a2 = C28162a.f73047a.m23824a(new byte[]{-58}, new byte[]{-9, 44});
                } else {
                    m23824a2 = C28162a.f73047a.m23824a(new byte[]{65}, new byte[]{113, -10});
                }
                c28390a.f73721F = m23824a2;
            }
            if (mo38248a().equals(C28207b.m38463a(TaurusXAds.getContext()))) {
                c28390a.f73747c0 = C28292a.m38298c(TaurusXAds.getContext());
            }
        } catch (Exception unused) {
        }
        c28390a.getClass();
        try {
            return new C28389a(c28390a).m38205a().toString();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: f */
    public Map<String, String> mo38242f() {
        return this.f73539a.f73545e;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo38247a(int r19, byte[] r20, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p593d.C28312d.mo38247a(int, byte[], java.util.Map, java.lang.String):void");
    }
}
