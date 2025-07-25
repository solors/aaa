package com.google.android.exoplayer2.p380ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.SubtitleView */
/* loaded from: classes4.dex */
public final class SubtitleView extends FrameLayout {
    public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08f;
    public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533f;
    public static final int VIEW_TYPE_CANVAS = 1;
    public static final int VIEW_TYPE_WEB = 2;

    /* renamed from: b */
    private List<Cue> f35644b;

    /* renamed from: c */
    private CaptionStyleCompat f35645c;

    /* renamed from: d */
    private int f35646d;

    /* renamed from: f */
    private float f35647f;

    /* renamed from: g */
    private float f35648g;

    /* renamed from: h */
    private boolean f35649h;

    /* renamed from: i */
    private boolean f35650i;

    /* renamed from: j */
    private int f35651j;

    /* renamed from: k */
    private Output f35652k;

    /* renamed from: l */
    private View f35653l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.ui.SubtitleView$Output */
    /* loaded from: classes4.dex */
    public interface Output {
        void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.SubtitleView$ViewType */
    /* loaded from: classes4.dex */
    public @interface ViewType {
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private Cue m72844a(Cue cue) {
        Cue.Builder buildUpon = cue.buildUpon();
        if (!this.f35649h) {
            SubtitleViewUtils.removeAllEmbeddedStyling(buildUpon);
        } else if (!this.f35650i) {
            SubtitleViewUtils.removeEmbeddedFontSizes(buildUpon);
        }
        return buildUpon.build();
    }

    /* renamed from: b */
    private void m72843b(int i, float f) {
        this.f35646d = i;
        this.f35647f = f;
        m72842c();
    }

    /* renamed from: c */
    private void m72842c() {
        this.f35652k.update(getCuesWithStylingPreferencesApplied(), this.f35645c, this.f35647f, this.f35646d, this.f35648g);
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.f35649h && this.f35650i) {
            return this.f35644b;
        }
        ArrayList arrayList = new ArrayList(this.f35644b.size());
        for (int i = 0; i < this.f35644b.size(); i++) {
            arrayList.add(m72844a(this.f35644b.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (Util.SDK_INT < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        if (Util.SDK_INT >= 19 && !isInEditMode()) {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                return CaptionStyleCompat.createFromCaptionStyle(captioningManager.getUserStyle());
            }
            return CaptionStyleCompat.DEFAULT;
        }
        return CaptionStyleCompat.DEFAULT;
    }

    private <T extends View & Output> void setView(T t) {
        removeView(this.f35653l);
        View view = this.f35653l;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).destroy();
        }
        this.f35653l = t;
        this.f35652k = t;
        addView(t);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f35650i = z;
        m72842c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f35649h = z;
        m72842c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f35648g = f;
        m72842c();
    }

    public void setCues(@Nullable List<Cue> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f35644b = list;
        m72842c();
    }

    public void setFixedTextSize(@Dimension int i, float f) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m72843b(2, TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f) {
        setFractionalTextSize(f, false);
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.f35645c = captionStyleCompat;
        m72842c();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i) {
        if (this.f35651j == i) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                setView(new WebViewSubtitleOutput(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new CanvasSubtitleOutput(getContext()));
        }
        this.f35651j = i;
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35644b = Collections.emptyList();
        this.f35645c = CaptionStyleCompat.DEFAULT;
        this.f35646d = 0;
        this.f35647f = 0.0533f;
        this.f35648g = 0.08f;
        this.f35649h = true;
        this.f35650i = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f35652k = canvasSubtitleOutput;
        this.f35653l = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f35651j = 1;
    }

    public void setFractionalTextSize(float f, boolean z) {
        m72843b(z ? 1 : 0, f);
    }
}
