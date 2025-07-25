package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import io.bidmachine.rendering.utils.Utils;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class AdPhaseParams {

    /* renamed from: a */
    private final List f97849a;

    /* renamed from: b */
    private final List f97850b;

    /* renamed from: c */
    private final List f97851c;

    /* renamed from: d */
    private final Map f97852d;

    /* renamed from: e */
    private final Map f97853e;

    /* renamed from: f */
    private final int f97854f;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private final List f97855a = new ArrayList();

        /* renamed from: b */
        private final List f97856b = new ArrayList();

        /* renamed from: c */
        private final List f97857c = new ArrayList();

        /* renamed from: d */
        private final Map f97858d = new HashMap();

        /* renamed from: e */
        private final Map f97859e = new HashMap();

        /* renamed from: f */
        private int f97860f = ViewCompat.MEASURED_STATE_MASK;

        public Builder addAdsElementParams(@NonNull AdElementParams adElementParams) {
            this.f97855a.add(adElementParams);
            return this;
        }

        public Builder addControlsElementParams(@NonNull AdElementParams adElementParams) {
            this.f97856b.add(adElementParams);
            return this;
        }

        public Builder addEventParams(@NonNull EventParams eventParams) {
            String source = eventParams.getSource();
            EventType eventType = eventParams.getEventType();
            List<EventTaskParams> eventTaskParamsList = eventParams.getEventTaskParamsList();
            if (eventTaskParamsList.isEmpty()) {
                return this;
            }
            Map map = (Map) this.f97858d.get(source);
            if (map == null) {
                map = new EnumMap(EventType.class);
                this.f97858d.put(source, map);
            }
            List list = (List) map.get(eventType);
            if (list == null) {
                list = new ArrayList();
                map.put(eventType, list);
            }
            list.addAll(eventTaskParamsList);
            return this;
        }

        public Builder addMethodParams(@NonNull MethodParams methodParams) {
            this.f97857c.add(methodParams);
            return this;
        }

        public AdPhaseParams build() {
            return new AdPhaseParams(this.f97855a, this.f97856b, this.f97857c, this.f97858d, this.f97859e, this.f97860f);
        }

        public Builder setAdsElementParamsList(@Nullable List<AdElementParams> list) {
            Utils.set(this.f97855a, list);
            return this;
        }

        public Builder setBackgroundColor(int i) {
            this.f97860f = i;
            return this;
        }

        public Builder setControlsElementParamsList(@Nullable List<AdElementParams> list) {
            Utils.set(this.f97856b, list);
            return this;
        }

        public Builder setCustomParams(@Nullable Map<String, String> map) {
            Utils.set(this.f97859e, map);
            return this;
        }

        public Builder setEventParamsList(@Nullable Map<String, Map<EventType, List<EventTaskParams>>> map) {
            Utils.set(this.f97858d, map);
            return this;
        }

        public Builder setMethodParamsList(@Nullable List<MethodParams> list) {
            Utils.set(this.f97857c, list);
            return this;
        }
    }

    public AdPhaseParams(@NonNull List<AdElementParams> list, @NonNull List<AdElementParams> list2, @NonNull List<MethodParams> list3, @NonNull Map<String, Map<EventType, List<EventTaskParams>>> map, @NonNull Map<String, String> map2, int i) {
        this.f97849a = list;
        this.f97850b = list2;
        this.f97851c = list3;
        this.f97852d = map;
        this.f97853e = map2;
        this.f97854f = i;
    }

    @NonNull
    public List<AdElementParams> getAdsList() {
        return this.f97849a;
    }

    public int getBackgroundColor() {
        return this.f97854f;
    }

    @NonNull
    public List<AdElementParams> getControlsList() {
        return this.f97850b;
    }

    @Nullable
    public String getCustomParam(@NonNull String str) {
        return (String) this.f97853e.get(str);
    }

    @NonNull
    public Map<String, String> getCustomParams() {
        return this.f97853e;
    }

    @Nullable
    public Map<EventType, List<EventTaskParams>> getEventTypeMap(@NonNull String str) {
        return getSourceEventTypeMap().get(str);
    }

    @NonNull
    public List<MethodParams> getMethodParamsList() {
        return this.f97851c;
    }

    @NonNull
    public Map<String, Map<EventType, List<EventTaskParams>>> getSourceEventTypeMap() {
        return this.f97852d;
    }
}
