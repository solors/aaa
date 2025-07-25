package com.smaato.sdk.core.network.interceptors;

import android.app.Application;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import java.io.IOException;

/* loaded from: classes7.dex */
public class UserAgentInterceptor implements Interceptor {
    private final String userAgent;

    public UserAgentInterceptor(Application application) {
        this.userAgent = getUserAgent(application);
    }

    private String getUserAgent(Application application) {
        try {
            return WebSettings.getDefaultUserAgent(application);
        } catch (Exception unused) {
            return new WebView(application).getSettings().getUserAgentString();
        }
    }

    @Override // com.smaato.sdk.core.network.Interceptor
    @NonNull
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        return chain.proceed(request.buildUpon().headers(request.headers().buildUpon().put("User-Agent", this.userAgent).build()).build());
    }
}
