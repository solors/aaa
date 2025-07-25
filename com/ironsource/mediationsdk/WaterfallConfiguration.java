package com.ironsource.mediationsdk;

import com.ironsource.C20086i9;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public final class WaterfallConfiguration {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable

    /* renamed from: a */
    private final Double f51266a;
    @Nullable

    /* renamed from: b */
    private final Double f51267b;

    @Metadata
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WaterfallConfigurationBuilder builder() {
            return new WaterfallConfigurationBuilder();
        }

        @NotNull
        public final WaterfallConfiguration empty() {
            return builder().build();
        }
    }

    @Metadata
    /* loaded from: classes6.dex */
    public static final class WaterfallConfigurationBuilder {
        @Nullable

        /* renamed from: a */
        private Double f51268a;
        @Nullable

        /* renamed from: b */
        private Double f51269b;

        @NotNull
        public final WaterfallConfiguration build() {
            return new WaterfallConfiguration(this, null);
        }

        @Nullable
        public final Double getCeiling$mediationsdk_release() {
            return this.f51269b;
        }

        @Nullable
        public final Double getFloor$mediationsdk_release() {
            return this.f51268a;
        }

        @NotNull
        public final WaterfallConfigurationBuilder setCeiling(double d) {
            this.f51269b = Double.valueOf(d);
            return this;
        }

        public final void setCeiling$mediationsdk_release(@Nullable Double d) {
            this.f51269b = d;
        }

        @NotNull
        public final WaterfallConfigurationBuilder setFloor(double d) {
            this.f51268a = Double.valueOf(d);
            return this;
        }

        public final void setFloor$mediationsdk_release(@Nullable Double d) {
            this.f51268a = d;
        }
    }

    private WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder) {
        this.f51266a = waterfallConfigurationBuilder.getFloor$mediationsdk_release();
        this.f51267b = waterfallConfigurationBuilder.getCeiling$mediationsdk_release();
    }

    @NotNull
    public static final WaterfallConfigurationBuilder builder() {
        return Companion.builder();
    }

    @NotNull
    public static final WaterfallConfiguration empty() {
        return Companion.empty();
    }

    @Nullable
    public final Double getCeiling() {
        return this.f51267b;
    }

    @Nullable
    public final Double getFloor() {
        return this.f51266a;
    }

    @NotNull
    public final String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.f51267b);
            jSONObject.put("floor", this.f51266a);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    @NotNull
    public String toString() {
        return "WaterfallConfiguration" + toJsonString();
    }

    public /* synthetic */ WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(waterfallConfigurationBuilder);
    }
}
