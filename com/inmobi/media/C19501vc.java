package com.inmobi.media;

import com.inmobi.media.C19501vc;
import java.util.Objects;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.vc */
/* loaded from: classes6.dex */
public final class C19501vc extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ AbstractC19515wc f48745a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19501vc(AbstractC19515wc abstractC19515wc) {
        super(0);
        this.f48745a = abstractC19515wc;
    }

    @Override // kotlin.jvm.functions.Functions
    /* renamed from: a */
    public final Runnable invoke() {
        final AbstractC19515wc abstractC19515wc = this.f48745a;
        return new Runnable() { // from class: o3.p6
            @Override // java.lang.Runnable
            public final void run() {
                C19501vc.m59821a(abstractC19515wc);
            }
        };
    }

    /* renamed from: a */
    public static final void m59821a(AbstractC19515wc this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Objects.toString(this$0);
        this$0.f48847c.post((RunnableC19445rc) this$0.f48855k.getValue());
    }
}
