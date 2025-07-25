package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.af */
/* loaded from: classes6.dex */
public interface InterfaceC19581af<T> {

    @Metadata
    /* renamed from: com.ironsource.af$a */
    /* loaded from: classes6.dex */
    public static final class C19582a implements InterfaceC19581af<ISDemandOnlyInterstitialListener> {
        @NotNull

        /* renamed from: a */
        private C21307ze f49159a = new C21307ze();
        @NotNull

        /* renamed from: b */
        private final Map<String, C21307ze> f49160b = new HashMap();

        @Override // com.ironsource.InterfaceC19581af
        @NotNull
        /* renamed from: b */
        public ISDemandOnlyInterstitialListener mo59448a(@NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            C21307ze c21307ze = this.f49160b.get(instanceId);
            if (c21307ze == null) {
                return this.f49159a;
            }
            return c21307ze;
        }

        @Override // com.ironsource.InterfaceC19581af
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo59449a(@NotNull ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f49159a.mo59322a(listener);
            for (String str : this.f49160b.keySet()) {
                C21307ze c21307ze = this.f49160b.get(str);
                if (c21307ze != null) {
                    c21307ze.mo59322a(listener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC19581af
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo59446a(@NotNull String instanceId, @NotNull ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (!this.f49160b.containsKey(instanceId)) {
                this.f49160b.put(instanceId, new C21307ze(listener));
                return;
            }
            C21307ze c21307ze = this.f49160b.get(instanceId);
            if (c21307ze != null) {
                c21307ze.mo59322a(listener);
            }
        }
    }

    @Metadata
    /* renamed from: com.ironsource.af$b */
    /* loaded from: classes6.dex */
    public static final class C19583b implements InterfaceC19581af<ISDemandOnlyRewardedVideoListener> {
        @NotNull

        /* renamed from: a */
        private C19699cf f49161a = new C19699cf();
        @NotNull

        /* renamed from: b */
        private final Map<String, C19699cf> f49162b = new HashMap();

        @Override // com.ironsource.InterfaceC19581af
        @NotNull
        /* renamed from: b */
        public ISDemandOnlyRewardedVideoListener mo59448a(@NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            C19699cf c19699cf = this.f49162b.get(instanceId);
            if (c19699cf == null) {
                return this.f49161a;
            }
            return c19699cf;
        }

        @Override // com.ironsource.InterfaceC19581af
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo59449a(@NotNull ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f49161a.mo59322a(listener);
            for (String str : this.f49162b.keySet()) {
                C19699cf c19699cf = this.f49162b.get(str);
                if (c19699cf != null) {
                    c19699cf.mo59322a(listener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC19581af
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo59446a(@NotNull String instanceId, @NotNull ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (!this.f49162b.containsKey(instanceId)) {
                this.f49162b.put(instanceId, new C19699cf(listener));
                return;
            }
            C19699cf c19699cf = this.f49162b.get(instanceId);
            if (c19699cf != null) {
                c19699cf.mo59322a(listener);
            }
        }
    }

    /* renamed from: a */
    T mo59448a(@NotNull String str);

    /* renamed from: a */
    void mo59449a(T t);

    /* renamed from: a */
    void mo59446a(@NotNull String str, T t);
}
