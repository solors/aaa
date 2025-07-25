package com.mobilefuse.sdk.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mobilefuse.sdk.AdRendererContainer;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import java.util.Date;

/* loaded from: classes7.dex */
public class MraidAdRendererContainer extends AdRendererContainer {
    private static final int MIN_MS_BETWEEN_CHECKPOSITION = 50;
    private boolean attachedToWindow;
    private int checkPositionTimeInterval;
    private Handler handler;
    private boolean isOnscreen;
    private boolean isVideoOnScreen;
    private boolean isVisible;
    @Nullable
    private OnLayoutListener onLayoutListener;
    private Date timeOfLastCheckPosition;
    private ViewableChangeListener viewableChangeListener;
    private boolean viewableCheckPaused;

    /* loaded from: classes7.dex */
    public interface OnLayoutListener {
        void onLayout(boolean z, int i, int i2, int i3, int i4);
    }

    /* loaded from: classes7.dex */
    public interface ViewableChangeListener {
        void onViewableChange(int i, int i2, int i3, int i4, double d, Rect rect) throws Throwable;
    }

    public MraidAdRendererContainer(@NonNull Context context) throws Throwable {
        super(context);
        this.isOnscreen = false;
        this.isVideoOnScreen = false;
        this.isVisible = false;
        this.handler = new Handler(Looper.getMainLooper());
        this.viewableCheckPaused = false;
        this.checkPositionTimeInterval = 1000;
        this.timeOfLastCheckPosition = new Date();
    }

    /* renamed from: b */
    public static /* synthetic */ void m47767b(MraidAdRendererContainer mraidAdRendererContainer) {
        mraidAdRendererContainer.lambda$onDetachedFromWindow$2();
    }

    /* renamed from: c */
    public static /* synthetic */ void m47766c(MraidAdRendererContainer mraidAdRendererContainer) {
        mraidAdRendererContainer.lambda$onAttachedToWindow$1();
    }

    /* renamed from: d */
    public static /* synthetic */ void m47765d(MraidAdRendererContainer mraidAdRendererContainer) {
        mraidAdRendererContainer.lambda$onLayout$0();
    }

    public /* synthetic */ void lambda$onAttachedToWindow$1() {
        try {
            checkPosition();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public /* synthetic */ void lambda$onDetachedFromWindow$2() {
        try {
            checkPosition();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public /* synthetic */ void lambda$onLayout$0() {
        try {
            checkPosition();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private boolean tooManyCheckPositionRequests() throws Throwable {
        if (new Date().getTime() - this.timeOfLastCheckPosition.getTime() >= 50) {
            return false;
        }
        return true;
    }

    public double checkPosition() throws Throwable {
        Rect rect;
        double d = 0.0d;
        if (!this.attachedToWindow) {
            return 0.0d;
        }
        if (tooManyCheckPositionRequests()) {
            return -1.0d;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect2 = new Rect();
        boolean globalVisibleRect = getGlobalVisibleRect(rect2);
        boolean z = false;
        if (!globalVisibleRect) {
            rect2 = new Rect(0, 0, 0, 0);
        }
        int i = iArr[0];
        int width = getWidth() + i;
        int i2 = iArr[1];
        int height = getHeight() + i2;
        double height2 = rect2.height() * rect2.width();
        double height3 = getHeight() * getWidth();
        if (height3 != 0.0d) {
            d = 100.0d * (height2 / height3);
        }
        int[] screenSizeAsPixels = Utils.getScreenSizeAsPixels(getContext());
        if (width > 0 && i < screenSizeAsPixels[0] && height > 0 && i2 < screenSizeAsPixels[1]) {
            z = true;
        }
        this.isOnscreen = z;
        if (this.viewableChangeListener != null) {
            if (globalVisibleRect) {
                rect = new Rect();
                getLocalVisibleRect(rect);
            } else {
                rect = null;
            }
            this.viewableChangeListener.onViewableChange(i, i2, getWidth(), getHeight(), d, rect);
        }
        this.timeOfLastCheckPosition = new Date();
        return d;
    }

    @Nullable
    public OnLayoutListener getOnLayoutListener() {
        return this.onLayoutListener;
    }

    boolean isViewable() {
        if (this.isOnscreen && this.isVisible) {
            return true;
        }
        return false;
    }

    @Override // com.mobilefuse.sdk.AdRendererContainer, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        try {
            getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.mobilefuse.sdk.mraid.o
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    MraidAdRendererContainer.m47766c(MraidAdRendererContainer.this);
                }
            });
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @Override // com.mobilefuse.sdk.AdRendererContainer, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.attachedToWindow = false;
        try {
            getViewTreeObserver().removeOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.mobilefuse.sdk.mraid.n
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    MraidAdRendererContainer.m47767b(MraidAdRendererContainer.this);
                }
            });
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        try {
            OnLayoutListener onLayoutListener = this.onLayoutListener;
            if (onLayoutListener != null) {
                onLayoutListener.onLayout(z, i, i2, i3, i4);
            }
            this.handler.postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.mraid.m
                @Override // java.lang.Runnable
                public final void run() {
                    MraidAdRendererContainer.m47765d(MraidAdRendererContainer.this);
                }
            }, 50L);
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public void setOnLayoutListener(@Nullable OnLayoutListener onLayoutListener) {
        this.onLayoutListener = onLayoutListener;
    }

    public void setViewableChangeListener(ViewableChangeListener viewableChangeListener) {
        this.viewableChangeListener = viewableChangeListener;
    }

    public MraidAdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.isOnscreen = false;
        this.isVideoOnScreen = false;
        this.isVisible = false;
        this.handler = new Handler(Looper.getMainLooper());
        this.viewableCheckPaused = false;
        this.checkPositionTimeInterval = 1000;
        this.timeOfLastCheckPosition = new Date();
    }

    public MraidAdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        this.isOnscreen = false;
        this.isVideoOnScreen = false;
        this.isVisible = false;
        this.handler = new Handler(Looper.getMainLooper());
        this.viewableCheckPaused = false;
        this.checkPositionTimeInterval = 1000;
        this.timeOfLastCheckPosition = new Date();
    }

    @RequiresApi(api = 21)
    public MraidAdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) throws Throwable {
        super(context, attributeSet, i, i2);
        this.isOnscreen = false;
        this.isVideoOnScreen = false;
        this.isVisible = false;
        this.handler = new Handler(Looper.getMainLooper());
        this.viewableCheckPaused = false;
        this.checkPositionTimeInterval = 1000;
        this.timeOfLastCheckPosition = new Date();
    }
}
