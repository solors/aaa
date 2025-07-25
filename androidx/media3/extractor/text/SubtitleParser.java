package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public interface SubtitleParser {

    /* loaded from: classes2.dex */
    public interface Factory {
        SubtitleParser create(Format format);

        int getCueReplacementBehavior(Format format);

        boolean supportsFormat(Format format);
    }

    /* loaded from: classes2.dex */
    public static class OutputOptions {
        private static final OutputOptions ALL = new OutputOptions(-9223372036854775807L, false);
        public final boolean outputAllCues;
        public final long startTimeUs;

        private OutputOptions(long j, boolean z) {
            this.startTimeUs = j;
            this.outputAllCues = z;
        }

        public static OutputOptions allCues() {
            return ALL;
        }

        public static OutputOptions cuesAfterThenRemainingCuesBefore(long j) {
            return new OutputOptions(j, true);
        }

        public static OutputOptions onlyCuesAfter(long j) {
            return new OutputOptions(j, false);
        }
    }

    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i, int i2, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer);

    default void parse(byte[] bArr, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    default Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        final ImmutableList.Builder builder = ImmutableList.builder();
        OutputOptions outputOptions = OutputOptions.ALL;
        Objects.requireNonNull(builder);
        parse(bArr, i, i2, outputOptions, new Consumer() { // from class: androidx.media3.extractor.text.c
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ImmutableList.Builder.this.add((ImmutableList.Builder) ((CuesWithTiming) obj));
            }
        });
        return new CuesWithTimingSubtitle(builder.build());
    }

    default void reset() {
    }
}
