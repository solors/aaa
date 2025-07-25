package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class ResponseDataHolder {

    /* renamed from: a */
    private int f95903a;

    /* renamed from: b */
    private byte[] f95904b;

    /* renamed from: c */
    private Map f95905c;

    /* renamed from: d */
    private final ResponseValidityChecker f95906d;

    public ResponseDataHolder(@NonNull ResponseValidityChecker responseValidityChecker) {
        this.f95906d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f95903a;
    }

    @Nullable
    public byte[] getResponseData() {
        return this.f95904b;
    }

    @Nullable
    public Map<String, List<String>> getResponseHeaders() {
        return this.f95905c;
    }

    public boolean isValidResponse() {
        return this.f95906d.isResponseValid(this.f95903a);
    }

    public void setResponseCode(int i) {
        this.f95903a = i;
    }

    public void setResponseData(@Nullable byte[] bArr) {
        this.f95904b = bArr;
    }

    public void setResponseHeaders(@Nullable Map<String, List<String>> map) {
        this.f95905c = map;
    }
}
