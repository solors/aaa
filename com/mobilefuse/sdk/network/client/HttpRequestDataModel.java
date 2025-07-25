package com.mobilefuse.sdk.network.client;

import com.maticoo.sdk.utils.request.network.Headers;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.network.client.HttpBinaryPostBody */
/* loaded from: classes7.dex */
public final class HttpRequestDataModel implements HttpPostBody {
    @NotNull
    private final byte[] content;
    @NotNull
    private final String contentType;
    @NotNull
    private final Map<String, String> headers;

    public HttpRequestDataModel(@NotNull byte[] content, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.content = content;
        this.headers = headers;
        this.contentType = Headers.VALUE_APPLICATION_STREAM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpRequestDataModel copy$default(HttpRequestDataModel httpRequestDataModel, byte[] bArr, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = httpRequestDataModel.getContent();
        }
        if ((i & 2) != 0) {
            map = httpRequestDataModel.getHeaders();
        }
        return httpRequestDataModel.copy(bArr, map);
    }

    @NotNull
    public final byte[] component1() {
        return getContent();
    }

    @NotNull
    public final Map<String, String> component2() {
        return getHeaders();
    }

    @NotNull
    public final HttpRequestDataModel copy(@NotNull byte[] content, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new HttpRequestDataModel(content, headers);
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if ((!Intrinsics.m17075f(HttpRequestDataModel.class, cls)) || !(obj instanceof HttpRequestDataModel)) {
            return false;
        }
        HttpRequestDataModel httpRequestDataModel = (HttpRequestDataModel) obj;
        if (!(!Intrinsics.m17075f(getHeaders(), httpRequestDataModel.getHeaders())) && !(!Intrinsics.m17075f(getContentType(), httpRequestDataModel.getContentType())) && Arrays.equals(getContent(), httpRequestDataModel.getContent())) {
            return true;
        }
        return false;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @NotNull
    public byte[] getContent() {
        return this.content;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @NotNull
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        return (((Arrays.hashCode(getContent()) * 31) + getHeaders().hashCode()) * 31) + getContentType().hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpBinaryPostBody(content=" + Arrays.toString(getContent()) + ", headers=" + getHeaders() + ")";
    }

    public /* synthetic */ HttpRequestDataModel(byte[] bArr, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? C37559r0.m17284j() : map);
    }
}
