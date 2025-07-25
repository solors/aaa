package p671fb;

import com.yandex.div.core.InterfaceC29586d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p656eb.ParsingException;

/* compiled from: ExpressionList.kt */
@Metadata
/* renamed from: fb.c */
/* loaded from: classes8.dex */
public interface InterfaceC33099c<T> {
    @NotNull
    /* renamed from: a */
    List<T> mo24827a(@NotNull ExpressionResolver expressionResolver) throws ParsingException;

    @NotNull
    /* renamed from: b */
    InterfaceC29586d mo24826b(@NotNull ExpressionResolver expressionResolver, @NotNull Function1<? super List<? extends T>, Unit> function1);
}
