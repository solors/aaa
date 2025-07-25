package p026b3;

import p026b3.HSResponse;
import p038c3.HSRootApiException;
import p038c3.NetworkException;
import p752k3.C37383m;

/* renamed from: b3.a */
/* loaded from: classes5.dex */
public class AuthenticationFailureNetwork implements HSNetwork {

    /* renamed from: a */
    private final HSNetwork f1554a;

    public AuthenticationFailureNetwork(HSNetwork hSNetwork) {
        this.f1554a = hSNetwork;
    }

    @Override // p026b3.HSNetwork
    /* renamed from: a */
    public HSResponse mo103964a(HSRequestData hSRequestData) {
        HSResponse mo103964a = this.f1554a.mo103964a(hSRequestData);
        if (mo103964a.m103957b() == HSResponse.InterfaceC3348a.f1580d.intValue() && !C37383m.m18236d(mo103964a.m103958a())) {
            if (!"missing user auth token".equalsIgnoreCase(mo103964a.m103958a())) {
                if ("invalid user auth token".equalsIgnoreCase(mo103964a.m103958a())) {
                    NetworkException networkException = NetworkException.INVALID_AUTH_TOKEN;
                    networkException.f1848b = HSResponse.InterfaceC3348a.f1582f.intValue();
                    throw HSRootApiException.m103683a(null, networkException);
                }
            } else {
                NetworkException networkException2 = NetworkException.AUTH_TOKEN_NOT_PROVIDED;
                networkException2.f1848b = HSResponse.InterfaceC3348a.f1581e.intValue();
                throw HSRootApiException.m103683a(null, networkException2);
            }
        }
        return mo103964a;
    }
}
