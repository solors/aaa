package com.yandex.mobile.ads.impl;

import androidx.annotation.CallSuper;
import com.yandex.mobile.ads.impl.InterfaceC31983zg;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.yandex.mobile.ads.impl.jj */
/* loaded from: classes8.dex */
public abstract class AbstractC30628jj implements InterfaceC31983zg {

    /* renamed from: b */
    protected InterfaceC31983zg.C31984a f80926b;

    /* renamed from: c */
    protected InterfaceC31983zg.C31984a f80927c;

    /* renamed from: d */
    private InterfaceC31983zg.C31984a f80928d;

    /* renamed from: e */
    private InterfaceC31983zg.C31984a f80929e;

    /* renamed from: f */
    private ByteBuffer f80930f;

    /* renamed from: g */
    private ByteBuffer f80931g;

    /* renamed from: h */
    private boolean f80932h;

    public AbstractC30628jj() {
        ByteBuffer byteBuffer = InterfaceC31983zg.f88850a;
        this.f80930f = byteBuffer;
        this.f80931g = byteBuffer;
        InterfaceC31983zg.C31984a c31984a = InterfaceC31983zg.C31984a.f88851e;
        this.f80928d = c31984a;
        this.f80929e = c31984a;
        this.f80926b = c31984a;
        this.f80927c = c31984a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: a */
    public final InterfaceC31983zg.C31984a mo26238a(InterfaceC31983zg.C31984a c31984a) throws InterfaceC31983zg.C31985b {
        this.f80928d = c31984a;
        this.f80929e = mo29000b(c31984a);
        return isActive() ? this.f80929e : InterfaceC31983zg.C31984a.f88851e;
    }

    /* renamed from: b */
    protected abstract InterfaceC31983zg.C31984a mo29000b(InterfaceC31983zg.C31984a c31984a) throws InterfaceC31983zg.C31985b;

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: b */
    public final void mo26236b() {
        flush();
        this.f80930f = InterfaceC31983zg.f88850a;
        InterfaceC31983zg.C31984a c31984a = InterfaceC31983zg.C31984a.f88851e;
        this.f80928d = c31984a;
        this.f80929e = c31984a;
        this.f80926b = c31984a;
        this.f80927c = c31984a;
        mo28997h();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    @CallSuper
    /* renamed from: c */
    public ByteBuffer mo26235c() {
        ByteBuffer byteBuffer = this.f80931g;
        this.f80931g = InterfaceC31983zg.f88850a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: d */
    public final void mo26234d() {
        this.f80932h = true;
        mo28998g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean m32906e() {
        return this.f80931g.hasRemaining();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    public final void flush() {
        this.f80931g = InterfaceC31983zg.f88850a;
        this.f80932h = false;
        this.f80926b = this.f80928d;
        this.f80927c = this.f80929e;
        mo28999f();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    public boolean isActive() {
        if (this.f80929e != InterfaceC31983zg.C31984a.f88851e) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    @CallSuper
    /* renamed from: a */
    public boolean mo26239a() {
        return this.f80932h && this.f80931g == InterfaceC31983zg.f88850a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final ByteBuffer m32907a(int i) {
        if (this.f80930f.capacity() < i) {
            this.f80930f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f80930f.clear();
        }
        ByteBuffer byteBuffer = this.f80930f;
        this.f80931g = byteBuffer;
        return byteBuffer;
    }

    /* renamed from: f */
    protected void mo28999f() {
    }

    /* renamed from: g */
    protected void mo28998g() {
    }

    /* renamed from: h */
    protected void mo28997h() {
    }
}
