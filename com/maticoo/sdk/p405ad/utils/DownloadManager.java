package com.maticoo.sdk.p405ad.utils;

import android.text.TextUtils;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.ResDownloader;
import com.maticoo.sdk.utils.WorkExecutor;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.maticoo.sdk.ad.utils.DownloadManager */
/* loaded from: classes6.dex */
public class DownloadManager {
    private ConcurrentLinkedQueue<String> mActiveTask;
    private ConcurrentMap<String, List<OnResDownloaded>> mPendingTask;

    /* renamed from: com.maticoo.sdk.ad.utils.DownloadManager$DmHolder */
    /* loaded from: classes6.dex */
    private static final class DmHolder {
        private static final DownloadManager INSTANCE = new DownloadManager();

        private DmHolder() {
        }
    }

    /* renamed from: com.maticoo.sdk.ad.utils.DownloadManager$OnResDownloaded */
    /* loaded from: classes6.dex */
    public interface OnResDownloaded {
        void onCompleted(String str, File file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addToPendingTask(String str, OnResDownloaded onResDownloaded) {
        synchronized (DownloadManager.class) {
            List<OnResDownloaded> list = this.mPendingTask.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
            }
            list.add(onResDownloaded);
            DeveloperLog.LogD("DownloadManager downloadFile addToPendingTask onResDownloadedList.size()  = " + list.size());
            this.mPendingTask.put(str, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackPendingTaskFinished(String str, File file) {
        synchronized (DownloadManager.class) {
            List<OnResDownloaded> list = this.mPendingTask.get(str);
            if (list != null && !list.isEmpty()) {
                for (OnResDownloaded onResDownloaded : list) {
                    if (onResDownloaded != null) {
                        onResDownloaded.onCompleted(str, file);
                    }
                }
                this.mPendingTask.remove(str);
            }
        }
    }

    public static DownloadManager getInstance() {
        return DmHolder.INSTANCE;
    }

    public synchronized void downloadFile(final String str, final OnResDownloaded onResDownloaded) {
        if (TextUtils.isEmpty(str)) {
            if (onResDownloaded != null) {
                onResDownloaded.onCompleted(str, null);
            }
        } else if (Cache.existCache(ApplicationUtil.getInstance().getApplicationContext(), str)) {
            if (onResDownloaded != null) {
                onResDownloaded.onCompleted(str, Cache.getCacheFile(ApplicationUtil.getInstance().getApplicationContext(), str, null));
            }
        } else {
            WorkExecutor.execute(new Runnable() { // from class: com.maticoo.sdk.ad.utils.DownloadManager.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        synchronized (DownloadManager.class) {
                            DownloadManager.this.addToPendingTask(str, onResDownloaded);
                            DeveloperLog.LogD("DownloadManager downloadFile addToPendingTask url is  = " + str);
                            if (DownloadManager.this.mActiveTask.contains(str)) {
                                DeveloperLog.LogD("DownloadManager downloadFile mActiveTask.contains(url) ");
                                return;
                            }
                            DownloadManager.this.mActiveTask.add(str);
                            File downloadFile = ResDownloader.downloadFile(str);
                            synchronized (DownloadManager.class) {
                                DownloadManager.this.callbackPendingTaskFinished(str, downloadFile);
                                DownloadManager.this.mActiveTask.remove(str);
                                DeveloperLog.LogD("DownloadManager downloadFile callbackPendingTaskFinished url is  = " + str);
                            }
                        }
                    } catch (Exception e) {
                        DeveloperLog.LogW("DownloadManager downloadFile exception: " + e);
                        synchronized (DownloadManager.class) {
                            DownloadManager.this.callbackPendingTaskFinished(str, null);
                            DownloadManager.this.mActiveTask.remove(str);
                        }
                    }
                }
            });
        }
    }

    public int getActiveTaskSize() {
        return this.mActiveTask.size();
    }

    public int getPendingTaskSize() {
        return this.mPendingTask.size();
    }

    private DownloadManager() {
        this.mActiveTask = new ConcurrentLinkedQueue<>();
        this.mPendingTask = new ConcurrentHashMap();
    }
}
