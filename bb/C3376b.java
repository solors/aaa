package bb;

import com.yandex.div.internal.widget.indicator.C29817e;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: IndicatorAnimator.kt */
@Metadata
/* renamed from: bb.b */
/* loaded from: classes8.dex */
public final class C3376b {

    /* compiled from: IndicatorAnimator.kt */
    @Metadata
    /* renamed from: bb.b$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C3377a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndicatorParams.values().length];
            try {
                iArr[IndicatorParams.SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorParams.WORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndicatorParams.SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final IndicatorAnimator m103846a(@NotNull C29817e style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int i = C3377a.$EnumSwitchMapping$0[style.m36321b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new SliderIndicatorAnimator(style);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new WormIndicatorAnimator(style);
        }
        return new ScaleIndicatorAnimator(style);
    }
}
