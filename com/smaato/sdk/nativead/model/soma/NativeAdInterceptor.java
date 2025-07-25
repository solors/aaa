package com.smaato.sdk.nativead.model.soma;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import java.io.IOException;

/* loaded from: classes7.dex */
public class NativeAdInterceptor implements Interceptor {
    @Override // com.smaato.sdk.core.network.Interceptor
    @NonNull
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        return chain.proceed(request.buildUpon().uri(request.uri().buildUpon().appendQueryParameter("nver", "1.2").appendQueryParameter("nsupport", "title,txt,icon,image,ctatext,starrating").build()).build());
    }
}
