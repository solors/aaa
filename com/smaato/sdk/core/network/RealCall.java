package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.smaato.sdk.core.network.o */
/* loaded from: classes7.dex */
public class RealCall implements Call, Callable<Response> {

    /* renamed from: b */
    private final HttpClient f71836b;

    /* renamed from: c */
    private final Request f71837c;

    /* renamed from: d */
    private Future<?> f71838d;

    public RealCall(HttpClient httpClient, Request request) {
        this.f71836b = httpClient;
        this.f71837c = request;
    }

    /* renamed from: c */
    private IOException m39423c(Throwable th) {
        while (th != null) {
            if (th instanceof IOException) {
                return (IOException) th;
            }
            th = th.getCause();
        }
        return new IOException(new Throwable("Unknown Error"));
    }

    /* renamed from: d */
    public /* synthetic */ void m39422d(Callback callback) {
        try {
            Response call = call();
            callback.onResponse(this, call);
            if (call != null) {
                call.close();
            }
        } catch (Exception e) {
            callback.onFailure(this, m39423c(e));
        }
    }

    @Override // java.util.concurrent.Callable
    @WorkerThread
    /* renamed from: b */
    public Response call() throws Exception {
        ArrayList arrayList = new ArrayList(this.f71836b.interceptors());
        arrayList.add(HttpCaller.f71830a);
        return RealChain.m39421a().mo39413f(this.f71836b.readTimeoutMillis()).mo39416c(this.f71836b.connectTimeoutMillis()).mo39414e(arrayList).mo39412g(this.f71837c).mo39417b(this).mo39418a().proceed(this.f71837c);
    }

    @Override // com.smaato.sdk.core.network.Call
    public void cancel() {
        synchronized (this) {
            Future<?> future = this.f71838d;
            if (future != null && !future.isCancelled()) {
                this.f71838d.cancel(true);
            }
        }
    }

    @Override // com.smaato.sdk.core.network.Call
    public void enqueue(@NonNull final Callback callback) {
        synchronized (this) {
            if (this.f71838d == null) {
                this.f71838d = this.f71836b.executor().submit(new Runnable() { // from class: com.smaato.sdk.core.network.n
                    {
                        RealCall.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        RealCall.this.m39422d(callback);
                    }
                });
            } else {
                throw new IllegalStateException("Already enqueued");
            }
        }
    }

    @Override // com.smaato.sdk.core.network.Call
    @NonNull
    public Response execute() throws IOException {
        Future<?> submit;
        synchronized (this) {
            if (this.f71838d == null) {
                submit = this.f71836b.executor().submit(this);
                this.f71838d = submit;
            } else {
                throw new IllegalStateException("Already executed");
            }
        }
        try {
            return (Response) submit.get();
        } catch (Exception e) {
            throw m39423c(e);
        }
    }

    @Override // com.smaato.sdk.core.network.Call
    @NonNull
    public Request request() {
        return this.f71837c;
    }
}
