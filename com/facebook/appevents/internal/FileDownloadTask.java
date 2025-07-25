package com.facebook.appevents.internal;

import android.os.AsyncTask;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileDownloadTask.kt */
@Metadata
/* loaded from: classes2.dex */
public final class FileDownloadTask extends AsyncTask<String, Void, Boolean> {
    @NotNull
    private final File destFile;
    @NotNull
    private final Callback onSuccess;
    @NotNull
    private final String uriStr;

    /* compiled from: FileDownloadTask.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public interface Callback {
        void onComplete(@NotNull File file);
    }

    public FileDownloadTask(@NotNull String uriStr, @NotNull File destFile, @NotNull Callback onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.uriStr = uriStr;
        this.destFile = destFile;
        this.onSuccess = onSuccess;
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return doInBackground2(strArr);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            onPostExecute(bool.booleanValue());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @VisibleForTesting(otherwise = 4)
    @NotNull
    /* renamed from: doInBackground  reason: avoid collision after fix types in other method */
    public Boolean doInBackground2(@NotNull String... args) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                URL url = new URL(this.uriStr);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.destFile));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    protected void onPostExecute(boolean z) {
        if (!CrashShieldHandler.isObjectCrashing(this) && z) {
            try {
                this.onSuccess.onComplete(this.destFile);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
