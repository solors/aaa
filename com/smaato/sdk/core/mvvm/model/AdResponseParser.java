package com.smaato.sdk.core.mvvm.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.mvvm.model.AdResponse;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.network.SomaException;
import com.smaato.sdk.core.p568ad.AdType;
import com.smaato.sdk.core.p568ad.Expiration;
import com.smaato.sdk.core.util.HeaderValueUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public abstract class AdResponseParser {
    @NonNull
    protected final AdType adType;
    @NonNull
    protected final HeaderValueUtils headerValueUtils;

    /* loaded from: classes7.dex */
    public static class ParsingException extends IOException {
        public ParsingException(String str, Throwable th) {
            super(str, th);
        }
    }

    public AdResponseParser(@NonNull AdType adType, @NonNull HeaderValueUtils headerValueUtils) {
        this.headerValueUtils = headerValueUtils;
        this.adType = adType;
    }

    private byte[] getBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[65535];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private String getJsonFromBody(Response response) throws IOException {
        String charSet = this.headerValueUtils.getCharSet(response.headers());
        if (charSet != null) {
            String str = new String(getBytes(response.body().source()), charSet);
            if (!str.isEmpty()) {
                return str;
            }
            throw new SomaException(SomaException.Type.NO_CONTENT, "Ad response is empty");
        }
        throw new SomaException(SomaException.Type.BAD_RESPONSE, "No char set in response");
    }

    private AdResponse.Builder initializeAdResponseBuilder(Response response) {
        return AdResponse.builder().setSessionId(this.headerValueUtils.retrieveSessionId(response.headers())).setSci(this.headerValueUtils.retrieveSci(response.headers())).setImpressionCountingType(this.headerValueUtils.retrieveImpressionType(response.headers())).setBundleId(this.headerValueUtils.retrieveBundleId(response.headers())).setTtlMs(Long.valueOf(this.headerValueUtils.getTtl(response.headers()))).setAdType(this.adType);
    }

    protected abstract AdResponse parseResponse(AdResponse.Builder builder, String str, long j) throws IOException;

    @NonNull
    public AdResponse parseSomaResponse(Response response) throws IOException {
        return parseResponse(initializeAdResponseBuilder(response), getJsonFromBody(response), this.headerValueUtils.getTtl(response.headers()));
    }

    @NonNull
    public AdResponse parseUbBid(@NonNull String str, @NonNull ImpressionCountingType impressionCountingType, @NonNull Expiration expiration, @NonNull String str2, @Nullable String str3, @Nullable String str4) throws IOException {
        if (str != null) {
            if (impressionCountingType != null) {
                if (expiration != null) {
                    if (str2 != null) {
                        long remainingTime = expiration.getRemainingTime();
                        return parseResponse(AdResponse.builder().setSessionId(str).setImpressionCountingType(impressionCountingType).setBundleId(str4).setTtlMs(Long.valueOf(remainingTime)).setAdType(this.adType).setSci(str3), str2, remainingTime);
                    }
                    throw new NullPointerException("'markup' specified as non-null is null");
                }
                throw new NullPointerException("'expiration' specified as non-null is null");
            }
            throw new NullPointerException("'impressionCountingType' specified as non-null is null");
        }
        throw new NullPointerException("'sessionId' specified as non-null is null");
    }
}
