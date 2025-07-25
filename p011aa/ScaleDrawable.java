package p011aa;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: aa.b */
/* loaded from: classes8.dex */
public final class ScaleDrawable extends Drawable implements Animatable {
    @NotNull

    /* renamed from: b */
    private final Drawable f126b;

    /* renamed from: c */
    private final float f127c;

    /* renamed from: d */
    private final float f128d;

    public ScaleDrawable(@NotNull Drawable child, float f, float f2) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f126b = child;
        this.f127c = f;
        this.f128d = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int save = canvas.save();
        try {
            canvas.scale(this.f127c, this.f128d);
            this.f126b.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int m103791d;
        if (this.f126b.getIntrinsicHeight() != -1) {
            m103791d = MathJVM.m103791d(this.f126b.getIntrinsicHeight() * this.f128d);
            return m103791d;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int m103791d;
        if (this.f126b.getIntrinsicWidth() != -1) {
            m103791d = MathJVM.m103791d(this.f126b.getIntrinsicWidth() * this.f127c);
            return m103791d;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f126b.getOpacity();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f126b;
        if ((drawable instanceof Animatable) && ((Animatable) drawable).isRunning()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f126b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f126b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f126b;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f126b;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScaleDrawable(@NotNull Drawable child, float f) {
        this(child, f, f);
        Intrinsics.checkNotNullParameter(child, "child");
    }
}
