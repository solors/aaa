package com.google.android.exoplayer2.p380ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: com.google.android.exoplayer2.ui.CaptionStyleCompat */
/* loaded from: classes4.dex */
public final class CaptionStyleCompat {
    public static final CaptionStyleCompat DEFAULT = new CaptionStyleCompat(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int USE_TRACK_COLOR_SETTINGS = 1;
    public final int backgroundColor;
    public final int edgeColor;
    public final int edgeType;
    public final int foregroundColor;
    @Nullable
    public final Typeface typeface;
    public final int windowColor;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.CaptionStyleCompat$EdgeType */
    /* loaded from: classes4.dex */
    public @interface EdgeType {
    }

    public CaptionStyleCompat(int i, int i2, int i3, int i4, int i5, @Nullable Typeface typeface) {
        this.foregroundColor = i;
        this.backgroundColor = i2;
        this.windowColor = i3;
        this.edgeType = i4;
        this.edgeColor = i5;
        this.typeface = typeface;
    }

    @RequiresApi(19)
    /* renamed from: a */
    private static CaptionStyleCompat m73170a(CaptioningManager.CaptionStyle captionStyle) {
        return new CaptionStyleCompat(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @RequiresApi(21)
    /* renamed from: b */
    private static CaptionStyleCompat m73169b(CaptioningManager.CaptionStyle captionStyle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (captionStyle.hasForegroundColor()) {
            i = captionStyle.foregroundColor;
        } else {
            i = DEFAULT.foregroundColor;
        }
        int i6 = i;
        if (captionStyle.hasBackgroundColor()) {
            i2 = captionStyle.backgroundColor;
        } else {
            i2 = DEFAULT.backgroundColor;
        }
        int i7 = i2;
        if (captionStyle.hasWindowColor()) {
            i3 = captionStyle.windowColor;
        } else {
            i3 = DEFAULT.windowColor;
        }
        int i8 = i3;
        if (captionStyle.hasEdgeType()) {
            i4 = captionStyle.edgeType;
        } else {
            i4 = DEFAULT.edgeType;
        }
        int i9 = i4;
        if (captionStyle.hasEdgeColor()) {
            i5 = captionStyle.edgeColor;
        } else {
            i5 = DEFAULT.edgeColor;
        }
        return new CaptionStyleCompat(i6, i7, i8, i9, i5, captionStyle.getTypeface());
    }

    @RequiresApi(19)
    public static CaptionStyleCompat createFromCaptionStyle(CaptioningManager.CaptionStyle captionStyle) {
        if (Util.SDK_INT >= 21) {
            return m73169b(captionStyle);
        }
        return m73170a(captionStyle);
    }
}
