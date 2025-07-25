package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Jc */
/* loaded from: classes9.dex */
public final class C33991Jc implements JsonParser, Converter {

    /* renamed from: a */
    public final RemoteConfigExtensionConfiguration f93062a;

    /* renamed from: b */
    public final /* synthetic */ JsonParser f93063b;

    /* renamed from: c */
    public final /* synthetic */ Converter f93064c;

    public C33991Jc(@NotNull RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f93062a = remoteConfigExtensionConfiguration;
        this.f93063b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f93064c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    @NotNull
    /* renamed from: a */
    public final byte[] m22517a(@NotNull Object obj) {
        return (byte[]) this.f93064c.fromModel(obj);
    }

    @Nullable
    /* renamed from: b */
    public final Object m22514b(@NotNull JSONObject jSONObject) {
        return this.f93063b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f93064c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f93063b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f93063b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f93064c.toModel((byte[]) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Object m22516a(@NotNull JSONObject jSONObject) {
        return this.f93063b.parse(jSONObject);
    }

    @NotNull
    /* renamed from: a */
    public final Object m22515a(@NotNull byte[] bArr) {
        return this.f93064c.toModel(bArr);
    }

    @NotNull
    /* renamed from: a */
    public final RemoteConfigExtensionConfiguration<Object> m22518a() {
        return this.f93062a;
    }
}
