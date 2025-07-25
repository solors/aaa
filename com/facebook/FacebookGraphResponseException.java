package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FacebookGraphResponseException.kt */
@Metadata
/* loaded from: classes3.dex */
public final class FacebookGraphResponseException extends FacebookException {
    @Nullable
    private final GraphResponse graphResponse;

    public FacebookGraphResponseException(@Nullable GraphResponse graphResponse, @Nullable String str) {
        super(str);
        this.graphResponse = graphResponse;
    }

    @Nullable
    public final GraphResponse getGraphResponse() {
        return this.graphResponse;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    @NotNull
    public String toString() {
        FacebookRequestError error;
        GraphResponse graphResponse = this.graphResponse;
        if (graphResponse == null) {
            error = null;
        } else {
            error = graphResponse.getError();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (error != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(error.getRequestStatusCode());
            sb2.append(", facebookErrorCode: ");
            sb2.append(error.getErrorCode());
            sb2.append(", facebookErrorType: ");
            sb2.append(error.getErrorType());
            sb2.append(", message: ");
            sb2.append(error.getErrorMessage());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "errorStringBuilder.toString()");
        return sb3;
    }
}
