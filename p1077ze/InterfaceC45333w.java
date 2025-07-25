package p1077ze;

import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Interceptor.kt */
@Metadata
/* renamed from: ze.w */
/* loaded from: classes10.dex */
public interface InterfaceC45333w {

    /* compiled from: Interceptor.kt */
    @Metadata
    /* renamed from: ze.w$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC45334a {
        @NotNull
        /* renamed from: a */
        C45292c0 mo103a(@NotNull C45275a0 c45275a0) throws IOException;

        @NotNull
        InterfaceC45299e call();

        @Nullable
        Connection connection();

        @NotNull
        C45275a0 request();
    }

    @NotNull
    C45292c0 intercept(@NotNull InterfaceC45334a interfaceC45334a) throws IOException;
}
