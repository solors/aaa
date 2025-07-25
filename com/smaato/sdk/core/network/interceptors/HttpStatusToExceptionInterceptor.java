package com.smaato.sdk.core.network.interceptors;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.network.HttpNoResponseBodyException;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.network.SomaException;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes7.dex */
public class HttpStatusToExceptionInterceptor implements Interceptor {
    @Override // com.smaato.sdk.core.network.Interceptor
    @NonNull
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        try {
            Response proceed = chain.proceed(chain.request());
            if (204 != proceed.responseCode()) {
                return proceed;
            }
            SomaException.Type type = SomaException.Type.NO_CONTENT;
            throw new SomaException(type, "Server returned HTTP response code: 204 for URL: " + proceed.request().uri());
        } catch (HttpNoResponseBodyException e) {
            int responseCode = e.getResponseCode();
            if (400 <= responseCode && responseCode < 420) {
                throw new SomaException(SomaException.Type.BAD_REQUEST, e.getCause());
            }
            if (500 <= responseCode && responseCode < 510) {
                throw new SomaException(SomaException.Type.BAD_RESPONSE, e.getCause());
            }
            throw e;
        } catch (SocketTimeoutException e2) {
            throw new SomaException(SomaException.Type.TIMEOUT_ERROR, e2);
        }
    }
}
