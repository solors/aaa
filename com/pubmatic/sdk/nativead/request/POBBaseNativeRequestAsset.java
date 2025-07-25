package com.pubmatic.sdk.nativead.request;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class POBBaseNativeRequestAsset {

    /* renamed from: a */
    private final int f70473a;

    /* renamed from: b */
    private final boolean f70474b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public POBBaseNativeRequestAsset(int i, boolean z) {
        this.f70473a = i;
        this.f70474b = z;
    }

    public int getId() {
        return this.f70473a;
    }

    @NonNull
    public abstract JSONObject getRTBJSON();

    public boolean isRequired() {
        return this.f70474b;
    }
}
