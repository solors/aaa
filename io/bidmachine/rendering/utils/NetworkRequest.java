package io.bidmachine.rendering.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.explorestack.iab.utils.C10512g;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.utils.taskmanager.BackgroundTaskManager;
import io.bidmachine.rendering.utils.taskmanager.CancelableTask;
import io.bidmachine.rendering.utils.taskmanager.TaskManager;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class NetworkRequest<ResponseType> {

    /* renamed from: i */
    private static final TaskManager f97938i = new BackgroundTaskManager();

    /* renamed from: a */
    private final String f97939a;

    /* renamed from: b */
    private final Method f97940b;

    /* renamed from: c */
    private final Map f97941c;

    /* renamed from: d */
    private final Map f97942d;

    /* renamed from: e */
    private final DataRetriever f97943e;

    /* renamed from: f */
    private final ResponseProcessor f97944f;

    /* renamed from: g */
    private final Listener f97945g;

    /* renamed from: h */
    private CancelableTask f97946h;

    /* loaded from: classes9.dex */
    public static class Builder<ResponseType> {

        /* renamed from: a */
        private final String f97947a;

        /* renamed from: b */
        private final Method f97948b;

        /* renamed from: c */
        private final Map f97949c = new HashMap();

        /* renamed from: d */
        private final Map f97950d = new HashMap();

        /* renamed from: e */
        private DataRetriever f97951e;

        /* renamed from: f */
        private ResponseProcessor f97952f;

        /* renamed from: g */
        private Listener f97953g;

        public Builder(@NonNull String str, @NonNull Method method) {
            this.f97947a = str;
            this.f97948b = method;
        }

        public Builder<ResponseType> addHeader(@NonNull String str, @NonNull String str2) {
            this.f97949c.put(str, str2);
            return this;
        }

        public Builder<ResponseType> addQueryParameter(@NonNull String str, @NonNull String str2) {
            this.f97950d.put(str, str2);
            return this;
        }

        public NetworkRequest<ResponseType> build() {
            return new NetworkRequest<>(this.f97947a, this.f97948b, this.f97949c, this.f97950d, this.f97951e, this.f97952f, this.f97953g);
        }

        public NetworkRequest<ResponseType> send() {
            NetworkRequest<ResponseType> build = build();
            build.send();
            return build;
        }

        public Builder<ResponseType> setHeaders(@Nullable Map<String, String> map) {
            Utils.set(this.f97949c, map);
            return this;
        }

        public Builder<ResponseType> setListener(@Nullable Listener<ResponseType> listener) {
            this.f97953g = listener;
            return this;
        }

        public Builder<ResponseType> setQueryParameters(@Nullable Map<String, String> map) {
            Utils.set(this.f97950d, map);
            return this;
        }

        public Builder<ResponseType> setRequestDataRetriever(@Nullable DataRetriever dataRetriever) {
            this.f97951e = dataRetriever;
            return this;
        }

        public Builder<ResponseType> setResponseTransformer(@Nullable ResponseProcessor<ResponseType> responseProcessor) {
            this.f97952f = responseProcessor;
            return this;
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class ByteArrayProcessor<T> implements ResponseProcessor<T>, ResponseTransformer<byte[], T> {
        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseProcessor
        @Nullable
        public T process(@NonNull URLConnection uRLConnection) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = uRLConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        Utils.write(inputStream2, byteArrayOutputStream);
                        T transform = transform(byteArrayOutputStream.toByteArray());
                        C10512g.m79300q(byteArrayOutputStream);
                        C10512g.m79304m(byteArrayOutputStream);
                        C10512g.m79304m(inputStream2);
                        return transform;
                    } catch (Throwable th) {
                        inputStream = inputStream2;
                        th = th;
                        C10512g.m79300q(byteArrayOutputStream);
                        C10512g.m79304m(byteArrayOutputStream);
                        C10512g.m79304m(inputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    inputStream = inputStream2;
                    th = th2;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        @Nullable
        public abstract /* synthetic */ Object transform(@NonNull Object obj);
    }

    /* loaded from: classes9.dex */
    public interface DataRetriever {
        @Nullable
        @WorkerThread
        byte[] retrieve();
    }

    /* loaded from: classes9.dex */
    public static abstract class FileOutputStreamProcessor<T> implements ResponseProcessor<T>, ResponseTransformer<File, T> {

        /* renamed from: a */
        private final Context f97954a;

        /* renamed from: b */
        private final File f97955b;

        public FileOutputStreamProcessor(@NonNull Context context, @NonNull File file) {
            this.f97954a = context.getApplicationContext();
            this.f97955b = file;
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseProcessor
        @Nullable
        public T process(@NonNull URLConnection uRLConnection) {
            FileOutputStream fileOutputStream;
            File tempFile = FileUtils.getTempFile(this.f97954a);
            if (tempFile != null) {
                long contentLength = uRLConnection.getContentLength();
                InputStream inputStream = null;
                try {
                    InputStream inputStream2 = uRLConnection.getInputStream();
                    try {
                        fileOutputStream = new FileOutputStream(tempFile);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = null;
                    }
                    try {
                        long write = Utils.write(inputStream2, fileOutputStream);
                        C10512g.m79300q(fileOutputStream);
                        C10512g.m79304m(fileOutputStream);
                        C10512g.m79304m(inputStream2);
                        if (contentLength == write) {
                            if (tempFile.renameTo(this.f97955b)) {
                                return transform(this.f97955b);
                            }
                            FileUtils.deleteFile(tempFile);
                            throw new IllegalStateException("Can't rename temp file");
                        }
                        FileUtils.deleteFile(tempFile);
                        throw new IllegalStateException("The downloaded file size does not match the stated size");
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        C10512g.m79300q(fileOutputStream);
                        C10512g.m79304m(fileOutputStream);
                        C10512g.m79304m(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } else {
                throw new IllegalStateException("Can't create temp file");
            }
        }

        @Nullable
        public abstract /* synthetic */ Object transform(@NonNull Object obj);
    }

    /* loaded from: classes9.dex */
    public interface Listener<ResponseType> {
        void onError(@NonNull Error error);

        void onSuccess(@Nullable ResponseType responsetype);
    }

    /* loaded from: classes9.dex */
    public enum Method {
        Get("GET"),
        Post("POST");
        

        /* renamed from: a */
        private final String f97957a;

        Method(String str) {
            this.f97957a = str;
        }

        public String getNetworkName() {
            return this.f97957a;
        }
    }

    /* loaded from: classes9.dex */
    public interface ResponseProcessor<ResponseType> {
        @Nullable
        ResponseType process(@NonNull URLConnection uRLConnection);
    }

    /* loaded from: classes9.dex */
    public interface ResponseTransformer<From, To> {
        @Nullable
        To transform(@NonNull From from);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.rendering.utils.NetworkRequest$b */
    /* loaded from: classes9.dex */
    public class C37086b extends CancelableTask {
        private C37086b() {
        }

        @Override // io.bidmachine.rendering.utils.taskmanager.CancelableTask
        public void runTask() {
            NetworkRequest.this.m19036a();
        }
    }

    public NetworkRequest(@NonNull String str, @NonNull Method method, @NonNull Map<String, String> map, @NonNull Map<String, String> map2, @Nullable DataRetriever dataRetriever, @Nullable ResponseProcessor<ResponseType> responseProcessor, @Nullable Listener<ResponseType> listener) {
        this.f97939a = str;
        this.f97940b = method;
        this.f97944f = responseProcessor;
        this.f97941c = map;
        this.f97942d = map2;
        this.f97943e = dataRetriever;
        this.f97945g = listener;
    }

    public void cancel() {
        CancelableTask cancelableTask = this.f97946h;
        if (cancelableTask != null) {
            f97938i.cancel(cancelableTask);
        }
    }

    public void send() {
        cancel();
        C37086b c37086b = new C37086b();
        this.f97946h = c37086b;
        f97938i.execute(c37086b);
    }

    /* renamed from: a */
    private String m19031a(String str, Map map) {
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    /* renamed from: a */
    private void m19030a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m19035a(Error error) {
        Listener listener = this.f97945g;
        if (listener != null) {
            listener.onError(error);
        }
    }

    /* renamed from: a */
    private void m19033a(Object obj) {
        Listener listener = this.f97945g;
        if (listener != null) {
            listener.onSuccess(obj);
        }
    }

    /* renamed from: a */
    private HttpURLConnection m19032a(String str) {
        HttpURLConnection httpURLConnection;
        byte[] retrieve;
        URL url = new URL(str);
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod(this.f97940b.getNetworkName());
            for (Map.Entry entry : this.f97941c.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            DataRetriever dataRetriever = this.f97943e;
            if (dataRetriever != null && (retrieve = dataRetriever.retrieve()) != null) {
                m19029a(httpURLConnection, retrieve);
            }
            switch (httpURLConnection.getResponseCode()) {
                case 301:
                case 302:
                case 303:
                case 305:
                case 307:
                case 308:
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField) && C10512g.m79294w(headerField)) {
                        m19030a(httpURLConnection);
                        return m19032a(headerField);
                    }
                    break;
            }
            return httpURLConnection;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            m19030a(httpURLConnection2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m19036a() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        try {
            httpURLConnection = m19032a(m19031a(this.f97939a, this.f97942d));
        } catch (Throwable th2) {
            httpURLConnection = null;
            th = th2;
        }
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                ResponseProcessor responseProcessor = this.f97944f;
                if (responseProcessor == null) {
                    m19033a((Object) null);
                    return;
                }
                m19033a(responseProcessor.process(httpURLConnection));
            } else if (responseCode == 204) {
                m19033a((Object) null);
            } else {
                m19035a(new Error("Server response code - " + responseCode + " " + httpURLConnection.getResponseMessage()));
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                m19035a(Error.create(th));
            } finally {
                m19030a(httpURLConnection);
            }
        }
    }

    /* renamed from: a */
    private void m19029a(URLConnection uRLConnection, byte[] bArr) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(uRLConnection.getOutputStream());
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedOutputStream.write(bArr);
            C10512g.m79300q(bufferedOutputStream);
            C10512g.m79304m(bufferedOutputStream);
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            C10512g.m79300q(bufferedOutputStream2);
            C10512g.m79304m(bufferedOutputStream2);
            throw th;
        }
    }
}
