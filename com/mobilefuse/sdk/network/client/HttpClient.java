package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.exception.Either;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClient.kt */
@Metadata
/* loaded from: classes7.dex */
public interface HttpClient {

    /* compiled from: HttpClient.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Either headSync$default(HttpClient httpClient, String str, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    j = 10000;
                }
                return httpClient.headSync(str, j);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: headSync");
        }
    }

    void get(@NotNull HttpGetRequest httpGetRequest, @NotNull Function1<? super Either<? extends HttpError, HttpResponse>, Unit> function1);

    @NotNull
    Either<HttpError, HttpResponse> headSync(@NotNull String str, long j);

    void post(@NotNull HttpPostRequest<? extends HttpPostBody> httpPostRequest, @NotNull Function1<? super Either<? extends HttpError, HttpResponse>, Unit> function1);
}
