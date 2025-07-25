package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.hls.offline.ExecutorC2515a;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final Requirements DEFAULT_REQUIREMENTS = new Requirements(1);

    /* renamed from: a */
    private final Context f33981a;

    /* renamed from: b */
    private final WritableDownloadIndex f33982b;

    /* renamed from: c */
    private final Handler f33983c;

    /* renamed from: d */
    private final InternalHandler f33984d;

    /* renamed from: e */
    private final RequirementsWatcher.Listener f33985e;

    /* renamed from: f */
    private final CopyOnWriteArraySet<Listener> f33986f;

    /* renamed from: g */
    private int f33987g;

    /* renamed from: h */
    private int f33988h;

    /* renamed from: i */
    private boolean f33989i;

    /* renamed from: j */
    private boolean f33990j;

    /* renamed from: k */
    private int f33991k;

    /* renamed from: l */
    private int f33992l;

    /* renamed from: m */
    private int f33993m;

    /* renamed from: n */
    private boolean f33994n;

    /* renamed from: o */
    private List<Download> f33995o;

    /* renamed from: p */
    private RequirementsWatcher f33996p;

    /* loaded from: classes4.dex */
    public static final class DownloadUpdate {
        public final Download download;
        public final List<Download> downloads;
        @Nullable
        public final Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(Download download, boolean z, List<Download> list, @Nullable Exception exc) {
            this.download = download;
            this.isRemove = z;
            this.downloads = list;
            this.finalException = exc;
        }
    }

    /* loaded from: classes4.dex */
    public static final class InternalHandler extends Handler {

        /* renamed from: a */
        private final HandlerThread f33997a;

        /* renamed from: b */
        private final WritableDownloadIndex f33998b;

        /* renamed from: c */
        private final DownloaderFactory f33999c;

        /* renamed from: d */
        private final Handler f34000d;

        /* renamed from: e */
        private final ArrayList<Download> f34001e;

        /* renamed from: f */
        private final HashMap<String, Task> f34002f;

        /* renamed from: g */
        private int f34003g;

        /* renamed from: h */
        private boolean f34004h;

        /* renamed from: i */
        private int f34005i;

        /* renamed from: j */
        private int f34006j;

        /* renamed from: k */
        private int f34007k;

        /* renamed from: l */
        private boolean f34008l;
        public boolean released;

        public InternalHandler(HandlerThread handlerThread, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory, Handler handler, int i, int i2, boolean z) {
            super(handlerThread.getLooper());
            this.f33997a = handlerThread;
            this.f33998b = writableDownloadIndex;
            this.f33999c = downloaderFactory;
            this.f34000d = handler;
            this.f34005i = i;
            this.f34006j = i2;
            this.f34004h = z;
            this.f34001e = new ArrayList<>();
            this.f34002f = new HashMap<>();
        }

        /* renamed from: A */
        private void m73988A(@Nullable Task task) {
            if (task != null) {
                Assertions.checkState(!task.f34012f);
                task.cancel(false);
            }
        }

        /* renamed from: B */
        private void m73987B() {
            int i = 0;
            for (int i2 = 0; i2 < this.f34001e.size(); i2++) {
                Download download = this.f34001e.get(i2);
                Task task = this.f34002f.get(download.request.f34018id);
                int i3 = download.state;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 5 && i3 != 7) {
                                throw new IllegalStateException();
                            }
                            m73960z(task, download);
                        } else {
                            Assertions.checkNotNull(task);
                            m73962x(task, download, i);
                        }
                    } else {
                        m73988A(task);
                    }
                } else {
                    task = m73961y(task, download);
                }
                if (task != null && !task.f34012f) {
                    i++;
                }
            }
        }

        /* renamed from: C */
        private void m73986C() {
            for (int i = 0; i < this.f34001e.size(); i++) {
                Download download = this.f34001e.get(i);
                if (download.state == 2) {
                    try {
                        this.f33998b.putDownload(download);
                    } catch (IOException e) {
                        Log.m72605e("DownloadManager", "Failed to update index.", e);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        /* renamed from: b */
        private void m73984b(DownloadRequest downloadRequest, int i) {
            int i2 = 1;
            Download m73980f = m73980f(downloadRequest.f34018id, true);
            long currentTimeMillis = System.currentTimeMillis();
            if (m73980f != null) {
                m73973m(DownloadManager.m73996d(m73980f, downloadRequest, i, currentTimeMillis));
            } else {
                if (i == 0) {
                    i2 = 0;
                }
                m73973m(new Download(downloadRequest, i2, currentTimeMillis, currentTimeMillis, -1L, i, 0));
            }
            m73987B();
        }

        /* renamed from: c */
        private boolean m73983c() {
            if (!this.f34004h && this.f34003g == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public static int m73982d(Download download, Download download2) {
            return Util.compareLong(download.startTimeMs, download2.startTimeMs);
        }

        /* renamed from: e */
        private static Download m73981e(Download download, int i, int i2) {
            return new Download(download.request, i, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i2, 0, download.f33958a);
        }

        @Nullable
        /* renamed from: f */
        private Download m73980f(String str, boolean z) {
            int m73979g = m73979g(str);
            if (m73979g != -1) {
                return this.f34001e.get(m73979g);
            }
            if (z) {
                try {
                    return this.f33998b.getDownload(str);
                } catch (IOException e) {
                    Log.m72605e("DownloadManager", "Failed to load download: " + str, e);
                    return null;
                }
            }
            return null;
        }

        /* renamed from: g */
        private int m73979g(String str) {
            for (int i = 0; i < this.f34001e.size(); i++) {
                if (this.f34001e.get(i).request.f34018id.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: h */
        private void m73978h(int i) {
            this.f34003g = i;
            DownloadCursor downloadCursor = null;
            try {
                try {
                    this.f33998b.setDownloadingStatesToQueued();
                    downloadCursor = this.f33998b.getDownloads(0, 1, 2, 5, 7);
                    while (downloadCursor.moveToNext()) {
                        this.f34001e.add(downloadCursor.getDownload());
                    }
                } catch (IOException e) {
                    Log.m72605e("DownloadManager", "Failed to load index.", e);
                    this.f34001e.clear();
                }
                Util.closeQuietly(downloadCursor);
                this.f34000d.obtainMessage(0, new ArrayList(this.f34001e)).sendToTarget();
                m73987B();
            } catch (Throwable th) {
                Util.closeQuietly(downloadCursor);
                throw th;
            }
        }

        /* renamed from: i */
        private void m73977i(Task task, long j) {
            Download download = (Download) Assertions.checkNotNull(m73980f(task.f34009b.f34018id, false));
            if (j != download.contentLength && j != -1) {
                m73973m(new Download(download.request, download.state, download.startTimeMs, System.currentTimeMillis(), j, download.stopReason, download.failureReason, download.f33958a));
            }
        }

        /* renamed from: j */
        private void m73976j(Download download, @Nullable Exception exc) {
            int i;
            int i2;
            DownloadRequest downloadRequest = download.request;
            if (exc == null) {
                i = 3;
            } else {
                i = 4;
            }
            int i3 = i;
            long j = download.startTimeMs;
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = download.contentLength;
            int i4 = download.stopReason;
            if (exc == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            Download download2 = new Download(downloadRequest, i3, j, currentTimeMillis, j2, i4, i2, download.f33958a);
            this.f34001e.remove(m73979g(download2.request.f34018id));
            try {
                this.f33998b.putDownload(download2);
            } catch (IOException e) {
                Log.m72605e("DownloadManager", "Failed to update index.", e);
            }
            this.f34000d.obtainMessage(2, new DownloadUpdate(download2, false, new ArrayList(this.f34001e), exc)).sendToTarget();
        }

        /* renamed from: k */
        private void m73975k(Download download) {
            int i = 1;
            if (download.state == 7) {
                int i2 = download.stopReason;
                if (i2 == 0) {
                    i = 0;
                }
                m73972n(download, i, i2);
                m73987B();
                return;
            }
            this.f34001e.remove(m73979g(download.request.f34018id));
            try {
                this.f33998b.removeDownload(download.request.f34018id);
            } catch (IOException unused) {
                Log.m72606e("DownloadManager", "Failed to remove from database");
            }
            this.f34000d.obtainMessage(2, new DownloadUpdate(download, true, new ArrayList(this.f34001e), null)).sendToTarget();
        }

        /* renamed from: l */
        private void m73974l(Task task) {
            String str = task.f34009b.f34018id;
            this.f34002f.remove(str);
            boolean z = task.f34012f;
            if (z) {
                this.f34008l = false;
            } else {
                int i = this.f34007k - 1;
                this.f34007k = i;
                if (i == 0) {
                    removeMessages(11);
                }
            }
            if (!task.f34015i) {
                Exception exc = task.f34016j;
                if (exc != null) {
                    Log.m72605e("DownloadManager", "Task failed: " + task.f34009b + ", " + z, exc);
                }
                Download download = (Download) Assertions.checkNotNull(m73980f(str, false));
                int i2 = download.state;
                if (i2 != 2) {
                    if (i2 != 5 && i2 != 7) {
                        throw new IllegalStateException();
                    }
                    Assertions.checkState(z);
                    m73975k(download);
                } else {
                    Assertions.checkState(!z);
                    m73976j(download, exc);
                }
                m73987B();
                return;
            }
            m73987B();
        }

        /* renamed from: m */
        private Download m73973m(Download download) {
            boolean z;
            int i = download.state;
            boolean z2 = true;
            if (i != 3 && i != 4) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkState(z);
            int m73979g = m73979g(download.request.f34018id);
            if (m73979g == -1) {
                this.f34001e.add(download);
                Collections.sort(this.f34001e, new C15971k());
            } else {
                if (download.startTimeMs == this.f34001e.get(m73979g).startTimeMs) {
                    z2 = false;
                }
                this.f34001e.set(m73979g, download);
                if (z2) {
                    Collections.sort(this.f34001e, new C15971k());
                }
            }
            try {
                this.f33998b.putDownload(download);
            } catch (IOException e) {
                Log.m72605e("DownloadManager", "Failed to update index.", e);
            }
            this.f34000d.obtainMessage(2, new DownloadUpdate(download, false, new ArrayList(this.f34001e), null)).sendToTarget();
            return download;
        }

        /* renamed from: n */
        private Download m73972n(Download download, int i, int i2) {
            boolean z;
            if (i != 3 && i != 4) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkState(z);
            return m73973m(m73981e(download, i, i2));
        }

        /* renamed from: o */
        private void m73971o() {
            for (Task task : this.f34002f.values()) {
                task.cancel(true);
            }
            try {
                this.f33998b.setDownloadingStatesToQueued();
            } catch (IOException e) {
                Log.m72605e("DownloadManager", "Failed to update index.", e);
            }
            this.f34001e.clear();
            this.f33997a.quit();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        }

        /* renamed from: p */
        private void m73970p() {
            ArrayList arrayList = new ArrayList();
            try {
                DownloadCursor downloads = this.f33998b.getDownloads(3, 4);
                while (downloads.moveToNext()) {
                    arrayList.add(downloads.getDownload());
                }
                downloads.close();
            } catch (IOException unused) {
                Log.m72606e("DownloadManager", "Failed to load downloads.");
            }
            for (int i = 0; i < this.f34001e.size(); i++) {
                ArrayList<Download> arrayList2 = this.f34001e;
                arrayList2.set(i, m73981e(arrayList2.get(i), 5, 0));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.f34001e.add(m73981e((Download) arrayList.get(i2), 5, 0));
            }
            Collections.sort(this.f34001e, new C15971k());
            try {
                this.f33998b.setStatesToRemoving();
            } catch (IOException e) {
                Log.m72605e("DownloadManager", "Failed to update index.", e);
            }
            ArrayList arrayList3 = new ArrayList(this.f34001e);
            for (int i3 = 0; i3 < this.f34001e.size(); i3++) {
                this.f34000d.obtainMessage(2, new DownloadUpdate(this.f34001e.get(i3), false, arrayList3, null)).sendToTarget();
            }
            m73987B();
        }

        /* renamed from: q */
        private void m73969q(String str) {
            Download m73980f = m73980f(str, true);
            if (m73980f == null) {
                Log.m72606e("DownloadManager", "Failed to remove nonexistent download: " + str);
                return;
            }
            m73972n(m73980f, 5, 0);
            m73987B();
        }

        /* renamed from: r */
        private void m73968r(boolean z) {
            this.f34004h = z;
            m73987B();
        }

        /* renamed from: s */
        private void m73967s(int i) {
            this.f34005i = i;
            m73987B();
        }

        /* renamed from: t */
        private void m73966t(int i) {
            this.f34006j = i;
        }

        /* renamed from: u */
        private void m73965u(int i) {
            this.f34003g = i;
            m73987B();
        }

        /* renamed from: v */
        private void m73964v(Download download, int i) {
            if (i == 0) {
                if (download.state == 1) {
                    m73972n(download, 0, 0);
                }
            } else if (i != download.stopReason) {
                int i2 = download.state;
                if (i2 == 0 || i2 == 2) {
                    i2 = 1;
                }
                m73973m(new Download(download.request, i2, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i, 0, download.f33958a));
            }
        }

        /* renamed from: w */
        private void m73963w(@Nullable String str, int i) {
            if (str == null) {
                for (int i2 = 0; i2 < this.f34001e.size(); i2++) {
                    m73964v(this.f34001e.get(i2), i);
                }
                try {
                    this.f33998b.setStopReason(i);
                } catch (IOException e) {
                    Log.m72605e("DownloadManager", "Failed to set manual stop reason", e);
                }
            } else {
                Download m73980f = m73980f(str, false);
                if (m73980f != null) {
                    m73964v(m73980f, i);
                } else {
                    try {
                        this.f33998b.setStopReason(str, i);
                    } catch (IOException e2) {
                        Log.m72605e("DownloadManager", "Failed to set manual stop reason: " + str, e2);
                    }
                }
            }
            m73987B();
        }

        /* renamed from: x */
        private void m73962x(Task task, Download download, int i) {
            Assertions.checkState(!task.f34012f);
            if (!m73983c() || i >= this.f34005i) {
                m73972n(download, 0, 0);
                task.cancel(false);
            }
        }

        @Nullable
        @CheckResult
        /* renamed from: y */
        private Task m73961y(@Nullable Task task, Download download) {
            if (task != null) {
                Assertions.checkState(!task.f34012f);
                task.cancel(false);
                return task;
            } else if (m73983c() && this.f34007k < this.f34005i) {
                Download m73972n = m73972n(download, 2, 0);
                Task task2 = new Task(m73972n.request, this.f33999c.createDownloader(m73972n.request), m73972n.f33958a, false, this.f34006j, this);
                this.f34002f.put(m73972n.request.f34018id, task2);
                int i = this.f34007k;
                this.f34007k = i + 1;
                if (i == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                task2.start();
                return task2;
            } else {
                return null;
            }
        }

        /* renamed from: z */
        private void m73960z(@Nullable Task task, Download download) {
            if (task != null) {
                if (!task.f34012f) {
                    task.cancel(false);
                }
            } else if (this.f34008l) {
            } else {
                Task task2 = new Task(download.request, this.f33999c.createDownloader(download.request), download.f33958a, true, this.f34006j, this);
                this.f34002f.put(download.request.f34018id, task2);
                this.f34008l = true;
                task2.start();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = false;
            int i = 0;
            switch (message.what) {
                case 0:
                    m73978h(message.arg1);
                    i = 1;
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    }
                    m73968r(z);
                    i = 1;
                    break;
                case 2:
                    m73965u(message.arg1);
                    i = 1;
                    break;
                case 3:
                    m73963w((String) message.obj, message.arg1);
                    i = 1;
                    break;
                case 4:
                    m73967s(message.arg1);
                    i = 1;
                    break;
                case 5:
                    m73966t(message.arg1);
                    i = 1;
                    break;
                case 6:
                    m73984b((DownloadRequest) message.obj, message.arg1);
                    i = 1;
                    break;
                case 7:
                    m73969q((String) message.obj);
                    i = 1;
                    break;
                case 8:
                    m73970p();
                    i = 1;
                    break;
                case 9:
                    m73974l((Task) message.obj);
                    break;
                case 10:
                    m73977i((Task) message.obj, Util.toLong(message.arg1, message.arg2));
                    return;
                case 11:
                    m73986C();
                    return;
                case 12:
                    m73971o();
                    return;
                default:
                    throw new IllegalStateException();
            }
            this.f34000d.obtainMessage(1, i, this.f34002f.size()).sendToTarget();
        }
    }

    /* loaded from: classes4.dex */
    public static class Task extends Thread implements Downloader.ProgressListener {

        /* renamed from: b */
        private final DownloadRequest f34009b;

        /* renamed from: c */
        private final Downloader f34010c;

        /* renamed from: d */
        private final DownloadProgress f34011d;

        /* renamed from: f */
        private final boolean f34012f;

        /* renamed from: g */
        private final int f34013g;
        @Nullable

        /* renamed from: h */
        private volatile InternalHandler f34014h;

        /* renamed from: i */
        private volatile boolean f34015i;
        @Nullable

        /* renamed from: j */
        private Exception f34016j;

        /* renamed from: k */
        private long f34017k;

        /* renamed from: e */
        private static int m73955e(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }

        public void cancel(boolean z) {
            if (z) {
                this.f34014h = null;
            }
            if (!this.f34015i) {
                this.f34015i = true;
                this.f34010c.cancel();
                interrupt();
            }
        }

        @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
        public void onProgress(long j, long j2, float f) {
            this.f34011d.bytesDownloaded = j2;
            this.f34011d.percentDownloaded = f;
            if (j != this.f34017k) {
                this.f34017k = j;
                InternalHandler internalHandler = this.f34014h;
                if (internalHandler != null) {
                    internalHandler.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.f34012f) {
                    this.f34010c.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.f34015i) {
                        try {
                            this.f34010c.download(this);
                            break;
                        } catch (IOException e) {
                            if (!this.f34015i) {
                                long j2 = this.f34011d.bytesDownloaded;
                                if (j2 != j) {
                                    i = 0;
                                    j = j2;
                                }
                                i++;
                                if (i <= this.f34013g) {
                                    Thread.sleep(m73955e(i));
                                } else {
                                    throw e;
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e2) {
                this.f34016j = e2;
            }
            InternalHandler internalHandler = this.f34014h;
            if (internalHandler != null) {
                internalHandler.obtainMessage(9, this).sendToTarget();
            }
        }

        private Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z, int i, InternalHandler internalHandler) {
            this.f34009b = downloadRequest;
            this.f34010c = downloader;
            this.f34011d = downloadProgress;
            this.f34012f = z;
            this.f34013g = i;
            this.f34014h = internalHandler;
            this.f34017k = -1L;
        }
    }

    @Deprecated
    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory) {
        this(context, databaseProvider, cache, factory, new ExecutorC2515a());
    }

    /* renamed from: c */
    public boolean m73997c(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    m73994f((DownloadUpdate) message.obj);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                m73992h(message.arg1, message.arg2);
            }
        } else {
            m73993g((List) message.obj);
        }
        return true;
    }

    /* renamed from: d */
    static Download m73996d(Download download, DownloadRequest downloadRequest, int i, long j) {
        long j2;
        int i2;
        int i3;
        int i4 = download.state;
        if (i4 != 5 && !download.isTerminalState()) {
            j2 = download.startTimeMs;
        } else {
            j2 = j;
        }
        if (i4 != 5 && i4 != 7) {
            if (i != 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            i2 = i3;
        } else {
            i2 = 7;
        }
        return new Download(download.request.copyWithMergedRequest(downloadRequest), i2, j2, j, -1L, i, 0);
    }

    /* renamed from: e */
    private void m73995e() {
        Iterator<Listener> it = this.f33986f.iterator();
        while (it.hasNext()) {
            it.next().onWaitingForRequirementsChanged(this, this.f33994n);
        }
    }

    /* renamed from: f */
    private void m73994f(DownloadUpdate downloadUpdate) {
        this.f33995o = Collections.unmodifiableList(downloadUpdate.downloads);
        Download download = downloadUpdate.download;
        boolean m73989k = m73989k();
        if (downloadUpdate.isRemove) {
            Iterator<Listener> it = this.f33986f.iterator();
            while (it.hasNext()) {
                it.next().onDownloadRemoved(this, download);
            }
        } else {
            Iterator<Listener> it2 = this.f33986f.iterator();
            while (it2.hasNext()) {
                it2.next().onDownloadChanged(this, download, downloadUpdate.finalException);
            }
        }
        if (m73989k) {
            m73995e();
        }
    }

    /* renamed from: g */
    private void m73993g(List<Download> list) {
        this.f33989i = true;
        this.f33995o = Collections.unmodifiableList(list);
        boolean m73989k = m73989k();
        Iterator<Listener> it = this.f33986f.iterator();
        while (it.hasNext()) {
            it.next().onInitialized(this);
        }
        if (m73989k) {
            m73995e();
        }
    }

    /* renamed from: h */
    private void m73992h(int i, int i2) {
        this.f33987g -= i;
        this.f33988h = i2;
        if (isIdle()) {
            Iterator<Listener> it = this.f33986f.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    /* renamed from: i */
    public void m73991i(RequirementsWatcher requirementsWatcher, int i) {
        Requirements requirements = requirementsWatcher.getRequirements();
        if (this.f33993m != i) {
            this.f33993m = i;
            this.f33987g++;
            this.f33984d.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean m73989k = m73989k();
        Iterator<Listener> it = this.f33986f.iterator();
        while (it.hasNext()) {
            it.next().onRequirementsStateChanged(this, requirements, i);
        }
        if (m73989k) {
            m73995e();
        }
    }

    /* renamed from: j */
    private void m73990j(boolean z) {
        if (this.f33990j == z) {
            return;
        }
        this.f33990j = z;
        this.f33987g++;
        this.f33984d.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
        boolean m73989k = m73989k();
        Iterator<Listener> it = this.f33986f.iterator();
        while (it.hasNext()) {
            it.next().onDownloadsPausedChanged(this, z);
        }
        if (m73989k) {
            m73995e();
        }
    }

    /* renamed from: k */
    private boolean m73989k() {
        boolean z;
        boolean z2 = true;
        if (!this.f33990j && this.f33993m != 0) {
            for (int i = 0; i < this.f33995o.size(); i++) {
                if (this.f33995o.get(i).state == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (this.f33994n == z) {
            z2 = false;
        }
        this.f33994n = z;
        return z2;
    }

    public void addDownload(DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public void addListener(Listener listener) {
        Assertions.checkNotNull(listener);
        this.f33986f.add(listener);
    }

    public Looper getApplicationLooper() {
        return this.f33983c.getLooper();
    }

    public List<Download> getCurrentDownloads() {
        return this.f33995o;
    }

    public DownloadIndex getDownloadIndex() {
        return this.f33982b;
    }

    public boolean getDownloadsPaused() {
        return this.f33990j;
    }

    public int getMaxParallelDownloads() {
        return this.f33991k;
    }

    public int getMinRetryCount() {
        return this.f33992l;
    }

    public int getNotMetRequirements() {
        return this.f33993m;
    }

    public Requirements getRequirements() {
        return this.f33996p.getRequirements();
    }

    public boolean isIdle() {
        if (this.f33988h == 0 && this.f33987g == 0) {
            return true;
        }
        return false;
    }

    public boolean isInitialized() {
        return this.f33989i;
    }

    public boolean isWaitingForRequirements() {
        return this.f33994n;
    }

    public void pauseDownloads() {
        m73990j(true);
    }

    public void release() {
        synchronized (this.f33984d) {
            InternalHandler internalHandler = this.f33984d;
            if (internalHandler.released) {
                return;
            }
            internalHandler.sendEmptyMessage(12);
            boolean z = false;
            while (true) {
                InternalHandler internalHandler2 = this.f33984d;
                if (internalHandler2.released) {
                    break;
                }
                try {
                    internalHandler2.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            this.f33983c.removeCallbacksAndMessages(null);
            this.f33996p.stop();
            this.f33995o = Collections.emptyList();
            this.f33987g = 0;
            this.f33988h = 0;
            this.f33989i = false;
            this.f33993m = 0;
            this.f33994n = false;
        }
    }

    public void removeAllDownloads() {
        this.f33987g++;
        this.f33984d.obtainMessage(8).sendToTarget();
    }

    public void removeDownload(String str) {
        this.f33987g++;
        this.f33984d.obtainMessage(7, str).sendToTarget();
    }

    public void removeListener(Listener listener) {
        this.f33986f.remove(listener);
    }

    public void resumeDownloads() {
        m73990j(false);
    }

    public void setMaxParallelDownloads(@IntRange(from = 1) int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (this.f33991k == i) {
            return;
        }
        this.f33991k = i;
        this.f33987g++;
        this.f33984d.obtainMessage(4, i, 0).sendToTarget();
    }

    public void setMinRetryCount(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (this.f33992l == i) {
            return;
        }
        this.f33992l = i;
        this.f33987g++;
        this.f33984d.obtainMessage(5, i, 0).sendToTarget();
    }

    public void setRequirements(Requirements requirements) {
        if (requirements.equals(this.f33996p.getRequirements())) {
            return;
        }
        this.f33996p.stop();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.f33981a, this.f33985e, requirements);
        this.f33996p = requirementsWatcher;
        m73991i(this.f33996p, requirementsWatcher.start());
    }

    public void setStopReason(@Nullable String str, int i) {
        this.f33987g++;
        this.f33984d.obtainMessage(3, i, 0, str).sendToTarget();
    }

    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory, Executor executor) {
        this(context, new DefaultDownloadIndex(databaseProvider), new DefaultDownloaderFactory(new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(factory), executor));
    }

    public void addDownload(DownloadRequest downloadRequest, int i) {
        this.f33987g++;
        this.f33984d.obtainMessage(6, i, 0, downloadRequest).sendToTarget();
    }

    public DownloadManager(Context context, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory) {
        this.f33981a = context.getApplicationContext();
        this.f33982b = writableDownloadIndex;
        this.f33991k = 3;
        this.f33992l = 5;
        this.f33990j = true;
        this.f33995o = Collections.emptyList();
        this.f33986f = new CopyOnWriteArraySet<>();
        Handler createHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.i
            {
                DownloadManager.this = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m73997c;
                m73997c = DownloadManager.this.m73997c(message);
                return m73997c;
            }
        });
        this.f33983c = createHandlerForCurrentOrMainLooper;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        InternalHandler internalHandler = new InternalHandler(handlerThread, writableDownloadIndex, downloaderFactory, createHandlerForCurrentOrMainLooper, this.f33991k, this.f33992l, this.f33990j);
        this.f33984d = internalHandler;
        RequirementsWatcher.Listener listener = new RequirementsWatcher.Listener() { // from class: com.google.android.exoplayer2.offline.j
            {
                DownloadManager.this = this;
            }

            @Override // com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener
            public final void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
                DownloadManager.this.m73991i(requirementsWatcher, i);
            }
        };
        this.f33985e = listener;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, listener, DEFAULT_REQUIREMENTS);
        this.f33996p = requirementsWatcher;
        int start = requirementsWatcher.start();
        this.f33993m = start;
        this.f33987g = 1;
        internalHandler.obtainMessage(0, start, 0).sendToTarget();
    }

    /* loaded from: classes4.dex */
    public interface Listener {
        default void onIdle(DownloadManager downloadManager) {
        }

        default void onInitialized(DownloadManager downloadManager) {
        }

        default void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        }

        default void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z) {
        }

        default void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z) {
        }

        default void onDownloadChanged(DownloadManager downloadManager, Download download, @Nullable Exception exc) {
        }

        default void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i) {
        }
    }
}
