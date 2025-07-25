package p838q0;

import android.content.Context;
import p024b1.AbstractC3343c;
import p1017w0.InterfaceC44570a;
import p1017w0.InterfaceC44571b;
import p1049y0.C44996b;
import p1049y0.InterfaceC44995a;
import p870s0.AbstractC39571f;
import p870s0.C39570e;
import p870s0.C39573h;
import p989u0.C44417b;
import p989u0.InterfaceC44416a;

/* renamed from: q0.a */
/* loaded from: classes3.dex */
public class C39321a implements InterfaceC44571b {

    /* renamed from: a */
    public AbstractC39571f f103395a;

    /* renamed from: b */
    public C39323c f103396b;

    public C39321a(InterfaceC44995a interfaceC44995a, InterfaceC44416a interfaceC44416a) {
        C44996b.f118394b.f118395a = interfaceC44995a;
        C44417b.f116565b.f116566a = interfaceC44416a;
    }

    public void authenticate() {
        AbstractC3343c.f1549a.execute(new RunnableC39322b(this));
    }

    public void destroy() {
        this.f103396b = null;
        this.f103395a.destroy();
    }

    public String getOdt() {
        C39323c c39323c = this.f103396b;
        if (c39323c != null) {
            return c39323c.f103398a;
        }
        return "";
    }

    public boolean isAuthenticated() {
        return this.f103395a.mo12219h();
    }

    public boolean isConnected() {
        return this.f103395a.mo12228a();
    }

    @Override // p1017w0.InterfaceC44571b
    public void onCredentialsRequestFailed(String str) {
        this.f103395a.onCredentialsRequestFailed(str);
    }

    @Override // p1017w0.InterfaceC44571b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f103395a.onCredentialsRequestSuccess(str, str2);
    }

    public C39321a(Context context, InterfaceC44995a interfaceC44995a, boolean z, InterfaceC44570a interfaceC44570a) {
        this(interfaceC44995a, null);
        this.f103395a = new C39573h(new C39570e(context), false, z, interfaceC44570a, this);
    }
}
