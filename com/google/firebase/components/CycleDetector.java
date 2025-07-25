package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
class CycleDetector {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class ComponentNode {

        /* renamed from: a */
        private final Component<?> f42108a;

        /* renamed from: b */
        private final Set<ComponentNode> f42109b = new HashSet();

        /* renamed from: c */
        private final Set<ComponentNode> f42110c = new HashSet();

        ComponentNode(Component<?> component) {
            this.f42108a = component;
        }

        /* renamed from: a */
        void m67337a(ComponentNode componentNode) {
            this.f42109b.add(componentNode);
        }

        /* renamed from: b */
        void m67336b(ComponentNode componentNode) {
            this.f42110c.add(componentNode);
        }

        /* renamed from: c */
        Component<?> m67335c() {
            return this.f42108a;
        }

        /* renamed from: d */
        Set<ComponentNode> m67334d() {
            return this.f42109b;
        }

        /* renamed from: e */
        boolean m67333e() {
            return this.f42109b.isEmpty();
        }

        /* renamed from: f */
        boolean m67332f() {
            return this.f42110c.isEmpty();
        }

        /* renamed from: g */
        void m67331g(ComponentNode componentNode) {
            this.f42110c.remove(componentNode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class Dep {

        /* renamed from: a */
        private final Qualified<?> f42111a;

        /* renamed from: b */
        private final boolean f42112b;

        public boolean equals(Object obj) {
            if (!(obj instanceof Dep)) {
                return false;
            }
            Dep dep = (Dep) obj;
            if (!dep.f42111a.equals(this.f42111a) || dep.f42112b != this.f42112b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f42111a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f42112b).hashCode();
        }

        private Dep(Qualified<?> qualified, boolean z) {
            this.f42111a = qualified;
            this.f42112b = z;
        }
    }

    CycleDetector() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m67340a(List<Component<?>> list) {
        Set<ComponentNode> m67338c = m67338c(list);
        Set<ComponentNode> m67339b = m67339b(m67338c);
        int i = 0;
        while (!m67339b.isEmpty()) {
            ComponentNode next = m67339b.iterator().next();
            m67339b.remove(next);
            i++;
            for (ComponentNode componentNode : next.m67334d()) {
                componentNode.m67331g(next);
                if (componentNode.m67332f()) {
                    m67339b.add(componentNode);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ComponentNode componentNode2 : m67338c) {
            if (!componentNode2.m67332f() && !componentNode2.m67333e()) {
                arrayList.add(componentNode2.m67335c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    /* renamed from: b */
    private static Set<ComponentNode> m67339b(Set<ComponentNode> set) {
        HashSet hashSet = new HashSet();
        for (ComponentNode componentNode : set) {
            if (componentNode.m67332f()) {
                hashSet.add(componentNode);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<ComponentNode> m67338c(List<Component<?>> list) {
        Set<ComponentNode> set;
        HashMap hashMap = new HashMap(list.size());
        for (Component<?> component : list) {
            ComponentNode componentNode = new ComponentNode(component);
            for (Qualified<? super Object> qualified : component.getProvidedInterfaces()) {
                Dep dep = new Dep(qualified, !component.isValue());
                if (!hashMap.containsKey(dep)) {
                    hashMap.put(dep, new HashSet());
                }
                Set set2 = (Set) hashMap.get(dep);
                if (!set2.isEmpty() && !dep.f42112b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", qualified));
                }
                set2.add(componentNode);
            }
        }
        for (Set<ComponentNode> set3 : hashMap.values()) {
            for (ComponentNode componentNode2 : set3) {
                for (Dependency dependency : componentNode2.m67335c().getDependencies()) {
                    if (dependency.isDirectInjection() && (set = (Set) hashMap.get(new Dep(dependency.getInterface(), dependency.isSet()))) != null) {
                        for (ComponentNode componentNode3 : set) {
                            componentNode2.m67337a(componentNode3);
                            componentNode3.m67336b(componentNode2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
