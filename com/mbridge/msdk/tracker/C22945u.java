package com.mbridge.msdk.tracker;

import com.mbridge.msdk.tracker.network.AbstractC22930u;
import com.mbridge.msdk.tracker.network.C22905e;
import com.mbridge.msdk.tracker.network.C22913r;
import com.mbridge.msdk.tracker.network.C22937w;
import com.mbridge.msdk.tracker.network.InterfaceC22941z;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ReportRequest.java */
/* renamed from: com.mbridge.msdk.tracker.u */
/* loaded from: classes6.dex */
public final class C22945u<T> extends AbstractC22930u<T> {

    /* renamed from: a */
    private Map<String, String> f59914a;

    /* renamed from: b */
    private AbstractC22930u.EnumC22932b f59915b;

    /* renamed from: c */
    private C22937w.InterfaceC22939b<T> f59916c;

    /* renamed from: d */
    private AbstractC22946v f59917d;

    /* renamed from: e */
    private C22905e f59918e;

    public C22945u(String str, int i) {
        super(i, str);
    }

    /* renamed from: a */
    public final void m49321a(AbstractC22946v abstractC22946v) {
        this.f59917d = abstractC22946v;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: b */
    public final InterfaceC22941z mo49318b() {
        if (C22949y.m49289a(this.f59918e)) {
            this.f59918e = new C22905e(30000, 5);
        }
        return this.f59918e;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: c */
    public final Map<String, String> mo49317c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Charset", "UTF-8");
        return hashMap;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: d */
    public final boolean mo49316d() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: e */
    public final AbstractC22930u.EnumC22932b mo49315e() {
        return this.f59915b;
    }

    public C22945u(String str, int i, int i2) {
        super(i, str, i2);
    }

    /* renamed from: a */
    public final void m49323a(AbstractC22930u.EnumC22932b enumC22932b) {
        this.f59915b = enumC22932b;
    }

    /* renamed from: a */
    public final void m49319a(Map<String, String> map) {
        this.f59914a = map;
    }

    /* renamed from: a */
    public final void m49322a(C22937w.InterfaceC22939b<T> interfaceC22939b) {
        this.f59916c = interfaceC22939b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    public final C22937w<T> mo49324a(C22913r c22913r) {
        return this.f59917d.mo49314a(c22913r);
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    protected final Map<String, String> mo49325a() {
        return this.f59914a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    public final void mo49320a(T t) {
        C22937w.InterfaceC22939b<T> interfaceC22939b = this.f59916c;
        this.f59916c = interfaceC22939b;
        if (interfaceC22939b != null) {
            interfaceC22939b.mo49371a(t);
        }
    }
}
