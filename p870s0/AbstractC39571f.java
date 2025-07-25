package p870s0;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceAPI;
import p1017w0.InterfaceC44570a;

/* renamed from: s0.f */
/* loaded from: classes3.dex */
public abstract class AbstractC39571f implements InterfaceServiceConnectionC39566a {

    /* renamed from: b */
    public final InterfaceServiceConnectionC39566a f103993b;

    /* renamed from: c */
    public InterfaceC44570a f103994c;

    public AbstractC39571f(InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a, InterfaceC44570a interfaceC44570a) {
        this.f103993b = interfaceServiceConnectionC39566a;
        this.f103994c = interfaceC44570a;
        interfaceServiceConnectionC39566a.mo12234c(this);
        interfaceServiceConnectionC39566a.mo12235b(this);
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: a */
    public boolean mo12228a() {
        return this.f103993b.mo12228a();
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: b */
    public void mo12225b() {
        this.f103993b.mo12225b();
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: c */
    public boolean mo12223c() {
        return this.f103993b.mo12223c();
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: d */
    public String mo12232d() {
        return null;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    public void destroy() {
        this.f103994c = null;
        this.f103993b.destroy();
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: e */
    public final String mo12233e() {
        return this.f103993b.mo12233e();
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: f */
    public boolean mo12221f() {
        return this.f103993b.mo12221f();
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: g */
    public Context mo12220g() {
        return this.f103993b.mo12220g();
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: h */
    public boolean mo12219h() {
        return this.f103993b.mo12219h();
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: i */
    public String mo12231i() {
        return null;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: j */
    public boolean mo12230j() {
        return false;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: k */
    public IIgniteServiceAPI mo12218k() {
        return this.f103993b.mo12218k();
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: l */
    public void mo12217l() {
        this.f103993b.mo12217l();
    }

    @Override // p1017w0.InterfaceC44571b
    public void onCredentialsRequestFailed(String str) {
        this.f103993b.onCredentialsRequestFailed(str);
    }

    @Override // p1017w0.InterfaceC44571b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f103993b.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f103993b.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f103993b.onServiceDisconnected(componentName);
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: a */
    public void mo12226a(String str) {
        InterfaceC44570a interfaceC44570a = this.f103994c;
        if (interfaceC44570a != null) {
            interfaceC44570a.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: b */
    public void mo12224b(String str) {
        InterfaceC44570a interfaceC44570a = this.f103994c;
        if (interfaceC44570a != null) {
            interfaceC44570a.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: c */
    public void mo12222c(String str) {
        InterfaceC44570a interfaceC44570a = this.f103994c;
        if (interfaceC44570a != null) {
            interfaceC44570a.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: a */
    public void mo12227a(ComponentName componentName, IBinder iBinder) {
        InterfaceC44570a interfaceC44570a = this.f103994c;
        if (interfaceC44570a != null) {
            interfaceC44570a.onIgniteServiceConnected(componentName, iBinder);
        }
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: b */
    public final void mo12235b(InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a) {
        this.f103993b.mo12235b(interfaceServiceConnectionC39566a);
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: c */
    public final void mo12234c(InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a) {
        this.f103993b.mo12234c(interfaceServiceConnectionC39566a);
    }
}
