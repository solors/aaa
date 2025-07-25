package p985ta;

import com.yandex.div.core.InterfaceC29586d;
import com.yandex.div.core.view2.Releasable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ta.d */
/* loaded from: classes8.dex */
public interface ExpressionSubscriber extends Releasable {
    default void addSubscription(@Nullable InterfaceC29586d interfaceC29586d) {
        if (interfaceC29586d != null && interfaceC29586d != InterfaceC29586d.f75159W7) {
            getSubscriptions().add(interfaceC29586d);
        }
    }

    default void closeAllSubscription() {
        for (InterfaceC29586d interfaceC29586d : getSubscriptions()) {
            interfaceC29586d.close();
        }
        getSubscriptions().clear();
    }

    @NotNull
    List<InterfaceC29586d> getSubscriptions();

    @Override // com.yandex.div.core.view2.Releasable
    default void release() {
        closeAllSubscription();
    }
}
