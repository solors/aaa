package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.AbstractC9754c2;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.vb */
/* loaded from: classes3.dex */
public final class C10298vb extends AbstractC9754c2 {

    /* renamed from: k */
    public final C9880h2 f23393k;

    /* renamed from: l */
    public final InterfaceC10299a f23394l;

    /* renamed from: m */
    public final String f23395m;

    /* renamed from: com.chartboost.sdk.impl.vb$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC10299a {
        /* renamed from: a */
        void mo80236a(String str, String str2);

        /* renamed from: a */
        void mo80235a(String str, String str2, long j, InterfaceC10014l0 interfaceC10014l0);

        /* renamed from: a */
        void mo80234a(String str, String str2, CBError cBError);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10298vb(C9880h2 c9880h2, File outputFile, String uri, InterfaceC10299a interfaceC10299a, EnumC10022l8 priority, String appId) {
        super(AbstractC9754c2.EnumC9757c.f21778b, uri, priority, outputFile);
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f23393k = c9880h2;
        this.f23394l = interfaceC10299a;
        this.f23395m = appId;
        this.f21773i = AbstractC9754c2.EnumC9756b.f21775c;
    }

    @Override // com.chartboost.sdk.impl.AbstractC9754c2
    /* renamed from: a */
    public C9800d2 mo80240a() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Chartboost-App", this.f23395m);
        hashMap.put("X-Chartboost-Client", C10060n2.m81041b());
        C9880h2 c9880h2 = this.f23393k;
        hashMap.put("X-Chartboost-Reachability", String.valueOf(c9880h2 != null ? c9880h2.m81579c() : null));
        return new C9800d2(hashMap, null, null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC9754c2
    /* renamed from: a */
    public void mo80239a(CBError cBError, C9843f2 c9843f2) {
        InterfaceC10299a interfaceC10299a = this.f23394l;
        if (interfaceC10299a != null) {
            String m81934e = m81934e();
            File file = this.f21768d;
            Intrinsics.m17074g(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            interfaceC10299a.mo80234a(m81934e, name, cBError);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC9754c2
    /* renamed from: a */
    public void mo80238a(Object obj, C9843f2 c9843f2) {
        InterfaceC10299a interfaceC10299a = this.f23394l;
        if (interfaceC10299a != null) {
            String m81934e = m81934e();
            File file = this.f21768d;
            Intrinsics.m17074g(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            interfaceC10299a.mo80236a(m81934e, name);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC9754c2
    /* renamed from: a */
    public void mo80237a(String uri, long j) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        InterfaceC10299a interfaceC10299a = this.f23394l;
        if (interfaceC10299a != null) {
            File file = this.f21768d;
            Intrinsics.m17074g(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            interfaceC10299a.mo80235a(uri, name, j, null);
        }
    }
}
