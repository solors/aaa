package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C19897f5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.mediationsdk.demandOnly.a */
/* loaded from: classes6.dex */
public interface InterfaceC20353a {

    @Metadata
    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a */
    /* loaded from: classes6.dex */
    public static final class C20354a implements InterfaceC20353a {
        @NotNull

        /* renamed from: a */
        private final List<C19897f5> f51367a;

        public C20354a() {
            this(null, 1, null);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20353a
        @Nullable
        /* renamed from: a */
        public C19897f5 mo56986a(@NotNull String instanceName) {
            Object obj;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            Iterator<T> it = this.f51367a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.m17075f(((C19897f5) obj).m58650c(), instanceName)) {
                    break;
                }
            }
            return (C19897f5) obj;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20353a
        @NotNull
        /* renamed from: b */
        public String mo56985b() {
            Object m17531p0;
            if (this.f51367a.isEmpty()) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('1');
            m17531p0 = _Collections.m17531p0(this.f51367a);
            sb2.append(((C19897f5) m17531p0).m58650c());
            return sb2.toString();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20353a
        @Nullable
        public C19897f5 get(int i) {
            if (i >= 0 && i < this.f51367a.size()) {
                return this.f51367a.get(i);
            }
            return null;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20353a
        public boolean isEmpty() {
            return this.f51367a.isEmpty();
        }

        public C20354a(@NotNull List<C19897f5> waterfall) {
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            this.f51367a = waterfall;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20353a
        @NotNull
        /* renamed from: a */
        public List<C19897f5> mo56987a() {
            return this.f51367a;
        }

        public /* synthetic */ C20354a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list);
        }
    }

    @Nullable
    /* renamed from: a */
    C19897f5 mo56986a(@NotNull String str);

    @NotNull
    /* renamed from: a */
    List<C19897f5> mo56987a();

    @NotNull
    /* renamed from: b */
    String mo56985b();

    @Nullable
    C19897f5 get(int i);

    boolean isEmpty();
}
