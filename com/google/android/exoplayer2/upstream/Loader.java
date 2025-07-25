package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class Loader implements LoaderErrorThrower {

    /* renamed from: a */
    private final ExecutorService f35854a;
    @Nullable

    /* renamed from: b */
    private LoadTask<? extends Loadable> f35855b;
    @Nullable

    /* renamed from: c */
    private IOException f35856c;
    public static final LoadErrorAction RETRY = createRetryAction(false, -9223372036854775807L);
    public static final LoadErrorAction RETRY_RESET_ERROR_COUNT = createRetryAction(true, -9223372036854775807L);
    public static final LoadErrorAction DONT_RETRY = new LoadErrorAction(2, -9223372036854775807L);
    public static final LoadErrorAction DONT_RETRY_FATAL = new LoadErrorAction(3, -9223372036854775807L);

    /* loaded from: classes4.dex */
    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T t, long j, long j2, boolean z);

        void onLoadCompleted(T t, long j, long j2);

        LoadErrorAction onLoadError(T t, long j, long j2, IOException iOException, int i);
    }

    /* loaded from: classes4.dex */
    public static final class LoadErrorAction {

        /* renamed from: a */
        private final int f35857a;

        /* renamed from: b */
        private final long f35858b;

        public boolean isRetry() {
            int i = this.f35857a;
            if (i == 0 || i == 1) {
                return true;
            }
            return false;
        }

        private LoadErrorAction(int i, long j) {
            this.f35857a = i;
            this.f35858b = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes4.dex */
    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {

        /* renamed from: b */
        private final T f35859b;

        /* renamed from: c */
        private final long f35860c;
        @Nullable

        /* renamed from: d */
        private Callback<T> f35861d;
        public final int defaultMinRetryCount;
        @Nullable

        /* renamed from: f */
        private IOException f35862f;

        /* renamed from: g */
        private int f35863g;
        @Nullable

        /* renamed from: h */
        private Thread f35864h;

        /* renamed from: i */
        private boolean f35865i;

        /* renamed from: j */
        private volatile boolean f35866j;

        public LoadTask(Looper looper, T t, Callback<T> callback, int i, long j) {
            super(looper);
            this.f35859b = t;
            this.f35861d = callback;
            this.defaultMinRetryCount = i;
            this.f35860c = j;
        }

        /* renamed from: a */
        private void m72758a() {
            this.f35862f = null;
            Loader.this.f35854a.execute((Runnable) Assertions.checkNotNull(Loader.this.f35855b));
        }

        /* renamed from: b */
        private void m72757b() {
            Loader.this.f35855b = null;
        }

        /* renamed from: c */
        private long m72756c() {
            return Math.min((this.f35863g - 1) * 1000, 5000);
        }

        public void cancel(boolean z) {
            this.f35866j = z;
            this.f35862f = null;
            if (hasMessages(0)) {
                this.f35865i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f35865i = true;
                    this.f35859b.cancelLoad();
                    Thread thread = this.f35864h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                m72757b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((Callback) Assertions.checkNotNull(this.f35861d)).onLoadCanceled(this.f35859b, elapsedRealtime, elapsedRealtime - this.f35860c, true);
                this.f35861d = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long m72756c;
            if (this.f35866j) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                m72758a();
            } else if (i != 3) {
                m72757b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f35860c;
                Callback callback = (Callback) Assertions.checkNotNull(this.f35861d);
                if (this.f35865i) {
                    callback.onLoadCanceled(this.f35859b, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f35862f = iOException;
                        int i3 = this.f35863g + 1;
                        this.f35863g = i3;
                        LoadErrorAction onLoadError = callback.onLoadError(this.f35859b, elapsedRealtime, j, iOException, i3);
                        if (onLoadError.f35857a == 3) {
                            Loader.this.f35856c = this.f35862f;
                            return;
                        } else if (onLoadError.f35857a != 2) {
                            if (onLoadError.f35857a == 1) {
                                this.f35863g = 1;
                            }
                            if (onLoadError.f35858b != -9223372036854775807L) {
                                m72756c = onLoadError.f35858b;
                            } else {
                                m72756c = m72756c();
                            }
                            start(m72756c);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    callback.onLoadCompleted(this.f35859b, elapsedRealtime, j);
                } catch (RuntimeException e) {
                    Log.m72605e("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.f35856c = new UnexpectedLoaderException(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        public void maybeThrowError(int i) throws IOException {
            IOException iOException = this.f35862f;
            if (iOException != null && this.f35863g > i) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    if (!this.f35865i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f35864h = Thread.currentThread();
                }
                if (z) {
                    TraceUtil.beginSection("load:" + this.f35859b.getClass().getSimpleName());
                    try {
                        this.f35859b.load();
                        TraceUtil.endSection();
                    } catch (Throwable th) {
                        TraceUtil.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f35864h = null;
                    Thread.interrupted();
                }
                if (!this.f35866j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f35866j) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Exception e2) {
                if (!this.f35866j) {
                    Log.m72605e("LoadTask", "Unexpected exception loading stream", e2);
                    obtainMessage(2, new UnexpectedLoaderException(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                if (!this.f35866j) {
                    Log.m72605e("LoadTask", "OutOfMemory error loading stream", e3);
                    obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
                }
            } catch (Error e4) {
                if (!this.f35866j) {
                    Log.m72605e("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            }
        }

        public void start(long j) {
            boolean z;
            if (Loader.this.f35855b == null) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkState(z);
            Loader.this.f35855b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m72758a();
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface Loadable {
        void cancelLoad();

        void load() throws IOException;
    }

    /* loaded from: classes4.dex */
    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ReleaseTask implements Runnable {

        /* renamed from: b */
        private final ReleaseCallback f35868b;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.f35868b = releaseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35868b.onLoaderReleased();
        }
    }

    /* loaded from: classes4.dex */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public Loader(String str) {
        this.f35854a = Util.newSingleThreadExecutor("ExoPlayer:Loader:" + str);
    }

    public static LoadErrorAction createRetryAction(boolean z, long j) {
        return new LoadErrorAction(z ? 1 : 0, j);
    }

    public void cancelLoading() {
        ((LoadTask) Assertions.checkStateNotNull(this.f35855b)).cancel(false);
    }

    public void clearFatalError() {
        this.f35856c = null;
    }

    public boolean hasFatalError() {
        if (this.f35856c != null) {
            return true;
        }
        return false;
    }

    public boolean isLoading() {
        if (this.f35855b != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public <T extends Loadable> long startLoading(T t, Callback<T> callback, int i) {
        this.f35856c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new LoadTask((Looper) Assertions.checkStateNotNull(Looper.myLooper()), t, callback, i, elapsedRealtime).start(0L);
        return elapsedRealtime;
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError(int i) throws IOException {
        IOException iOException = this.f35856c;
        if (iOException == null) {
            LoadTask<? extends Loadable> loadTask = this.f35855b;
            if (loadTask != null) {
                if (i == Integer.MIN_VALUE) {
                    i = loadTask.defaultMinRetryCount;
                }
                loadTask.maybeThrowError(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void release(@Nullable ReleaseCallback releaseCallback) {
        LoadTask<? extends Loadable> loadTask = this.f35855b;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        if (releaseCallback != null) {
            this.f35854a.execute(new ReleaseTask(releaseCallback));
        }
        this.f35854a.shutdown();
    }
}
