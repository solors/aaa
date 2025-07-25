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
public final class HttpParamsPostBody implements HttpPostBody {
    @Nullable
    private final InterfaceC38501j content$delegate;
    @NotNull
    private final String contentType;
    @NotNull
    private final Map<String, String> params;

    public HttpParamsPostBody(@NotNull Map<String, String> params) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        this.contentType = "application/x-www-form-urlencoded";
        m14554a = LazyJVM.m14554a(new HttpParamsPostBody$content$2(this));
        this.content$delegate = m14554a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpParamsPostBody copy$default(HttpParamsPostBody httpParamsPostBody, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = httpParamsPostBody.params;
        }
        return httpParamsPostBody.copy(map);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.params;
    }

    @NotNull
    public final HttpParamsPostBody copy(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new HttpParamsPostBody(params);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof HttpParamsPostBody) || !Intrinsics.m17075f(this.params, ((HttpParamsPostBody) obj).params)) {
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
    public final Map<String, String> getParams() {
        return this.params;
    }

    public int hashCode() {
        Map<String, String> map = this.params;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "HttpParamsPostBody(params=" + this.params + ")";
    }
}
