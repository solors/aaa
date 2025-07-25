package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ParameterComponent.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ParameterComponent {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String PARAMETER_NAME_KEY = "name";
    @NotNull
    private static final String PARAMETER_PATH_KEY = "path";
    @NotNull
    private static final String PARAMETER_VALUE_KEY = "value";
    @NotNull
    private final String name;
    @NotNull
    private final List<PathComponent> path;
    @NotNull
    private final String pathType;
    @NotNull
    private final String value;

    /* compiled from: ParameterComponent.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ParameterComponent(@NotNull JSONObject component) {
        int length;
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PARAMETER_NAME_KEY)");
        this.name = string;
        String optString = component.optString("value");
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.value = optString;
        String optString2 = component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE);
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.pathType = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = component.optJSONArray("path");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new PathComponent(jSONObject));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        this.path = arrayList;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<PathComponent> getPath() {
        return this.path;
    }

    @NotNull
    public final String getPathType() {
        return this.pathType;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
