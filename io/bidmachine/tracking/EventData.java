package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import io.bidmachine.utils.ProtoUtils;
import java.util.Map;

/* loaded from: classes9.dex */
public class EventData {
    @Nullable
    private Struct.Builder customParamsBuilder;
    @Nullable
    private String networkName;
    @Nullable
    private Double price;

    @Nullable
    public Struct getCustomParams() {
        Struct.Builder builder = this.customParamsBuilder;
        if (builder != null) {
            return builder.build();
        }
        return null;
    }

    @Nullable
    public String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public Double getPrice() {
        return this.price;
    }

    @NonNull
    public EventData setCustomParam(@NonNull String str, @NonNull String str2) {
        if (this.customParamsBuilder == null) {
            this.customParamsBuilder = Struct.newBuilder();
        }
        this.customParamsBuilder.putFields(str, Value.newBuilder().setStringValue(str2).build());
        return this;
    }

    @NonNull
    public EventData setCustomParams(@Nullable Map<String, Object> map) {
        this.customParamsBuilder = ProtoUtils.toStructBuilderOrNull(map);
        return this;
    }

    @NonNull
    public EventData setNetworkName(@Nullable String str) {
        this.networkName = str;
        return this;
    }

    @NonNull
    public EventData setPrice(@Nullable Double d) {
        this.price = d;
        return this;
    }

    @NonNull
    public EventData setCustomParam(@NonNull String str, double d) {
        if (this.customParamsBuilder == null) {
            this.customParamsBuilder = Struct.newBuilder();
        }
        this.customParamsBuilder.putFields(str, Value.newBuilder().setNumberValue(d).build());
        return this;
    }

    @NonNull
    public EventData setCustomParam(@NonNull String str, boolean z) {
        if (this.customParamsBuilder == null) {
            this.customParamsBuilder = Struct.newBuilder();
        }
        this.customParamsBuilder.putFields(str, Value.newBuilder().setBoolValue(z).build());
        return this;
    }
}
