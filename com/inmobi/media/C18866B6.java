package com.inmobi.media;

import com.inmobi.media.C18866B6;
import com.inmobi.media.C18945H1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.B6 */
/* loaded from: classes6.dex */
public final class C18866B6 {

    /* renamed from: a */
    public final ConcurrentHashMap f47112a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ExecutorService f47113b = Executors.newSingleThreadExecutor(new ThreadFactoryC18962I4("MultiEventBus"));

    /* renamed from: a */
    public static final void m61249a(C18945H1 event, C18866B6 this$0) {
        Intrinsics.checkNotNullParameter(event, "$event");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = event.f47304a;
        this$0.m61250a(event);
    }

    /* renamed from: b */
    public final void m61246b(final C18945H1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            this.f47113b.execute(new Runnable() { // from class: o3.i
                @Override // java.lang.Runnable
                public final void run() {
                    C18866B6.m61249a(C18945H1.this, this);
                }
            });
        } catch (InternalError unused) {
            m61250a(event);
        }
    }

    /* renamed from: a */
    public final void m61247a(int[] eventIds, Function1 subscriber) {
        Intrinsics.checkNotNullParameter(eventIds, "eventIds");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.f47112a.put(new C18852A6(eventIds), new WeakReference(subscriber));
    }

    /* renamed from: a */
    public final void m61248a(Function1 subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Iterator it = this.f47112a.entrySet().iterator();
        while (it.hasNext()) {
            if (Intrinsics.m17075f(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), subscriber)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final void m61250a(C18945H1 c18945h1) {
        Function1 function1;
        Set<Map.Entry> entrySet = this.f47112a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        for (Map.Entry entry : entrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.f47112a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> entrySet2 = this.f47112a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : entrySet2) {
            Intrinsics.m17074g(entry2);
            Function1 function12 = (Function1) entry2.getKey();
            WeakReference weakReference = (WeakReference) entry2.getValue();
            try {
                if (((Boolean) function12.invoke(c18945h1)).booleanValue() && (function1 = (Function1) weakReference.get()) != null) {
                    function1.invoke(c18945h1);
                }
            } catch (Exception e) {
                C19070Q4 c19070q4 = C19070Q4.f47635a;
                C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            }
        }
    }
}
