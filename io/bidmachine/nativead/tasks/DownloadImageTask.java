package io.bidmachine.nativead.tasks;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.nativead.utils.ImageHelper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes9.dex */
public class DownloadImageTask implements Runnable {
    private static final String DIR_NAME = "native_cache_image";
    private static final int RESULT_FAIL = 0;
    private static final int RESULT_IMAGE_SUCCESS = 2;
    private static final int RESULT_PATH_SUCCESS = 1;
    private static final int SERVER_TIME_OUT = 20000;
    private File cacheDir;
    private boolean checkAspectRatio;
    private Context context;
    private final Handler handler = new HandlerC36761a(Looper.getMainLooper());
    @Nullable
    private OnCacheImageListener listener;
    private String url;

    /* loaded from: classes9.dex */
    public class Builder {
        public Builder(@NonNull Context context, @NonNull String str) {
            DownloadImageTask.this.context = context;
            DownloadImageTask.this.url = str;
        }

        public DownloadImageTask build() {
            try {
                DownloadImageTask downloadImageTask = DownloadImageTask.this;
                if (downloadImageTask.context == null) {
                    if (DownloadImageTask.this.listener != null) {
                        DownloadImageTask.this.listener.onFail(DownloadImageTask.this);
                    }
                } else if (Utils.canUseExternalFilesDir()) {
                    DownloadImageTask downloadImageTask2 = DownloadImageTask.this;
                    downloadImageTask2.cacheDir = Utils.getCacheDir(downloadImageTask2.context, DownloadImageTask.DIR_NAME);
                }
                return downloadImageTask;
            } catch (Throwable th) {
                if (DownloadImageTask.this.context == null) {
                    if (DownloadImageTask.this.listener != null) {
                        DownloadImageTask.this.listener.onFail(DownloadImageTask.this);
                    }
                } else if (Utils.canUseExternalFilesDir()) {
                    DownloadImageTask downloadImageTask3 = DownloadImageTask.this;
                    downloadImageTask3.cacheDir = Utils.getCacheDir(downloadImageTask3.context, DownloadImageTask.DIR_NAME);
                }
                throw th;
            }
        }

        public Builder setCheckAspectRatio(boolean z) {
            DownloadImageTask.this.checkAspectRatio = z;
            return this;
        }

        public Builder setOnCacheImageListener(@Nullable OnCacheImageListener onCacheImageListener) {
            DownloadImageTask.this.listener = onCacheImageListener;
            return this;
        }
    }

    /* loaded from: classes9.dex */
    public interface OnCacheImageListener {
        void onFail(@NonNull DownloadImageTask downloadImageTask);

        void onImageSuccess(@NonNull DownloadImageTask downloadImageTask, Bitmap bitmap);

        void onPathSuccess(@NonNull DownloadImageTask downloadImageTask, Uri uri);
    }

    /* renamed from: io.bidmachine.nativead.tasks.DownloadImageTask$a */
    /* loaded from: classes9.dex */
    class HandlerC36761a extends Handler {
        HandlerC36761a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (DownloadImageTask.this.listener != null) {
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            DownloadImageTask.this.listener.onImageSuccess(DownloadImageTask.this, (Bitmap) message.obj);
                            return;
                        }
                        return;
                    }
                    DownloadImageTask.this.listener.onPathSuccess(DownloadImageTask.this, (Uri) message.obj);
                    return;
                }
                DownloadImageTask.this.listener.onFail(DownloadImageTask.this);
            }
        }
    }

    private DownloadImageTask() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0032: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable, java.io.Flushable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [io.bidmachine.nativead.tasks.DownloadImageTask] */
    @Nullable
    private Bitmap convert(byte[] bArr, @NonNull BitmapFactory.Options options) {
        ByteArrayOutputStream byteArrayOutputStream;
        Object obj;
        options.inJustDecodeBounds = false;
        ?? r0 = 0;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            } catch (Exception e) {
                e = e;
                byteArrayOutputStream = null;
            } catch (Throwable th) {
                th = th;
                Utils.flush(r0);
                Utils.close(r0);
                throw th;
            }
            try {
                writeBitmap(bArr, options, byteArrayOutputStream);
                Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                Utils.flush(byteArrayOutputStream);
                Utils.close(byteArrayOutputStream);
                return decodeStream;
            } catch (Exception e2) {
                e = e2;
                Logger.m20086w(e);
                Utils.flush(byteArrayOutputStream);
                Utils.close(byteArrayOutputStream);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            r0 = obj;
            Utils.flush(r0);
            Utils.close(r0);
            throw th;
        }
    }

    private void downloadImage(@NonNull Context context, @NonNull String str) {
        File file;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inJustDecodeBounds = true;
        InputStream inputStream2 = null;
        if (this.cacheDir != null) {
            file = new File(this.cacheDir, Utils.generateFileName(str));
            if (file.exists() && file.length() > 0) {
                BitmapFactory.decodeFile(file.getPath(), options);
                if (isAspectRatioCorrect(options)) {
                    sendPathSuccess(Uri.fromFile(file));
                    return;
                } else {
                    sendFail();
                    return;
                }
            }
        } else {
            file = null;
        }
        try {
            inputStream = ConnectionUtils.getInputStream(str, 20000);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            if (!isAspectRatioCorrect(options)) {
                sendFail();
                Utils.flush(byteArrayOutputStream);
                Utils.close(byteArrayOutputStream);
                Utils.close(inputStream);
                return;
            }
            if (file != null) {
                saveImage(file, byteArray, options);
                sendPathSuccess(Uri.fromFile(file));
            } else {
                int calculateReqWidth = ImageHelper.calculateReqWidth(context);
                options.inSampleSize = ImageHelper.calculateInSamplesSize(options, calculateReqWidth, ImageHelper.calculateReqHeight(calculateReqWidth, this.checkAspectRatio));
                Bitmap convert = convert(byteArray, options);
                if (convert != null) {
                    sendImageSuccess(convert);
                } else {
                    sendFail();
                }
            }
            Utils.flush(byteArrayOutputStream);
            Utils.close(byteArrayOutputStream);
            Utils.close(inputStream);
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            try {
                Logger.m20086w(th);
                sendFail();
            } finally {
                Utils.flush(byteArrayOutputStream);
                Utils.close(byteArrayOutputStream);
                Utils.close(inputStream2);
            }
        }
    }

    private boolean isAspectRatioCorrect(@NonNull BitmapFactory.Options options) {
        if (!this.checkAspectRatio) {
            return true;
        }
        if (options.outWidth / options.outHeight >= 1.5f) {
            return true;
        }
        return false;
    }

    public static Builder newBuilder(@NonNull Context context, @NonNull String str) {
        return new Builder(context, str);
    }

    private void saveImage(@NonNull File file, byte[] bArr, @NonNull BitmapFactory.Options options) {
        options.inJustDecodeBounds = false;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    writeBitmap(bArr, options, fileOutputStream2);
                    Utils.flush(fileOutputStream2);
                    Utils.close(fileOutputStream2);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Logger.m20086w(e);
                    Utils.flush(fileOutputStream);
                    Utils.close(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    Utils.flush(fileOutputStream);
                    Utils.close(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private void sendFail() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.sendEmptyMessage(0);
        }
    }

    private void sendImageSuccess(@NonNull Bitmap bitmap) {
        Handler handler = this.handler;
        if (handler != null) {
            this.handler.sendMessage(handler.obtainMessage(2, bitmap));
        }
    }

    private void sendPathSuccess(@NonNull Uri uri) {
        Handler handler = this.handler;
        if (handler != null) {
            this.handler.sendMessage(handler.obtainMessage(1, uri));
        }
    }

    private void writeBitmap(byte[] bArr, @NonNull BitmapFactory.Options options, @NonNull OutputStream outputStream) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        decodeByteArray.compress(Bitmap.CompressFormat.PNG, 85, outputStream);
        decodeByteArray.recycle();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!TextUtils.isEmpty(this.url) && Utils.isHttpUrl(this.url)) {
            String replace = this.url.replace(" ", "%20");
            this.url = replace;
            downloadImage(this.context, replace);
            return;
        }
        sendFail();
    }
}
