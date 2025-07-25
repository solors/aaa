package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1jSDK;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ParsingException extends IOException {
    @NonNull
    private final AFe1jSDK<String> AFInAppEventParameterName;

    public ParsingException(String str, Throwable th, @NonNull AFe1jSDK<String> aFe1jSDK) {
        super(str, th);
        this.AFInAppEventParameterName = aFe1jSDK;
    }

    @NonNull
    public AFe1jSDK<String> getRawResponse() {
        return this.AFInAppEventParameterName;
    }
}
