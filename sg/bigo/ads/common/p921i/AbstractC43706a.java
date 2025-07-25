package sg.bigo.ads.common.p921i;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: sg.bigo.ads.common.i.a */
/* loaded from: classes10.dex */
public abstract class AbstractC43706a extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public Drawable f114413a;

    /* renamed from: b */
    private boolean f114414b;

    public AbstractC43706a() {
        m5153a(null);
    }

    /* renamed from: a */
    public final void m5153a(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f114413a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f114413a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setVisible(isVisible(), true);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 19)
    public int getAlpha() {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return 255;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            return changingConfigurations | drawable.getChangingConfigurations();
        }
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 23)
    public void getHotspotBounds(@NonNull Rect rect) {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            drawable.getHotspotBounds(rect);
        } else {
            rect.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 29)
    public Insets getOpticalInsets() {
        Insets insets;
        Insets opticalInsets;
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            opticalInsets = drawable.getOpticalInsets();
            return opticalInsets;
        }
        insets = Insets.NONE;
        return insets;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            drawable.getOutline(outline);
        } else {
            super.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Drawable drawable = this.f114413a;
        if (drawable != null && drawable.getPadding(rect)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f114413a;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f114414b && super.mutate() == this) {
            Drawable drawable = this.f114413a;
            if (drawable != null) {
                drawable.mutate();
            }
            this.f114414b = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NonNull Rect rect) {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 23)
    public boolean onLayoutDirectionChanged(int i) {
        Drawable drawable = this.f114413a;
        if (drawable != null && drawable.setLayoutDirection(i)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f114413a;
        if (drawable != null && drawable.setLevel(i)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f114413a;
        if (drawable != null && drawable.isStateful()) {
            boolean state = this.f114413a.setState(iArr);
            if (state) {
                onBoundsChange(getBounds());
            }
            return state;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 29)
    public void setTintBlendMode(@NonNull BlendMode blendMode) {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public void setTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f114413a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3;
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f114413a;
        if (drawable != null && drawable.setVisible(z, z2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        return z3 | visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
