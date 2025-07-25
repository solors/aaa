package androidx.compose.p015ui.graphics.colorspace;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Illuminant.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.Illuminant */
/* loaded from: classes.dex */
public final class Illuminant {
    @NotNull
    public static final Illuminant INSTANCE = new Illuminant();
    @NotNull

    /* renamed from: A */
    private static final WhitePoint f405A = new WhitePoint(0.44757f, 0.40745f);
    @NotNull

    /* renamed from: B */
    private static final WhitePoint f406B = new WhitePoint(0.34842f, 0.35161f);
    @NotNull

    /* renamed from: C */
    private static final WhitePoint f407C = new WhitePoint(0.31006f, 0.31616f);
    @NotNull
    private static final WhitePoint D50 = new WhitePoint(0.34567f, 0.3585f);
    @NotNull
    private static final WhitePoint D55 = new WhitePoint(0.33242f, 0.34743f);
    @NotNull
    private static final WhitePoint D60 = new WhitePoint(0.32168f, 0.33767f);
    @NotNull
    private static final WhitePoint D65 = new WhitePoint(0.31271f, 0.32902f);
    @NotNull
    private static final WhitePoint D75 = new WhitePoint(0.29902f, 0.31485f);
    @NotNull

    /* renamed from: E */
    private static final WhitePoint f408E = new WhitePoint(0.33333f, 0.33333f);
    @NotNull
    private static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};

    private Illuminant() {
    }

    @NotNull
    public final WhitePoint getA() {
        return f405A;
    }

    @NotNull
    public final WhitePoint getB() {
        return f406B;
    }

    @NotNull
    public final WhitePoint getC() {
        return f407C;
    }

    @NotNull
    public final WhitePoint getD50() {
        return D50;
    }

    @NotNull
    public final float[] getD50Xyz$ui_graphics_release() {
        return D50Xyz;
    }

    @NotNull
    public final WhitePoint getD55() {
        return D55;
    }

    @NotNull
    public final WhitePoint getD60() {
        return D60;
    }

    @NotNull
    public final WhitePoint getD65() {
        return D65;
    }

    @NotNull
    public final WhitePoint getD75() {
        return D75;
    }

    @NotNull
    public final WhitePoint getE() {
        return f408E;
    }
}
