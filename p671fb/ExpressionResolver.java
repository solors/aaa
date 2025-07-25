package p671fb;

import com.yandex.div.core.InterfaceC29586d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p656eb.ParsingErrorLogger;
import p656eb.ParsingException;
import p759ka.Evaluable;
import va.InterfaceC44553w;
import va.TypeHelpers;

@Metadata
/* renamed from: fb.d */
/* loaded from: classes8.dex */
public interface ExpressionResolver {
    @NotNull

    /* renamed from: a */
    public static final C33101b f90405a = C33101b.f90407a;
    @NotNull

    /* renamed from: b */
    public static final ExpressionResolver f90406b = new C33100a();

    /* compiled from: ExpressionResolver.kt */
    @Metadata
    /* renamed from: fb.d$a */
    /* loaded from: classes8.dex */
    public static final class C33100a implements ExpressionResolver {
        C33100a() {
        }

        @Override // p671fb.ExpressionResolver
        @Nullable
        /* renamed from: b */
        public <R, T> T mo24834b(@NotNull String expressionKey, @NotNull String rawExpression, @NotNull Evaluable evaluable, @Nullable Function1<? super R, ? extends T> function1, @NotNull InterfaceC44553w<T> validator, @NotNull TypeHelpers<T> fieldType, @NotNull ParsingErrorLogger logger) {
            Intrinsics.checkNotNullParameter(expressionKey, "expressionKey");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            Intrinsics.checkNotNullParameter(evaluable, "evaluable");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(fieldType, "fieldType");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return null;
        }

        @Override // p671fb.ExpressionResolver
        @NotNull
        /* renamed from: c */
        public InterfaceC29586d mo24833c(@NotNull String rawExpression, @NotNull List<String> variableNames, @NotNull Functions<Unit> callback) {
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            Intrinsics.checkNotNullParameter(variableNames, "variableNames");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return InterfaceC29586d.f75159W7;
        }
    }

    /* compiled from: ExpressionResolver.kt */
    @Metadata
    /* renamed from: fb.d$b */
    /* loaded from: classes8.dex */
    public static final class C33101b {

        /* renamed from: a */
        static final /* synthetic */ C33101b f90407a = new C33101b();

        private C33101b() {
        }
    }

    /* renamed from: a */
    default void mo24835a(@NotNull ParsingException e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Nullable
    /* renamed from: b */
    <R, T> T mo24834b(@NotNull String str, @NotNull String str2, @NotNull Evaluable evaluable, @Nullable Function1<? super R, ? extends T> function1, @NotNull InterfaceC44553w<T> interfaceC44553w, @NotNull TypeHelpers<T> typeHelpers, @NotNull ParsingErrorLogger parsingErrorLogger);

    @NotNull
    /* renamed from: c */
    InterfaceC29586d mo24833c(@NotNull String str, @NotNull List<String> list, @NotNull Functions<Unit> functions);
}
