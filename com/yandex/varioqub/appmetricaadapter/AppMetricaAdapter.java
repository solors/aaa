package com.yandex.varioqub.appmetricaadapter;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.impl.AbstractC32056e;
import com.yandex.varioqub.appmetricaadapter.impl.C32062k;
import com.yandex.varioqub.appmetricaadapter.impl.InterfaceC32055d;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37572z0;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes8.dex */
public final class AppMetricaAdapter implements VarioqubConfigAdapter {
    @NotNull

    /* renamed from: f */
    public static final Companion f89331f = new Companion(null);

    /* renamed from: a */
    private final Context f89332a;

    /* renamed from: b */
    private final InterfaceC32055d f89333b = AbstractC32056e.m25923a();

    /* renamed from: c */
    private String f89334c = "";

    /* renamed from: d */
    private Set f89335d;

    /* renamed from: e */
    private final String f89336e;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AppMetricaAdapter(@NotNull Context context) {
        Set m17123f;
        this.f89332a = context;
        m17123f = C37572z0.m17123f();
        this.f89335d = m17123f;
        this.f89336e = "AppMetricaAdapter";
    }

    /* renamed from: a */
    public final void m25924a(@NotNull String str) {
        this.f89333b.mo25921a(this.f89332a, str);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    @NotNull
    public String getAdapterName() {
        return this.f89336e;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void reportConfigChanged(@NotNull ConfigData configData) {
        InterfaceC32055d interfaceC32055d = this.f89333b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", Long.valueOf(configData.getConfigLoadTimestamp()));
        interfaceC32055d.mo25919b(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestDeviceId(@NotNull AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f89333b.mo25918c(this.f89332a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestUserId(@NotNull AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f89333b.mo25922a(this.f89332a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setExperiments(@NotNull String str) {
        long[] m17552a1;
        this.f89334c = str;
        Objects.toString(this.f89335d);
        InterfaceC32055d interfaceC32055d = this.f89333b;
        C32062k c32062k = new C32062k();
        c32062k.f89342a = this.f89334c;
        m17552a1 = _Collections.m17552a1(this.f89335d);
        c32062k.f89343b = m17552a1;
        interfaceC32055d.mo25920a(MessageNano.toByteArray(c32062k));
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setTriggeredTestIds(@NotNull Set<Long> set) {
        Set m17547e1;
        long[] m17552a1;
        Objects.toString(set);
        m17547e1 = _Collections.m17547e1(set);
        this.f89335d = m17547e1;
        Objects.toString(m17547e1);
        InterfaceC32055d interfaceC32055d = this.f89333b;
        C32062k c32062k = new C32062k();
        c32062k.f89342a = this.f89334c;
        m17552a1 = _Collections.m17552a1(this.f89335d);
        c32062k.f89343b = m17552a1;
        interfaceC32055d.mo25920a(MessageNano.toByteArray(c32062k));
    }
}
