package com.taurusx.tax.p593d;

import com.taurusx.tax.C28162a;
import com.taurusx.tax.p593d.C28307c;
import java.util.Map;

/* renamed from: com.taurusx.tax.d.b */
/* loaded from: classes7.dex */
public class C28305b {

    /* renamed from: com.taurusx.tax.d.b$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC28306a {
        void onResult(int i, String str, String str2);
    }

    static {
        C28162a.f73047a.m23824a(new byte[]{-24, 5, -56, 29, -39, 33, -56, 2, -40, 22, -34, 7, -27, 22, -63, 3, -56, 1}, new byte[]{-83, 115});
    }

    /* renamed from: a */
    public static void m38259a(String str, int i, Map<String, String> map, InterfaceC28306a interfaceC28306a) {
        C28307c.InterfaceC28310c.EnumC28311a enumC28311a = C28307c.InterfaceC28310c.EnumC28311a.GET;
        C28307c c28307c = new C28307c();
        c28307c.f73535a = new C28304a(enumC28311a, str, null, null, interfaceC28306a);
        c28307c.m38249c(i);
    }

    /* renamed from: a */
    public static void m38258a(String str, int i, Map<String, String> map, String str2, InterfaceC28306a interfaceC28306a) {
        C28307c.InterfaceC28310c.EnumC28311a enumC28311a = C28307c.InterfaceC28310c.EnumC28311a.POST;
        C28307c c28307c = new C28307c();
        c28307c.f73535a = new C28304a(enumC28311a, str, str2, null, interfaceC28306a);
        c28307c.m38249c(i);
    }
}
