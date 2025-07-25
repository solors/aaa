package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class ProgressiveDownloadAction extends DownloadAction {
    private static final int VERSION = 0;
    @Nullable
    public final String customCacheKey;
    private static final String TYPE = "progressive";
    public static final DownloadAction.Deserializer DESERIALIZER = new DownloadAction.Deserializer(TYPE, 0) { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.ProgressiveDownloadAction.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction.Deserializer
        public final ProgressiveDownloadAction readFromStream(int i, DataInputStream dataInputStream) throws IOException {
            Uri parse = Uri.parse(dataInputStream.readUTF());
            boolean readBoolean = dataInputStream.readBoolean();
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            return new ProgressiveDownloadAction(parse, readBoolean, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
        }
    };

    public ProgressiveDownloadAction(Uri uri, boolean z, @Nullable byte[] bArr, @Nullable String str) {
        super(TYPE, 0, uri, z, bArr);
        this.customCacheKey = str;
    }

    private String getCacheKey() {
        String str = this.customCacheKey;
        if (str == null) {
            return CacheUtil.generateKey(this.uri);
        }
        return str;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return Util.areEqual(this.customCacheKey, ((ProgressiveDownloadAction) obj).customCacheKey);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.customCacheKey;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final boolean isSameMedia(DownloadAction downloadAction) {
        if ((downloadAction instanceof ProgressiveDownloadAction) && getCacheKey().equals(((ProgressiveDownloadAction) downloadAction).getCacheKey())) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    protected final void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        boolean z;
        dataOutputStream.writeUTF(this.uri.toString());
        dataOutputStream.writeBoolean(this.isRemoveAction);
        dataOutputStream.writeInt(this.data.length);
        dataOutputStream.write(this.data);
        if (this.customCacheKey != null) {
            z = true;
        } else {
            z = false;
        }
        dataOutputStream.writeBoolean(z);
        if (z) {
            dataOutputStream.writeUTF(this.customCacheKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final ProgressiveDownloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper) {
        return new ProgressiveDownloader(this.uri, this.customCacheKey, downloaderConstructorHelper);
    }
}
