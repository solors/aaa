package androidx.media3.extractor.p020ts;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.p020ts.TsPayloadReader;
import java.util.Collections;

@UnstableApi
/* renamed from: androidx.media3.extractor.ts.LatmReader */
/* loaded from: classes2.dex */
public final class LatmReader implements ElementaryStreamReader {
    private static final int INITIAL_BUFFER_SIZE = 1024;
    private static final int STATE_FINDING_SYNC_1 = 0;
    private static final int STATE_FINDING_SYNC_2 = 1;
    private static final int STATE_READING_HEADER = 2;
    private static final int STATE_READING_SAMPLE = 3;
    private static final int SYNC_BYTE_FIRST = 86;
    private static final int SYNC_BYTE_SECOND = 224;
    private int audioMuxVersionA;
    private int bytesRead;
    private int channelCount;
    @Nullable
    private String codecs;
    private Format format;
    private String formatId;
    private int frameLengthType;
    @Nullable
    private final String language;
    private int numSubframes;
    private long otherDataLenBits;
    private boolean otherDataPresent;
    private TrackOutput output;
    private final ParsableBitArray sampleBitArray;
    private final ParsableByteArray sampleDataBuffer;
    private long sampleDurationUs;
    private int sampleRateHz;
    private int sampleSize;
    private int secondHeaderByte;
    private int state;
    private boolean streamMuxRead;
    private long timeUs;

    public LatmReader(@Nullable String str) {
        this.language = str;
        ParsableByteArray parsableByteArray = new ParsableByteArray(1024);
        this.sampleDataBuffer = parsableByteArray;
        this.sampleBitArray = new ParsableBitArray(parsableByteArray.getData());
        this.timeUs = -9223372036854775807L;
    }

    private static long latmGetValue(ParsableBitArray parsableBitArray) {
        return parsableBitArray.readBits((parsableBitArray.readBits(2) + 1) * 8);
    }

    private void parseAudioMuxElement(ParsableBitArray parsableBitArray) throws ParserException {
        if (!parsableBitArray.readBit()) {
            this.streamMuxRead = true;
            parseStreamMuxConfig(parsableBitArray);
        } else if (!this.streamMuxRead) {
            return;
        }
        if (this.audioMuxVersionA == 0) {
            if (this.numSubframes == 0) {
                parsePayloadMux(parsableBitArray, parsePayloadLengthInfo(parsableBitArray));
                if (this.otherDataPresent) {
                    parsableBitArray.skipBits((int) this.otherDataLenBits);
                    return;
                }
                return;
            }
            throw ParserException.createForMalformedContainer(null, null);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    private int parseAudioSpecificConfig(ParsableBitArray parsableBitArray) throws ParserException {
        int bitsLeft = parsableBitArray.bitsLeft();
        AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(parsableBitArray, true);
        this.codecs = parseAudioSpecificConfig.codecs;
        this.sampleRateHz = parseAudioSpecificConfig.sampleRateHz;
        this.channelCount = parseAudioSpecificConfig.channelCount;
        return bitsLeft - parsableBitArray.bitsLeft();
    }

    private void parseFrameLength(ParsableBitArray parsableBitArray) {
        int readBits = parsableBitArray.readBits(3);
        this.frameLengthType = readBits;
        if (readBits != 0) {
            if (readBits != 1) {
                if (readBits != 3 && readBits != 4 && readBits != 5) {
                    if (readBits != 6 && readBits != 7) {
                        throw new IllegalStateException();
                    }
                    parsableBitArray.skipBits(1);
                    return;
                }
                parsableBitArray.skipBits(6);
                return;
            }
            parsableBitArray.skipBits(9);
            return;
        }
        parsableBitArray.skipBits(8);
    }

    private int parsePayloadLengthInfo(ParsableBitArray parsableBitArray) throws ParserException {
        int readBits;
        if (this.frameLengthType == 0) {
            int i = 0;
            do {
                readBits = parsableBitArray.readBits(8);
                i += readBits;
            } while (readBits == 255);
            return i;
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    private void parsePayloadMux(ParsableBitArray parsableBitArray, int i) {
        int position = parsableBitArray.getPosition();
        if ((position & 7) == 0) {
            this.sampleDataBuffer.setPosition(position >> 3);
        } else {
            parsableBitArray.readBits(this.sampleDataBuffer.getData(), 0, i * 8);
            this.sampleDataBuffer.setPosition(0);
        }
        this.output.sampleData(this.sampleDataBuffer, i);
        long j = this.timeUs;
        if (j != -9223372036854775807L) {
            this.output.sampleMetadata(j, 1, i, 0, null);
            this.timeUs += this.sampleDurationUs;
        }
    }

    private void parseStreamMuxConfig(ParsableBitArray parsableBitArray) throws ParserException {
        int i;
        boolean readBit;
        int readBits = parsableBitArray.readBits(1);
        if (readBits == 1) {
            i = parsableBitArray.readBits(1);
        } else {
            i = 0;
        }
        this.audioMuxVersionA = i;
        if (i == 0) {
            if (readBits == 1) {
                latmGetValue(parsableBitArray);
            }
            if (parsableBitArray.readBit()) {
                this.numSubframes = parsableBitArray.readBits(6);
                int readBits2 = parsableBitArray.readBits(4);
                int readBits3 = parsableBitArray.readBits(3);
                if (readBits2 == 0 && readBits3 == 0) {
                    if (readBits == 0) {
                        int position = parsableBitArray.getPosition();
                        int parseAudioSpecificConfig = parseAudioSpecificConfig(parsableBitArray);
                        parsableBitArray.setPosition(position);
                        byte[] bArr = new byte[(parseAudioSpecificConfig + 7) / 8];
                        parsableBitArray.readBits(bArr, 0, parseAudioSpecificConfig);
                        Format build = new Format.Builder().setId(this.formatId).setSampleMimeType("audio/mp4a-latm").setCodecs(this.codecs).setChannelCount(this.channelCount).setSampleRate(this.sampleRateHz).setInitializationData(Collections.singletonList(bArr)).setLanguage(this.language).build();
                        if (!build.equals(this.format)) {
                            this.format = build;
                            this.sampleDurationUs = 1024000000 / build.sampleRate;
                            this.output.format(build);
                        }
                    } else {
                        parsableBitArray.skipBits(((int) latmGetValue(parsableBitArray)) - parseAudioSpecificConfig(parsableBitArray));
                    }
                    parseFrameLength(parsableBitArray);
                    boolean readBit2 = parsableBitArray.readBit();
                    this.otherDataPresent = readBit2;
                    this.otherDataLenBits = 0L;
                    if (readBit2) {
                        if (readBits == 1) {
                            this.otherDataLenBits = latmGetValue(parsableBitArray);
                        } else {
                            do {
                                readBit = parsableBitArray.readBit();
                                this.otherDataLenBits = (this.otherDataLenBits << 8) + parsableBitArray.readBits(8);
                            } while (readBit);
                        }
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(8);
                        return;
                    }
                    return;
                }
                throw ParserException.createForMalformedContainer(null, null);
            }
            throw ParserException.createForMalformedContainer(null, null);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    private void resetBufferForSize(int i) {
        this.sampleDataBuffer.reset(i);
        this.sampleBitArray.reset(this.sampleDataBuffer.getData());
    }

    @Override // androidx.media3.extractor.p020ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) throws ParserException {
        Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.state;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            int min = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                            parsableByteArray.readBytes(this.sampleBitArray.data, this.bytesRead, min);
                            int i2 = this.bytesRead + min;
                            this.bytesRead = i2;
                            if (i2 == this.sampleSize) {
                                this.sampleBitArray.setPosition(0);
                                parseAudioMuxElement(this.sampleBitArray);
                                this.state = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int readUnsignedByte = ((this.secondHeaderByte & (-225)) << 8) | parsableByteArray.readUnsignedByte();
                        this.sampleSize = readUnsignedByte;
                        if (readUnsignedByte > this.sampleDataBuffer.getData().length) {
                            resetBufferForSize(this.sampleSize);
                        }
                        this.bytesRead = 0;
                        this.state = 3;
                    }
                } else {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    if ((readUnsignedByte2 & 224) == 224) {
                        this.secondHeaderByte = readUnsignedByte2;
                        this.state = 2;
                    } else if (readUnsignedByte2 != 86) {
                        this.state = 0;
                    }
                }
            } else if (parsableByteArray.readUnsignedByte() == 86) {
                this.state = 1;
            }
        }
    }

    @Override // androidx.media3.extractor.p020ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
        this.formatId = trackIdGenerator.getFormatId();
    }

    @Override // androidx.media3.extractor.p020ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.timeUs = j;
        }
    }

    @Override // androidx.media3.extractor.p020ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.timeUs = -9223372036854775807L;
        this.streamMuxRead = false;
    }

    @Override // androidx.media3.extractor.p020ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
    }
}
