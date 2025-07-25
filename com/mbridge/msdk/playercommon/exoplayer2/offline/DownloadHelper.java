package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class DownloadHelper {

    /* loaded from: classes6.dex */
    public interface Callback {
        void onPrepareError(DownloadHelper downloadHelper, IOException iOException);

        void onPrepared(DownloadHelper downloadHelper);
    }

    public abstract DownloadAction getDownloadAction(@Nullable byte[] bArr, List<TrackKey> list);

    public abstract int getPeriodCount();

    public abstract DownloadAction getRemoveAction(@Nullable byte[] bArr);

    public abstract TrackGroupArray getTrackGroups(int i);

    public void prepare(final Callback callback) {
        Looper mainLooper;
        if (Looper.myLooper() != null) {
            mainLooper = Looper.myLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        final Handler handler = new Handler(mainLooper);
        new Thread() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    DownloadHelper.this.prepareInternal();
                    handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C226031 c226031 = C226031.this;
                            callback.onPrepared(DownloadHelper.this);
                        }
                    });
                } catch (IOException e) {
                    handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C226031 c226031 = C226031.this;
                            callback.onPrepareError(DownloadHelper.this, e);
                        }
                    });
                }
            }
        }.start();
    }

    protected abstract void prepareInternal() throws IOException;
}
