package com.smaato.sdk.core.mvvm.model.soma;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.mvvm.model.AdResponse;
import com.smaato.sdk.core.mvvm.model.AdResponseParser;
import com.smaato.sdk.core.network.Call;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.network.SomaException;
import com.smaato.sdk.core.p568ad.AdFormat;
import com.smaato.sdk.core.util.HeaderValueUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class SomaRemoteSource {
    protected static final String KEY_ADSPACE_ID = "adspace";
    protected static final String KEY_AD_FORMAT = "format";
    protected static final String KEY_DIMENSION = "dimension";
    protected static final String KEY_HEIGHT = "height";
    protected static final String KEY_MEDIATION_ADAPTER_VERSION = "mav";
    protected static final String KEY_MEDIATION_NETWORK_NAME = "mnn";
    protected static final String KEY_MEDIATION_NETWORK_SDK_VERSION = "mnsv";
    protected static final String KEY_MEDIATION_VERSION = "mediationversion";
    protected static final String KEY_MRAIDVERSION = "mraidver";
    protected static final String KEY_PLAYABLE_SUPPORTED = "playableSupported";
    protected static final String KEY_PRIVACY_ICON = "privacyIcon";
    protected static final String KEY_VASTVERSION = "vastver";
    protected static final String KEY_VIDEO_TYPE_NAME = "videotype";
    protected static final String KEY_WIDTH = "width";
    protected static final String VALUE_MEDIATION_VERSION = "2";
    protected static final String VALUE_MRAIDVERSION = "3";
    protected static final String VALUE_PLAYABLE_SUPPORTED = "1";
    protected static final String VALUE_PRIVACY_ICON = "1";
    protected static final String VALUE_SPLASH = "splash";
    protected static final String VALUE_VAST_VERSION = "4.1";
    @NonNull
    Map<AdFormat, AdResponseParser> adResponseParsers = new HashMap();
    @Nullable
    private Call currentCall;
    @NonNull
    private final HeaderValueUtils headerValueUtils;
    @NonNull
    private final Logger logger;
    @NonNull
    private final String somaApiUrl;
    @NonNull
    private final HttpClient somaHttpClient;

    /* renamed from: com.smaato.sdk.core.mvvm.model.soma.SomaRemoteSource$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C27177a {

        /* renamed from: a */
        static final /* synthetic */ int[] f71720a;

        static {
            int[] iArr = new int[AdFormat.values().length];
            f71720a = iArr;
            try {
                iArr[AdFormat.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71720a[AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71720a[AdFormat.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71720a[AdFormat.DISPLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71720a[AdFormat.RICH_MEDIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SomaRemoteSource(@NonNull HttpClient httpClient, @NonNull String str, @NonNull HeaderValueUtils headerValueUtils, @NonNull Logger logger) {
        this.somaHttpClient = httpClient;
        this.somaApiUrl = str;
        this.headerValueUtils = headerValueUtils;
        this.logger = logger;
    }

    private void cancelCurrentCall() {
        Call call = this.currentCall;
        if (call != null) {
            call.cancel();
            this.currentCall = null;
        }
    }

    private AdResponse getAdResponseFromSoma(Request request) throws IOException {
        cancelCurrentCall();
        Call newCall = this.somaHttpClient.newCall(request);
        this.currentCall = newCall;
        Response execute = newCall.execute();
        try {
            this.currentCall = null;
            AdFormat adFormat = this.headerValueUtils.getAdFormat(execute.headers());
            if (adFormat != null) {
                AdResponseParser adResponseParser = this.adResponseParsers.get(adFormat);
                if (adResponseParser != null) {
                    AdResponse parseSomaResponse = adResponseParser.parseSomaResponse(execute);
                    execute.close();
                    return parseSomaResponse;
                }
                Logger logger = this.logger;
                LogDomain logDomain = LogDomain.CORE;
                logger.error(logDomain, "Illegal ad format: " + adFormat, new Object[0]);
                SomaException.Type type = SomaException.Type.BAD_RESPONSE;
                throw new SomaException(type, "Illegal ad format: " + adFormat);
            }
            this.logger.error(LogDomain.CORE, "No adformat received", new Object[0]);
            throw new SomaException(SomaException.Type.BAD_RESPONSE, "No adformat received");
        } catch (Throwable th) {
            if (execute != null) {
                try {
                    execute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Request buildSomaHttpRequest(SomaAdRequest somaAdRequest) {
        Request request = Request.get(this.somaApiUrl);
        Uri.Builder appendQueryParameter = request.uri().buildUpon().appendQueryParameter(KEY_ADSPACE_ID, somaAdRequest.getAdRequest().getAdSpaceId()).appendQueryParameter(KEY_AD_FORMAT, this.headerValueUtils.adFormatToApiValue(somaAdRequest.getAdRequest().getAdFormat())).appendQueryParameter(KEY_MEDIATION_VERSION, "2").appendQueryParameter(KEY_MEDIATION_ADAPTER_VERSION, somaAdRequest.getAdRequest().getMediationAdapterVersion()).appendQueryParameter(KEY_MEDIATION_NETWORK_NAME, somaAdRequest.getAdRequest().getMediationNetworkName()).appendQueryParameter(KEY_MEDIATION_NETWORK_SDK_VERSION, somaAdRequest.getAdRequest().getMediationNetworkSdkVersion());
        int i = C27177a.f71720a[somaAdRequest.getAdRequest().getAdFormat().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4 || i == 5) {
                    appendQueryParameter.appendQueryParameter(KEY_MRAIDVERSION, "3");
                }
            } else {
                appendQueryParameter.appendQueryParameter(KEY_VASTVERSION, "4.1");
                appendQueryParameter.appendQueryParameter("privacyIcon", "1");
                appendQueryParameter.appendQueryParameter(KEY_MRAIDVERSION, "3");
            }
        } else {
            appendQueryParameter.appendQueryParameter(KEY_VASTVERSION, "4.1");
            appendQueryParameter.appendQueryParameter("privacyIcon", "1");
        }
        return request.buildUpon().uri(appendQueryParameter.build()).build();
    }

    public synchronized AdResponse loadAd(@NonNull SomaAdRequest somaAdRequest) throws IOException {
        if (somaAdRequest == null) {
            throw new NullPointerException("'somaAdRequest' specified as non-null is null");
        }
        return getAdResponseFromSoma(buildSomaHttpRequest(somaAdRequest));
    }

    public void setAdResponseParsers(@NonNull Map<AdFormat, AdResponseParser> map) {
        if (map != null) {
            this.adResponseParsers = map;
            return;
        }
        throw new NullPointerException("'adResponseParsers' specified as non-null is null");
    }

    public synchronized AdResponse loadAd(@NonNull Request request) throws IOException {
        if (request == null) {
            throw new NullPointerException("'request' specified as non-null is null");
        }
        return getAdResponseFromSoma(request);
    }
}
