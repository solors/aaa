package p1077ze;

import java.net.Socket;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ze.j */
/* loaded from: classes10.dex */
public interface Connection {
    @NotNull
    Protocol protocol();

    @NotNull
    Socket socket();
}
