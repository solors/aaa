package p769l3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.helpshift.log.HSLogger;

@RequiresApi(api = 24)
/* renamed from: l3.f */
/* loaded from: classes5.dex */
class HSOnAndAboveNConnectivityManager extends ConnectivityManager.NetworkCallback implements HSAndroidConnectivityManager {

    /* renamed from: a */
    private Context f99946a;

    /* renamed from: b */
    private HSNetworkConnectivityCallback f99947b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HSOnAndAboveNConnectivityManager(Context context) {
        this.f99946a = context;
    }

    /* renamed from: d */
    private ConnectivityManager m15713d() {
        try {
            return (ConnectivityManager) this.f99946a.getSystemService("connectivity");
        } catch (Exception e) {
            HSLogger.m65438e("AboveNConnectvtManager", "Exception while getting connectivity manager", e);
            return null;
        }
    }

    @Override // p769l3.HSAndroidConnectivityManager
    @RequiresApi(api = 24)
    /* renamed from: a */
    public void mo15716a(HSNetworkConnectivityCallback hSNetworkConnectivityCallback) {
        this.f99947b = hSNetworkConnectivityCallback;
        ConnectivityManager m15713d = m15713d();
        if (m15713d != null) {
            try {
                m15713d.registerDefaultNetworkCallback(this);
            } catch (Exception e) {
                HSLogger.m65438e("AboveNConnectvtManager", "Exception while registering network callback", e);
            }
        }
        if (mo15715b() == HSConnectivityStatus.NOT_CONNECTED) {
            hSNetworkConnectivityCallback.mo12172n();
        }
    }

    @Override // p769l3.HSAndroidConnectivityManager
    @NonNull
    @RequiresApi(api = 24)
    /* renamed from: b */
    public HSConnectivityStatus mo15715b() {
        HSConnectivityStatus hSConnectivityStatus = HSConnectivityStatus.UNKNOWN;
        ConnectivityManager m15713d = m15713d();
        if (m15713d != null) {
            if (m15713d.getActiveNetwork() != null) {
                return HSConnectivityStatus.CONNECTED;
            }
            return HSConnectivityStatus.NOT_CONNECTED;
        }
        return hSConnectivityStatus;
    }

    @Override // p769l3.HSAndroidConnectivityManager
    @RequiresApi(api = 24)
    /* renamed from: c */
    public void mo15714c() {
        ConnectivityManager m15713d = m15713d();
        if (m15713d != null) {
            try {
                m15713d.unregisterNetworkCallback(this);
            } catch (Exception e) {
                HSLogger.m65438e("AboveNConnectvtManager", "Exception while unregistering network callback", e);
            }
        }
        this.f99947b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(@NonNull Network network) {
        HSNetworkConnectivityCallback hSNetworkConnectivityCallback = this.f99947b;
        if (hSNetworkConnectivityCallback != null) {
            hSNetworkConnectivityCallback.mo12171t();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NonNull Network network) {
        HSNetworkConnectivityCallback hSNetworkConnectivityCallback = this.f99947b;
        if (hSNetworkConnectivityCallback != null) {
            hSNetworkConnectivityCallback.mo12172n();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        HSNetworkConnectivityCallback hSNetworkConnectivityCallback = this.f99947b;
        if (hSNetworkConnectivityCallback != null) {
            hSNetworkConnectivityCallback.mo12172n();
        }
    }
}
