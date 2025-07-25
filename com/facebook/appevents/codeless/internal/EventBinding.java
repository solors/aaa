package com.facebook.appevents.codeless.internal;

import com.p552ot.pubsub.p559g.C26542f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventBinding.kt */
@Metadata
/* loaded from: classes2.dex */
public final class EventBinding {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String activityName;
    @NotNull
    private final String appVersion;
    @NotNull
    private final String componentId;
    @NotNull
    private final String eventName;
    @NotNull
    private final MappingMethod method;
    @NotNull
    private final List<ParameterComponent> parameters;
    @NotNull
    private final List<PathComponent> path;
    @NotNull
    private final String pathType;
    @NotNull
    private final ActionType type;

    /* compiled from: EventBinding.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            ActionType[] valuesCustom = values();
            return (ActionType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: EventBinding.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EventBinding getInstanceFromJson(@NotNull JSONObject mapping) throws JSONException, IllegalArgumentException {
            int length;
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            String eventName = mapping.getString(C26542f.C26543a.f69514l);
            String string = mapping.getString("method");
            Intrinsics.checkNotNullExpressionValue(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            MappingMethod valueOf = MappingMethod.valueOf(upperCase);
            String string2 = mapping.getString("event_type");
            Intrinsics.checkNotNullExpressionValue(string2, "mapping.getString(\"event_type\")");
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            ActionType valueOf2 = ActionType.valueOf(upperCase2);
            String appVersion = mapping.getString("app_version");
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i = 0;
            if (length2 > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jsonPath = jSONArray.getJSONObject(i2);
                    Intrinsics.checkNotNullExpressionValue(jsonPath, "jsonPath");
                    arrayList.add(new PathComponent(jsonPath));
                    if (i3 >= length2) {
                        break;
                    }
                    i2 = i3;
                }
            }
            String pathType = mapping.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE);
            JSONArray optJSONArray = mapping.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i4 = i + 1;
                    JSONObject jsonParameter = optJSONArray.getJSONObject(i);
                    Intrinsics.checkNotNullExpressionValue(jsonParameter, "jsonParameter");
                    arrayList2.add(new ParameterComponent(jsonParameter));
                    if (i4 >= length) {
                        break;
                    }
                    i = i4;
                }
            }
            String componentId = mapping.optString("component_id");
            String activityName = mapping.optString("activity_name");
            Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
            Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
            Intrinsics.checkNotNullExpressionValue(componentId, "componentId");
            Intrinsics.checkNotNullExpressionValue(pathType, "pathType");
            Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
            return new EventBinding(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }

        @NotNull
        public final List<EventBinding> parseArray(@Nullable JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(getInstanceFromJson(jSONObject));
                            if (i2 >= length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    /* compiled from: EventBinding.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public enum MappingMethod {
        MANUAL,
        INFERENCE;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static MappingMethod[] valuesCustom() {
            MappingMethod[] valuesCustom = values();
            return (MappingMethod[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public EventBinding(@NotNull String eventName, @NotNull MappingMethod method, @NotNull ActionType type, @NotNull String appVersion, @NotNull List<PathComponent> path, @NotNull List<ParameterComponent> parameters, @NotNull String componentId, @NotNull String pathType, @NotNull String activityName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.eventName = eventName;
        this.method = method;
        this.type = type;
        this.appVersion = appVersion;
        this.path = path;
        this.parameters = parameters;
        this.componentId = componentId;
        this.pathType = pathType;
        this.activityName = activityName;
    }

    @NotNull
    public static final EventBinding getInstanceFromJson(@NotNull JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return Companion.getInstanceFromJson(jSONObject);
    }

    @NotNull
    public static final List<EventBinding> parseArray(@Nullable JSONArray jSONArray) {
        return Companion.parseArray(jSONArray);
    }

    @NotNull
    public final String getActivityName() {
        return this.activityName;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getComponentId() {
        return this.componentId;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final MappingMethod getMethod() {
        return this.method;
    }

    @NotNull
    public final String getPathType() {
        return this.pathType;
    }

    @NotNull
    public final ActionType getType() {
        return this.type;
    }

    @NotNull
    public final List<ParameterComponent> getViewParameters() {
        List<ParameterComponent> unmodifiableList = Collections.unmodifiableList(this.parameters);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    @NotNull
    public final List<PathComponent> getViewPath() {
        List<PathComponent> unmodifiableList = Collections.unmodifiableList(this.path);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
