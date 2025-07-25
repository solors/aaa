package p763kf;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.Protocol;

@Metadata
/* renamed from: kf.k */
/* loaded from: classes10.dex */
public interface SocketAdapter {
    /* renamed from: a */
    boolean mo17637a(@NotNull SSLSocket sSLSocket);

    @Nullable
    /* renamed from: b */
    String mo17636b(@NotNull SSLSocket sSLSocket);

    /* renamed from: c */
    void mo17635c(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends Protocol> list);

    boolean isSupported();
}
