package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
@Metadata
/* renamed from: kotlinx.coroutines.j1 */
/* loaded from: classes7.dex */
public final class C37744j1 implements InterfaceC37808v1 {

    /* renamed from: b */
    private final boolean f99567b;

    public C37744j1(boolean z) {
        this.f99567b = z;
    }

    @Override // kotlinx.coroutines.InterfaceC37808v1
    @Nullable
    /* renamed from: a */
    public C37783o2 mo16085a() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC37808v1
    public boolean isActive() {
        return this.f99567b;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        if (isActive()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
