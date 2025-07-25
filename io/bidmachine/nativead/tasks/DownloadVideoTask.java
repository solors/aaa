package io.bidmachine.nativead.tasks;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Utils;
import java.io.File;

/* loaded from: classes9.dex */
public class DownloadVideoTask implements Runnable {
    private static final String DIR_NAME = "native_video";
    private static final int RESULT_FAIL = 0;
    private static final int RESULT_SUCCESS = 1;
    private static final int SERVER_TIME_OUT = 20000;
    private File cacheDir;
    private final Handler handler = new HandlerC36763a(Looper.getMainLooper());
    private boolean initialized;
    private OnLoadedListener listener;
    private String videoUrl;

    /* loaded from: classes9.dex */
    public interface OnLoadedListener {
        void onVideoLoaded(@NonNull DownloadVideoTask downloadVideoTask, Uri uri);

        void onVideoLoadingError(@NonNull DownloadVideoTask downloadVideoTask);
    }

    /* renamed from: io.bidmachine.nativead.tasks.DownloadVideoTask$a */
    /* loaded from: classes9.dex */
    class HandlerC36763a extends Handler {
        HandlerC36763a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (DownloadVideoTask.this.listener != null) {
                int i = message.what;
                if (i != 0) {
                    if (i == 1) {
                        DownloadVideoTask.this.listener.onVideoLoaded(DownloadVideoTask.this, (Uri) message.obj);
                        return;
                    }
                    return;
                }
                DownloadVideoTask.this.listener.onVideoLoadingError(DownloadVideoTask.this);
            }
        }
    }

    public DownloadVideoTask(@NonNull Context context, @NonNull OnLoadedListener onLoadedListener, @Nullable String str) {
        if (str != null && Utils.canUseExternalFilesDir()) {
            this.listener = onLoadedListener;
            this.videoUrl = str;
            if (Utils.canUseExternalFilesDir()) {
                this.cacheDir = Utils.getCacheDir(context, DIR_NAME);
                this.initialized = true;
                return;
            }
            onLoadedListener.onVideoLoadingError(this);
            return;
        }
        onLoadedListener.onVideoLoadingError(this);
    }

    private void sendFail() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.sendEmptyMessage(0);
        }
    }

    private void sendSuccess(@NonNull File file) {
        Handler handler = this.handler;
        if (handler != null) {
            this.handler.sendMessage(handler.obtainMessage(1, Uri.fromFile(file)));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.initialized) {
            sendFail();
            return;
        }
        File cacheVideoFile = CacheUtils.cacheVideoFile(this.videoUrl, this.cacheDir, 20000);
        if (cacheVideoFile != null) {
            sendSuccess(cacheVideoFile);
        } else {
            sendFail();
        }
    }
}
