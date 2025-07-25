package p870s0;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceAPI;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;
import p002a1.C0003a;
import p036c1.AbstractC3413a;
import p1004v0.C44489a;
import p1017w0.InterfaceC44570a;
import p1049y0.C44996b;
import p1049y0.InterfaceC44995a;
import p1064z0.C45106b;
import p661f1.C33076a;
import p838q0.C39321a;
import p838q0.C39323c;
import p838q0.C39324d;
import p854r0.BinderC39432b;
import p989u0.C44417b;
import p989u0.EnumC44418c;
import p989u0.EnumC44419d;

/* renamed from: s0.h */
/* loaded from: classes3.dex */
public final class C39573h extends AbstractC39571f {

    /* renamed from: d */
    public C39324d f103995d;

    /* renamed from: f */
    public C39321a f103996f;

    /* renamed from: g */
    public final C33076a f103997g;

    /* renamed from: h */
    public final C45106b f103998h;

    /* renamed from: i */
    public C39323c f103999i;

    /* renamed from: j */
    public C44489a f104000j;

    /* renamed from: k */
    public final boolean f104001k;

    /* renamed from: l */
    public final boolean f104002l;

    /* renamed from: m */
    public final AtomicBoolean f104003m;

    public C39573h(InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a, boolean z, boolean z2, InterfaceC44570a interfaceC44570a, C39321a c39321a) {
        super(interfaceServiceConnectionC39566a, interfaceC44570a);
        this.f104001k = false;
        this.f104002l = false;
        this.f104003m = new AtomicBoolean(false);
        this.f103996f = c39321a;
        this.f104001k = z;
        this.f103998h = new C45106b();
        this.f103997g = new C33076a(interfaceServiceConnectionC39566a.mo12220g());
        this.f104002l = z2;
        if (z2) {
            this.f103995d = new C39324d(interfaceServiceConnectionC39566a.mo12220g(), this, this);
        }
    }

    @Override // p870s0.AbstractC39571f, p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: a */
    public final void mo12227a(ComponentName componentName, IBinder iBinder) {
        InterfaceC44570a interfaceC44570a;
        boolean mo12230j = this.f103993b.mo12230j();
        if (!mo12230j && (interfaceC44570a = this.f103994c) != null) {
            interfaceC44570a.onOdtUnsupported();
        }
        if (this.f103995d != null && this.f103993b.mo12230j() && this.f104002l) {
            this.f103995d.m13003a();
        }
        if (mo12230j || this.f104001k) {
            super.mo12227a(componentName, iBinder);
        }
    }

    @Override // p870s0.AbstractC39571f, p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: b */
    public final void mo12225b() {
        if (this.f103999i == null) {
            Object[] objArr = {"OneDTAuthenticator"};
            InterfaceC44995a interfaceC44995a = C44996b.f118394b.f118395a;
            if (interfaceC44995a != null) {
                interfaceC44995a.mo1103i("%s : initializing new Ignite authentication session", objArr);
            }
            C33076a c33076a = this.f103997g;
            c33076a.getClass();
            try {
                c33076a.f90288b.m25797c();
            } catch (IOException e) {
                e = e;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidKeyException e3) {
                e = e3;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_INIT_ENCRYPTION));
            } catch (KeyStoreException e4) {
                e = e4;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchProviderException e6) {
                e = e6;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_INIT_ENCRYPTION));
            } catch (UnrecoverableEntryException e7) {
                e = e7;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_INIT_ENCRYPTION));
            } catch (CertificateException e8) {
                e = e8;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchPaddingException e9) {
                e = e9;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_INIT_ENCRYPTION));
            } catch (Exception e10) {
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e10, EnumC44418c.FAILED_INIT_ENCRYPTION));
            }
            String m24959a = this.f103997g.m24959a();
            this.f103998h.getClass();
            C39323c m900a = C45106b.m900a(m24959a);
            this.f103999i = m900a;
            if (m900a.f103399b > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                C44996b.m1101a("%s : One DT resolved from cache", "OneDTAuthenticator");
                C39323c c39323c = this.f103999i;
                C39321a c39321a = this.f103996f;
                if (c39321a != null) {
                    C44996b.m1101a("%s : setting one dt entity", "IgniteManager");
                    c39321a.f103396b = c39323c;
                }
            } else {
                this.f104003m.set(true);
            }
        }
        if (this.f104002l && this.f103995d == null) {
            C44996b.m1100b("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            mo12226a("Unable to authenticate: authenticator destroyed");
        } else if (!this.f104001k && !this.f104003m.get()) {
            if (this.f104002l) {
                this.f103995d.m13003a();
            }
        } else {
            Object[] objArr2 = {"OneDTAuthenticator"};
            InterfaceC44995a interfaceC44995a2 = C44996b.f118394b.f118395a;
            if (interfaceC44995a2 != null) {
                interfaceC44995a2.mo1103i("%s : will try to authenticate with Ignite if didn't done yet", objArr2);
            }
            this.f103993b.mo12225b();
        }
    }

    @Override // p870s0.AbstractC39571f, p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: c */
    public final void mo12222c(String str) {
        super.mo12222c(str);
        if (this.f103993b.mo12219h() && this.f104003m.get() && this.f103993b.mo12230j()) {
            this.f104003m.set(false);
            m12229m();
        }
    }

    @Override // p870s0.AbstractC39571f, p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: d */
    public final String mo12232d() {
        InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a = this.f103993b;
        if (interfaceServiceConnectionC39566a instanceof AbstractC39571f) {
            return interfaceServiceConnectionC39566a.mo12232d();
        }
        return null;
    }

    @Override // p870s0.AbstractC39571f, p870s0.InterfaceServiceConnectionC39566a
    public final void destroy() {
        this.f103996f = null;
        C39324d c39324d = this.f103995d;
        if (c39324d != null) {
            C0003a c0003a = c39324d.f103400a;
            if (c0003a != null && c0003a.f41b) {
                c39324d.f103401b.unregisterReceiver(c0003a);
                c39324d.f103400a.f41b = false;
            }
            C0003a c0003a2 = c39324d.f103400a;
            if (c0003a2 != null) {
                c0003a2.f40a = null;
                c39324d.f103400a = null;
            }
            c39324d.f103402c = null;
            c39324d.f103401b = null;
            c39324d.f103403d = null;
            this.f103995d = null;
        }
        C44489a c44489a = this.f104000j;
        if (c44489a != null) {
            BinderC39432b binderC39432b = c44489a.f116776b;
            if (binderC39432b != null) {
                binderC39432b.f103660c.clear();
                c44489a.f116776b = null;
            }
            c44489a.f116777c = null;
            c44489a.f116775a = null;
            this.f104000j = null;
        }
        this.f103994c = null;
        this.f103993b.destroy();
    }

    @Override // p870s0.AbstractC39571f, p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: i */
    public final String mo12231i() {
        InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a = this.f103993b;
        if (interfaceServiceConnectionC39566a instanceof AbstractC39571f) {
            return interfaceServiceConnectionC39566a.mo12231i();
        }
        return null;
    }

    @Override // p870s0.AbstractC39571f, p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: j */
    public final boolean mo12230j() {
        return this.f103993b.mo12230j();
    }

    @Override // p870s0.AbstractC39571f, p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: l */
    public final void mo12217l() {
        mo12225b();
    }

    /* renamed from: m */
    public final void m12229m() {
        IIgniteServiceAPI mo12218k = this.f103993b.mo12218k();
        if (mo12218k == null) {
            C44996b.m1100b("%s : service is unavailable", "OneDTAuthenticator");
            C44417b.m3082b(EnumC44419d.ONE_DT_REQUEST_ERROR, "error_code", EnumC44418c.IGNITE_SERVICE_UNAVAILABLE.m3081b());
            return;
        }
        if (this.f104000j == null) {
            this.f104000j = new C44489a(mo12218k, this);
        }
        if (TextUtils.isEmpty(this.f103993b.mo12233e())) {
            C44417b.m3082b(EnumC44419d.ONE_DT_REQUEST_ERROR, "error_code", EnumC44418c.IGNITE_SERVICE_INVALID_SESSION.m3081b());
            C44996b.m1100b("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        C44489a c44489a = this.f104000j;
        String mo12233e = this.f103993b.mo12233e();
        c44489a.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("clientToken", mo12233e);
            c44489a.f116777c.getProperty("onedtid", bundle, new Bundle(), c44489a.f116776b);
        } catch (RemoteException e) {
            C44417b.m3083a(EnumC44419d.ONE_DT_REQUEST_ERROR, e);
            C44996b.m1100b("%s : request failed : %s", "OneDTPropertyHandler", e.toString());
        }
    }
}
