package io.bidmachine.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaMetadata;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C36570a();
    public final List<Event> events;

    /* loaded from: classes9.dex */
    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        /* synthetic */ ComponentSplice(int i, long j, C36570a c36570a) {
            this(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.utcSpliceTime);
        }

        private ComponentSplice(int i, long j) {
            this.componentTag = i;
            this.utcSpliceTime = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.bidmachine.media3.extractor.metadata.scte35.SpliceScheduleCommand$a */
    /* loaded from: classes9.dex */
    public class C36570a implements Parcelable.Creator<SpliceScheduleCommand> {
        C36570a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* synthetic */ SpliceScheduleCommand(Parcel parcel, C36570a c36570a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(readUnsignedByte);
        for (int i = 0; i < readUnsignedByte; i++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // io.bidmachine.media3.extractor.metadata.scte35.SpliceCommand, io.bidmachine.media3.common.Metadata.Entry
    @Nullable
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // io.bidmachine.media3.extractor.metadata.scte35.SpliceCommand, io.bidmachine.media3.common.Metadata.Entry
    @Nullable
    public /* bridge */ /* synthetic */ Format getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    @Override // io.bidmachine.media3.extractor.metadata.scte35.SpliceCommand, io.bidmachine.media3.common.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        super.populateMediaMetadata(builder);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.events.get(i2).writeToParcel(parcel);
        }
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(Event.createFromParcel(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes9.dex */
    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j, boolean z, boolean z2, boolean z3, List<ComponentSplice> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.spliceEventId = j;
            this.spliceEventCancelIndicator = z;
            this.outOfNetworkIndicator = z2;
            this.programSpliceFlag = z3;
            this.componentSpliceList = Collections.unmodifiableList(list);
            this.utcSpliceTime = j2;
            this.autoReturn = z4;
            this.breakDurationUs = j3;
            this.uniqueProgramId = i;
            this.availNum = i2;
            this.availsExpected = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            boolean z;
            ArrayList arrayList;
            boolean z2;
            long j;
            boolean z3;
            long j2;
            int i;
            int i2;
            int i3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            long j3;
            boolean z8;
            long j4;
            boolean z9;
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                if ((readUnsignedByte & 128) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((readUnsignedByte & 64) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((readUnsignedByte & 32) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z6) {
                    j3 = parsableByteArray.readUnsignedInt();
                } else {
                    j3 = -9223372036854775807L;
                }
                if (!z6) {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(readUnsignedByte2);
                    for (int i4 = 0; i4 < readUnsignedByte2; i4++) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z7) {
                    long readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    if ((128 & readUnsignedByte3) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j4 = ((((readUnsignedByte3 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z8 = z9;
                } else {
                    z8 = false;
                    j4 = -9223372036854775807L;
                }
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                z4 = z6;
                i3 = parsableByteArray.readUnsignedByte();
                j2 = j4;
                arrayList = arrayList2;
                long j5 = j3;
                i = readUnsignedShort;
                i2 = readUnsignedByte4;
                j = j5;
                boolean z10 = z5;
                z3 = z8;
                z2 = z10;
            } else {
                arrayList = arrayList2;
                z2 = false;
                j = -9223372036854775807L;
                z3 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                i3 = 0;
                z4 = false;
            }
            return new Event(readUnsignedInt, z, z2, z4, arrayList, j, z3, j2, i, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeLong(this.spliceEventId);
            parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
            int size = this.componentSpliceList.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.componentSpliceList.get(i).writeToParcel(parcel);
            }
            parcel.writeLong(this.utcSpliceTime);
            parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.breakDurationUs);
            parcel.writeInt(this.uniqueProgramId);
            parcel.writeInt(this.availNum);
            parcel.writeInt(this.availsExpected);
        }

        private Event(Parcel parcel) {
            this.spliceEventId = parcel.readLong();
            this.spliceEventCancelIndicator = parcel.readByte() == 1;
            this.outOfNetworkIndicator = parcel.readByte() == 1;
            this.programSpliceFlag = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(ComponentSplice.createFromParcel(parcel));
            }
            this.componentSpliceList = Collections.unmodifiableList(arrayList);
            this.utcSpliceTime = parcel.readLong();
            this.autoReturn = parcel.readByte() == 1;
            this.breakDurationUs = parcel.readLong();
            this.uniqueProgramId = parcel.readInt();
            this.availNum = parcel.readInt();
            this.availsExpected = parcel.readInt();
        }
    }
}
