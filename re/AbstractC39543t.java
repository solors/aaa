package re;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionSerializers.kt */
@Metadata
/* renamed from: re.t */
/* loaded from: classes8.dex */
public abstract class AbstractC39543t<E, C extends Collection<? extends E>, B> extends AbstractC39540s<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC39543t(@NotNull KSerializer<E> element) {
        super(element, null);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    @NotNull
    /* renamed from: o */
    public Iterator<E> mo12298d(@NotNull C c) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        return c.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // re.CollectionSerializers
    /* renamed from: p */
    public int mo12297e(@NotNull C c) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        return c.size();
    }
}
