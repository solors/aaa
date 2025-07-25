package io.bidmachine.media3.extractor.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public final class VorbisComment extends io.bidmachine.media3.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C36572a();

    /* renamed from: io.bidmachine.media3.extractor.metadata.vorbis.VorbisComment$a */
    /* loaded from: classes9.dex */
    class C36572a implements Parcelable.Creator<VorbisComment> {
        C36572a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }

    @Override // io.bidmachine.media3.extractor.metadata.flac.VorbisComment, io.bidmachine.media3.common.Metadata.Entry
    @Nullable
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // io.bidmachine.media3.extractor.metadata.flac.VorbisComment, io.bidmachine.media3.common.Metadata.Entry
    @Nullable
    public /* bridge */ /* synthetic */ Format getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    VorbisComment(Parcel parcel) {
        super(parcel);
    }
}
