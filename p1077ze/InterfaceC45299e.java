package p1077ze;

import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Call.kt */
@Metadata
/* renamed from: ze.e */
/* loaded from: classes10.dex */
public interface InterfaceC45299e extends Cloneable {

    /* compiled from: Call.kt */
    @Metadata
    /* renamed from: ze.e$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC45300a {
        @NotNull
        /* renamed from: b */
        InterfaceC45299e mo83b(@NotNull C45275a0 c45275a0);
    }

    /* renamed from: a */
    void mo339a(@NotNull InterfaceC45301f interfaceC45301f);

    void cancel();

    @NotNull
    C45292c0 execute() throws IOException;

    boolean isCanceled();
}
