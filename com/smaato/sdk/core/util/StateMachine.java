package com.smaato.sdk.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class StateMachine<Event extends Enum<Event>, State extends Enum<State>> {
    @NonNull
    private final Map<Pair<Event, State>, List<State>> graph;
    private boolean inTransition;
    @NonNull
    private final LinkedHashSet<Listener<State>> listeners;
    @NonNull
    private State state;

    /* loaded from: classes7.dex */
    public static class Builder<Event extends Enum<Event>, State extends Enum<State>> {
        @NonNull
        private final Map<Pair<Event, State>, List<State>> graph = new HashMap();
        @Nullable
        private State initialState;

        @NonNull
        public Builder<Event, State> addLoopTransition(@NonNull Event event, @NonNull State state) {
            Objects.requireNonNull(event, "event cannot be null");
            Objects.requireNonNull(state, "state cannot be null");
            Pair<Event, State> m39354of = Pair.m39354of(event, state);
            if (!this.graph.containsKey(m39354of)) {
                this.graph.put(m39354of, Collections.singletonList(state));
                return this;
            }
            throw new IllegalArgumentException("a statePath with the same start state " + state + " is already defined for the event " + event);
        }

        @NonNull
        public Builder<Event, State> addTransition(@NonNull Event event, @NonNull List<State> list) {
            Objects.requireNonNull(event, "event can not be null");
            ArrayList<Enum> arrayList = new ArrayList((Collection) Objects.requireNonNull(list, "statePath can not be null"));
            if (arrayList.size() >= 2) {
                for (Enum r1 : arrayList) {
                    Objects.requireNonNull(r1, "a state can not be null");
                }
                if (arrayList.size() <= EnumSet.copyOf((Collection) arrayList).size()) {
                    Enum r5 = (Enum) arrayList.remove(0);
                    Pair<Event, State> m39354of = Pair.m39354of(event, r5);
                    if (!this.graph.containsKey(m39354of)) {
                        this.graph.put(m39354of, arrayList);
                        return this;
                    }
                    throw new IllegalArgumentException("a statePath with the same start state " + r5 + " is already defined for the event " + event);
                }
                throw new IllegalArgumentException("a statePath must consist of unique states");
            }
            throw new IllegalArgumentException("statePath must have at least 2 states");
        }

        @NonNull
        public StateMachine<Event, State> build() {
            if (this.initialState != null) {
                if (!this.graph.isEmpty()) {
                    return new StateMachine<>(this.graph, this.initialState);
                }
                throw new IllegalStateException("at least one transition must be added");
            }
            throw new IllegalStateException("initialState must be set");
        }

        public Builder<Event, State> setInitialState(@NonNull State state) {
            this.initialState = (State) Objects.requireNonNull(state, "initialState can not be null");
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public interface Listener<State> {
        void onStateChanged(@NonNull State state, @NonNull State state2, @Nullable Metadata metadata);
    }

    public synchronized void addListener(@NonNull Listener<State> listener) {
        Objects.requireNonNull(listener, "listener can not be null");
        this.listeners.add(listener);
    }

    public synchronized void deleteListener(@Nullable Listener<State> listener) {
        this.listeners.remove(listener);
    }

    public synchronized void deleteListeners() {
        this.listeners.clear();
    }

    @NonNull
    public synchronized State getCurrentState() {
        return this.state;
    }

    public synchronized boolean isTransitionAllowed(@NonNull Event event) {
        boolean z;
        if (this.graph.get(Pair.m39354of(event, this.state)) != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public void onEvent(Event event) {
        onEvent(event, null);
    }

    private StateMachine(@NonNull Map<Pair<Event, State>, List<State>> map, @NonNull State state) {
        this.listeners = new LinkedHashSet<>();
        this.graph = map;
        this.state = state;
    }

    public synchronized void onEvent(@NonNull Event event, @Nullable Metadata metadata) {
        List<State> list = this.graph.get(Pair.m39354of(event, this.state));
        if (list == null) {
            return;
        }
        if (!this.inTransition) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                this.inTransition = i < size + (-1);
                State state = this.state;
                State state2 = list.get(i);
                this.state = state2;
                java.util.Iterator it = new ArrayList(this.listeners).iterator();
                while (it.hasNext()) {
                    ((Listener) it.next()).onStateChanged(state, state2, metadata);
                }
                i++;
            }
            return;
        }
        throw new IllegalStateException("can not start a new transition, because there is an on-going unfinished transition");
    }
}
