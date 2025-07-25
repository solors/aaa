package p032b9;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: b9.a */
/* loaded from: classes8.dex */
public final class EaseInInterpolator extends LookupTableInterpolator {
    @NotNull

    /* renamed from: c */
    private static final C3356a f1605c = new C3356a(null);
    @NotNull

    /* renamed from: d */
    private static final float[] f1606d = {0.0f, 0.0f, 2.0E-4f, 4.0E-4f, 7.0E-4f, 0.0011f, 0.0016f, 0.0022f, 0.0029f, 0.0036f, 0.0045f, 0.0054f, 0.0064f, 0.0074f, 0.0086f, 0.0098f, 0.0111f, 0.0125f, 0.0139f, 0.0154f, 0.017f, 0.0187f, 0.0204f, 0.0222f, 0.0241f, 0.026f, 0.028f, 0.03f, 0.0322f, 0.0343f, 0.0366f, 0.0389f, 0.0413f, 0.0437f, 0.0462f, 0.0487f, 0.0513f, 0.054f, 0.0567f, 0.0595f, 0.0623f, 0.0652f, 0.0681f, 0.0711f, 0.0741f, 0.0772f, 0.0804f, 0.0836f, 0.0868f, 0.0901f, 0.0935f, 0.0969f, 0.1003f, 0.1038f, 0.1073f, 0.1109f, 0.1146f, 0.1183f, 0.122f, 0.1258f, 0.1296f, 0.1334f, 0.1373f, 0.1413f, 0.1453f, 0.1493f, 0.1534f, 0.1575f, 0.1617f, 0.1659f, 0.1702f, 0.1745f, 0.1788f, 0.1832f, 0.1876f, 0.192f, 0.1965f, 0.201f, 0.2056f, 0.2102f, 0.2149f, 0.2195f, 0.2243f, 0.229f, 0.2338f, 0.2386f, 0.2435f, 0.2484f, 0.2534f, 0.2583f, 0.2633f, 0.2684f, 0.2735f, 0.2786f, 0.2837f, 0.2889f, 0.2941f, 0.2994f, 0.3047f, 0.31f, 0.3154f, 0.3207f, 0.3262f, 0.3316f, 0.3371f, 0.3426f, 0.3482f, 0.3537f, 0.3594f, 0.365f, 0.3707f, 0.3764f, 0.3821f, 0.3879f, 0.3937f, 0.3995f, 0.4054f, 0.4113f, 0.4172f, 0.4231f, 0.4291f, 0.4351f, 0.4412f, 0.4472f, 0.4533f, 0.4595f, 0.4656f, 0.4718f, 0.478f, 0.4843f, 0.4905f, 0.4968f, 0.5032f, 0.5095f, 0.5159f, 0.5223f, 0.5288f, 0.5352f, 0.5417f, 0.5483f, 0.5548f, 0.5614f, 0.568f, 0.5746f, 0.5813f, 0.588f, 0.5947f, 0.6015f, 0.6082f, 0.615f, 0.6219f, 0.6287f, 0.6356f, 0.6425f, 0.6494f, 0.6564f, 0.6634f, 0.6704f, 0.6775f, 0.6845f, 0.6916f, 0.6988f, 0.7059f, 0.7131f, 0.7203f, 0.7275f, 0.7348f, 0.7421f, 0.7494f, 0.7568f, 0.7641f, 0.7715f, 0.779f, 0.7864f, 0.7939f, 0.8014f, 0.809f, 0.8165f, 0.8241f, 0.8318f, 0.8394f, 0.8471f, 0.8548f, 0.8626f, 0.8704f, 0.8782f, 0.886f, 0.8939f, 0.9018f, 0.9098f, 0.9178f, 0.9258f, 0.9338f, 0.9419f, 0.9501f, 0.9582f, 0.9665f, 0.9748f, 0.9831f, 0.9915f, 1.0f};

    /* compiled from: EaseInInterpolator.kt */
    @Metadata
    /* renamed from: b9.a$a */
    /* loaded from: classes8.dex */
    private static final class C3356a {
        private C3356a() {
        }

        public /* synthetic */ C3356a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EaseInInterpolator() {
        super(f1606d);
    }
}
