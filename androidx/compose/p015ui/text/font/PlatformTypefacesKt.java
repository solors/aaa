package androidx.compose.p015ui.text.font;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformTypefaces.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.PlatformTypefacesKt */
/* loaded from: classes.dex */
public final class PlatformTypefacesKt {
    @NotNull
    public static final PlatformTypefaces PlatformTypefaces() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PlatformTypefacesApi28();
        }
        return new PlatformTypefacesApi();
    }

    @VisibleForTesting
    @NotNull
    public static final String getWeightSuffixForFallbackFamilyName(@NotNull String name, @NotNull FontWeight fontWeight) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int weight = fontWeight.getWeight() / 100;
        boolean z4 = true;
        if (weight >= 0 && weight < 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return name + "-thin";
        }
        if (2 <= weight && weight < 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return name + "-light";
        } else if (weight != 4) {
            if (weight == 5) {
                return name + "-medium";
            }
            if (6 <= weight && weight < 8) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                if (8 > weight || weight >= 11) {
                    z4 = false;
                }
                if (z4) {
                    return name + "-black";
                }
                return name;
            }
            return name;
        } else {
            return name;
        }
    }
}
