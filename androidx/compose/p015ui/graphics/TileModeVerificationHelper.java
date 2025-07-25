package androidx.compose.p015ui.graphics;

import android.graphics.Shader;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidTileMode.android.kt */
@RequiresApi(31)
@Metadata
/* renamed from: androidx.compose.ui.graphics.TileModeVerificationHelper */
/* loaded from: classes.dex */
final class TileModeVerificationHelper {
    @NotNull
    public static final TileModeVerificationHelper INSTANCE = new TileModeVerificationHelper();

    private TileModeVerificationHelper() {
    }

    @DoNotInline
    /* renamed from: getComposeTileModeDecal-3opZhB0  reason: not valid java name */
    public final int m107855getComposeTileModeDecal3opZhB0() {
        return TileMode.Companion.m107852getDecal3opZhB0();
    }

    @DoNotInline
    @NotNull
    public final Shader.TileMode getFrameworkTileModeDecal() {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        return tileMode;
    }
}
