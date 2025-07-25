package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.network.client.HttpPostBody;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EidDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class EidUpdateRequest {
    @NotNull
    private final EidDataModel eidData;
    @NotNull
    private final HttpPostBody requestBody;
    @NotNull
    private final String requestUserPayload;

    public EidUpdateRequest(@NotNull EidDataModel eidData, @NotNull HttpPostBody requestBody, @NotNull String requestUserPayload) {
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(requestUserPayload, "requestUserPayload");
        this.eidData = eidData;
        this.requestBody = requestBody;
        this.requestUserPayload = requestUserPayload;
    }

    public static /* synthetic */ EidUpdateRequest copy$default(EidUpdateRequest eidUpdateRequest, EidDataModel eidDataModel, HttpPostBody httpPostBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            eidDataModel = eidUpdateRequest.eidData;
        }
        if ((i & 2) != 0) {
            httpPostBody = eidUpdateRequest.requestBody;
        }
        if ((i & 4) != 0) {
            str = eidUpdateRequest.requestUserPayload;
        }
        return eidUpdateRequest.copy(eidDataModel, httpPostBody, str);
    }

    @NotNull
    public final EidDataModel component1() {
        return this.eidData;
    }

    @NotNull
    public final HttpPostBody component2() {
        return this.requestBody;
    }

    @NotNull
    public final String component3() {
        return this.requestUserPayload;
    }

    @NotNull
    public final EidUpdateRequest copy(@NotNull EidDataModel eidData, @NotNull HttpPostBody requestBody, @NotNull String requestUserPayload) {
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(requestUserPayload, "requestUserPayload");
        return new EidUpdateRequest(eidData, requestBody, requestUserPayload);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof EidUpdateRequest) {
                EidUpdateRequest eidUpdateRequest = (EidUpdateRequest) obj;
                if (!Intrinsics.m17075f(this.eidData, eidUpdateRequest.eidData) || !Intrinsics.m17075f(this.requestBody, eidUpdateRequest.requestBody) || !Intrinsics.m17075f(this.requestUserPayload, eidUpdateRequest.requestUserPayload)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final EidDataModel getEidData() {
        return this.eidData;
    }

    @NotNull
    public final HttpPostBody getRequestBody() {
        return this.requestBody;
    }

    @NotNull
    public final String getRequestUserPayload() {
        return this.requestUserPayload;
    }

    public int hashCode() {
        int i;
        int i2;
        EidDataModel eidDataModel = this.eidData;
        int i3 = 0;
        if (eidDataModel != null) {
            i = eidDataModel.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        HttpPostBody httpPostBody = this.requestBody;
        if (httpPostBody != null) {
            i2 = httpPostBody.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str = this.requestUserPayload;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i5 + i3;
    }

    @NotNull
    public String toString() {
        return "EidUpdateRequest(eidData=" + this.eidData + ", requestBody=" + this.requestBody + ", requestUserPayload=" + this.requestUserPayload + ")";
    }
}
