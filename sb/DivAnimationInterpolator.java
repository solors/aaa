package sb;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.m1 */
/* loaded from: classes8.dex */
public enum DivAnimationInterpolator {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");
    
    @NotNull

    /* renamed from: c */
    public static final C40850b f106966c = new C40850b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivAnimationInterpolator> f106967d = C40849a.f106976g;
    @NotNull

    /* renamed from: b */
    private final String f106975b;

    /* compiled from: DivAnimationInterpolator.kt */
    @Metadata
    /* renamed from: sb.m1$a */
    /* loaded from: classes8.dex */
    static final class C40849a extends Lambda implements Function1<String, DivAnimationInterpolator> {

        /* renamed from: g */
        public static final C40849a f106976g = new C40849a();

        C40849a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivAnimationInterpolator invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
            if (!Intrinsics.m17075f(string, divAnimationInterpolator.f106975b)) {
                DivAnimationInterpolator divAnimationInterpolator2 = DivAnimationInterpolator.EASE;
                if (!Intrinsics.m17075f(string, divAnimationInterpolator2.f106975b)) {
                    DivAnimationInterpolator divAnimationInterpolator3 = DivAnimationInterpolator.EASE_IN;
                    if (!Intrinsics.m17075f(string, divAnimationInterpolator3.f106975b)) {
                        DivAnimationInterpolator divAnimationInterpolator4 = DivAnimationInterpolator.EASE_OUT;
                        if (!Intrinsics.m17075f(string, divAnimationInterpolator4.f106975b)) {
                            DivAnimationInterpolator divAnimationInterpolator5 = DivAnimationInterpolator.EASE_IN_OUT;
                            if (!Intrinsics.m17075f(string, divAnimationInterpolator5.f106975b)) {
                                DivAnimationInterpolator divAnimationInterpolator6 = DivAnimationInterpolator.SPRING;
                                if (!Intrinsics.m17075f(string, divAnimationInterpolator6.f106975b)) {
                                    return null;
                                }
                                return divAnimationInterpolator6;
                            }
                            return divAnimationInterpolator5;
                        }
                        return divAnimationInterpolator4;
                    }
                    return divAnimationInterpolator3;
                }
                return divAnimationInterpolator2;
            }
            return divAnimationInterpolator;
        }
    }

    /* compiled from: DivAnimationInterpolator.kt */
    @Metadata
    /* renamed from: sb.m1$b */
    /* loaded from: classes8.dex */
    public static final class C40850b {
        private C40850b() {
        }

        public /* synthetic */ C40850b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivAnimationInterpolator> m10115a() {
            return DivAnimationInterpolator.f106967d;
        }

        @NotNull
        /* renamed from: b */
        public final String m10114b(@NotNull DivAnimationInterpolator obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f106975b;
        }
    }

    DivAnimationInterpolator(String str) {
        this.f106975b = str;
    }
}
