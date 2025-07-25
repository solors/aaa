package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class DownloadAction {
    public final byte[] data;
    public final boolean isRemoveAction;
    public final String type;
    public final Uri uri;
    public final int version;

    /* loaded from: classes6.dex */
    public static abstract class Deserializer {
        public final String type;
        public final int version;

        public Deserializer(String str, int i) {
            this.type = str;
            this.version = i;
        }

        public abstract DownloadAction readFromStream(int i, DataInputStream dataInputStream) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DownloadAction(String str, int i, Uri uri, boolean z, @Nullable byte[] bArr) {
        this.type = str;
        this.version = i;
        this.uri = uri;
        this.isRemoveAction = z;
        this.data = bArr == null ? new byte[0] : bArr;
    }

    public static DownloadAction deserializeFromStream(Deserializer[] deserializerArr, InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String readUTF = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        for (Deserializer deserializer : deserializerArr) {
            if (readUTF.equals(deserializer.type) && deserializer.version >= readInt) {
                return deserializer.readFromStream(readInt, dataInputStream);
            }
        }
        throw new DownloadException("No deserializer found for:" + readUTF + ", " + readInt);
    }

    public static void serializeToStream(DownloadAction downloadAction, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.type);
        dataOutputStream.writeInt(downloadAction.version);
        downloadAction.writeToStream(dataOutputStream);
        dataOutputStream.flush();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Downloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper);

    public boolean equals(@Nullable Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadAction downloadAction = (DownloadAction) obj;
        if (!this.type.equals(downloadAction.type) || this.version != downloadAction.version || !this.uri.equals(downloadAction.uri) || this.isRemoveAction != downloadAction.isRemoveAction || !Arrays.equals(this.data, downloadAction.data)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.uri.hashCode() * 31) + (this.isRemoveAction ? 1 : 0)) * 31) + Arrays.hashCode(this.data);
    }

    public boolean isSameMedia(DownloadAction downloadAction) {
        return this.uri.equals(downloadAction.uri);
    }

    public final byte[] toByteArray() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            serializeToStream(this, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException();
        }
    }

    protected abstract void writeToStream(DataOutputStream dataOutputStream) throws IOException;
}
