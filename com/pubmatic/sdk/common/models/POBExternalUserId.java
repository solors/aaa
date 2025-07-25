package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBExternalUserId {
    @NonNull

    /* renamed from: a */
    private final String f70157a;
    @NonNull

    /* renamed from: b */
    private final String f70158b;

    /* renamed from: c */
    private int f70159c = 0;
    @Nullable

    /* renamed from: d */
    private JSONObject f70160d;

    public POBExternalUserId(@NonNull String str, @NonNull String str2) {
        this.f70157a = str;
        this.f70158b = str2;
    }

    public int getAtype() {
        return this.f70159c;
    }

    @Nullable
    public JSONObject getExtension() {
        return this.f70160d;
    }

    @NonNull
    public String getId() {
        return this.f70158b;
    }

    @NonNull
    public String getSource() {
        return this.f70157a;
    }

    public void setAtype(int i) {
        this.f70159c = i;
    }

    public void setExtension(@Nullable JSONObject jSONObject) {
        this.f70160d = jSONObject;
    }
}
