package com.maticoo.sdk.mraid.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import com.maticoo.sdk.mraid.cache.WebResInterceptor;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class BaseInterceptor implements WebResInterceptor {
    private static final String CHARSET_ENCODE = "UTF-8";
    private static final long DEFAULT_CACHE_DISK_SIZE = 10485760;
    private static final int MAX_REDIRECT_COUNT = 5;
    private static final String RES_TYPE_HTML = "text/html";
    private static int redirectCount;
    private OnErrorListener onErrorListener;
    private Handler handler = new Handler(Looper.getMainLooper());
    private UrlConnectionDownloader downloader = UrlConnectionDownloader.getInstance();

    /* loaded from: classes6.dex */
    public interface OnErrorListener {
        void onError(String str, int i, String str2);
    }

    public BaseInterceptor(@NonNull Context context) {
    }

    private WebResourceResponse buildWebResponse(DownloadResult downloadResult) {
        if (downloadResult == null) {
            return null;
        }
        String str = downloadResult.contentType;
        if (str != null && str.toLowerCase().contains("html")) {
            downloadResult.contentType = RES_TYPE_HTML;
            downloadResult.contentEncoding = "UTF-8";
        }
        return new WebResourceResponse(downloadResult.contentType, downloadResult.contentEncoding, downloadResult.responseCode, downloadResult.responseMsg, downloadResult.responseHeaders, downloadResult.inputStream);
    }

    private void dispatchError(final String str, final int i, final String str2) {
        this.handler.post(new Runnable() { // from class: com.maticoo.sdk.mraid.cache.BaseInterceptor.1
            @Override // java.lang.Runnable
            public void run() {
                BaseInterceptor.this.onErrorListener.onError(str, i, str2);
            }
        });
    }

    private DownloadResult loopRetryLoad(WebResInterceptor.Chain chain) throws Exception {
        String requestUrl = chain.getRequestUrl();
        Map<String, String> requestHeaders = chain.getRequestHeaders();
        while (redirectCount <= 5) {
            try {
                return this.downloader.load(requestUrl, requestHeaders);
            } catch (RedirectsException e) {
                requestUrl = e.getNewUrl();
                redirectCount++;
                DeveloperLog.LogW("loopRetryLoad: redirectCount -> " + redirectCount);
            } catch (Exception e2) {
                e2.printStackTrace();
                throw new Exception(e2);
            }
        }
        return null;
    }

    @Override // com.maticoo.sdk.mraid.cache.WebResInterceptor
    public WebResourceResponse intercept(WebResInterceptor.Chain chain) {
        DownloadResult downloadResult;
        int i;
        String requestUrl = chain.getRequestUrl();
        if (!isIntercept(requestUrl, chain.getRequestHeaders())) {
            return chain.proceed(requestUrl, chain.getRequestHeaders());
        }
        try {
            downloadResult = loopRetryLoad(chain);
        } catch (Exception e) {
            e.printStackTrace();
            downloadResult = null;
        }
        if (downloadResult != null && (i = downloadResult.responseCode) >= 400 && this.onErrorListener != null) {
            dispatchError(requestUrl, i, downloadResult.responseMsg);
        }
        return buildWebResponse(downloadResult);
    }

    protected abstract boolean isIntercept(String str, Map<String, String> map);

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.onErrorListener = onErrorListener;
    }
}
