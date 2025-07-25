package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: b */
    private final List<Component<?>> f42116b;

    public DependencyCycleException(List<Component<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f42116b = list;
    }

    public List<Component<?>> getComponentsInCycle() {
        return this.f42116b;
    }
}
