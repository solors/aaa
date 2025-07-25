package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Queue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class ConsumingQueueIterator<T> extends AbstractIterator<T> {

    /* renamed from: d */
    private final Queue<T> f39891d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConsumingQueueIterator(Queue<T> queue) {
        this.f39891d = (Queue) Preconditions.checkNotNull(queue);
    }

    @Override // com.google.common.collect.AbstractIterator
    public T computeNext() {
        if (this.f39891d.isEmpty()) {
            return m69807a();
        }
        return this.f39891d.remove();
    }
}
