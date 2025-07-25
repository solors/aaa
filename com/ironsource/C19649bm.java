package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* renamed from: com.ironsource.bm */
/* loaded from: classes6.dex */
public class C19649bm implements InterfaceC21263yd {

    /* renamed from: a */
    private String f49313a = C19649bm.class.getSimpleName();

    /* renamed from: b */
    private int f49314b = 23;

    /* renamed from: c */
    private final InterfaceC21306zd f49315c;

    /* renamed from: d */
    private ConnectivityManager.NetworkCallback f49316d;

    /* renamed from: com.ironsource.bm$a */
    /* loaded from: classes6.dex */
    class C19650a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        final /* synthetic */ Context f49317a;

        C19650a(Context context) {
            this.f49317a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network == null) {
                InterfaceC21306zd interfaceC21306zd = C19649bm.this.f49315c;
                String m55379b = C20793s8.m55379b(this.f49317a);
                Context context = this.f49317a;
                interfaceC21306zd.mo53849a(m55379b, C20793s8.m55381a(context, C20793s8.m55382a(context)));
                return;
            }
            C19649bm.this.f49315c.mo53849a(C20793s8.m55380a(network, this.f49317a), C20793s8.m55381a(this.f49317a, network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C19649bm.this.f49315c.mo53848b(C20793s8.m55380a(network, this.f49317a), C20793s8.m55381a(this.f49317a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C19649bm.this.f49315c.mo53848b(C20793s8.m55380a(network, this.f49317a), C20793s8.m55381a(this.f49317a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (C20793s8.m55379b(this.f49317a).equals("none")) {
                C19649bm.this.f49315c.mo53850a();
            }
        }
    }

    public C19649bm(InterfaceC21306zd interfaceC21306zd) {
        this.f49315c = interfaceC21306zd;
    }

    @Override // com.ironsource.InterfaceC21263yd
    @SuppressLint({"NewApi", "MissingPermission"})
    /* renamed from: b */
    public void mo53986b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f49314b) {
            mo53987a(context);
            if (C20793s8.m55379b(context).equals("none")) {
                this.f49315c.mo53850a();
            }
            if (this.f49316d == null) {
                this.f49316d = new C19650a(context);
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.f49316d);
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                Log.e(this.f49313a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC21263yd
    /* renamed from: c */
    public JSONObject mo53985c(Context context) {
        return C20793s8.m55381a(context, C20793s8.m55382a(context));
    }

    @Override // com.ironsource.InterfaceC21263yd
    /* renamed from: a */
    public void mo53988a() {
        this.f49316d = null;
    }

    @Override // com.ironsource.InterfaceC21263yd
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo53987a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f49314b || this.f49316d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f49316d);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            Log.e(this.f49313a, "NetworkCallback for was not registered or already unregistered");
        }
    }
}
