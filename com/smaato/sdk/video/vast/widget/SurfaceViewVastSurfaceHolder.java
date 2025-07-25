package com.smaato.sdk.video.vast.widget;

import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.vast.widget.SurfaceViewVastSurfaceHolder;
import com.smaato.sdk.video.vast.widget.VastSurfaceHolder;

/* loaded from: classes7.dex */
public class SurfaceViewVastSurfaceHolder implements VastSurfaceHolder {
    @Nullable
    private VastSurfaceHolder.OnSurfaceAvailableListener onSurfaceAvailableListener;
    @Nullable
    private VastSurfaceHolder.OnSurfaceChangedListener onSurfaceChangedListener;
    @Nullable
    private VastSurfaceHolder.OnSurfaceDestroyedListener onSurfaceDestroyedListener;
    @NonNull
    private final SurfaceView surfaceView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.smaato.sdk.video.vast.widget.SurfaceViewVastSurfaceHolder$a */
    /* loaded from: classes7.dex */
    public class SurfaceHolder$CallbackC28106a implements SurfaceHolder.Callback {
        SurfaceHolder$CallbackC28106a() {
            SurfaceViewVastSurfaceHolder.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m38531a(SurfaceHolder surfaceHolder, int i, int i2, VastSurfaceHolder.OnSurfaceChangedListener onSurfaceChangedListener) {
            m38528d(surfaceHolder, i, i2, onSurfaceChangedListener);
        }

        /* renamed from: b */
        public static /* synthetic */ void m38530b(SurfaceHolder surfaceHolder, VastSurfaceHolder.OnSurfaceDestroyedListener onSurfaceDestroyedListener) {
            m38526f(surfaceHolder, onSurfaceDestroyedListener);
        }

        /* renamed from: c */
        public static /* synthetic */ void m38529c(SurfaceHolder surfaceHolder, VastSurfaceHolder.OnSurfaceAvailableListener onSurfaceAvailableListener) {
            m38527e(surfaceHolder, onSurfaceAvailableListener);
        }

        /* renamed from: d */
        public static /* synthetic */ void m38528d(SurfaceHolder surfaceHolder, int i, int i2, VastSurfaceHolder.OnSurfaceChangedListener onSurfaceChangedListener) {
            Surface surface = surfaceHolder.getSurface();
            if (surface != null) {
                onSurfaceChangedListener.onSurfaceChanged(surface, i, i2);
            }
        }

        /* renamed from: e */
        public static /* synthetic */ void m38527e(SurfaceHolder surfaceHolder, VastSurfaceHolder.OnSurfaceAvailableListener onSurfaceAvailableListener) {
            Surface surface = surfaceHolder.getSurface();
            if (surface != null) {
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                onSurfaceAvailableListener.onSurfaceAvailable(surface, surfaceFrame.width(), surfaceFrame.height());
            }
        }

        /* renamed from: f */
        public static /* synthetic */ void m38526f(SurfaceHolder surfaceHolder, VastSurfaceHolder.OnSurfaceDestroyedListener onSurfaceDestroyedListener) {
            Surface surface = surfaceHolder.getSurface();
            if (surface != null) {
                onSurfaceDestroyedListener.onSurfaceDestroyed(surface);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(final SurfaceHolder surfaceHolder, int i, final int i2, final int i3) {
            Objects.onNotNull(SurfaceViewVastSurfaceHolder.this.onSurfaceChangedListener, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.a
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    SurfaceViewVastSurfaceHolder.SurfaceHolder$CallbackC28106a.m38531a(surfaceHolder, i2, i3, (VastSurfaceHolder.OnSurfaceChangedListener) obj);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(final SurfaceHolder surfaceHolder) {
            Objects.onNotNull(SurfaceViewVastSurfaceHolder.this.onSurfaceAvailableListener, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.b
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    SurfaceViewVastSurfaceHolder.SurfaceHolder$CallbackC28106a.m38529c(surfaceHolder, (VastSurfaceHolder.OnSurfaceAvailableListener) obj);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
            Objects.onNotNull(SurfaceViewVastSurfaceHolder.this.onSurfaceDestroyedListener, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.c
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    SurfaceViewVastSurfaceHolder.SurfaceHolder$CallbackC28106a.m38530b(surfaceHolder, (VastSurfaceHolder.OnSurfaceDestroyedListener) obj);
                }
            });
        }
    }

    public SurfaceViewVastSurfaceHolder(@NonNull SurfaceView surfaceView) {
        this.surfaceView = surfaceView;
        surfaceView.getHolder().addCallback(new SurfaceHolder$CallbackC28106a());
    }

    @Override // com.smaato.sdk.video.vast.widget.VastSurfaceHolder
    @Nullable
    public Surface getSurface() {
        return this.surfaceView.getHolder().getSurface();
    }

    @Override // com.smaato.sdk.video.vast.widget.VastSurfaceHolder
    @NonNull
    public View getView() {
        return this.surfaceView;
    }

    @Override // com.smaato.sdk.video.vast.widget.VastSurfaceHolder
    public void setOnSurfaceAvailableListener(@Nullable VastSurfaceHolder.OnSurfaceAvailableListener onSurfaceAvailableListener) {
        this.onSurfaceAvailableListener = onSurfaceAvailableListener;
    }

    @Override // com.smaato.sdk.video.vast.widget.VastSurfaceHolder
    public void setOnSurfaceChangedListener(@Nullable VastSurfaceHolder.OnSurfaceChangedListener onSurfaceChangedListener) {
        this.onSurfaceChangedListener = onSurfaceChangedListener;
    }

    @Override // com.smaato.sdk.video.vast.widget.VastSurfaceHolder
    public void setOnSurfaceDestroyedListener(@Nullable VastSurfaceHolder.OnSurfaceDestroyedListener onSurfaceDestroyedListener) {
        this.onSurfaceDestroyedListener = onSurfaceDestroyedListener;
    }
}
