package p879s9;

import com.yandex.div.core.InterfaceC29586d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p985ta.ExpressionSubscriber;

@Metadata
/* renamed from: s9.f */
/* loaded from: classes8.dex */
final class Releasables implements ExpressionSubscriber {
    @NotNull

    /* renamed from: b */
    private final List<InterfaceC29586d> f104113b = new ArrayList();

    @Override // p985ta.ExpressionSubscriber
    @NotNull
    public List<InterfaceC29586d> getSubscriptions() {
        return this.f104113b;
    }
}
