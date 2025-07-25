package androidx.compose.p015ui.graphics;

import android.graphics.Shader;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Brush.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.ShaderBrush */
/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    @Nullable
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m107368getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.p015ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo107474applyToPq9zytI(long j, @NotNull Paint p, float f) {
        boolean z;
        Intrinsics.checkNotNullParameter(p, "p");
        Shader shader = this.internalShader;
        if (shader == null || !Size.m107356equalsimpl0(this.createdSize, j)) {
            shader = mo107496createShaderuvyYCjk(j);
            this.internalShader = shader;
            this.createdSize = j;
        }
        long mo107405getColor0d7_KjU = p.mo107405getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m107528equalsimpl0(mo107405getColor0d7_KjU, companion.m107553getBlack0d7_KjU())) {
            p.mo107411setColor8_81llA(companion.m107553getBlack0d7_KjU());
        }
        if (!Intrinsics.m17075f(p.getShader(), shader)) {
            p.setShader(shader);
        }
        if (p.getAlpha() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            p.setAlpha(f);
        }
    }

    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo107496createShaderuvyYCjk(long j);
}
