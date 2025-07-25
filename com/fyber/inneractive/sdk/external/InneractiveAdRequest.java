package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.InterfaceC14327U;
import com.fyber.inneractive.sdk.flow.AbstractC14493U;

/* loaded from: classes4.dex */
public class InneractiveAdRequest extends AbstractC14493U {

    /* renamed from: c */
    public final String f27349c;

    /* renamed from: d */
    public InterfaceC14327U f27350d;

    public InneractiveAdRequest(String str) {
        this.f27349c = str;
    }

    @Deprecated
    public boolean getMuteVideo() {
        return InneractiveAdManager.getMuteVideo();
    }

    public InterfaceC14327U getSelectedUnitConfig() {
        return this.f27350d;
    }

    public String getSpotId() {
        return this.f27349c;
    }

    @Deprecated
    public InneractiveUserConfig getUserParams() {
        return InneractiveAdManager.getUserParams();
    }

    @Deprecated
    public void setMuteVideo(boolean z) {
        InneractiveAdManager.setMuteVideo(z);
    }

    public void setSelectedUnitConfig(InterfaceC14327U interfaceC14327U) {
        this.f27350d = interfaceC14327U;
    }

    @Deprecated
    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
