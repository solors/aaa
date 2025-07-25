package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.network.client.HttpPostBody;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: HttpRequestDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpJsonPostBody implements HttpPostBody {
    @Nullable
    private final InterfaceC38501j content$delegate;
    @NotNull
    private final String contentType;
    @NotNull
    private final String json;

    public HttpJsonPostBody(@NotNull String json) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
        this.contentType = "application/json";
        m14554a = LazyJVM.m14554a(new HttpJsonPostBody$content$2(this));
        this.content$delegate = m14554a;
    }

    public static /* synthetic */ HttpJsonPostBody copy$default(HttpJsonPostBody httpJsonPostBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = httpJsonPostBody.json;
        }
        return httpJsonPostBody.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.json;
    }

    @NotNull
    public final HttpJsonPostBody copy(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new HttpJsonPostBody(json);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof HttpJsonPostBody) || !Intrinsics.m17075f(this.json, ((HttpJsonPostBody) obj).json)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @Nullable
    public byte[] getContent() {
        return (byte[]) this.content$delegate.getValue();
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @NotNull
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @NotNull
    public Map<String, String> getHeaders() {
        return HttpPostBody.DefaultImpls.getHeaders(this);
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    public int hashCode() {
        String str = this.json;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "HttpJsonPostBody(json=" + this.json + ")";
    }
}
