package com.smaato.sdk.video.utils;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class EventValidator<Event, State> {
    @NonNull
    private final Map<Event, List<? extends State>> validStatesForEvent;

    /* loaded from: classes7.dex */
    public static class Builder<Event, State> {
        @NonNull
        private final Map<Event, List<? extends State>> validStatesForEvent = new HashMap();

        @NonNull
        public EventValidator<Event, State> build() {
            if (!this.validStatesForEvent.isEmpty()) {
                return new EventValidator<>(this.validStatesForEvent);
            }
            throw new IllegalStateException("At least one valid event for states should be added.");
        }

        @NonNull
        public Builder<Event, State> setValidStatesForEvent(@NonNull Event event, @NonNull List<? extends State> list) {
            Objects.requireNonNull(event, "Parameter event can not be null");
            ArrayList<Object> arrayList = new ArrayList((Collection) Objects.requireNonNull(list, "Parameter states can not be null"));
            for (Object obj : arrayList) {
                Objects.requireNonNull(obj, "a state can not be null");
            }
            if (arrayList.size() <= new HashSet(list).size()) {
                this.validStatesForEvent.put(event, arrayList);
                return this;
            }
            throw new IllegalArgumentException("a states must consist of unique states");
        }
    }

    public boolean isValid(@NonNull Event event, @NonNull State state) {
        List<? extends State> list = this.validStatesForEvent.get(event);
        if (list == null) {
            return false;
        }
        return list.contains(state);
    }

    private EventValidator(@NonNull Map<Event, List<? extends State>> map) {
        this.validStatesForEvent = map;
    }
}
