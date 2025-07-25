package com.google.android.exoplayer2.extractor.p379ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader */
/* loaded from: classes4.dex */
public interface TsPayloadReader {
    public static final int FLAG_DATA_ALIGNMENT_INDICATOR = 4;
    public static final int FLAG_PAYLOAD_UNIT_START_INDICATOR = 1;
    public static final int FLAG_RANDOM_ACCESS_INDICATOR = 2;

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$DvbSubtitleInfo */
    /* loaded from: classes4.dex */
    public static final class DvbSubtitleInfo {
        public final byte[] initializationData;
        public final String language;
        public final int type;

        public DvbSubtitleInfo(String str, int i, byte[] bArr) {
            this.language = str;
            this.type = i;
            this.initializationData = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$EsInfo */
    /* loaded from: classes4.dex */
    public static final class EsInfo {
        public final byte[] descriptorBytes;
        public final List<DvbSubtitleInfo> dvbSubtitleInfos;
        @Nullable
        public final String language;
        public final int streamType;

        public EsInfo(int i, @Nullable String str, @Nullable List<DvbSubtitleInfo> list, byte[] bArr) {
            List<DvbSubtitleInfo> unmodifiableList;
            this.streamType = i;
            this.language = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.dvbSubtitleInfos = unmodifiableList;
            this.descriptorBytes = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$Factory */
    /* loaded from: classes4.dex */
    public interface Factory {
        SparseArray<TsPayloadReader> createInitialPayloadReaders();

        @Nullable
        TsPayloadReader createPayloadReader(int i, EsInfo esInfo);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$Flags */
    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$TrackIdGenerator */
    /* loaded from: classes4.dex */
    public static final class TrackIdGenerator {

        /* renamed from: a */
        private final String f33652a;

        /* renamed from: b */
        private final int f33653b;

        /* renamed from: c */
        private final int f33654c;

        /* renamed from: d */
        private int f33655d;

        /* renamed from: e */
        private String f33656e;

        public TrackIdGenerator(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: a */
        private void m74279a() {
            if (this.f33655d != Integer.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public void generateNewId() {
            int i;
            int i2 = this.f33655d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.f33653b;
            } else {
                i = i2 + this.f33654c;
            }
            this.f33655d = i;
            this.f33656e = this.f33652a + this.f33655d;
        }

        public String getFormatId() {
            m74279a();
            return this.f33656e;
        }

        public int getTrackId() {
            m74279a();
            return this.f33655d;
        }

        public TrackIdGenerator(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + RemoteSettings.FORWARD_SLASH_STRING;
            } else {
                str = "";
            }
            this.f33652a = str;
            this.f33653b = i2;
            this.f33654c = i3;
            this.f33655d = Integer.MIN_VALUE;
            this.f33656e = "";
        }
    }

    void consume(ParsableByteArray parsableByteArray, int i) throws ParserException;

    void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator trackIdGenerator);

    void seek();
}
