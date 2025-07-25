package com.taurusx.tax.p593d;

import android.text.TextUtils;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p593d.C28305b;
import com.taurusx.tax.p593d.C28307c;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.d.a */
/* loaded from: classes7.dex */
public class C28304a implements C28307c.InterfaceC28310c {

    /* renamed from: a */
    public final /* synthetic */ C28307c.InterfaceC28310c.EnumC28311a f73529a;

    /* renamed from: b */
    public final /* synthetic */ String f73530b;

    /* renamed from: c */
    public final /* synthetic */ String f73531c;

    /* renamed from: d */
    public final /* synthetic */ Map f73532d;

    /* renamed from: e */
    public final /* synthetic */ C28305b.InterfaceC28306a f73533e;

    public C28304a(C28307c.InterfaceC28310c.EnumC28311a enumC28311a, String str, String str2, Map map, C28305b.InterfaceC28306a interfaceC28306a) {
        this.f73529a = enumC28311a;
        this.f73530b = str;
        this.f73531c = str2;
        this.f73532d = map;
        this.f73533e = interfaceC28306a;
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: a */
    public String mo38248a() {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m23824a = stringFogImpl.m23824a(new byte[]{60, -10, 61, -27, 61, -28, 48, -70, 58, -14, 36, -14, 41, -28, 45}, new byte[]{72, -105});
        LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{93, 73, 94, 89, 74, 95, 91, 12, 90, 94, 67, 12, 21, 12}, new byte[]{47, 44}) + this.f73530b);
        return this.f73530b;
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: b */
    public int mo38246b() {
        return 60000;
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: c */
    public C28307c.InterfaceC28310c.EnumC28311a mo38245c() {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m23824a = stringFogImpl.m23824a(new byte[]{-75, 114, -76, 97, -76, 96, -71, 62, -77, 118, -83, 118, -96, 96, -92}, new byte[]{-63, 19});
        LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{-74, 55, -75, 39, -95, 33, -80, 114, -87, 55, -80, 58, -85, 54, -28, 104, -28}, new byte[]{-60, 82}) + this.f73529a);
        return this.f73529a;
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: d */
    public int mo38244d() {
        return 60000;
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: e */
    public String mo38243e() {
        return this.f73531c;
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: f */
    public Map<String, String> mo38242f() {
        return this.f73532d;
    }

    @Override // com.taurusx.tax.p593d.C28307c.InterfaceC28310c
    /* renamed from: a */
    public void mo38247a(int i, byte[] bArr, Map<String, List<String>> map, String str) {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m23824a = stringFogImpl.m23824a(new byte[]{118, 103, 74, 99, 30, 86, 70, 112, 91, 99, 74, 122, 81, 125}, new byte[]{62, 19});
        if (TextUtils.isEmpty(str)) {
            str = m23824a;
        }
        String str2 = (bArr == null || bArr.length <= 0 || this.f73529a != C28307c.InterfaceC28310c.EnumC28311a.POST) ? "" : new String(bArr, Charset.forName(stringFogImpl.m23824a(new byte[]{-124, -40, -105, -127, -55}, new byte[]{-15, -84})));
        C28305b.InterfaceC28306a interfaceC28306a = this.f73533e;
        if (interfaceC28306a != null) {
            interfaceC28306a.onResult(i, str, str2);
        }
    }
}
