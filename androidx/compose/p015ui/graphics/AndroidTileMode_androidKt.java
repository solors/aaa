package androidx.compose.p015ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p015ui.graphics.TileMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidTileMode.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidTileMode_androidKt */
/* loaded from: classes.dex */
public final class AndroidTileMode_androidKt {

    /* compiled from: AndroidTileMode.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.AndroidTileMode_androidKt$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-0vamqd0  reason: not valid java name */
    public static final boolean m107433isSupported0vamqd0(int i) {
        if (Build.VERSION.SDK_INT < 31 && TileMode.m107847equalsimpl0(i, TileMode.Companion.m107852getDecal3opZhB0())) {
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: toAndroidTileMode-0vamqd0  reason: not valid java name */
    public static final Shader.TileMode m107434toAndroidTileMode0vamqd0(int i) {
        TileMode.Companion companion = TileMode.Companion;
        if (TileMode.m107847equalsimpl0(i, companion.m107851getClamp3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (TileMode.m107847equalsimpl0(i, companion.m107854getRepeated3opZhB0())) {
            return Shader.TileMode.REPEAT;
        }
        if (TileMode.m107847equalsimpl0(i, companion.m107853getMirror3opZhB0())) {
            return Shader.TileMode.MIRROR;
        }
        if (TileMode.m107847equalsimpl0(i, companion.m107852getDecal3opZhB0())) {
            if (Build.VERSION.SDK_INT >= 31) {
                return TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(@NotNull Shader.TileMode tileMode) {
        Shader.TileMode tileMode2;
        Intrinsics.checkNotNullParameter(tileMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        tileMode2 = Shader.TileMode.DECAL;
                        if (tileMode == tileMode2) {
                            return TileModeVerificationHelper.INSTANCE.m107855getComposeTileModeDecal3opZhB0();
                        }
                    }
                    return TileMode.Companion.m107851getClamp3opZhB0();
                }
                return TileMode.Companion.m107854getRepeated3opZhB0();
            }
            return TileMode.Companion.m107853getMirror3opZhB0();
        }
        return TileMode.Companion.m107851getClamp3opZhB0();
    }
}
