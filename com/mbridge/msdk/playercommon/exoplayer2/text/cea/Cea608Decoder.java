package com.mbridge.msdk.playercommon.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleOutputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class Cea608Decoder extends CeaDecoder {
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_608_ID = 4;
    private static final int CC_VALID_FLAG = 4;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private int captionMode;
    private int captionRowCount;
    private List<Cue> cues;
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedField;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ArrayList<CueBuilder> cueBuilders = new ArrayList<>();
    private CueBuilder currentCueBuilder = new CueBuilder(0, 4);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private int indent;
        private int row;
        private int tabOffset;
        private final List<CueStyle> cueStyles = new ArrayList();
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final StringBuilder captionStringBuilder = new StringBuilder();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i, boolean z, int i2) {
                this.style = i;
                this.underline = z;
                this.start = i2;
            }
        }

        public CueBuilder(int i, int i2) {
            reset(i);
            setCaptionRowCount(i2);
        }

        private static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        private static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        private static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        public void append(char c) {
            this.captionStringBuilder.append(c);
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
                for (int size = this.cueStyles.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = this.cueStyles.get(size);
                    int i = cueStyle.start;
                    if (i == length) {
                        cueStyle.start = i - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        public Cue build() {
            int i;
            float f;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.rolledUpCaptions.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i4));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildSpannableString());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.indent + this.tabOffset;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (this.captionMode == 2 && (Math.abs(i6) < 3 || length < 0)) {
                f = 0.5f;
                i = 1;
            } else if (this.captionMode == 2 && i6 > 0) {
                f = (((32 - length) / 32.0f) * 0.8f) + 0.1f;
                i = 2;
            } else {
                i = 0;
                f = ((i5 / 32.0f) * 0.8f) + 0.1f;
            }
            if (this.captionMode != 1 && (i2 = this.row) <= 7) {
                i3 = 0;
            } else {
                i2 = (this.row - 15) - 2;
                i3 = 2;
            }
            return new Cue(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i2, 1, i3, f, i, Float.MIN_VALUE);
        }

        public SpannableString buildSpannableString() {
            int i;
            boolean z;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = false;
            while (i6 < this.cueStyles.size()) {
                CueStyle cueStyle = this.cueStyles.get(i6);
                boolean z3 = cueStyle.underline;
                int i8 = cueStyle.style;
                if (i8 != 8) {
                    if (i8 == 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i8 != 7) {
                        i5 = Cea608Decoder.STYLE_COLORS[i8];
                    }
                    z2 = z;
                }
                int i9 = cueStyle.start;
                i6++;
                if (i6 < this.cueStyles.size()) {
                    i = this.cueStyles.get(i6).start;
                } else {
                    i = length;
                }
                if (i9 != i) {
                    if (i2 != -1 && !z3) {
                        setUnderlineSpan(spannableStringBuilder, i2, i9);
                        i2 = -1;
                    } else if (i2 == -1 && z3) {
                        i2 = i9;
                    }
                    if (i3 != -1 && !z2) {
                        setItalicSpan(spannableStringBuilder, i3, i9);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i9;
                    }
                    if (i5 != i4) {
                        setColorSpan(spannableStringBuilder, i7, i9, i4);
                        i4 = i5;
                        i7 = i9;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                setUnderlineSpan(spannableStringBuilder, i2, length);
            }
            if (i3 != -1 && i3 != length) {
                setItalicSpan(spannableStringBuilder, i3, length);
            }
            if (i7 != length) {
                setColorSpan(spannableStringBuilder, i7, length, i4);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public int getRow() {
            return this.row;
        }

        public boolean isEmpty() {
            if (this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0) {
                return true;
            }
            return false;
        }

        public void reset(int i) {
            this.captionMode = i;
            this.cueStyles.clear();
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.setLength(0);
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
        }

        public void rollUp() {
            this.rolledUpCaptions.add(buildSpannableString());
            this.captionStringBuilder.setLength(0);
            this.cueStyles.clear();
            int min = Math.min(this.captionRowCount, this.row);
            while (this.rolledUpCaptions.size() >= min) {
                this.rolledUpCaptions.remove(0);
            }
        }

        public void setCaptionRowCount(int i) {
            this.captionRowCount = i;
        }

        public void setIndent(int i) {
            this.indent = i;
        }

        public void setRow(int i) {
            this.row = i;
        }

        public void setStyle(int i, boolean z) {
            this.cueStyles.add(new CueStyle(i, z, this.captionStringBuilder.length()));
        }

        public void setTab(int i) {
            this.tabOffset = i;
        }

        public String toString() {
            return this.captionStringBuilder.toString();
        }
    }

    public Cea608Decoder(String str, int i) {
        int i2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.packetLength = i2;
        if (i != 3 && i != 4) {
            this.selectedField = 1;
        } else {
            this.selectedField = 2;
        }
        setCaptionMode(0);
        resetCueBuilders();
    }

    private static char getChar(byte b) {
        return (char) BASIC_CHARACTER_SET[(b & Byte.MAX_VALUE) - 32];
    }

    private List<Cue> getDisplayCues() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.cueBuilders.size(); i++) {
            Cue build = this.cueBuilders.get(i).build();
            if (build != null) {
                arrayList.add(build);
            }
        }
        return arrayList;
    }

    private static char getExtendedEsFrChar(byte b) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b & 31];
    }

    private static char getExtendedPtDeChar(byte b) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b & 31];
    }

    private static char getSpecialChar(byte b) {
        return (char) SPECIAL_CHARACTER_SET[b & 15];
    }

    private boolean handleCtrl(byte b, byte b2) {
        boolean isRepeatable = isRepeatable(b);
        if (isRepeatable) {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b && this.repeatableControlCc2 == b2) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b;
            this.repeatableControlCc2 = b2;
        }
        if (isMidrowCtrlCode(b, b2)) {
            handleMidrowCtrl(b2);
        } else if (isPreambleAddressCode(b, b2)) {
            handlePreambleAddressCode(b, b2);
        } else if (isTabCtrlCode(b, b2)) {
            this.currentCueBuilder.setTab(b2 - 32);
        } else if (isMiscCode(b, b2)) {
            handleMiscCode(b2);
        }
        return isRepeatable;
    }

    private void handleMidrowCtrl(byte b) {
        boolean z;
        this.currentCueBuilder.append(' ');
        if ((b & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.currentCueBuilder.setStyle((b >> 1) & 7, z);
    }

    private void handleMiscCode(byte b) {
        if (b != 32) {
            if (b != 41) {
                switch (b) {
                    case 37:
                        setCaptionMode(1);
                        setCaptionRowCount(2);
                        return;
                    case 38:
                        setCaptionMode(1);
                        setCaptionRowCount(3);
                        return;
                    case 39:
                        setCaptionMode(1);
                        setCaptionRowCount(4);
                        return;
                    default:
                        int i = this.captionMode;
                        if (i == 0) {
                            return;
                        }
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.cues = null;
                                    if (i == 1 || i == 3) {
                                        resetCueBuilders();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i == 1 && !this.currentCueBuilder.isEmpty()) {
                                        this.currentCueBuilder.rollUp();
                                        return;
                                    }
                                    return;
                                case 46:
                                    resetCueBuilders();
                                    return;
                                case 47:
                                    this.cues = getDisplayCues();
                                    resetCueBuilders();
                                    return;
                                default:
                                    return;
                            }
                        }
                        this.currentCueBuilder.backspace();
                        return;
                }
            }
            setCaptionMode(3);
            return;
        }
        setCaptionMode(2);
    }

    private void handlePreambleAddressCode(byte b, byte b2) {
        boolean z;
        boolean z2;
        int i;
        int i2 = ROW_INDICES[b & 7];
        boolean z3 = false;
        if ((b2 & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2++;
        }
        if (i2 != this.currentCueBuilder.getRow()) {
            if (this.captionMode != 1 && !this.currentCueBuilder.isEmpty()) {
                CueBuilder cueBuilder = new CueBuilder(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = cueBuilder;
                this.cueBuilders.add(cueBuilder);
            }
            this.currentCueBuilder.setRow(i2);
        }
        if ((b2 & 16) == 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((b2 & 1) == 1) {
            z3 = true;
        }
        int i3 = (b2 >> 1) & 7;
        CueBuilder cueBuilder2 = this.currentCueBuilder;
        if (z2) {
            i = 8;
        } else {
            i = i3;
        }
        cueBuilder2.setStyle(i, z3);
        if (z2) {
            this.currentCueBuilder.setIndent(COLUMN_INDICES[i3]);
        }
    }

    private static boolean isMidrowCtrlCode(byte b, byte b2) {
        if ((b & 247) == 17 && (b2 & 240) == 32) {
            return true;
        }
        return false;
    }

    private static boolean isMiscCode(byte b, byte b2) {
        if ((b & 247) == 20 && (b2 & 240) == 32) {
            return true;
        }
        return false;
    }

    private static boolean isPreambleAddressCode(byte b, byte b2) {
        if ((b & 240) == 16 && (b2 & 192) == 64) {
            return true;
        }
        return false;
    }

    private static boolean isRepeatable(byte b) {
        if ((b & 240) == 16) {
            return true;
        }
        return false;
    }

    private static boolean isTabCtrlCode(byte b, byte b2) {
        if ((b & 247) == 23 && b2 >= 33 && b2 <= 35) {
            return true;
        }
        return false;
    }

    private void resetCueBuilders() {
        this.currentCueBuilder.reset(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    private void setCaptionMode(int i) {
        int i2 = this.captionMode;
        if (i2 == i) {
            return;
        }
        this.captionMode = i;
        resetCueBuilders();
        if (i2 == 3 || i == 1 || i == 0) {
            this.cues = null;
        }
    }

    private void setCaptionRowCount(int i) {
        this.captionRowCount = i;
        this.currentCueBuilder.setCaptionRowCount(i);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    protected final Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle(list);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    protected final void decode(SubtitleInputBuffer subtitleInputBuffer) {
        byte readUnsignedByte;
        int i;
        this.ccData.reset(subtitleInputBuffer.data.array(), subtitleInputBuffer.data.limit());
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int bytesLeft = this.ccData.bytesLeft();
            int i2 = this.packetLength;
            if (bytesLeft < i2) {
                break;
            }
            if (i2 == 2) {
                readUnsignedByte = CC_IMPLICIT_DATA_HEADER;
            } else {
                readUnsignedByte = (byte) this.ccData.readUnsignedByte();
            }
            byte readUnsignedByte2 = (byte) (this.ccData.readUnsignedByte() & 127);
            byte readUnsignedByte3 = (byte) (this.ccData.readUnsignedByte() & 127);
            if ((readUnsignedByte & 6) == 4 && ((i = this.selectedField) != 1 || (readUnsignedByte & 1) == 0)) {
                if (i != 2 || (readUnsignedByte & 1) == 1) {
                    if (readUnsignedByte2 != 0 || readUnsignedByte3 != 0) {
                        if ((readUnsignedByte2 & 247) == 17 && (readUnsignedByte3 & 240) == 48) {
                            this.currentCueBuilder.append(getSpecialChar(readUnsignedByte3));
                        } else if ((readUnsignedByte2 & 246) == 18 && (readUnsignedByte3 & 224) == 32) {
                            this.currentCueBuilder.backspace();
                            if ((readUnsignedByte2 & 1) == 0) {
                                this.currentCueBuilder.append(getExtendedEsFrChar(readUnsignedByte3));
                            } else {
                                this.currentCueBuilder.append(getExtendedPtDeChar(readUnsignedByte3));
                            }
                        } else if ((readUnsignedByte2 & 224) == 0) {
                            z2 = handleCtrl(readUnsignedByte2, readUnsignedByte3);
                        } else {
                            this.currentCueBuilder.append(getChar(readUnsignedByte2));
                            if ((readUnsignedByte3 & 224) != 0) {
                                this.currentCueBuilder.append(getChar(readUnsignedByte3));
                            }
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            if (!z2) {
                this.repeatableControlSet = false;
            }
            int i3 = this.captionMode;
            if (i3 == 1 || i3 == 3) {
                this.cues = getDisplayCues();
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    protected final boolean isNewSubtitleDataAvailable() {
        if (this.cues != this.lastCues) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    public final /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoder
    public final /* bridge */ /* synthetic */ void setPositionUs(long j) {
        super.setPositionUs(j);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final void release() {
    }
}
