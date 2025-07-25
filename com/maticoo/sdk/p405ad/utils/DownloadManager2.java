package com.maticoo.sdk.p405ad.utils;

import com.maticoo.sdk.utils.ResDownloader;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.maticoo.sdk.ad.utils.DownloadManager2 */
/* loaded from: classes6.dex */
public class DownloadManager2 {
    private static final Queue<String> mActiveTask = new ConcurrentLinkedQueue();
    private static final Map<String, List<OnResDownloaded>> mPendingTask = new HashMap();
    private static final ConcurrentMap<String, Lock> LOCKS = new ConcurrentHashMap();

    /* renamed from: com.maticoo.sdk.ad.utils.DownloadManager2$OnResDownloaded */
    /* loaded from: classes6.dex */
    public interface OnResDownloaded {
        void onCompleted(String str, File file);
    }

    private static void addToPendingTask(String str, OnResDownloaded onResDownloaded) {
        if (onResDownloaded == null) {
            return;
        }
        Map<String, List<OnResDownloaded>> map = mPendingTask;
        synchronized (map) {
            List<OnResDownloaded> list = map.get(str);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str, list);
            }
            list.add(onResDownloaded);
            DeveloperLog.LogD("DownloadManager downloadFile addToPendingTask onResDownloadedList.size()  = " + list.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void callbackPendingTaskFinished(String str, File file) {
        Map<String, List<OnResDownloaded>> map = mPendingTask;
        synchronized (map) {
            List<OnResDownloaded> list = map.get(str);
            if (list != null && !list.isEmpty()) {
                for (OnResDownloaded onResDownloaded : list) {
                    if (onResDownloaded != null) {
                        onResDownloaded.onCompleted(str, file);
                    }
                }
                mPendingTask.remove(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        r5.onCompleted(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void downloadFile(final java.lang.String r4, com.maticoo.sdk.p405ad.utils.DownloadManager2.OnResDownloaded r5) {
        /*
            com.maticoo.sdk.utils.ApplicationUtil r0 = com.maticoo.sdk.utils.ApplicationUtil.getInstance()     // Catch: java.lang.Exception -> L78
            android.app.Application r0 = r0.getApplicationContext()     // Catch: java.lang.Exception -> L78
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L78
            r2 = 0
            if (r1 != 0) goto L72
            if (r0 != 0) goto L12
            goto L72
        L12:
            java.util.List<java.lang.String> r1 = com.maticoo.sdk.p405ad.utils.Cache.IN_USE_URLS     // Catch: java.lang.Exception -> L78
            boolean r1 = r1.contains(r4)     // Catch: java.lang.Exception -> L78
            if (r1 == 0) goto L24
            if (r5 == 0) goto L23
            java.io.File r0 = com.maticoo.sdk.p405ad.utils.Cache.getCacheFile(r0, r4, r2)     // Catch: java.lang.Exception -> L78
            r5.onCompleted(r4, r0)     // Catch: java.lang.Exception -> L78
        L23:
            return
        L24:
            java.util.concurrent.locks.Lock r1 = getLock(r4)     // Catch: java.lang.Exception -> L78
            r1.lock()     // Catch: java.lang.Throwable -> L6d
            boolean r3 = com.maticoo.sdk.p405ad.utils.Cache.existCache(r0, r4)     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L41
            if (r5 == 0) goto L3a
            java.io.File r0 = com.maticoo.sdk.p405ad.utils.Cache.getCacheFile(r0, r4, r2)     // Catch: java.lang.Throwable -> L6d
            r5.onCompleted(r4, r0)     // Catch: java.lang.Throwable -> L6d
        L3a:
            removeLock(r4)     // Catch: java.lang.Throwable -> L6d
            r1.unlock()     // Catch: java.lang.Exception -> L78
            return
        L41:
            r1.unlock()     // Catch: java.lang.Exception -> L78
            addToPendingTask(r4, r5)     // Catch: java.lang.Exception -> L78
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L78
            r5.<init>()     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = "DownloadManager downloadFile addToPendingTask url is  = "
            r5.append(r0)     // Catch: java.lang.Exception -> L78
            r5.append(r4)     // Catch: java.lang.Exception -> L78
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L78
            com.maticoo.sdk.utils.log.DeveloperLog.LogD(r5)     // Catch: java.lang.Exception -> L78
            java.util.Queue<java.lang.String> r5 = com.maticoo.sdk.p405ad.utils.DownloadManager2.mActiveTask     // Catch: java.lang.Exception -> L78
            boolean r0 = r5.contains(r4)     // Catch: java.lang.Exception -> L78
            if (r0 == 0) goto L69
            java.lang.String r5 = "DownloadManager downloadFile mActiveTask.contains(url) "
            com.maticoo.sdk.utils.log.DeveloperLog.LogD(r5)     // Catch: java.lang.Exception -> L78
            return
        L69:
            r5.add(r4)     // Catch: java.lang.Exception -> L78
            goto L87
        L6d:
            r5 = move-exception
            r1.unlock()     // Catch: java.lang.Exception -> L78
            throw r5     // Catch: java.lang.Exception -> L78
        L72:
            if (r5 == 0) goto L77
            r5.onCompleted(r4, r2)     // Catch: java.lang.Exception -> L78
        L77:
            return
        L78:
            r5 = move-exception
            java.lang.String r0 = "DownloadManager2 downloadFile, exception : "
            com.maticoo.sdk.utils.log.DeveloperLog.LogD(r0, r5)
            com.maticoo.sdk.utils.crash.CrashUtil r0 = com.maticoo.sdk.utils.crash.CrashUtil.getSingleton()
            java.lang.String r1 = "DownloadManager2-downloadFile"
            r0.reportSDKException(r5, r1)
        L87:
            com.maticoo.sdk.ad.utils.DownloadManager2$1 r5 = new com.maticoo.sdk.ad.utils.DownloadManager2$1
            r5.<init>()
            com.maticoo.sdk.utils.WorkExecutor.execute(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maticoo.sdk.p405ad.utils.DownloadManager2.downloadFile(java.lang.String, com.maticoo.sdk.ad.utils.DownloadManager2$OnResDownloaded):void");
    }

    public static int getActiveTaskSize() {
        return mActiveTask.size();
    }

    private static Lock getLock(String str) {
        ConcurrentMap<String, Lock> concurrentMap = LOCKS;
        synchronized (concurrentMap) {
            if (concurrentMap.get(str) == null) {
                concurrentMap.put(str, new ReentrantLock());
            }
        }
        return concurrentMap.get(str);
    }

    public static int getLocksSize() {
        return LOCKS.size();
    }

    public static int getPendingTaskSize() {
        return mPendingTask.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void removeLock(String str) {
        LOCKS.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File downloadFile(String str) throws Exception {
        Lock lock = getLock(str);
        try {
            lock.lock();
            return ResDownloader.downloadFile(str);
        } finally {
            lock.unlock();
        }
    }
}
