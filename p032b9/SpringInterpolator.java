package p032b9;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: b9.h */
/* loaded from: classes8.dex */
public final class SpringInterpolator extends LookupTableInterpolator {
    @NotNull

    /* renamed from: c */
    private static final C3361a f1616c = new C3361a(null);
    @NotNull

    /* renamed from: d */
    private static final float[] f1617d = {0.0f, 5.0E-4f, 0.002f, 0.0045f, 0.0078f, 0.0119f, 0.0168f, 0.0224f, 0.0286f, 0.0355f, 0.0429f, 0.0508f, 0.0592f, 0.0681f, 0.0774f, 0.087f, 0.0969f, 0.1072f, 0.1177f, 0.1285f, 0.1395f, 0.1507f, 0.1621f, 0.1736f, 0.1853f, 0.197f, 0.2089f, 0.2208f, 0.2328f, 0.2448f, 0.2569f, 0.2689f, 0.281f, 0.293f, 0.305f, 0.317f, 0.3289f, 0.3408f, 0.3526f, 0.3644f, 0.376f, 0.3876f, 0.3991f, 0.4105f, 0.4218f, 0.433f, 0.444f, 0.455f, 0.4658f, 0.4765f, 0.4871f, 0.4975f, 0.5078f, 0.518f, 0.528f, 0.5379f, 0.5477f, 0.5573f, 0.5668f, 0.5761f, 0.5853f, 0.5944f, 0.6033f, 0.612f, 0.6206f, 0.6291f, 0.6374f, 0.6456f, 0.6537f, 0.6616f, 0.6693f, 0.677f, 0.6845f, 0.6918f, 0.699f, 0.7061f, 0.713f, 0.7199f, 0.7265f, 0.7331f, 0.7395f, 0.7458f, 0.752f, 0.758f, 0.764f, 0.7698f, 0.7755f, 0.781f, 0.7865f, 0.7918f, 0.7971f, 0.8022f, 0.8072f, 0.8121f, 0.8169f, 0.8216f, 0.8262f, 0.8307f, 0.8351f, 0.8394f, 0.8436f, 0.8477f, 0.8517f, 0.8557f, 0.8595f, 0.8633f, 0.8669f, 0.8705f, 0.874f, 0.8775f, 0.8808f, 0.8841f, 0.8873f, 0.8904f, 0.8934f, 0.8964f, 0.8993f, 0.9022f, 0.9049f, 0.9076f, 0.9103f, 0.9129f, 0.9154f, 0.9178f, 0.9202f, 0.9226f, 0.9249f, 0.9271f, 0.9293f, 0.9314f, 0.9335f, 0.9355f, 0.9375f, 0.9394f, 0.9413f, 0.9431f, 0.9449f, 0.9466f, 0.9483f, 0.95f, 0.9516f, 0.9532f, 0.9547f, 0.9562f, 0.9576f, 0.9591f, 0.9605f, 0.9618f, 0.9631f, 0.9644f, 0.9657f, 0.9669f, 0.9681f, 0.9692f, 0.9703f, 0.9714f, 0.9725f, 0.9736f, 0.9746f, 0.9756f, 0.9765f, 0.9775f, 0.9784f, 0.9793f, 0.9802f, 0.981f, 0.9818f, 0.9826f, 0.9834f, 0.9842f, 0.9849f, 0.9856f, 0.9863f, 0.987f, 0.9877f, 0.9883f, 0.989f, 0.9896f, 0.9902f, 0.9908f, 0.9913f, 0.9919f, 0.9924f, 0.993f, 0.9935f, 0.994f, 0.9944f, 0.9949f, 0.9954f, 0.9958f, 0.9963f, 0.9967f, 0.9971f, 0.9975f, 0.9979f, 0.9983f, 0.9986f, 0.999f, 0.9993f, 0.9997f, 1.0f};

    /* compiled from: SpringInterpolator.kt */
    @Metadata
    /* renamed from: b9.h$a */
    /* loaded from: classes8.dex */
    private static final class C3361a {
        private C3361a() {
        }

        public /* synthetic */ C3361a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SpringInterpolator() {
        super(f1617d);
    }
}
