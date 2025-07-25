package com.monetization.ads.exo.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C30937nf;
import com.yandex.mobile.ads.impl.oh0;
import com.yandex.mobile.ads.impl.y32;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new C25569a();

    /* renamed from: b */
    public final String f66351b;

    /* renamed from: c */
    public final Uri f66352c;
    @Nullable

    /* renamed from: d */
    public final String f66353d;

    /* renamed from: e */
    public final List<StreamKey> f66354e;
    @Nullable

    /* renamed from: f */
    public final byte[] f66355f;
    @Nullable

    /* renamed from: g */
    public final String f66356g;

    /* renamed from: h */
    public final byte[] f66357h;

    /* renamed from: com.monetization.ads.exo.offline.DownloadRequest$a */
    /* loaded from: classes7.dex */
    final class C25569a implements Parcelable.Creator<DownloadRequest> {
        C25569a() {
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    /* renamed from: com.monetization.ads.exo.offline.DownloadRequest$b */
    /* loaded from: classes7.dex */
    public static class C25570b {

        /* renamed from: a */
        private final String f66358a;

        /* renamed from: b */
        private final Uri f66359b;
        @Nullable

        /* renamed from: c */
        private String f66360c;
        @Nullable

        /* renamed from: d */
        private List<StreamKey> f66361d;
        @Nullable

        /* renamed from: e */
        private byte[] f66362e;
        @Nullable

        /* renamed from: f */
        private String f66363f;
        @Nullable

        /* renamed from: g */
        private byte[] f66364g;

        public C25570b(Uri uri, String str) {
            this.f66358a = str;
            this.f66359b = uri;
        }

        /* renamed from: a */
        public final C25570b m44357a(@Nullable ArrayList arrayList) {
            this.f66361d = arrayList;
            return this;
        }

        /* renamed from: b */
        public final C25570b m44355b(@Nullable String str) {
            this.f66360c = str;
            return this;
        }

        /* renamed from: a */
        public final C25570b m44358a(@Nullable String str) {
            this.f66363f = str;
            return this;
        }

        /* renamed from: b */
        public final C25570b m44354b(@Nullable byte[] bArr) {
            this.f66362e = bArr;
            return this;
        }

        /* renamed from: a */
        public final C25570b m44356a(@Nullable byte[] bArr) {
            this.f66364g = bArr;
            return this;
        }

        /* renamed from: a */
        public final DownloadRequest m44359a() {
            String str = this.f66358a;
            Uri uri = this.f66359b;
            String str2 = this.f66360c;
            List list = this.f66361d;
            if (list == null) {
                list = oh0.m31009h();
            }
            return new DownloadRequest(str, uri, str2, list, this.f66362e, this.f66363f, this.f66364g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* renamed from: a */
    public final DownloadRequest m44360a(DownloadRequest downloadRequest) {
        ?? emptyList;
        if (this.f66351b.equals(downloadRequest.f66351b)) {
            if (!this.f66354e.isEmpty() && !downloadRequest.f66354e.isEmpty()) {
                emptyList = new ArrayList(this.f66354e);
                for (int i = 0; i < downloadRequest.f66354e.size(); i++) {
                    StreamKey streamKey = downloadRequest.f66354e.get(i);
                    if (!emptyList.contains(streamKey)) {
                        emptyList.add(streamKey);
                    }
                }
            } else {
                emptyList = Collections.emptyList();
            }
            return new DownloadRequest(this.f66351b, downloadRequest.f66352c, downloadRequest.f66353d, emptyList, downloadRequest.f66355f, downloadRequest.f66356g, downloadRequest.f66357h);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (!this.f66351b.equals(downloadRequest.f66351b) || !this.f66352c.equals(downloadRequest.f66352c) || !y32.m27076a(this.f66353d, downloadRequest.f66353d) || !this.f66354e.equals(downloadRequest.f66354e) || !Arrays.equals(this.f66355f, downloadRequest.f66355f) || !y32.m27076a(this.f66356g, downloadRequest.f66356g) || !Arrays.equals(this.f66357h, downloadRequest.f66357h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f66352c.hashCode() + (this.f66351b.hashCode() * 961)) * 31;
        String str = this.f66353d;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (Arrays.hashCode(this.f66355f) + ((this.f66354e.hashCode() + ((hashCode + i) * 31)) * 31)) * 31;
        String str2 = this.f66356g;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Arrays.hashCode(this.f66357h) + ((hashCode2 + i2) * 31);
    }

    public final String toString() {
        return this.f66353d + ":" + this.f66351b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66351b);
        parcel.writeString(this.f66352c.toString());
        parcel.writeString(this.f66353d);
        parcel.writeInt(this.f66354e.size());
        for (int i2 = 0; i2 < this.f66354e.size(); i2++) {
            parcel.writeParcelable(this.f66354e.get(i2), 0);
        }
        parcel.writeByteArray(this.f66355f);
        parcel.writeString(this.f66356g);
        parcel.writeByteArray(this.f66357h);
    }

    private DownloadRequest(String str, Uri uri, @Nullable String str2, List<StreamKey> list, @Nullable byte[] bArr, @Nullable String str3, @Nullable byte[] bArr2) {
        int m27085a = y32.m27085a(uri, str2);
        if (m27085a == 0 || m27085a == 2 || m27085a == 1) {
            boolean z = str3 == null;
            C30937nf.m31568a("customCacheKey must be null for type: " + m27085a, z);
        }
        this.f66351b = str;
        this.f66352c = uri;
        this.f66353d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f66354e = Collections.unmodifiableList(arrayList);
        this.f66355f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f66356g = str3;
        this.f66357h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : y32.f88015f;
    }

    DownloadRequest(Parcel parcel) {
        this.f66351b = (String) y32.m27077a(parcel.readString());
        this.f66352c = Uri.parse((String) y32.m27077a(parcel.readString()));
        this.f66353d = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f66354e = Collections.unmodifiableList(arrayList);
        this.f66355f = parcel.createByteArray();
        this.f66356g = parcel.readString();
        this.f66357h = (byte[]) y32.m27077a(parcel.createByteArray());
    }
}
