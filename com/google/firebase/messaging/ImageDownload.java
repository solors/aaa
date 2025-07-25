package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public class ImageDownload implements Closeable {

    /* renamed from: b */
    private final URL f43218b;
    @Nullable

    /* renamed from: c */
    private volatile Future<?> f43219c;
    @Nullable

    /* renamed from: d */
    private Task<Bitmap> f43220d;

    private ImageDownload(URL url) {
        this.f43218b = url;
    }

    /* renamed from: a */
    public static /* synthetic */ void m66613a(ImageDownload imageDownload, TaskCompletionSource taskCompletionSource) {
        imageDownload.m66611e(taskCompletionSource);
    }

    /* renamed from: b */
    private byte[] m66612b() throws IOException {
        URLConnection openConnection = this.f43218b.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] byteArray = ByteStreams.toByteArray(ByteStreams.limit(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable(Constants.TAG, 2)) {
                    Log.v(Constants.TAG, "Downloaded " + byteArray.length + " bytes from " + this.f43218b);
                }
                if (byteArray.length <= 1048576) {
                    return byteArray;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @Nullable
    public static ImageDownload create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w(Constants.TAG, "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* renamed from: e */
    public /* synthetic */ void m66611e(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingDownload());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public Bitmap blockingDownload() throws IOException {
        if (Log.isLoggable(Constants.TAG, 4)) {
            Log.i(Constants.TAG, "Starting download of: " + this.f43218b);
        }
        byte[] m66612b = m66612b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m66612b, 0, m66612b.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Successfully downloaded image: " + this.f43218b);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f43218b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43219c.cancel(true);
    }

    public Task<Bitmap> getTask() {
        return (Task) Preconditions.checkNotNull(this.f43220d);
    }

    public void start(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f43219c = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                ImageDownload.m66613a(ImageDownload.this, taskCompletionSource);
            }
        });
        this.f43220d = taskCompletionSource.getTask();
    }
}
