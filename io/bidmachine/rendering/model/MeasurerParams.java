package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes9.dex */
public class MeasurerParams {

    /* renamed from: a */
    private final String f97919a;

    /* renamed from: b */
    private final Map f97920b;

    public MeasurerParams(@NonNull String str, @Nullable Map<String, String> map) {
        this.f97919a = str;
        this.f97920b = map;
    }

    @NonNull
    public String getName() {
        return this.f97919a;
    }

    @Nullable
    public Map<String, String> getParameters() {
        return this.f97920b;
    }
}
