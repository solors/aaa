package com.iabtcf.decoder;

import java.io.InputStream;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class LazySegmentFactory {
    private final String src;
    private SegmentSupplier sup = new SegmentSupplier();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class EmptyInputStream extends SegmentInputStream {
        public static EmptyInputStream INSTANCE = new EmptyInputStream();

        private EmptyInputStream() {
            super("", 0);
        }

        @Override // com.iabtcf.decoder.SegmentInputStream
        protected boolean hasNextSegment() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.iabtcf.decoder.SegmentInputStream
        public int segmentEnd() {
            return -1;
        }
    }

    /* loaded from: classes6.dex */
    class SegmentSupplier implements Supplier<InputStream> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private SegmentInputStream current;
        private final SegmentSupplier prev;

        public SegmentSupplier() {
            this.prev = null;
            this.current = new SegmentInputStream(LazySegmentFactory.this.src, 0);
        }

        private SegmentInputStream getCurrent() {
            if (this.current == null) {
                SegmentInputStream current = this.prev.getCurrent();
                EmptyInputStream emptyInputStream = EmptyInputStream.INSTANCE;
                if (current == emptyInputStream) {
                    this.current = emptyInputStream;
                } else {
                    this.current = new SegmentInputStream(LazySegmentFactory.this.src, current.segmentEnd() + 1);
                }
            }
            return this.current;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.function.Supplier
        public InputStream get() {
            return getCurrent();
        }

        public SegmentSupplier(SegmentSupplier segmentSupplier) {
            this.prev = segmentSupplier;
        }
    }

    public LazySegmentFactory(String str) {
        this.src = str;
    }

    public Supplier<InputStream> next() {
        SegmentSupplier segmentSupplier = this.sup;
        this.sup = new SegmentSupplier(segmentSupplier);
        return segmentSupplier;
    }
}
