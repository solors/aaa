package androidx.compose.p015ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Paint.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.Paint */
/* loaded from: classes.dex */
public interface Paint {
    @NotNull
    android.graphics.Paint asFrameworkPaint();

    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU */
    int mo107404getBlendMode0nO6VwU();

    /* renamed from: getColor-0d7_KjU */
    long mo107405getColor0d7_KjU();

    @Nullable
    ColorFilter getColorFilter();

    /* renamed from: getFilterQuality-f-v9h1I */
    int mo107406getFilterQualityfv9h1I();

    @Nullable
    PathEffect getPathEffect();

    @Nullable
    Shader getShader();

    /* renamed from: getStrokeCap-KaPHkGw */
    int mo107407getStrokeCapKaPHkGw();

    /* renamed from: getStrokeJoin-LxFBmk8 */
    int mo107408getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    /* renamed from: getStyle-TiuSbCo */
    int mo107409getStyleTiuSbCo();

    boolean isAntiAlias();

    void setAlpha(float f);

    void setAntiAlias(boolean z);

    /* renamed from: setBlendMode-s9anfk8 */
    void mo107410setBlendModes9anfk8(int i);

    /* renamed from: setColor-8_81llA */
    void mo107411setColor8_81llA(long j);

    void setColorFilter(@Nullable ColorFilter colorFilter);

    /* renamed from: setFilterQuality-vDHp3xo */
    void mo107412setFilterQualityvDHp3xo(int i);

    void setPathEffect(@Nullable PathEffect pathEffect);

    void setShader(@Nullable Shader shader);

    /* renamed from: setStrokeCap-BeK7IIE */
    void mo107413setStrokeCapBeK7IIE(int i);

    /* renamed from: setStrokeJoin-Ww9F2mQ */
    void mo107414setStrokeJoinWw9F2mQ(int i);

    void setStrokeMiterLimit(float f);

    void setStrokeWidth(float f);

    /* renamed from: setStyle-k9PVt8s */
    void mo107415setStylek9PVt8s(int i);
}
