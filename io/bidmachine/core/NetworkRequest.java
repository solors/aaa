package io.bidmachine.core;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> {
    @Nullable
    private Callback<RequestResultType, ErrorResultType> callback;
    @Nullable
    private CancelCallback cancelCallback;
    @Nullable
    private ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> contentEncoders;
    @Nullable
    private URLConnection currentConnection;
    private State currentState = State.Idle;
    @Nullable
    private RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> dataBinder;
    @Nullable
    private ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> dataEncoders;
    @Nullable
    private ErrorResultType errorResult;
    @NonNull
    private final Method method;
    @Nullable
    private final String path;
    @Nullable
    private final RequestDataType requestData;
    @Nullable
    private RequestResultType requestResult;

    /* loaded from: classes9.dex */
    public static class Base64RequestDataEncoder extends RequestDataEncoder {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        protected byte[] decode(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) {
            return Base64.decode(bArr, 0);
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        protected byte[] encode(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) {
            return Base64.encode(bArr, 0);
        }
    }

    /* loaded from: classes9.dex */
    public interface Callback<RequestResultType, ErrorResultType> {
        void onFail(@Nullable ErrorResultType errorresulttype);

        void onSuccess(@Nullable RequestResultType requestresulttype);
    }

    /* loaded from: classes9.dex */
    public interface CancelCallback {
        void onCanceled();
    }

    /* loaded from: classes9.dex */
    public static class GZIPRequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> extends RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        protected byte[] decode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            GZIPInputStream gZIPInputStream;
            ByteArrayInputStream byteArrayInputStream;
            Throwable th;
            ByteArrayOutputStream byteArrayOutputStream;
            if ("gzip".equals(uRLConnection.getContentEncoding())) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byteArrayInputStream = new ByteArrayInputStream(bArr);
                        try {
                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        } catch (Throwable th2) {
                            gZIPInputStream = null;
                            th = th2;
                        }
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int read = gZIPInputStream.read(bArr2);
                                if (read != -1) {
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                } else {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    Utils.flush(byteArrayOutputStream);
                                    Utils.close(byteArrayOutputStream);
                                    Utils.close(byteArrayInputStream);
                                    Utils.close(gZIPInputStream);
                                    return byteArray;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            Utils.flush(byteArrayOutputStream);
                            Utils.close(byteArrayOutputStream);
                            Utils.close(byteArrayInputStream);
                            Utils.close(gZIPInputStream);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        byteArrayInputStream = null;
                        th = th4;
                        gZIPInputStream = null;
                    }
                } catch (Throwable th5) {
                    gZIPInputStream = null;
                    byteArrayInputStream = null;
                    th = th5;
                    byteArrayOutputStream = null;
                }
            } else {
                return bArr;
            }
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        protected byte[] encode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            GZIPOutputStream gZIPOutputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
            }
            try {
                gZIPOutputStream.write(bArr);
                Utils.close(gZIPOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Utils.flush(byteArrayOutputStream);
                Utils.close(byteArrayOutputStream);
                Utils.flush(null);
                Utils.close(null);
                return byteArray;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream2 = byteArrayOutputStream;
                Utils.flush(byteArrayOutputStream2);
                Utils.close(byteArrayOutputStream2);
                Utils.flush(gZIPOutputStream);
                Utils.close(gZIPOutputStream);
                throw th;
            }
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        protected void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
            uRLConnection.setRequestProperty("Content-Encoding", "gzip");
        }
    }

    /* loaded from: classes9.dex */
    public enum Method {
        Get("GET"),
        Post("POST");
        
        private final String methodString;

        Method(@NonNull String str) {
            this.methodString = str;
        }

        public void apply(URLConnection uRLConnection) throws ProtocolException {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setRequestMethod(this.methodString);
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class SimpleJsonArrayDataBinder<ErrorResultType> extends AbstractC35677b<JSONArray, ErrorResultType> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        public JSONArray createSuccessResult(NetworkRequest<JSONObject, JSONArray, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return new JSONArray(new String(bArr));
        }
    }

    /* loaded from: classes9.dex */
    public static class SimpleJsonObjectDataBinder<ErrorResultType> extends AbstractC35677b<JSONObject, ErrorResultType> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        public JSONObject createSuccessResult(NetworkRequest<JSONObject, JSONObject, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return new JSONObject(new String(bArr));
        }
    }

    /* loaded from: classes9.dex */
    public enum State {
        Idle,
        Running,
        Success,
        Fail,
        Canceled
    }

    /* renamed from: io.bidmachine.core.NetworkRequest$b */
    /* loaded from: classes9.dex */
    static abstract class AbstractC35677b<RequestResultType, ErrorResultType> extends RequestDataBinder<JSONObject, RequestResultType, ErrorResultType> {
        AbstractC35677b() {
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected void prepareHeaders(NetworkRequest<JSONObject, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        @Nullable
        public byte[] obtainData(NetworkRequest<JSONObject, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, @Nullable JSONObject jSONObject) throws Exception {
            if (jSONObject != null) {
                return jSONObject.toString().getBytes("UTF-8");
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.core.NetworkRequest$c */
    /* loaded from: classes9.dex */
    public final class RunnableC35678c implements Runnable {
        private RunnableC35678c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            NetworkRequest.this.process();
            if (NetworkRequest.this.callback != null && !NetworkRequest.this.isCanceled()) {
                if (NetworkRequest.this.currentState == State.Success) {
                    NetworkRequest.this.callback.onSuccess(NetworkRequest.this.requestResult);
                } else {
                    NetworkRequest.this.callback.onFail(NetworkRequest.this.errorResult);
                }
            }
        }
    }

    public NetworkRequest(@NonNull Method method, @Nullable String str, @Nullable RequestDataType requestdatatype) {
        this.method = method;
        this.path = str;
        this.requestData = requestdatatype;
    }

    private InputStream obtainErrorStream(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getErrorStream();
        }
        return null;
    }

    private int obtainResponseCode(URLConnection uRLConnection) throws IOException {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
        if (r8.errorResult == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0149, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void process() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.core.NetworkRequest.process():void");
    }

    public void addContentEncoder(RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> requestDataEncoder) {
        if (this.contentEncoders == null) {
            this.contentEncoders = new ArrayList<>();
        }
        this.contentEncoders.add(requestDataEncoder);
    }

    public void addDataEncoder(RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> requestDataEncoder) {
        if (this.dataEncoders == null) {
            this.dataEncoders = new ArrayList<>();
        }
        this.dataEncoders.add(requestDataEncoder);
    }

    public void cancel() {
        this.currentState = State.Canceled;
        CancelCallback cancelCallback = this.cancelCallback;
        if (cancelCallback != null) {
            cancelCallback.onCanceled();
        }
    }

    protected byte[] decodeResponseData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList = this.contentEncoders;
        if (arrayList != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it = arrayList.iterator();
            while (it.hasNext()) {
                bArr = it.next().decode(this, uRLConnection, bArr);
            }
        }
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList2 = this.dataEncoders;
        if (arrayList2 != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                bArr = it2.next().decode(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    protected byte[] encodeRequestData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList = this.dataEncoders;
        if (arrayList != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it = arrayList.iterator();
            while (it.hasNext()) {
                RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> next = it.next();
                next.prepareHeaders(this, uRLConnection);
                bArr = next.encode(this, uRLConnection, bArr);
            }
        }
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList2 = this.contentEncoders;
        if (arrayList2 != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> next2 = it2.next();
                next2.prepareHeaders(this, uRLConnection);
                bArr = next2.encode(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    protected String getBaseUrl() throws Exception {
        return "TODO: implement url";
    }

    @NonNull
    public Method getMethod() {
        return this.method;
    }

    @Nullable
    public String getPath() {
        return this.path;
    }

    public boolean isCanceled() {
        if (this.currentState == State.Canceled) {
            return true;
        }
        return false;
    }

    @NonNull
    protected abstract ErrorResultType obtainError(@Nullable URLConnection uRLConnection, int i);

    @NonNull
    protected abstract ErrorResultType obtainError(@Nullable URLConnection uRLConnection, @Nullable Throwable th);

    protected byte[] obtainRequestData(URLConnection uRLConnection) throws Exception {
        RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> requestDataBinder = this.dataBinder;
        if (requestDataBinder != null) {
            requestDataBinder.prepareRequest(this, uRLConnection);
            this.dataBinder.prepareHeaders(this, uRLConnection);
            return this.dataBinder.obtainData(this, uRLConnection, this.requestData);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void prepareRequestParams(URLConnection uRLConnection) {
        uRLConnection.setConnectTimeout(40000);
        uRLConnection.setReadTimeout(40000);
    }

    public void request() {
        request(NetworkRequestExecutor.get());
    }

    public void setCallback(@Nullable Callback<RequestResultType, ErrorResultType> callback) {
        this.callback = callback;
    }

    public void setCancelCallback(@Nullable CancelCallback cancelCallback) {
        this.cancelCallback = cancelCallback;
    }

    public void setDataBinder(@Nullable RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> requestDataBinder) {
        this.dataBinder = requestDataBinder;
    }

    public void request(@NonNull Executor executor) {
        try {
            executor.execute(new RunnableC35678c());
        } catch (Throwable th) {
            Logger.m20086w(th);
            Callback<RequestResultType, ErrorResultType> callback = this.callback;
            if (callback != null) {
                callback.onFail(obtainError((URLConnection) null, th));
            }
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> {
        protected ErrorResultType createFailResult(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        protected abstract RequestResultType createSuccessResult(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        @Nullable
        protected abstract byte[] obtainData(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, @Nullable RequestDataType requestdatatype) throws Exception;

        protected abstract void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection);

        protected void prepareRequest(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> {
        protected abstract byte[] decode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        protected abstract byte[] encode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        protected void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
        }
    }
}
