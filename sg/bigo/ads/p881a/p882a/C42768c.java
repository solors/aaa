package sg.bigo.ads.p881a.p882a;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* renamed from: sg.bigo.ads.a.a.c */
/* loaded from: classes10.dex */
public final class C42768c extends CustomTabsServiceConnection {

    /* renamed from: a */
    private WeakReference<InterfaceC42769d> f111963a;

    public C42768c(InterfaceC42769d interfaceC42769d) {
        this.f111963a = new WeakReference<>(interfaceC42769d);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient) {
        InterfaceC42769d interfaceC42769d = this.f111963a.get();
        if (interfaceC42769d != null) {
            interfaceC42769d.mo6623a(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InterfaceC42769d interfaceC42769d = this.f111963a.get();
        if (interfaceC42769d != null) {
            interfaceC42769d.mo6622b();
        }
    }
}
