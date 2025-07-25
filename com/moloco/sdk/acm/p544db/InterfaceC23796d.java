package com.moloco.sdk.acm.p544db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Dao
/* renamed from: com.moloco.sdk.acm.db.d */
/* loaded from: classes7.dex */
public interface InterfaceC23796d {

    /* renamed from: com.moloco.sdk.acm.db.d$a */
    /* loaded from: classes7.dex */
    public static final class C23797a {

        @DebugMetadata(m17095c = "com.moloco.sdk.acm.db.MetricsDAO$DefaultImpls", m17094f = "MetricsDAO.kt", m17093l = {58, 62}, m17092m = "deleteAndReturnDeletedEvents")
        /* renamed from: com.moloco.sdk.acm.db.d$a$a */
        /* loaded from: classes7.dex */
        public static final class C23798a extends AbstractC37589d {

            /* renamed from: l */
            public Object f61772l;

            /* renamed from: m */
            public Object f61773m;

            /* renamed from: n */
            public Object f61774n;

            /* renamed from: o */
            public /* synthetic */ Object f61775o;

            /* renamed from: p */
            public int f61776p;

            public C23798a(Continuation<? super C23798a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f61775o = obj;
                this.f61776p |= Integer.MIN_VALUE;
                return C23797a.m47703a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a3 -> B:32:0x00a5). Please submit an issue!!! */
        @androidx.room.Transaction
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object m47703a(@org.jetbrains.annotations.NotNull com.moloco.sdk.acm.p544db.InterfaceC23796d r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<com.moloco.sdk.acm.p544db.C23794b>> r10) {
            /*
                boolean r0 = r10 instanceof com.moloco.sdk.acm.p544db.InterfaceC23796d.C23797a.C23798a
                if (r0 == 0) goto L13
                r0 = r10
                com.moloco.sdk.acm.db.d$a$a r0 = (com.moloco.sdk.acm.p544db.InterfaceC23796d.C23797a.C23798a) r0
                int r1 = r0.f61776p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f61776p = r1
                goto L18
            L13:
                com.moloco.sdk.acm.db.d$a$a r0 = new com.moloco.sdk.acm.db.d$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f61775o
                java.lang.Object r1 = sd.C42683b.m6964e()
                int r2 = r0.f61776p
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L49
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r9 = r0.f61772l
                java.util.List r9 = (java.util.List) r9
                p804nd.C38508r.m14539b(r10)
                goto L6c
            L30:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L38:
                java.lang.Object r9 = r0.f61774n
                java.util.List r9 = (java.util.List) r9
                java.lang.Object r2 = r0.f61773m
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r5 = r0.f61772l
                com.moloco.sdk.acm.db.d r5 = (com.moloco.sdk.acm.p544db.InterfaceC23796d) r5
                p804nd.C38508r.m14539b(r10)
                r10 = r2
                goto La5
            L49:
                p804nd.C38508r.m14539b(r10)
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
            L51:
                java.util.List r2 = r9.mo47700b()
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto L6d
                r0.f61772l = r10
                r2 = 0
                r0.f61773m = r2
                r0.f61774n = r2
                r0.f61776p = r3
                java.lang.Object r9 = r9.mo47699b(r0)
                if (r9 != r1) goto L6b
                return r1
            L6b:
                r9 = r10
            L6c:
                return r9
            L6d:
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.C37561t.m17185x(r2, r6)
                r5.<init>(r6)
                java.util.Iterator r6 = r2.iterator()
            L7c:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L94
                java.lang.Object r7 = r6.next()
                com.moloco.sdk.acm.db.b r7 = (com.moloco.sdk.acm.p544db.C23794b) r7
                long r7 = r7.m47708c()
                java.lang.Long r7 = kotlin.coroutines.jvm.internal.boxing.m17096e(r7)
                r5.add(r7)
                goto L7c
            L94:
                r0.f61772l = r9
                r0.f61773m = r10
                r0.f61774n = r2
                r0.f61776p = r4
                java.lang.Object r5 = r9.mo47697d(r5, r0)
                if (r5 != r1) goto La3
                return r1
            La3:
                r5 = r9
                r9 = r2
            La5:
                r10.addAll(r9)
                r9 = r5
                goto L51
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.p544db.InterfaceC23796d.C23797a.m47703a(com.moloco.sdk.acm.db.d, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @Transaction
    @Nullable
    /* renamed from: a */
    Object mo47701a(@NotNull Continuation<? super List<C23794b>> continuation);

    @Query("DELETE FROM sqlite_sequence WHERE name='events'")
    @Nullable
    /* renamed from: b */
    Object mo47699b(@NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM events LIMIT 900")
    @NotNull
    /* renamed from: b */
    List<C23794b> mo47700b();

    @Insert(onConflict = 1)
    /* renamed from: c */
    long mo47698c(@NotNull C23794b c23794b);

    @Query("DELETE FROM events WHERE id IN (:ids)")
    @Nullable
    /* renamed from: d */
    Object mo47697d(@NotNull List<Long> list, @NotNull Continuation<? super Unit> continuation);
}
