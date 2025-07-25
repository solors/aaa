package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.encoding.Gzip;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpError;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37559r0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import p1046xd.C44986p;
import p1046xd.Closeable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HttpClient.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidHttpClient$post$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Function1 $completeBlock;
    final /* synthetic */ HttpPostRequest $request;
    final /* synthetic */ AndroidHttpClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClient.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.network.client.AndroidHttpClient$post$1$1 */
    /* loaded from: classes7.dex */
    public static final class C236311 extends Lambda implements Functions<Unit> {
        final /* synthetic */ Either $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C236311(Either either) {
            super(0);
            this.$result = either;
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AndroidHttpClient$post$1.this.$completeBlock.invoke(this.$result);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpClient.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.network.client.AndroidHttpClient$post$1$2 */
    /* loaded from: classes7.dex */
    public static final class C236322 extends Lambda implements Functions<Unit> {
        final /* synthetic */ HttpError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C236322(HttpError httpError) {
            super(0);
            this.$error = httpError;
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AndroidHttpClient$post$1.this.$completeBlock.invoke(new ErrorResult(this.$error));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClient$post$1(AndroidHttpClient androidHttpClient, HttpPostRequest httpPostRequest, Function1 function1) {
        super(0);
        this.this$0 = androidHttpClient;
        this.$request = httpPostRequest;
        this.$completeBlock = function1;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map m17276r;
        BufferedReader bufferedReader;
        Either errorResult;
        InputStream inputStream;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            URLConnection openConnection = new URL(this.$request.getUrl()).openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setConnectTimeout((int) this.$request.getTimeoutMillis());
                httpURLConnection.setReadTimeout((int) this.$request.getTimeoutMillis());
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                if (this.$request.getEmptyUserAgent()) {
                    httpURLConnection.setRequestProperty("User-Agent", "");
                }
                if (this.$request.getGzipEncoding()) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                }
                httpURLConnection.setRequestProperty("Content-Type", this.$request.getBody().getContentType());
                m17276r = C37559r0.m17276r(this.$request.getHeaders(), this.$request.getBody().getHeaders());
                for (Map.Entry entry : m17276r.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                byte[] content = this.$request.getBody().getContent();
                if (content == null) {
                    SchedulersKt.runOnScheduler(Schedulers.MAIN, new AndroidHttpClient$post$1$$special$$inlined$let$lambda$1(this));
                    return;
                }
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                if (this.$request.getGzipEncoding()) {
                    content = Gzip.gzip(content);
                }
                dataOutputStream.write(content);
                dataOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (responseCode == 200) {
                    if (this.$request.getGzipEncoding()) {
                        inputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                    } else {
                        inputStream = httpURLConnection.getInputStream();
                    }
                    Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                    BufferedReader bufferedReader2 = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    String m1163g = C44986p.m1163g(bufferedReader2);
                    Closeable.m1220a(bufferedReader2, null);
                    inputStream.close();
                    errorResult = new SuccessResult(new HttpResponse(m1163g, responseCode, currentTimeMillis, currentTimeMillis2));
                } else {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charsets.UTF_8);
                        bufferedReader = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
                    } else {
                        bufferedReader = null;
                    }
                    String m1163g2 = bufferedReader != null ? C44986p.m1163g(bufferedReader) : null;
                    Closeable.m1220a(bufferedReader, null);
                    errorResult = new ErrorResult(new HttpError.ConnectionError(responseCode, m1163g2));
                }
                SchedulersKt.runOnScheduler(Schedulers.MAIN, new C236311(errorResult));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (Throwable th) {
            HttpError connectionError = th instanceof FileNotFoundException ? new HttpError.ConnectionError(404, null, 2, null) : new HttpError.UnknownError(th.getMessage());
            th.printStackTrace();
            SchedulersKt.runOnScheduler(Schedulers.MAIN, new C236322(connectionError));
        }
    }
}
