package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes4.dex */
class FileBackedNativeSessionFile implements NativeSessionFile {
    @NonNull

    /* renamed from: a */
    private final File f42401a;
    @NonNull

    /* renamed from: b */
    private final String f42402b;
    @NonNull

    /* renamed from: c */
    private final String f42403c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileBackedNativeSessionFile(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.f42402b = str;
        this.f42403c = str2;
        this.f42401a = file;
    }

    @Nullable
    /* renamed from: a */
    private byte[] m67088a() {
        byte[] bArr = new byte[8192];
        try {
            InputStream stream = getStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (stream == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (stream != null) {
                    stream.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = stream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        stream.close();
                        return byteArray;
                    }
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @Nullable
    public CrashlyticsReport.FilesPayload.File asFilePayload() {
        byte[] m67088a = m67088a();
        if (m67088a != null) {
            return CrashlyticsReport.FilesPayload.File.builder().setContents(m67088a).setFilename(this.f42402b).build();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @NonNull
    public String getReportsEndpointFilename() {
        return this.f42403c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @Nullable
    public InputStream getStream() {
        if (this.f42401a.exists() && this.f42401a.isFile()) {
            try {
                return new FileInputStream(this.f42401a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
