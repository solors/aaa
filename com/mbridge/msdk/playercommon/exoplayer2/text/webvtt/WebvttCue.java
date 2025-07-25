package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;

/* loaded from: classes6.dex */
public final class WebvttCue extends Cue {
    public final long endTime;
    public final long startTime;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.playercommon.exoplayer2.text.webvtt.WebvttCue$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C226421 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class Builder {
        private static final String TAG = "WebvttCueBuilder";
        private long endTime;
        private float line;
        private int lineAnchor;
        private int lineType;
        private float position;
        private int positionAnchor;
        private long startTime;
        private SpannableStringBuilder text;
        private Layout.Alignment textAlignment;
        private float width;

        public Builder() {
            reset();
        }

        private Builder derivePositionAnchorFromAlignment() {
            Layout.Alignment alignment = this.textAlignment;
            if (alignment == null) {
                this.positionAnchor = Integer.MIN_VALUE;
            } else {
                int i = C226421.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            Log.w(TAG, "Unrecognized alignment: " + this.textAlignment);
                            this.positionAnchor = 0;
                        } else {
                            this.positionAnchor = 2;
                        }
                    } else {
                        this.positionAnchor = 1;
                    }
                } else {
                    this.positionAnchor = 0;
                }
            }
            return this;
        }

        public WebvttCue build() {
            if (this.position != Float.MIN_VALUE && this.positionAnchor == Integer.MIN_VALUE) {
                derivePositionAnchorFromAlignment();
            }
            return new WebvttCue(this.startTime, this.endTime, this.text, this.textAlignment, this.line, this.lineType, this.lineAnchor, this.position, this.positionAnchor, this.width);
        }

        public void reset() {
            this.startTime = 0L;
            this.endTime = 0L;
            this.text = null;
            this.textAlignment = null;
            this.line = Float.MIN_VALUE;
            this.lineType = Integer.MIN_VALUE;
            this.lineAnchor = Integer.MIN_VALUE;
            this.position = Float.MIN_VALUE;
            this.positionAnchor = Integer.MIN_VALUE;
            this.width = Float.MIN_VALUE;
        }

        public Builder setEndTime(long j) {
            this.endTime = j;
            return this;
        }

        public Builder setLine(float f) {
            this.line = f;
            return this;
        }

        public Builder setLineAnchor(int i) {
            this.lineAnchor = i;
            return this;
        }

        public Builder setLineType(int i) {
            this.lineType = i;
            return this;
        }

        public Builder setPosition(float f) {
            this.position = f;
            return this;
        }

        public Builder setPositionAnchor(int i) {
            this.positionAnchor = i;
            return this;
        }

        public Builder setStartTime(long j) {
            this.startTime = j;
            return this;
        }

        public Builder setText(SpannableStringBuilder spannableStringBuilder) {
            this.text = spannableStringBuilder;
            return this;
        }

        public Builder setTextAlignment(Layout.Alignment alignment) {
            this.textAlignment = alignment;
            return this;
        }

        public Builder setWidth(float f) {
            this.width = f;
            return this;
        }
    }

    public WebvttCue(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public final boolean isNormalCue() {
        if (this.line == Float.MIN_VALUE && this.position == Float.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public WebvttCue(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public WebvttCue(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.startTime = j;
        this.endTime = j2;
    }
}
