package ec;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mc.Attributes;
import org.jetbrains.annotations.NotNull;
import p1060yb.HttpClient;

@Metadata
/* renamed from: ec.m */
/* loaded from: classes9.dex */
public interface HttpClientPlugin<TConfig, TPlugin> {
    @NotNull
    /* renamed from: a */
    TPlugin mo25168a(@NotNull Function1<? super TConfig, Unit> function1);

    /* renamed from: b */
    void mo25167b(@NotNull TPlugin tplugin, @NotNull HttpClient httpClient);

    @NotNull
    Attributes<TPlugin> getKey();
}
