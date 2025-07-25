package com.google.android.exoplayer2.p380ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.p380ui.SubtitleView;
import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.CanvasSubtitleOutput */
/* loaded from: classes4.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.Output {

    /* renamed from: b */
    private final List<SubtitlePainter> f35243b;

    /* renamed from: c */
    private List<Cue> f35244c;

    /* renamed from: d */
    private int f35245d;

    /* renamed from: f */
    private float f35246f;

    /* renamed from: g */
    private CaptionStyleCompat f35247g;

    /* renamed from: h */
    private float f35248h;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static Cue m73171a(Cue cue) {
        Cue.Builder textAlignment = cue.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
        if (cue.lineType == 0) {
            textAlignment.setLine(1.0f - cue.line, 0);
        } else {
            textAlignment.setLine((-cue.line) - 1.0f, 1);
        }
        int i = cue.lineAnchor;
        if (i != 0) {
            if (i == 2) {
                textAlignment.setLineAnchor(0);
            }
        } else {
            textAlignment.setLineAnchor(2);
        }
        return textAlignment.build();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<Cue> list = this.f35244c;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom > paddingTop && width > paddingLeft) {
            int i = paddingBottom - paddingTop;
            float resolveTextSize = SubtitleViewUtils.resolveTextSize(this.f35245d, this.f35246f, height, i);
            if (resolveTextSize <= 0.0f) {
                return;
            }
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                Cue cue = list.get(i2);
                if (cue.verticalType != Integer.MIN_VALUE) {
                    cue = m73171a(cue);
                }
                Cue cue2 = cue;
                int i3 = paddingBottom;
                this.f35243b.get(i2).draw(cue2, this.f35247g, resolveTextSize, SubtitleViewUtils.resolveTextSize(cue2.textSizeType, cue2.textSize, height, i), this.f35248h, canvas, paddingLeft, paddingTop, width, i3);
                i2++;
                size = size;
                i = i;
                paddingBottom = i3;
                width = width;
            }
        }
    }

    @Override // com.google.android.exoplayer2.p380ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.f35244c = list;
        this.f35247g = captionStyleCompat;
        this.f35246f = f;
        this.f35245d = i;
        this.f35248h = f2;
        while (this.f35243b.size() < list.size()) {
            this.f35243b.add(new SubtitlePainter(getContext()));
        }
        invalidate();
    }

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35243b = new ArrayList();
        this.f35244c = Collections.emptyList();
        this.f35245d = 0;
        this.f35246f = 0.0533f;
        this.f35247g = CaptionStyleCompat.DEFAULT;
        this.f35248h = 0.08f;
    }
}
