package androidx.compose.p015ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.graphics.BlendMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidBlendMode.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidBlendMode_androidKt */
/* loaded from: classes.dex */
public final class AndroidBlendMode_androidKt {
    /* renamed from: isSupported-s9anfk8  reason: not valid java name */
    public static final boolean m107382isSupporteds9anfk8(int i) {
        if (Build.VERSION.SDK_INT < 29 && !BlendMode.m107440equalsimpl0(i, BlendMode.Companion.m107471getSrcOver0nO6VwU()) && m107384toPorterDuffModes9anfk8(i) == PorterDuff.Mode.SRC_OVER) {
            return false;
        }
        return true;
    }

    @RequiresApi(29)
    @NotNull
    /* renamed from: toAndroidBlendMode-s9anfk8  reason: not valid java name */
    public static final BlendMode m107383toAndroidBlendModes9anfk8(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        BlendMode.Companion companion = BlendMode.Companion;
        if (BlendMode.m107440equalsimpl0(i, companion.m107444getClear0nO6VwU())) {
            blendMode30 = android.graphics.BlendMode.CLEAR;
            return blendMode30;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107467getSrc0nO6VwU())) {
            blendMode29 = android.graphics.BlendMode.SRC;
            return blendMode29;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107450getDst0nO6VwU())) {
            blendMode28 = android.graphics.BlendMode.DST;
            return blendMode28;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107471getSrcOver0nO6VwU())) {
            blendMode27 = android.graphics.BlendMode.SRC_OVER;
            return blendMode27;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107454getDstOver0nO6VwU())) {
            blendMode26 = android.graphics.BlendMode.DST_OVER;
            return blendMode26;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107469getSrcIn0nO6VwU())) {
            blendMode25 = android.graphics.BlendMode.SRC_IN;
            return blendMode25;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107452getDstIn0nO6VwU())) {
            blendMode24 = android.graphics.BlendMode.DST_IN;
            return blendMode24;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107470getSrcOut0nO6VwU())) {
            blendMode23 = android.graphics.BlendMode.SRC_OUT;
            return blendMode23;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107453getDstOut0nO6VwU())) {
            blendMode22 = android.graphics.BlendMode.DST_OUT;
            return blendMode22;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107468getSrcAtop0nO6VwU())) {
            blendMode21 = android.graphics.BlendMode.SRC_ATOP;
            return blendMode21;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107451getDstAtop0nO6VwU())) {
            blendMode20 = android.graphics.BlendMode.DST_ATOP;
            return blendMode20;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107472getXor0nO6VwU())) {
            blendMode19 = android.graphics.BlendMode.XOR;
            return blendMode19;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107463getPlus0nO6VwU())) {
            blendMode18 = android.graphics.BlendMode.PLUS;
            return blendMode18;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107460getModulate0nO6VwU())) {
            blendMode17 = android.graphics.BlendMode.MODULATE;
            return blendMode17;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107465getScreen0nO6VwU())) {
            blendMode16 = android.graphics.BlendMode.SCREEN;
            return blendMode16;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107462getOverlay0nO6VwU())) {
            blendMode15 = android.graphics.BlendMode.OVERLAY;
            return blendMode15;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107448getDarken0nO6VwU())) {
            blendMode14 = android.graphics.BlendMode.DARKEN;
            return blendMode14;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107458getLighten0nO6VwU())) {
            blendMode13 = android.graphics.BlendMode.LIGHTEN;
            return blendMode13;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107447getColorDodge0nO6VwU())) {
            blendMode12 = android.graphics.BlendMode.COLOR_DODGE;
            return blendMode12;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107446getColorBurn0nO6VwU())) {
            blendMode11 = android.graphics.BlendMode.COLOR_BURN;
            return blendMode11;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107456getHardlight0nO6VwU())) {
            blendMode10 = android.graphics.BlendMode.HARD_LIGHT;
            return blendMode10;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107466getSoftlight0nO6VwU())) {
            blendMode9 = android.graphics.BlendMode.SOFT_LIGHT;
            return blendMode9;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107449getDifference0nO6VwU())) {
            blendMode8 = android.graphics.BlendMode.DIFFERENCE;
            return blendMode8;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107455getExclusion0nO6VwU())) {
            blendMode7 = android.graphics.BlendMode.EXCLUSION;
            return blendMode7;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107461getMultiply0nO6VwU())) {
            blendMode6 = android.graphics.BlendMode.MULTIPLY;
            return blendMode6;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107457getHue0nO6VwU())) {
            blendMode5 = android.graphics.BlendMode.HUE;
            return blendMode5;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107464getSaturation0nO6VwU())) {
            blendMode4 = android.graphics.BlendMode.SATURATION;
            return blendMode4;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107445getColor0nO6VwU())) {
            blendMode3 = android.graphics.BlendMode.COLOR;
            return blendMode3;
        } else if (BlendMode.m107440equalsimpl0(i, companion.m107459getLuminosity0nO6VwU())) {
            blendMode2 = android.graphics.BlendMode.LUMINOSITY;
            return blendMode2;
        } else {
            blendMode = android.graphics.BlendMode.SRC_OVER;
            return blendMode;
        }
    }

    @NotNull
    /* renamed from: toPorterDuffMode-s9anfk8  reason: not valid java name */
    public static final PorterDuff.Mode m107384toPorterDuffModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.Companion;
        if (BlendMode.m107440equalsimpl0(i, companion.m107444getClear0nO6VwU())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107467getSrc0nO6VwU())) {
            return PorterDuff.Mode.SRC;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107450getDst0nO6VwU())) {
            return PorterDuff.Mode.DST;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107471getSrcOver0nO6VwU())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107454getDstOver0nO6VwU())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107469getSrcIn0nO6VwU())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107452getDstIn0nO6VwU())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107470getSrcOut0nO6VwU())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107453getDstOut0nO6VwU())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107468getSrcAtop0nO6VwU())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107451getDstAtop0nO6VwU())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107472getXor0nO6VwU())) {
            return PorterDuff.Mode.XOR;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107463getPlus0nO6VwU())) {
            return PorterDuff.Mode.ADD;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107465getScreen0nO6VwU())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107462getOverlay0nO6VwU())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107448getDarken0nO6VwU())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107458getLighten0nO6VwU())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (BlendMode.m107440equalsimpl0(i, companion.m107460getModulate0nO6VwU())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
