package com.maticoo.sdk.utils.request.network.connect;

import android.text.TextUtils;
import com.maticoo.sdk.utils.IOUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.model.Configurations;
import com.maticoo.sdk.utils.prefs.Preference;
import com.maticoo.sdk.utils.request.network.Headers;
import com.maticoo.sdk.utils.request.network.Request;
import com.maticoo.sdk.utils.request.network.RequestBody;
import com.maticoo.sdk.utils.request.network.Response;
import com.maticoo.sdk.utils.request.network.StreamBody;
import com.maticoo.sdk.utils.request.network.exception.ReadException;
import com.maticoo.sdk.utils.request.network.exception.WriteException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes6.dex */
public abstract class AbstractUrlConnection {
    private BufferedInputStream inputStream = null;
    private URLConnection mConnection;

    private Headers parseResponseHeaders(Map<String, List<String>> map) {
        Headers headers = new Headers();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            headers.add(entry.getKey(), entry.getValue());
        }
        return headers;
    }

    private Response readResponse(Request request) throws ReadException {
        String str;
        try {
            int responseCode = getResponseCode();
            if (responseCode < 400) {
                Headers parseResponseHeaders = parseResponseHeaders(this.mConnection.getHeaderFields());
                String contentEncoding = parseResponseHeaders.getContentEncoding();
                Configurations value = Preference.CONFIGURATION.getValue();
                InputStream inputStream = this.mConnection.getInputStream();
                if (value != null && value.getGzip() == 1) {
                    DeveloperLog.LogD("use gzip");
                    if (TextUtils.equals(contentEncoding, "gzip")) {
                        inputStream = new GZIPInputStream(inputStream);
                    }
                } else {
                    DeveloperLog.LogD("use normal");
                }
                this.inputStream = IOUtil.toBufferedInputStream(inputStream);
                if (!request.shouldCallbackResponse()) {
                    cancel();
                    return null;
                }
                String contentType = parseResponseHeaders.getContentType();
                StreamBody streamBody = new StreamBody(contentType, this.inputStream);
                DeveloperLog.LogD("StreamBody1234, request url :" + request.getUrl() + " contentType = " + contentType + "  encodingType = " + contentEncoding);
                return Response.newBuilder().code(responseCode).headers(parseResponseHeaders).body(streamBody).connection(this).build();
            }
            throw new ReadException(String.format("%s RequestCode:%d", this.mConnection.getURL().toString(), Integer.valueOf(responseCode)));
        } catch (SocketTimeoutException e) {
            throw new ReadException(String.format("Read data time out: %1$s.", this.mConnection.getURL().toString()), e);
        } catch (Throwable th) {
            if (!(th instanceof ReadException)) {
                if (!TextUtils.isEmpty(request.getUrl())) {
                    str = request.getUrl();
                } else {
                    str = "";
                }
                throw new ReadException(str + th.getMessage(), th);
            }
            throw th;
        }
    }

    private void writeBody(RequestBody requestBody) throws WriteException {
        if (requestBody == null) {
            return;
        }
        try {
            OutputStream outputStream = this.mConnection.getOutputStream();
            requestBody.writeTo(IOUtil.toBufferedOutputStream(outputStream));
            IOUtil.closeQuietly(outputStream);
        } catch (Exception e) {
            throw new WriteException(e);
        }
    }

    public void cancel() throws Exception {
        BufferedInputStream bufferedInputStream = this.inputStream;
        if (bufferedInputStream != null) {
            IOUtil.closeQuietly(bufferedInputStream);
            this.inputStream = null;
        }
    }

    public abstract URLConnection connect(Request request) throws Exception;

    abstract int getResponseCode() throws IOException;

    public Response intercept(Request request) throws Throwable {
        if (isAllowBody(request.getRequestMethod())) {
            Headers headers = request.getHeaders();
            RequestBody requestBody = request.getRequestBody();
            if (requestBody != null && headers != null) {
                headers.set("Content-Type", requestBody.contentType());
            }
            this.mConnection = connect(request);
            writeBody(requestBody);
        } else {
            this.mConnection = connect(request);
        }
        return readResponse(request);
    }

    public boolean isAllowBody(Request.Method method) {
        return method.equals(Request.Method.POST);
    }
}
