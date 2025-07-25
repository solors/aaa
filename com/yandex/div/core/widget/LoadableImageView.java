package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.internal.widget.AspectImageView;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011aa.ScaleDrawable;
import p1072z8.C45190f;
import p789m9.LoadReference;

/* compiled from: LoadableImageView.kt */
@Metadata
/* loaded from: classes8.dex */
public class LoadableImageView extends AspectImageView implements LoadableImage {
    @Nullable

    /* renamed from: j */
    private Bitmap f75990j;
    @Nullable

    /* renamed from: k */
    private LoadReference f75991k;
    @Nullable

    /* renamed from: l */
    private Functions<Unit> f75992l;
    @Nullable

    /* renamed from: m */
    private Drawable f75993m;

    public /* synthetic */ LoadableImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: c */
    private final Drawable m36551c(Drawable drawable) {
        if (m36550d()) {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    bitmap.setDensity(160);
                }
                bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
                return drawable;
            } else if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                return new ScaleDrawable(drawable, getContext().getResources().getDisplayMetrics().density);
            } else {
                return drawable;
            }
        }
        return drawable;
    }

    /* renamed from: d */
    private final boolean m36550d() {
        boolean z;
        if (m36549e(getLayoutParams().width) && m36549e(getLayoutParams().height)) {
            z = true;
        } else {
            z = false;
        }
        if (z || getImageScale() == AspectImageView.EnumC29793a.NO_SCALE) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m36549e(int i) {
        if (i != -3 && i != -2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setImageChangeCallback$default(LoadableImageView loadableImageView, Functions functions, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                functions = null;
            }
            loadableImageView.setImageChangeCallback(functions);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setImageChangeCallback");
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        getDelegate();
        super.buildDrawingCache(z);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void cleanLoadingTask() {
        setTag(C45190f.bitmap_load_references_tag, null);
    }

    @Nullable
    public final Bitmap getCurrentBitmapWithoutFilters$div_release() {
        return this.f75990j;
    }

    @Nullable
    public DivViewDelegate getDelegate() {
        return null;
    }

    @Nullable
    public final Drawable getExternalImage() {
        return this.f75993m;
    }

    @Nullable
    public final LoadReference getLoadReference$div_release() {
        return this.f75991k;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    @Nullable
    public Future<?> getLoadingTask() {
        Object tag = getTag(C45190f.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    public void imageLoaded() {
        setTag(C45190f.image_loaded_flag, Boolean.TRUE);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable dr) {
        Intrinsics.checkNotNullParameter(dr, "dr");
        getDelegate();
        super.invalidateDrawable(dr);
    }

    public boolean isImageLoaded() {
        return Intrinsics.m17075f(getTag(C45190f.image_loaded_flag), Boolean.TRUE);
    }

    public boolean isImagePreview() {
        return Intrinsics.m17075f(getTag(C45190f.image_loaded_flag), Boolean.FALSE);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getDelegate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDelegate();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        getDelegate();
    }

    public void previewLoaded() {
        setTag(C45190f.image_loaded_flag, Boolean.FALSE);
    }

    public void resetImageLoaded() {
        setTag(C45190f.image_loaded_flag, null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void saveLoadingTask(@NotNull Future<?> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        setTag(C45190f.bitmap_load_references_tag, task);
    }

    public final void setCurrentBitmapWithoutFilters$div_release(@Nullable Bitmap bitmap) {
        this.f75990j = bitmap;
    }

    public final void setExternalImage(@Nullable Drawable drawable) {
        Drawable drawable2;
        if (drawable != null) {
            drawable2 = m36551c(drawable);
        } else {
            drawable2 = null;
        }
        this.f75993m = drawable2;
        invalidate();
    }

    public void setImage(@Nullable Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @CallSuper
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        if (this.f75993m == null) {
            if (m36550d() && bitmap != null) {
                bitmap.setDensity(160);
            }
            super.setImageBitmap(bitmap);
            Functions<Unit> functions = this.f75992l;
            if (functions != null) {
                functions.invoke();
                return;
            }
            return;
        }
        Drawable drawable = getDrawable();
        Drawable drawable2 = this.f75993m;
        if (drawable != drawable2) {
            super.setImageDrawable(drawable2);
        }
        Functions<Unit> functions2 = this.f75992l;
        if (functions2 != null) {
            functions2.invoke();
        }
    }

    public final void setImageChangeCallback(@Nullable Functions<Unit> functions) {
        this.f75992l = functions;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @CallSuper
    public void setImageDrawable(@Nullable Drawable drawable) {
        Drawable drawable2;
        if (this.f75993m == null) {
            if (drawable != null) {
                drawable2 = m36551c(drawable);
            } else {
                drawable2 = null;
            }
            super.setImageDrawable(drawable2);
            Functions<Unit> functions = this.f75992l;
            if (functions != null) {
                functions.invoke();
                return;
            }
            return;
        }
        Drawable drawable3 = getDrawable();
        Drawable drawable4 = this.f75993m;
        if (drawable3 != drawable4) {
            super.setImageDrawable(drawable4);
        }
        Functions<Unit> functions2 = this.f75992l;
        if (functions2 != null) {
            functions2.invoke();
        }
    }

    public final void setLoadReference$div_release(@Nullable LoadReference loadReference) {
        this.f75991k = loadReference;
    }

    public void setPlaceholder(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setPreview(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void unscheduleDrawable(@Nullable Drawable drawable) {
        getDelegate();
        super.unscheduleDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void setImage(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
        Drawable drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.f75993m == null) {
            ((Animatable) drawable2).start();
        }
    }

    public void setPreview(@Nullable Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public void setDelegate(@Nullable DivViewDelegate divViewDelegate) {
    }
}
