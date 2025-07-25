package androidx.compose.p015ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidPaint.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidPaint */
/* loaded from: classes.dex */
public final class AndroidPaint implements Paint {
    @Nullable
    private ColorFilter internalColorFilter;
    @Nullable
    private Shader internalShader;
    @Nullable
    private PathEffect pathEffect;
    @NotNull
    private Paint internalPaint = AndroidPaint_androidKt.makeNativePaint();
    private int _blendMode = BlendMode.Companion.m107471getSrcOver0nO6VwU();

    @Override // androidx.compose.p015ui.graphics.Paint
    @NotNull
    public Paint asFrameworkPaint() {
        return this.internalPaint;
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    public float getAlpha() {
        return AndroidPaint_androidKt.getNativeAlpha(this.internalPaint);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: getBlendMode-0nO6VwU  reason: not valid java name */
    public int mo107404getBlendMode0nO6VwU() {
        return this._blendMode;
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public long mo107405getColor0d7_KjU() {
        return AndroidPaint_androidKt.getNativeColor(this.internalPaint);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    @Nullable
    public ColorFilter getColorFilter() {
        return this.internalColorFilter;
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: getFilterQuality-f-v9h1I  reason: not valid java name */
    public int mo107406getFilterQualityfv9h1I() {
        return AndroidPaint_androidKt.getNativeFilterQuality(this.internalPaint);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    @Nullable
    public PathEffect getPathEffect() {
        return this.pathEffect;
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    @Nullable
    public Shader getShader() {
        return this.internalShader;
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: getStrokeCap-KaPHkGw  reason: not valid java name */
    public int mo107407getStrokeCapKaPHkGw() {
        return AndroidPaint_androidKt.getNativeStrokeCap(this.internalPaint);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: getStrokeJoin-LxFBmk8  reason: not valid java name */
    public int mo107408getStrokeJoinLxFBmk8() {
        return AndroidPaint_androidKt.getNativeStrokeJoin(this.internalPaint);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    public float getStrokeMiterLimit() {
        return AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.internalPaint);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    public float getStrokeWidth() {
        return AndroidPaint_androidKt.getNativeStrokeWidth(this.internalPaint);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: getStyle-TiuSbCo  reason: not valid java name */
    public int mo107409getStyleTiuSbCo() {
        return AndroidPaint_androidKt.getNativeStyle(this.internalPaint);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    public boolean isAntiAlias() {
        return AndroidPaint_androidKt.getNativeAntiAlias(this.internalPaint);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    public void setAlpha(float f) {
        AndroidPaint_androidKt.setNativeAlpha(this.internalPaint, f);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    public void setAntiAlias(boolean z) {
        AndroidPaint_androidKt.setNativeAntiAlias(this.internalPaint, z);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: setBlendMode-s9anfk8  reason: not valid java name */
    public void mo107410setBlendModes9anfk8(int i) {
        this._blendMode = i;
        AndroidPaint_androidKt.m107416setNativeBlendModeGB0RdKg(this.internalPaint, i);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: setColor-8_81llA  reason: not valid java name */
    public void mo107411setColor8_81llA(long j) {
        AndroidPaint_androidKt.m107417setNativeColor4WTKRHQ(this.internalPaint, j);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.internalColorFilter = colorFilter;
        AndroidPaint_androidKt.setNativeColorFilter(this.internalPaint, colorFilter);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: setFilterQuality-vDHp3xo  reason: not valid java name */
    public void mo107412setFilterQualityvDHp3xo(int i) {
        AndroidPaint_androidKt.m107418setNativeFilterQuality50PEsBU(this.internalPaint, i);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    public void setPathEffect(@Nullable PathEffect pathEffect) {
        AndroidPaint_androidKt.setNativePathEffect(this.internalPaint, pathEffect);
        this.pathEffect = pathEffect;
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    public void setShader(@Nullable Shader shader) {
        this.internalShader = shader;
        AndroidPaint_androidKt.setNativeShader(this.internalPaint, shader);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: setStrokeCap-BeK7IIE  reason: not valid java name */
    public void mo107413setStrokeCapBeK7IIE(int i) {
        AndroidPaint_androidKt.m107419setNativeStrokeCapCSYIeUk(this.internalPaint, i);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: setStrokeJoin-Ww9F2mQ  reason: not valid java name */
    public void mo107414setStrokeJoinWw9F2mQ(int i) {
        AndroidPaint_androidKt.m107420setNativeStrokeJoinkLtJ_vA(this.internalPaint, i);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    public void setStrokeMiterLimit(float f) {
        AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.internalPaint, f);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    public void setStrokeWidth(float f) {
        AndroidPaint_androidKt.setNativeStrokeWidth(this.internalPaint, f);
    }

    @Override // androidx.compose.p015ui.graphics.Paint
    /* renamed from: setStyle-k9PVt8s  reason: not valid java name */
    public void mo107415setStylek9PVt8s(int i) {
        AndroidPaint_androidKt.m107421setNativeStyle5YerkU(this.internalPaint, i);
    }
}
