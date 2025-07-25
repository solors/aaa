package com.bytedance.sdk.openadsdk.core.act;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;

/* loaded from: classes3.dex */
public class ActServiceConnection extends CustomTabsServiceConnection {
    private InterfaceC8872IL mConnectionCallback;

    public ActServiceConnection(InterfaceC8872IL interfaceC8872IL) {
        this.mConnectionCallback = interfaceC8872IL;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient) {
        InterfaceC8872IL interfaceC8872IL = this.mConnectionCallback;
        if (interfaceC8872IL != null) {
            interfaceC8872IL.mo84511bg(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        InterfaceC8872IL interfaceC8872IL = this.mConnectionCallback;
        if (interfaceC8872IL != null) {
            interfaceC8872IL.mo84512bg();
        }
    }
}
