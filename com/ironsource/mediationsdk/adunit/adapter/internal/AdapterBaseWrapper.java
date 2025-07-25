package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.model.NetworkSettings;

/* loaded from: classes6.dex */
public class AdapterBaseWrapper {
    AdapterBaseInterface adapterBaseInterface;
    NetworkSettings settings;

    public AdapterBaseWrapper(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        this.adapterBaseInterface = adapterBaseInterface;
        this.settings = networkSettings;
    }

    public AdapterBaseInterface getAdapterBaseInterface() {
        return this.adapterBaseInterface;
    }

    public NetworkSettings getSettings() {
        return this.settings;
    }
}
