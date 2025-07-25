package kotlinx.coroutines;

import ie.C33648p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.coroutines.n2 */
/* loaded from: classes7.dex */
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    @NotNull
    public abstract MainCoroutineDispatcher getImmediate();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher limitedParallelism(int i) {
        C33648p.m22931a(i);
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl == null) {
            return DebugStrings.m16104a(this) + '@' + DebugStrings.m16103b(this);
        }
        return stringInternalImpl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final String toStringInternalImpl() {
        MainCoroutineDispatcher mainCoroutineDispatcher;
        MainCoroutineDispatcher m16376c = Dispatchers.m16376c();
        if (this == m16376c) {
            return "Dispatchers.Main";
        }
        try {
            mainCoroutineDispatcher = m16376c.getImmediate();
        } catch (UnsupportedOperationException unused) {
            mainCoroutineDispatcher = null;
        }
        if (this != mainCoroutineDispatcher) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }
}
