package p848qb;

import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p793n0.SVG;
import p793n0.SVGParseException;

@Metadata
/* renamed from: qb.b */
/* loaded from: classes8.dex */
public final class SvgDecoder {

    /* renamed from: a */
    private final boolean f103571a;

    public SvgDecoder(boolean z) {
        this.f103571a = z;
    }

    @Nullable
    /* renamed from: a */
    public final PictureDrawable m12801a(@NotNull InputStream source) {
        float m15032h;
        float m15034f;
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            SVG m15028l = SVG.m15028l(source);
            Intrinsics.checkNotNullExpressionValue(m15028l, "getFromInputStream(source)");
            RectF m15033g = m15028l.m15033g();
            if (this.f103571a && m15033g != null) {
                m15032h = m15033g.width();
                m15034f = m15033g.height();
            } else {
                m15032h = m15028l.m15032h();
                m15034f = m15028l.m15034f();
            }
            if (m15033g == null && m15032h > 0.0f && m15034f > 0.0f) {
                m15028l.m15017w(0.0f, 0.0f, m15032h, m15034f);
            }
            return new PictureDrawable(m15028l.m15022r());
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public /* synthetic */ SvgDecoder(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
