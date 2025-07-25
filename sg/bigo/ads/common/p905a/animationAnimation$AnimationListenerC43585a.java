package sg.bigo.ads.common.p905a;

import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* renamed from: sg.bigo.ads.common.a.a  reason: invalid class name */
/* loaded from: classes10.dex */
public class animationAnimation$AnimationListenerC43585a extends TranslateAnimation implements Animation.AnimationListener {

    /* renamed from: a */
    private int f114140a;

    /* renamed from: b */
    private int f114141b;

    /* renamed from: c */
    public int f114142c;

    /* renamed from: d */
    public int f114143d;

    /* renamed from: e */
    private int f114144e;

    /* renamed from: f */
    private int f114145f;

    /* renamed from: g */
    private Animation.AnimationListener f114146g;

    public animationAnimation$AnimationListenerC43585a(float f) {
        super(0.0f, 0.0f, 0.0f, f);
    }

    @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        Matrix matrix;
        Transformation transformation2 = new Transformation();
        super.applyTransformation(f, transformation2);
        Matrix matrix2 = transformation2.getMatrix();
        if (transformation != null) {
            matrix = transformation.getMatrix();
        } else {
            matrix = null;
        }
        if (matrix2 != null && matrix != null) {
            float[] fArr = new float[9];
            matrix2.getValues(fArr);
            fArr[2] = fArr[2] - this.f114145f;
            fArr[5] = fArr[5] - this.f114143d;
            matrix.setValues(fArr);
            mo5355a(fArr[2], fArr[5], this.f114140a, this.f114141b);
        }
    }

    @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        super.setAnimationListener(this);
        this.f114140a = i;
        this.f114141b = i2;
    }

    public void onAnimationEnd(Animation animation) {
        Animation.AnimationListener animationListener = this.f114146g;
        if (animationListener != null) {
            animationListener.onAnimationEnd(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        this.f114145f = this.f114144e;
        this.f114143d = this.f114142c;
        Animation.AnimationListener animationListener = this.f114146g;
        if (animationListener != null) {
            animationListener.onAnimationRepeat(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        Animation.AnimationListener animationListener = this.f114146g;
        if (animationListener != null) {
            animationListener.onAnimationStart(animation);
        }
    }

    @Override // android.view.animation.Animation
    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f114146g = animationListener;
    }

    public animationAnimation$AnimationListenerC43585a(float f, float f2) {
        super(1, 0.0f, 1, 0.0f, 1, f, 1, f2);
    }

    /* renamed from: a */
    protected void mo5355a(float f, float f2, int i, int i2) {
    }
}
