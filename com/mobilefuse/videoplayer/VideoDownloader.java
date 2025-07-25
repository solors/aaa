package com.mobilefuse.videoplayer;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.utils.DiskCacheUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoDownloader.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VideoDownloader {
    private static final int VIDEO_MAX_SIZE = 36700160;
    @NotNull
    public static final VideoDownloader INSTANCE = new VideoDownloader();
    private static final List<WeakReference<VideoDownloaderTask>> activeTasks = new ArrayList();
    private static final Map<String, Set<Listener>> LOADING_LIST = new LinkedHashMap();

    /* compiled from: VideoDownloader.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface Listener {
        void onComplete(@NotNull String str, @NotNull String str2);

        void onError(@NotNull VastError vastError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoDownloader.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class VideoDownloaderTask extends AsyncTask<Unit, Unit, Pair<String, VastError>> {
        private final Listener listener;
        private final String url;
        private final WeakReference<VideoDownloaderTask> weakSelfTask;

        public VideoDownloaderTask(@NotNull String url, @NotNull Listener listener) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.url = url;
            this.listener = listener;
            WeakReference<VideoDownloaderTask> weakReference = new WeakReference<>(this);
            this.weakSelfTask = weakReference;
            VideoDownloader.access$getActiveTasks$p(VideoDownloader.INSTANCE).add(weakReference);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            try {
                VideoDownloader.access$getActiveTasks$p(VideoDownloader.INSTANCE).remove(this.weakSelfTask);
                this.listener.onError(VastError.UNIDENTIFIED);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
            if (r0 == null) goto L29;
         */
        @Override // android.os.AsyncTask
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.util.Pair<java.lang.String, com.mobilefuse.videoplayer.model.VastError> doInBackground(@org.jetbrains.annotations.NotNull kotlin.Unit... r6) {
            /*
                r5 = this;
                java.lang.String r0 = "params"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r6 = 0
                java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L91
                java.lang.String r1 = r5.url     // Catch: java.lang.Throwable -> L91
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L91
                java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L91
                if (r0 == 0) goto L89
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L91
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L86
                r1 = 20000(0x4e20, float:2.8026E-41)
                r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L86
                java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L86
                java.io.InputStream r2 = r0.getInputStream()     // Catch: java.lang.Throwable -> L86
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L86
                int r2 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L84
                com.mobilefuse.videoplayer.model.VastError r3 = com.mobilefuse.videoplayer.model.VastError.UNIDENTIFIED     // Catch: java.lang.Throwable -> L84
                r4 = 200(0xc8, float:2.8E-43)
                if (r2 < r4) goto L6b
                r4 = 300(0x12c, float:4.2E-43)
                if (r2 < r4) goto L37
                goto L6b
            L37:
                int r2 = r0.getContentLength()     // Catch: java.lang.Throwable -> L84
                r4 = 36700160(0x2300000, float:1.2930438E-37)
                if (r2 <= r4) goto L4b
                android.util.Pair r2 = new android.util.Pair     // Catch: java.lang.Throwable -> L84
                r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L84
                com.mobilefuse.videoplayer.utils.DiskCacheUtil.closeStream(r1)
                r0.disconnect()
                return r2
            L4b:
                java.lang.String r2 = r5.url     // Catch: java.lang.Throwable -> L84
                java.lang.String r2 = com.mobilefuse.videoplayer.utils.DiskCacheUtil.cacheFile(r2, r1)     // Catch: java.lang.Throwable -> L84
                if (r2 != 0) goto L5f
                android.util.Pair r2 = new android.util.Pair     // Catch: java.lang.Throwable -> L84
                r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L84
                com.mobilefuse.videoplayer.utils.DiskCacheUtil.closeStream(r1)
                r0.disconnect()
                return r2
            L5f:
                android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> L84
                r3.<init>(r2, r6)     // Catch: java.lang.Throwable -> L84
                com.mobilefuse.videoplayer.utils.DiskCacheUtil.closeStream(r1)
            L67:
                r0.disconnect()
                goto La4
            L6b:
                r4 = 404(0x194, float:5.66E-43)
                if (r2 != r4) goto L72
                com.mobilefuse.videoplayer.model.VastError r3 = com.mobilefuse.videoplayer.model.VastError.MEDIAFILE_NOT_FOUND     // Catch: java.lang.Throwable -> L84
                goto L78
            L72:
                r4 = 408(0x198, float:5.72E-43)
                if (r2 != r4) goto L78
                com.mobilefuse.videoplayer.model.VastError r3 = com.mobilefuse.videoplayer.model.VastError.MEDIAFILE_TIMEOUT     // Catch: java.lang.Throwable -> L84
            L78:
                android.util.Pair r2 = new android.util.Pair     // Catch: java.lang.Throwable -> L84
                r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L84
                com.mobilefuse.videoplayer.utils.DiskCacheUtil.closeStream(r1)
                r0.disconnect()
                return r2
            L84:
                r2 = move-exception
                goto L94
            L86:
                r2 = move-exception
                r1 = r6
                goto L94
            L89:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L91
                java.lang.String r1 = "null cannot be cast to non-null type java.net.HttpURLConnection"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L91
                throw r0     // Catch: java.lang.Throwable -> L91
            L91:
                r2 = move-exception
                r0 = r6
                r1 = r0
            L94:
                r2.printStackTrace()     // Catch: java.lang.Throwable -> La5
                android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> La5
                com.mobilefuse.videoplayer.model.VastError r2 = com.mobilefuse.videoplayer.model.VastError.MEDIAFILE_TIMEOUT     // Catch: java.lang.Throwable -> La5
                r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> La5
                com.mobilefuse.videoplayer.utils.DiskCacheUtil.closeStream(r1)
                if (r0 == 0) goto La4
                goto L67
            La4:
                return r3
            La5:
                r6 = move-exception
                com.mobilefuse.videoplayer.utils.DiskCacheUtil.closeStream(r1)
                if (r0 == 0) goto Lae
                r0.disconnect()
            Lae:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.videoplayer.VideoDownloader.VideoDownloaderTask.doInBackground(kotlin.Unit[]):android.util.Pair");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(@NotNull Pair<String, VastError> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            try {
                if (isCancelled()) {
                    onCancelled();
                    return;
                }
                VideoDownloader videoDownloader = VideoDownloader.INSTANCE;
                VideoDownloader.access$getActiveTasks$p(videoDownloader).remove(this.weakSelfTask);
                VastError vastError = (VastError) result.second;
                String str = (String) result.first;
                Set<Listener> set = (Set) VideoDownloader.access$getLOADING_LIST$p(videoDownloader).get(this.url);
                if (set != null) {
                    for (Listener listener : set) {
                        if (vastError != null) {
                            listener.onError(vastError);
                        } else if (str == null) {
                            listener.onError(VastError.COMPANION_RESOURCE_LOAD_FAILED);
                        } else {
                            listener.onComplete(this.url, str);
                        }
                    }
                }
                VideoDownloader.access$getLOADING_LIST$p(VideoDownloader.INSTANCE).remove(this.url);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private VideoDownloader() {
    }

    public static final /* synthetic */ List access$getActiveTasks$p(VideoDownloader videoDownloader) {
        return activeTasks;
    }

    public static final /* synthetic */ Map access$getLOADING_LIST$p(VideoDownloader videoDownloader) {
        return LOADING_LIST;
    }

    public final void cache(@NotNull Context context, @Nullable String str, @NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            if (str == null) {
                listener.onError(VastError.UNIDENTIFIED);
                return;
            }
            DiskCacheUtil.initialize(context);
            Map<String, Set<Listener>> map = LOADING_LIST;
            if (map.containsKey(str)) {
                Set<Listener> set = map.get(str);
                if (set != null) {
                    set.add(listener);
                    return;
                }
                return;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(listener);
            map.put(str, linkedHashSet);
            new VideoDownloaderTask(str, listener).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Unit[0]);
        } catch (Throwable th) {
            listener.onError(VastError.UNIDENTIFIED);
            th.printStackTrace();
        }
    }
}
