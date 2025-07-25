package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class AFe1uSDK<ResponseBody> {
    private final ExecutorService AFInAppEventParameterName;
    private final AFe1iSDK<ResponseBody> AFInAppEventType;
    public final AFe1hSDK AFKeystoreWrapper;
    private final AFe1oSDK valueOf;
    private final AtomicBoolean values = new AtomicBoolean(false);

    public AFe1uSDK(AFe1hSDK aFe1hSDK, ExecutorService executorService, AFe1oSDK aFe1oSDK, AFe1iSDK<ResponseBody> aFe1iSDK) {
        this.AFKeystoreWrapper = aFe1hSDK;
        this.AFInAppEventParameterName = executorService;
        this.valueOf = aFe1oSDK;
        this.AFInAppEventType = aFe1iSDK;
    }

    public final AFe1jSDK<ResponseBody> AFKeystoreWrapper() throws IOException {
        if (!this.values.getAndSet(true)) {
            AFe1jSDK<String> values = this.valueOf.values(this.AFKeystoreWrapper);
            try {
                return new AFe1jSDK<>(this.AFInAppEventType.AFKeystoreWrapper(values.getBody()), values.AFKeystoreWrapper, values.values, values.valueOf, values.AFInAppEventParameterName);
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
                throw new ParsingException(e.getMessage(), e, values);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}
