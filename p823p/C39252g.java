package p823p;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p823p.InterfaceC39249e;

/* compiled from: NetworkObserver.kt */
@Metadata
@SuppressLint({"MissingPermission"})
/* renamed from: p.g */
/* loaded from: classes2.dex */
final class C39252g implements InterfaceC39249e {
    @NotNull

    /* renamed from: a */
    private final ConnectivityManager f103093a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC39249e.InterfaceC39250a f103094b;
    @NotNull

    /* renamed from: c */
    private final C39253a f103095c;

    /* compiled from: NetworkObserver.kt */
    @Metadata
    /* renamed from: p.g$a */
    /* loaded from: classes2.dex */
    public static final class C39253a extends ConnectivityManager.NetworkCallback {
        C39253a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull Network network) {
            C39252g.this.m13337d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            C39252g.this.m13337d(network, false);
        }
    }

    public C39252g(@NotNull ConnectivityManager connectivityManager, @NotNull InterfaceC39249e.InterfaceC39250a interfaceC39250a) {
        this.f103093a = connectivityManager;
        this.f103094b = interfaceC39250a;
        C39253a c39253a = new C39253a();
        this.f103095c = c39253a;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c39253a);
    }

    /* renamed from: c */
    private final boolean m13338c(Network network) {
        NetworkCapabilities networkCapabilities = this.f103093a.getNetworkCapabilities(network);
        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m13337d(Network network, boolean z) {
        boolean m13338c;
        Network[] allNetworks = this.f103093a.getAllNetworks();
        int length = allNetworks.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (Intrinsics.m17075f(network2, network)) {
                m13338c = z;
            } else {
                m13338c = m13338c(network2);
            }
            if (m13338c) {
                z2 = true;
                break;
            }
            i++;
        }
        this.f103094b.mo2793a(z2);
    }

    @Override // p823p.InterfaceC39249e
    /* renamed from: a */
    public boolean mo13340a() {
        for (Network network : this.f103093a.getAllNetworks()) {
            if (m13338c(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // p823p.InterfaceC39249e
    public void shutdown() {
        this.f103093a.unregisterNetworkCallback(this.f103095c);
    }
}
