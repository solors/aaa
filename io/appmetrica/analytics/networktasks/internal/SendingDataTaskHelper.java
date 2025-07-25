package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.p724io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* loaded from: classes9.dex */
public class SendingDataTaskHelper {

    /* renamed from: a */
    private final RequestBodyEncrypter f95907a;

    /* renamed from: b */
    private final Compressor f95908b;

    /* renamed from: c */
    private final TimeProvider f95909c;

    /* renamed from: d */
    private final RequestDataHolder f95910d;

    /* renamed from: e */
    private final ResponseDataHolder f95911e;

    /* renamed from: f */
    private final NetworkResponseHandler f95912f;

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f95912f.handle(this.f95911e);
        if (response != null && "accepted".equals(response.mStatus)) {
            return true;
        }
        return false;
    }

    public void onPerformRequest() {
        this.f95910d.applySendTime(this.f95909c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(@NonNull byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.f95908b.compress(bArr);
            if (compress == null || (encrypt = this.f95907a.encrypt(compress)) == null) {
                return false;
            }
            this.f95910d.setPostData(encrypt);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull TimeProvider timeProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f95907a = requestBodyEncrypter;
        this.f95908b = compressor;
        this.f95909c = timeProvider;
        this.f95910d = requestDataHolder;
        this.f95911e = responseDataHolder;
        this.f95912f = networkResponseHandler;
    }
}
