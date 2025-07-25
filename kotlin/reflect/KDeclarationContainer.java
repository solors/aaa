package kotlin.reflect;

import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: KDeclarationContainer.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KDeclarationContainer {
    @NotNull
    Collection<KCallable<?>> getMembers();
}
