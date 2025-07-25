package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: io.appmetrica.analytics.impl.uf */
/* loaded from: classes9.dex */
public final class C34937uf {

    /* renamed from: a */
    public final C33846Df f95466a;

    /* renamed from: b */
    public final C35010xa f95467b;

    /* renamed from: c */
    public final C34114Of f95468c;

    /* renamed from: d */
    public final InterfaceC38501j f95469d;

    /* renamed from: e */
    public final InterfaceC38501j f95470e;

    /* renamed from: f */
    public final InterfaceC38501j f95471f;

    /* renamed from: g */
    public final ArrayList f95472g;

    public C34937uf(C33846Df c33846Df, C34090Nf c34090Nf, C35010xa c35010xa, C34114Of c34114Of) {
        InterfaceC38501j m14554a;
        InterfaceC38501j m14554a2;
        InterfaceC38501j m14554a3;
        this.f95466a = c33846Df;
        this.f95467b = c35010xa;
        this.f95468c = c34114Of;
        m14554a = LazyJVM.m14554a(new C34859rf(this));
        this.f95469d = m14554a;
        m14554a2 = LazyJVM.m14554a(new C34806pf(this));
        this.f95470e = m14554a2;
        m14554a3 = LazyJVM.m14554a(new C34911tf(this));
        this.f95471f = m14554a3;
        this.f95472g = new ArrayList();
    }

    /* renamed from: a */
    public static final InterfaceC34725mf m20912a(C34937uf c34937uf) {
        return (InterfaceC34725mf) c34937uf.f95469d.getValue();
    }

    /* renamed from: a */
    public static final void m20911a(C34937uf c34937uf, C33896Ff c33896Ff, InterfaceC34725mf interfaceC34725mf) {
        boolean m17075f;
        c34937uf.f95472g.add(c33896Ff);
        C34114Of c34114Of = c34937uf.f95468c;
        if (c33896Ff == null) {
            c34114Of.getClass();
        } else {
            SafePackageManager safePackageManager = c34114Of.f93304b;
            Context context = c34114Of.f93303a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c33896Ff.f92842d.ordinal();
            if (ordinal == 1) {
                m17075f = Intrinsics.m17075f(c34114Of.f93308f, installerPackageName);
            } else if (ordinal == 2) {
                m17075f = Intrinsics.m17075f(c34114Of.f93309g, installerPackageName);
            }
            if (m17075f) {
                c34937uf.m20913a(c33896Ff);
                return;
            }
        }
        interfaceC34725mf.mo21079a();
    }

    /* renamed from: a */
    public final void m20913a(C33896Ff c33896Ff) {
        C33846Df c33846Df = this.f95466a;
        synchronized (c33846Df) {
            c33846Df.f92714b = c33896Ff;
            c33846Df.f92715c = true;
            c33846Df.f92716d.m20856a(c33896Ff);
            c33846Df.f92716d.m20850d();
            c33846Df.m22709a(c33846Df.f92714b);
        }
    }
}
