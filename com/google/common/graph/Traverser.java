package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.DoNotMock;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

@Beta
@ElementTypesAreNonnullByDefault
@DoNotMock("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
/* loaded from: classes4.dex */
public abstract class Traverser<N> {

    /* renamed from: a */
    private final SuccessorsFunction<N> f41044a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum InsertionOrder {
        FRONT { // from class: com.google.common.graph.Traverser.InsertionOrder.1
            @Override // com.google.common.graph.Traverser.InsertionOrder
            /* renamed from: c */
            <T> void mo68403c(Deque<T> deque, T t) {
                deque.addFirst(t);
            }
        },
        BACK { // from class: com.google.common.graph.Traverser.InsertionOrder.2
            @Override // com.google.common.graph.Traverser.InsertionOrder
            /* renamed from: c */
            <T> void mo68403c(Deque<T> deque, T t) {
                deque.addLast(t);
            }
        };

        /* renamed from: c */
        abstract <T> void mo68403c(Deque<T> deque, T t);
    }

    /* loaded from: classes4.dex */
    private static abstract class Traversal<N> {

        /* renamed from: a */
        final SuccessorsFunction<N> f41054a;

        Traversal(SuccessorsFunction<N> successorsFunction) {
            this.f41054a = successorsFunction;
        }

        /* renamed from: b */
        static <N> Traversal<N> m68401b(SuccessorsFunction<N> successorsFunction) {
            final HashSet hashSet = new HashSet();
            return new Traversal<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.Traversal.1
                @Override // com.google.common.graph.Traverser.Traversal
                /* renamed from: g */
                N mo68396g(Deque<Iterator<? extends N>> deque) {
                    Iterator<? extends N> first = deque.getFirst();
                    while (first.hasNext()) {
                        N next = first.next();
                        Objects.requireNonNull(next);
                        if (hashSet.add(next)) {
                            return next;
                        }
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        /* renamed from: c */
        static <N> Traversal<N> m68400c(SuccessorsFunction<N> successorsFunction) {
            return new Traversal<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.Traversal.2
                @Override // com.google.common.graph.Traverser.Traversal
                /* renamed from: g */
                N mo68396g(Deque<Iterator<? extends N>> deque) {
                    Iterator<? extends N> first = deque.getFirst();
                    if (first.hasNext()) {
                        return (N) Preconditions.checkNotNull(first.next());
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        /* renamed from: f */
        private Iterator<N> m68397f(Iterator<? extends N> it, final InsertionOrder insertionOrder) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(it);
            return new AbstractIterator<N>() { // from class: com.google.common.graph.Traverser.Traversal.3
                @Override // com.google.common.collect.AbstractIterator
                protected N computeNext() {
                    do {
                        N n = (N) Traversal.this.mo68396g(arrayDeque);
                        if (n != null) {
                            Iterator<? extends N> it2 = Traversal.this.f41054a.successors(n).iterator();
                            if (it2.hasNext()) {
                                insertionOrder.mo68403c(arrayDeque, it2);
                            }
                            return n;
                        }
                    } while (!arrayDeque.isEmpty());
                    return m69807a();
                }
            };
        }

        /* renamed from: a */
        final Iterator<N> m68402a(Iterator<? extends N> it) {
            return m68397f(it, InsertionOrder.BACK);
        }

        /* renamed from: d */
        final Iterator<N> m68399d(Iterator<? extends N> it) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            final ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(it);
            return new AbstractIterator<N>() { // from class: com.google.common.graph.Traverser.Traversal.4
                @Override // com.google.common.collect.AbstractIterator
                protected N computeNext() {
                    while (true) {
                        N n = (N) Traversal.this.mo68396g(arrayDeque2);
                        if (n != null) {
                            Iterator<? extends N> it2 = Traversal.this.f41054a.successors(n).iterator();
                            if (!it2.hasNext()) {
                                return n;
                            }
                            arrayDeque2.addFirst(it2);
                            arrayDeque.push(n);
                        } else if (!arrayDeque.isEmpty()) {
                            return (N) arrayDeque.pop();
                        } else {
                            return m69807a();
                        }
                    }
                }
            };
        }

        /* renamed from: e */
        final Iterator<N> m68398e(Iterator<? extends N> it) {
            return m68397f(it, InsertionOrder.FRONT);
        }

        /* renamed from: g */
        abstract N mo68396g(Deque<Iterator<? extends N>> deque);
    }

    /* renamed from: b */
    private ImmutableSet<N> m68406b(Iterable<? extends N> iterable) {
        ImmutableSet<N> copyOf = ImmutableSet.copyOf(iterable);
        UnmodifiableIterator<N> it = copyOf.iterator();
        while (it.hasNext()) {
            this.f41044a.successors(it.next());
        }
        return copyOf;
    }

    public static <N> Traverser<N> forGraph(final SuccessorsFunction<N> successorsFunction) {
        return new Traverser<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.1
            @Override // com.google.common.graph.Traverser
            /* renamed from: a */
            Traversal<N> mo68405a() {
                return Traversal.m68401b(successorsFunction);
            }
        };
    }

    public static <N> Traverser<N> forTree(final SuccessorsFunction<N> successorsFunction) {
        if (successorsFunction instanceof BaseGraph) {
            Preconditions.checkArgument(((BaseGraph) successorsFunction).isDirected(), "Undirected graphs can never be trees.");
        }
        if (successorsFunction instanceof Network) {
            Preconditions.checkArgument(((Network) successorsFunction).isDirected(), "Undirected networks can never be trees.");
        }
        return new Traverser<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.2
            @Override // com.google.common.graph.Traverser
            /* renamed from: a */
            Traversal<N> mo68405a() {
                return Traversal.m68400c(successorsFunction);
            }
        };
    }

    /* renamed from: a */
    abstract Traversal<N> mo68405a();

    public final Iterable<N> breadthFirst(N n) {
        return breadthFirst((Iterable) ImmutableSet.m69330of(n));
    }

    public final Iterable<N> depthFirstPostOrder(N n) {
        return depthFirstPostOrder((Iterable) ImmutableSet.m69330of(n));
    }

    public final Iterable<N> depthFirstPreOrder(N n) {
        return depthFirstPreOrder((Iterable) ImmutableSet.m69330of(n));
    }

    private Traverser(SuccessorsFunction<N> successorsFunction) {
        this.f41044a = (SuccessorsFunction) Preconditions.checkNotNull(successorsFunction);
    }

    public final Iterable<N> breadthFirst(Iterable<? extends N> iterable) {
        final ImmutableSet<N> m68406b = m68406b(iterable);
        return new Iterable<N>() { // from class: com.google.common.graph.Traverser.3
            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return Traverser.this.mo68405a().m68402a(m68406b.iterator());
            }
        };
    }

    public final Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable) {
        final ImmutableSet<N> m68406b = m68406b(iterable);
        return new Iterable<N>() { // from class: com.google.common.graph.Traverser.5
            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return Traverser.this.mo68405a().m68399d(m68406b.iterator());
            }
        };
    }

    public final Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable) {
        final ImmutableSet<N> m68406b = m68406b(iterable);
        return new Iterable<N>() { // from class: com.google.common.graph.Traverser.4
            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return Traverser.this.mo68405a().m68398e(m68406b.iterator());
            }
        };
    }
}
