package com.maticoo.sdk.utils.request.network;

import android.content.Context;
import android.text.TextUtils;
import com.maticoo.sdk.utils.IOUtil;
import com.maticoo.sdk.utils.request.network.AsyncReq;

/* loaded from: classes6.dex */
public class Request {
    private final boolean isCheckChain;
    private final boolean isInstanceFollowRedirects;
    private final OnRequestCallback mCallback;
    private final int mConnectTimeout;
    private Context mContext;
    private final Headers mHeaders;
    private final Method mMethod;
    private final int mReadTimeout;
    private final RequestBody mRequestBody;
    private boolean mShouldCallbackResponse;
    private final Object mTag;
    private final String mUrl;

    /* loaded from: classes6.dex */
    public enum Method {
        GET("GET"),
        POST("POST");
        
        private final String value;

        Method(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* loaded from: classes6.dex */
    public interface OnRequestCallback {
        void onRequestFailed(String str);

        void onRequestSuccess(Response response);
    }

    /* loaded from: classes6.dex */
    public static class RequestBuilder {
        private boolean isCheckChain;
        private boolean isInstanceFollowRedirects;
        private OnRequestCallback mCallback;
        private int mConnectTimeout;
        private Headers mHeaders;
        private Method mMethod;
        private int mReadTimeout;
        private RequestBody mRequestBody;
        private Object mTag;
        private String mUrl;

        public RequestBuilder body(RequestBody requestBody) {
            this.mRequestBody = requestBody;
            return this;
        }

        public RequestBuilder callback(OnRequestCallback onRequestCallback) {
            this.mCallback = onRequestCallback;
            return this;
        }

        public RequestBuilder connectTimeout(int i) {
            this.mConnectTimeout = i;
            return this;
        }

        public RequestBuilder headers(Headers headers) {
            this.mHeaders = headers;
            return this;
        }

        public RequestBuilder instanceFollowRedirects(boolean z) {
            this.isInstanceFollowRedirects = z;
            return this;
        }

        public RequestBuilder isCheckChain(boolean z) {
            this.isCheckChain = z;
            return this;
        }

        public RequestBuilder method(Method method) {
            this.mMethod = method;
            return this;
        }

        public void performRequest(Context context) {
            new Request(this).performRequest(context);
        }

        public RequestBuilder readTimeout(int i) {
            this.mReadTimeout = i;
            return this;
        }

        public Response syncRequest() {
            return new Request(this).syncRequest();
        }

        public RequestBuilder tag(Object obj) {
            this.mTag = obj;
            return this;
        }

        public RequestBuilder url(String str) {
            this.mUrl = str;
            return this;
        }
    }

    private void callbackError(OnRequestCallback onRequestCallback, String str) {
        if (onRequestCallback != null) {
            onRequestCallback.onRequestFailed(str);
            return;
        }
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RequestBuilder newBuilder() {
        return new RequestBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performRequest(Context context) {
        if (context == null) {
            callbackError(this.mCallback, "Context error");
        } else if (TextUtils.isEmpty(this.mUrl)) {
            callbackError(this.mCallback, "request need a valid url, current is empty");
        } else {
            this.mContext = context;
            AsyncReq asyncReq = new AsyncReq(this);
            asyncReq.setCallback(new AsyncReq.OnTaskCallback() { // from class: com.maticoo.sdk.utils.request.network.Request.1
                @Override // com.maticoo.sdk.utils.request.network.AsyncReq.OnTaskCallback
                public void onError(String str) {
                    if (Request.this.mCallback != null) {
                        Request.this.mCallback.onRequestFailed(str);
                    }
                }

                @Override // com.maticoo.sdk.utils.request.network.AsyncReq.OnTaskCallback
                public void onSuccess(Response response) {
                    if (Request.this.mCallback != null) {
                        Request.this.mCallback.onRequestSuccess(response);
                    } else {
                        IOUtil.closeQuietly(response);
                    }
                }
            });
            ReqExecutor.execute(asyncReq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response syncRequest() {
        this.mShouldCallbackResponse = true;
        return new SyncReq(this).start();
    }

    public int getConnectTimeout() {
        return this.mConnectTimeout;
    }

    public Context getContext() {
        return this.mContext;
    }

    public Headers getHeaders() {
        return this.mHeaders;
    }

    public int getReadTimeout() {
        return this.mReadTimeout;
    }

    public RequestBody getRequestBody() {
        return this.mRequestBody;
    }

    public Method getRequestMethod() {
        return this.mMethod;
    }

    public Object getTag() {
        return this.mTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean isCheckChain() {
        return this.isCheckChain;
    }

    public boolean isInstanceFollowRedirects() {
        return this.isInstanceFollowRedirects;
    }

    public boolean shouldCallbackResponse() {
        if (!this.mShouldCallbackResponse && this.mCallback == null) {
            return false;
        }
        return true;
    }

    private Request(RequestBuilder requestBuilder) {
        this.mMethod = requestBuilder.mMethod;
        this.mHeaders = requestBuilder.mHeaders;
        this.mConnectTimeout = requestBuilder.mConnectTimeout;
        this.mReadTimeout = requestBuilder.mReadTimeout;
        this.mUrl = requestBuilder.mUrl;
        this.mRequestBody = requestBuilder.mRequestBody;
        this.isInstanceFollowRedirects = requestBuilder.isInstanceFollowRedirects;
        this.isCheckChain = requestBuilder.isCheckChain;
        this.mCallback = requestBuilder.mCallback;
        this.mTag = requestBuilder.mTag;
    }
}
