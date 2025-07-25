package androidx.media3.extractor.p020ts;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.p020ts.TsPayloadReader;

@UnstableApi
/* renamed from: androidx.media3.extractor.ts.PesReader */
/* loaded from: classes2.dex */
public final class PesReader implements TsPayloadReader {
    private static final int HEADER_SIZE = 9;
    private static final int MAX_HEADER_EXTENSION_SIZE = 10;
    private static final int PES_SCRATCH_SIZE = 10;
    private static final int STATE_FINDING_HEADER = 0;
    private static final int STATE_READING_BODY = 3;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_HEADER_EXTENSION = 2;
    private static final String TAG = "PesReader";
    private int bytesRead;
    private boolean dataAlignmentIndicator;
    private boolean dtsFlag;
    private int extendedHeaderLength;
    private int payloadSize;
    private boolean ptsFlag;
    private final ElementaryStreamReader reader;
    private boolean seenFirstDts;
    private long timeUs;
    private TimestampAdjuster timestampAdjuster;
    private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[10]);
    private int state = 0;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.reader = elementaryStreamReader;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, @Nullable byte[] bArr, int i) {
        int min = Math.min(parsableByteArray.bytesLeft(), i - this.bytesRead);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.skipBytes(min);
        } else {
            parsableByteArray.readBytes(bArr, this.bytesRead, min);
        }
        int i2 = this.bytesRead + min;
        this.bytesRead = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    private boolean parseHeader() {
        this.pesScratch.setPosition(0);
        int readBits = this.pesScratch.readBits(24);
        if (readBits != 1) {
            Log.m104564w(TAG, "Unexpected start code prefix: " + readBits);
            this.payloadSize = -1;
            return false;
        }
        this.pesScratch.skipBits(8);
        int readBits2 = this.pesScratch.readBits(16);
        this.pesScratch.skipBits(5);
        this.dataAlignmentIndicator = this.pesScratch.readBit();
        this.pesScratch.skipBits(2);
        this.ptsFlag = this.pesScratch.readBit();
        this.dtsFlag = this.pesScratch.readBit();
        this.pesScratch.skipBits(6);
        int readBits3 = this.pesScratch.readBits(8);
        this.extendedHeaderLength = readBits3;
        if (readBits2 == 0) {
            this.payloadSize = -1;
        } else {
            int i = ((readBits2 + 6) - 9) - readBits3;
            this.payloadSize = i;
            if (i < 0) {
                Log.m104564w(TAG, "Found negative packet payload size: " + this.payloadSize);
                this.payloadSize = -1;
            }
        }
        return true;
    }

    private void parseHeaderExtension() {
        this.pesScratch.setPosition(0);
        this.timeUs = -9223372036854775807L;
        if (this.ptsFlag) {
            this.pesScratch.skipBits(4);
            this.pesScratch.skipBits(1);
            this.pesScratch.skipBits(1);
            long readBits = (this.pesScratch.readBits(3) << 30) | (this.pesScratch.readBits(15) << 15) | this.pesScratch.readBits(15);
            this.pesScratch.skipBits(1);
            if (!this.seenFirstDts && this.dtsFlag) {
                this.pesScratch.skipBits(4);
                this.pesScratch.skipBits(1);
                this.pesScratch.skipBits(1);
                this.pesScratch.skipBits(1);
                this.timestampAdjuster.adjustTsTimestamp((this.pesScratch.readBits(3) << 30) | (this.pesScratch.readBits(15) << 15) | this.pesScratch.readBits(15));
                this.seenFirstDts = true;
            }
            this.timeUs = this.timestampAdjuster.adjustTsTimestamp(readBits);
        }
    }

    private void setState(int i) {
        this.state = i;
        this.bytesRead = 0;
    }

    @Override // androidx.media3.extractor.p020ts.TsPayloadReader
    public final void consume(ParsableByteArray parsableByteArray, int i) throws ParserException {
        int i2;
        int i3;
        int i4;
        boolean z;
        Assertions.checkStateNotNull(this.timestampAdjuster);
        if ((i & 1) != 0) {
            int i5 = this.state;
            if (i5 != 0 && i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (this.payloadSize != -1) {
                            Log.m104564w(TAG, "Unexpected start indicator: expected " + this.payloadSize + " more bytes");
                        }
                        if (parsableByteArray.limit() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.reader.packetFinished(z);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    Log.m104564w(TAG, "Unexpected start indicator reading extended header");
                }
            }
            setState(1);
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i6 = this.state;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            int bytesLeft = parsableByteArray.bytesLeft();
                            int i7 = this.payloadSize;
                            if (i7 == -1) {
                                i2 = 0;
                            } else {
                                i2 = bytesLeft - i7;
                            }
                            if (i2 > 0) {
                                bytesLeft -= i2;
                                parsableByteArray.setLimit(parsableByteArray.getPosition() + bytesLeft);
                            }
                            this.reader.consume(parsableByteArray);
                            int i8 = this.payloadSize;
                            if (i8 != -1) {
                                int i9 = i8 - bytesLeft;
                                this.payloadSize = i9;
                                if (i9 == 0) {
                                    this.reader.packetFinished(false);
                                    setState(1);
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (continueRead(parsableByteArray, this.pesScratch.data, Math.min(10, this.extendedHeaderLength)) && continueRead(parsableByteArray, null, this.extendedHeaderLength)) {
                            parseHeaderExtension();
                            if (this.dataAlignmentIndicator) {
                                i3 = 4;
                            } else {
                                i3 = 0;
                            }
                            i |= i3;
                            this.reader.packetStarted(this.timeUs, i);
                            setState(3);
                        }
                    }
                } else if (continueRead(parsableByteArray, this.pesScratch.data, 9)) {
                    if (parseHeader()) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    setState(i4);
                }
            } else {
                parsableByteArray.skipBytes(parsableByteArray.bytesLeft());
            }
        }
    }

    @Override // androidx.media3.extractor.p020ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        this.reader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.p020ts.TsPayloadReader
    public final void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.seenFirstDts = false;
        this.reader.seek();
    }
}
