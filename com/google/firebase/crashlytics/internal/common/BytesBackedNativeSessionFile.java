package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes4.dex */
class BytesBackedNativeSessionFile implements NativeSessionFile {
    @Nullable

    /* renamed from: a */
    private final byte[] f42297a;
    @NonNull

    /* renamed from: b */
    private final String f42298b;
    @NonNull

    /* renamed from: c */
    private final String f42299c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BytesBackedNativeSessionFile(@NonNull String str, @NonNull String str2, @Nullable byte[] bArr) {
        this.f42298b = str;
        this.f42299c = str2;
        this.f42297a = bArr;
    }

    @Nullable
    /* renamed from: a */
    private byte[] m67199a() {
        if (m67198b()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f42297a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private boolean m67198b() {
        byte[] bArr = this.f42297a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @Nullable
    public CrashlyticsReport.FilesPayload.File asFilePayload() {
        byte[] m67199a = m67199a();
        if (m67199a == null) {
            return null;
        }
        return CrashlyticsReport.FilesPayload.File.builder().setContents(m67199a).setFilename(this.f42298b).build();
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @NonNull
    public String getReportsEndpointFilename() {
        return this.f42299c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @Nullable
    public InputStream getStream() {
        if (m67198b()) {
            return null;
        }
        return new ByteArrayInputStream(this.f42297a);
    }
}
