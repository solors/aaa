package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

import android.text.Layout;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
final class TtmlStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;

    /* renamed from: ON */
    private static final int f58764ON = 1;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    private int backgroundColor;
    private int fontColor;
    private String fontFamily;
    private float fontSize;
    private boolean hasBackgroundColor;
    private boolean hasFontColor;

    /* renamed from: id */
    private String f58765id;
    private TtmlStyle inheritableStyle;
    private Layout.Alignment textAlign;
    private int linethrough = -1;
    private int underline = -1;
    private int bold = -1;
    private int italic = -1;
    private int fontSizeUnit = -1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface FontSizeUnit {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    private @interface OptionalBoolean {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface StyleFlags {
    }

    public final TtmlStyle chain(TtmlStyle ttmlStyle) {
        return inherit(ttmlStyle, true);
    }

    public final int getBackgroundColor() {
        if (this.hasBackgroundColor) {
            return this.backgroundColor;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int getFontColor() {
        if (this.hasFontColor) {
            return this.fontColor;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final int getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    public final String getId() {
        return this.f58765id;
    }

    public final int getStyle() {
        int i;
        int i2 = this.bold;
        if (i2 == -1 && this.italic == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.italic == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    public final Layout.Alignment getTextAlign() {
        return this.textAlign;
    }

    public final boolean hasBackgroundColor() {
        return this.hasBackgroundColor;
    }

    public final boolean hasFontColor() {
        return this.hasFontColor;
    }

    public final TtmlStyle inherit(TtmlStyle ttmlStyle) {
        return inherit(ttmlStyle, false);
    }

    public final boolean isLinethrough() {
        if (this.linethrough == 1) {
            return true;
        }
        return false;
    }

    public final boolean isUnderline() {
        if (this.underline == 1) {
            return true;
        }
        return false;
    }

    public final TtmlStyle setBackgroundColor(int i) {
        this.backgroundColor = i;
        this.hasBackgroundColor = true;
        return this;
    }

    public final TtmlStyle setBold(boolean z) {
        boolean z2;
        if (this.inheritableStyle == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        this.bold = z ? 1 : 0;
        return this;
    }

    public final TtmlStyle setFontColor(int i) {
        boolean z;
        if (this.inheritableStyle == null) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        this.fontColor = i;
        this.hasFontColor = true;
        return this;
    }

    public final TtmlStyle setFontFamily(String str) {
        boolean z;
        if (this.inheritableStyle == null) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        this.fontFamily = str;
        return this;
    }

    public final TtmlStyle setFontSize(float f) {
        this.fontSize = f;
        return this;
    }

    public final TtmlStyle setFontSizeUnit(int i) {
        this.fontSizeUnit = i;
        return this;
    }

    public final TtmlStyle setId(String str) {
        this.f58765id = str;
        return this;
    }

    public final TtmlStyle setItalic(boolean z) {
        boolean z2;
        if (this.inheritableStyle == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        this.italic = z ? 1 : 0;
        return this;
    }

    public final TtmlStyle setLinethrough(boolean z) {
        boolean z2;
        if (this.inheritableStyle == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        this.linethrough = z ? 1 : 0;
        return this;
    }

    public final TtmlStyle setTextAlign(Layout.Alignment alignment) {
        this.textAlign = alignment;
        return this;
    }

    public final TtmlStyle setUnderline(boolean z) {
        boolean z2;
        if (this.inheritableStyle == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        this.underline = z ? 1 : 0;
        return this;
    }

    private TtmlStyle inherit(TtmlStyle ttmlStyle, boolean z) {
        if (ttmlStyle != null) {
            if (!this.hasFontColor && ttmlStyle.hasFontColor) {
                setFontColor(ttmlStyle.fontColor);
            }
            if (this.bold == -1) {
                this.bold = ttmlStyle.bold;
            }
            if (this.italic == -1) {
                this.italic = ttmlStyle.italic;
            }
            if (this.fontFamily == null) {
                this.fontFamily = ttmlStyle.fontFamily;
            }
            if (this.linethrough == -1) {
                this.linethrough = ttmlStyle.linethrough;
            }
            if (this.underline == -1) {
                this.underline = ttmlStyle.underline;
            }
            if (this.textAlign == null) {
                this.textAlign = ttmlStyle.textAlign;
            }
            if (this.fontSizeUnit == -1) {
                this.fontSizeUnit = ttmlStyle.fontSizeUnit;
                this.fontSize = ttmlStyle.fontSize;
            }
            if (z && !this.hasBackgroundColor && ttmlStyle.hasBackgroundColor) {
                setBackgroundColor(ttmlStyle.backgroundColor);
            }
        }
        return this;
    }
}
