package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.AbstractC35118e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class Request {

    /* renamed from: a */
    private final String f95836a;

    /* renamed from: b */
    private final String f95837b;

    /* renamed from: c */
    private final byte[] f95838c;

    /* renamed from: d */
    private final Map f95839d;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private final String f95840a;

        /* renamed from: b */
        private String f95841b;

        /* renamed from: c */
        private byte[] f95842c = new byte[0];

        /* renamed from: d */
        private final HashMap f95843d = new HashMap();

        public Builder(@NonNull String str) {
            this.f95840a = str;
        }

        @NonNull
        public Builder addHeader(@NonNull String str, @Nullable String str2) {
            this.f95843d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f95840a, this.f95841b, this.f95842c, this.f95843d, 0);
        }

        @NonNull
        public Builder post(@NonNull byte[] bArr) {
            this.f95842c = bArr;
            return withMethod("POST");
        }

        @NonNull
        public Builder withMethod(@NonNull String str) {
            this.f95841b = str;
            return this;
        }
    }

    /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap hashMap, int i) {
        this(str, str2, bArr, hashMap);
    }

    @NonNull
    public byte[] getBody() {
        return this.f95838c;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f95839d;
    }

    @NonNull
    public String getMethod() {
        return this.f95837b;
    }

    @NonNull
    public String getUrl() {
        return this.f95836a;
    }

    public String toString() {
        return "Request{url=" + this.f95836a + ", method='" + this.f95837b + "', bodyLength=" + this.f95838c.length + ", headers=" + this.f95839d + '}';
    }

    private Request(String str, String str2, byte[] bArr, HashMap hashMap) {
        this.f95836a = str;
        this.f95837b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f95838c = bArr;
        this.f95839d = AbstractC35118e.m20661a(hashMap);
    }
}
