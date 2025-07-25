package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes3.dex */
public class PAGRequest {

    /* renamed from: IL */
    private Map<String, Object> f17689IL;

    /* renamed from: bX */
    private Bundle f17690bX = null;

    /* renamed from: bg */
    private String f17691bg;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.f17690bX == null) {
            this.f17690bX = new Bundle();
        }
        this.f17690bX.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.f17691bg;
    }

    public Map<String, Object> getExtraInfo() {
        return this.f17689IL;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.f17690bX;
    }

    public void setAdString(String str) {
        this.f17691bg = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.f17689IL = map;
    }
}
