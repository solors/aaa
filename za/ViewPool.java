package za;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: za.i */
/* loaded from: classes8.dex */
public interface ViewPool {
    @NotNull
    /* renamed from: a */
    <T extends View> T mo559a(@NotNull String str);

    /* renamed from: b */
    void mo558b(@NotNull String str, int i);

    /* renamed from: c */
    <T extends View> void mo557c(@NotNull String str, @NotNull ViewFactory<T> viewFactory, int i);
}
