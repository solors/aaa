package io.bidmachine.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaMetadata;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.metadata.mp4.SlowMotionData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new C36564a();
    public final List<Segment> segments;

    /* loaded from: classes9.dex */
    public static final class Segment implements Parcelable {
        public static final Comparator<Segment> BY_START_THEN_END_THEN_DIVISOR = new Comparator() { // from class: io.bidmachine.media3.extractor.metadata.mp4.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$static$0;
                lambda$static$0 = SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
                return lambda$static$0;
            }
        };
        public static final Parcelable.Creator<Segment> CREATOR = new C36563a();
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        /* renamed from: io.bidmachine.media3.extractor.metadata.mp4.SlowMotionData$Segment$a */
        /* loaded from: classes9.dex */
        class C36563a implements Parcelable.Creator<Segment> {
            C36563a() {
            }

            @Override // android.os.Parcelable.Creator
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public Segment[] newArray(int i) {
                return new Segment[i];
            }
        }

        public Segment(long j, long j2, int i) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.speedDivisor = i;
        }

        public static /* synthetic */ int lambda$static$0(Segment segment, Segment segment2) {
            return ComparisonChain.start().compare(segment.startTimeMs, segment2.startTimeMs).compare(segment.endTimeMs, segment2.endTimeMs).compare(segment.speedDivisor, segment2.speedDivisor).result();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            if (this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        public String toString() {
            return Util.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.startTimeMs);
            parcel.writeLong(this.endTimeMs);
            parcel.writeInt(this.speedDivisor);
        }
    }

    /* renamed from: io.bidmachine.media3.extractor.metadata.mp4.SlowMotionData$a */
    /* loaded from: classes9.dex */
    class C36564a implements Parcelable.Creator<SlowMotionData> {
        C36564a() {
        }

        @Override // android.os.Parcelable.Creator
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.segments = list;
        Assertions.checkArgument(!doSegmentsOverlap(list));
    }

    private static boolean doSegmentsOverlap(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).endTimeMs;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).startTimeMs < j) {
                return true;
            }
            j = list.get(i).endTimeMs;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SlowMotionData.class == obj.getClass()) {
            return this.segments.equals(((SlowMotionData) obj).segments);
        }
        return false;
    }

    @Override // io.bidmachine.media3.common.Metadata.Entry
    @Nullable
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // io.bidmachine.media3.common.Metadata.Entry
    @Nullable
    public /* bridge */ /* synthetic */ Format getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        return this.segments.hashCode();
    }

    @Override // io.bidmachine.media3.common.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        super.populateMediaMetadata(builder);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.segments;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.segments);
    }
}
