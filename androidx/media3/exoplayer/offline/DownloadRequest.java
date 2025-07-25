package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    };
    @Nullable
    public final String customCacheKey;
    public final byte[] data;

    /* renamed from: id */
    public final String f1176id;
    @Nullable
    public final byte[] keySetId;
    @Nullable
    public final String mimeType;
    public final List<StreamKey> streamKeys;
    public final Uri uri;

    /* loaded from: classes2.dex */
    public static class Builder {
        @Nullable
        private String customCacheKey;
        @Nullable
        private byte[] data;

        /* renamed from: id */
        private final String f1177id;
        @Nullable
        private byte[] keySetId;
        @Nullable
        private String mimeType;
        @Nullable
        private List<StreamKey> streamKeys;
        private final Uri uri;

        public Builder(String str, Uri uri) {
            this.f1177id = str;
            this.uri = uri;
        }

        public DownloadRequest build() {
            String str = this.f1177id;
            Uri uri = this.uri;
            String str2 = this.mimeType;
            List list = this.streamKeys;
            if (list == null) {
                list = ImmutableList.m69424of();
            }
            return new DownloadRequest(str, uri, str2, list, this.keySetId, this.customCacheKey, this.data);
        }

        @CanIgnoreReturnValue
        public Builder setCustomCacheKey(@Nullable String str) {
            this.customCacheKey = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setData(@Nullable byte[] bArr) {
            this.data = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeySetId(@Nullable byte[] bArr) {
            this.keySetId = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMimeType(@Nullable String str) {
            this.mimeType = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setStreamKeys(@Nullable List<StreamKey> list) {
            this.streamKeys = list;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest copyWithId(String str) {
        return new DownloadRequest(str, this.uri, this.mimeType, this.streamKeys, this.keySetId, this.customCacheKey, this.data);
    }

    public DownloadRequest copyWithKeySetId(@Nullable byte[] bArr) {
        return new DownloadRequest(this.f1176id, this.uri, this.mimeType, this.streamKeys, bArr, this.customCacheKey, this.data);
    }

    public DownloadRequest copyWithMergedRequest(DownloadRequest downloadRequest) {
        List emptyList;
        Assertions.checkArgument(this.f1176id.equals(downloadRequest.f1176id));
        if (!this.streamKeys.isEmpty() && !downloadRequest.streamKeys.isEmpty()) {
            emptyList = new ArrayList(this.streamKeys);
            for (int i = 0; i < downloadRequest.streamKeys.size(); i++) {
                StreamKey streamKey = downloadRequest.streamKeys.get(i);
                if (!emptyList.contains(streamKey)) {
                    emptyList.add(streamKey);
                }
            }
        } else {
            emptyList = Collections.emptyList();
        }
        return new DownloadRequest(this.f1176id, downloadRequest.uri, downloadRequest.mimeType, emptyList, downloadRequest.keySetId, downloadRequest.customCacheKey, downloadRequest.data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (!this.f1176id.equals(downloadRequest.f1176id) || !this.uri.equals(downloadRequest.uri) || !Util.areEqual(this.mimeType, downloadRequest.mimeType) || !this.streamKeys.equals(downloadRequest.streamKeys) || !Arrays.equals(this.keySetId, downloadRequest.keySetId) || !Util.areEqual(this.customCacheKey, downloadRequest.customCacheKey) || !Arrays.equals(this.data, downloadRequest.data)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f1176id.hashCode() * 31 * 31) + this.uri.hashCode()) * 31;
        String str = this.mimeType;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.streamKeys.hashCode()) * 31) + Arrays.hashCode(this.keySetId)) * 31;
        String str2 = this.customCacheKey;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode2 + i2) * 31) + Arrays.hashCode(this.data);
    }

    public MediaItem toMediaItem() {
        return new MediaItem.Builder().setMediaId(this.f1176id).setUri(this.uri).setCustomCacheKey(this.customCacheKey).setMimeType(this.mimeType).setStreamKeys(this.streamKeys).build();
    }

    public String toString() {
        return this.mimeType + ":" + this.f1176id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1176id);
        parcel.writeString(this.uri.toString());
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.streamKeys.size());
        for (int i2 = 0; i2 < this.streamKeys.size(); i2++) {
            parcel.writeParcelable(this.streamKeys.get(i2), 0);
        }
        parcel.writeByteArray(this.keySetId);
        parcel.writeString(this.customCacheKey);
        parcel.writeByteArray(this.data);
    }

    private DownloadRequest(String str, Uri uri, @Nullable String str2, List<StreamKey> list, @Nullable byte[] bArr, @Nullable String str3, @Nullable byte[] bArr2) {
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(uri, str2);
        if (inferContentTypeForUriAndMimeType == 0 || inferContentTypeForUriAndMimeType == 2 || inferContentTypeForUriAndMimeType == 1) {
            boolean z = str3 == null;
            Assertions.checkArgument(z, "customCacheKey must be null for type: " + inferContentTypeForUriAndMimeType);
        }
        this.f1176id = str;
        this.uri = uri;
        this.mimeType = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.customCacheKey = str3;
        this.data = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : Util.EMPTY_BYTE_ARRAY;
    }

    DownloadRequest(Parcel parcel) {
        this.f1176id = (String) Util.castNonNull(parcel.readString());
        this.uri = Uri.parse((String) Util.castNonNull(parcel.readString()));
        this.mimeType = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.keySetId = parcel.createByteArray();
        this.customCacheKey = parcel.readString();
        this.data = (byte[]) Util.castNonNull(parcel.createByteArray());
    }
}
