package cc;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p033bc.HttpClientEngine;
import p033bc.InterfaceC3387h;

@Metadata
/* renamed from: cc.a */
/* loaded from: classes9.dex */
public final class Android implements InterfaceC3387h<AndroidEngineConfig> {
    @NotNull

    /* renamed from: a */
    public static final Android f1951a = new Android();

    private Android() {
    }

    @Override // p033bc.InterfaceC3387h
    @NotNull
    /* renamed from: a */
    public HttpClientEngine mo103525a(@NotNull Function1<? super AndroidEngineConfig, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AndroidEngineConfig androidEngineConfig = new AndroidEngineConfig();
        block.invoke(androidEngineConfig);
        return new AndroidClientEngine(androidEngineConfig);
    }
}
