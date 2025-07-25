package p643df;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;

@Metadata
/* renamed from: df.c */
/* loaded from: classes10.dex */
public final class TaskQueue extends AbstractC32871a {

    /* renamed from: e */
    final /* synthetic */ String f89604e;

    /* renamed from: f */
    final /* synthetic */ boolean f89605f;

    /* renamed from: g */
    final /* synthetic */ Functions<Unit> f89606g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue(String str, boolean z, Functions<Unit> functions) {
        super(str, z);
        this.f89604e = str;
        this.f89605f = z;
        this.f89606g = functions;
    }

    @Override // p643df.AbstractC32871a
    /* renamed from: f */
    public long mo23439f() {
        this.f89606g.invoke();
        return -1L;
    }
}
