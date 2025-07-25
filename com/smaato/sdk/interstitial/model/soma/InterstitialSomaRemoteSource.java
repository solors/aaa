package com.smaato.sdk.interstitial.model.soma;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.mvvm.model.soma.SomaAdRequest;
import com.smaato.sdk.core.mvvm.model.soma.SomaRemoteSource;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.util.HeaderValueUtils;
import com.smaato.sdk.interstitial.model.InterstitialAdRequest;
import java.util.Set;

/* loaded from: classes7.dex */
public class InterstitialSomaRemoteSource extends SomaRemoteSource {
    public InterstitialSomaRemoteSource(@NonNull HttpClient httpClient, @NonNull String str, @NonNull HeaderValueUtils headerValueUtils, @NonNull Logger logger) {
        super(httpClient, str, headerValueUtils, logger);
    }

    private static Uri addUriParameter(Uri uri, String str, String str2) {
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private static Uri setAdFormatParameterToSplash(Uri uri) {
        String queryParameter;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : queryParameterNames) {
            if (str.equals("format")) {
                queryParameter = "splash";
            } else {
                queryParameter = uri.getQueryParameter(str);
            }
            clearQuery.appendQueryParameter(str, queryParameter);
        }
        return clearQuery.build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.smaato.sdk.core.mvvm.model.soma.SomaRemoteSource
    public Request buildSomaHttpRequest(SomaAdRequest somaAdRequest) {
        Request buildSomaHttpRequest = super.buildSomaHttpRequest(somaAdRequest);
        if (somaAdRequest instanceof InterstitialAdRequest) {
            InterstitialAdRequest interstitialAdRequest = (InterstitialAdRequest) somaAdRequest;
            Uri addUriParameter = addUriParameter(addUriParameter(addUriParameter(addUriParameter(buildSomaHttpRequest.uri(), "videotype", interstitialAdRequest.getVideoType()), ViewHierarchyConstants.DIMENSION_KEY, interstitialAdRequest.getFullscreenDimension()), "width", Integer.toString(interstitialAdRequest.getDisplayWidthInDp())), "height", Integer.toString(interstitialAdRequest.getDisplayHeightInDp()));
            if (interstitialAdRequest.getIsSplash()) {
                addUriParameter = setAdFormatParameterToSplash(addUriParameter);
            }
            if (interstitialAdRequest.getRichMediaIsRewarded()) {
                addUriParameter = addUriParameter(addUriParameter, "playableSupported", "1");
            }
            return buildSomaHttpRequest.buildUpon().uri(addUriParameter).build();
        }
        return buildSomaHttpRequest;
    }
}
