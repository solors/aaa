package p851qe;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: qe.f */
/* loaded from: classes8.dex */
public final class SerialDescriptor {

    /* compiled from: SerialDescriptor.kt */
    @Metadata
    /* renamed from: qe.f$a */
    /* loaded from: classes8.dex */
    public static final class C39402a implements Iterator<kotlinx.serialization.descriptors.SerialDescriptor>, KMarkers {

        /* renamed from: b */
        private int f103616b;

        /* renamed from: c */
        final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor f103617c;

        C39402a(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
            this.f103617c = serialDescriptor;
            this.f103616b = serialDescriptor.mo12262e();
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: a */
        public kotlinx.serialization.descriptors.SerialDescriptor next() {
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = this.f103617c;
            int mo12262e = serialDescriptor.mo12262e();
            int i = this.f103616b;
            this.f103616b = i - 1;
            return serialDescriptor.mo12263d(mo12262e - i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f103616b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: SerialDescriptor.kt */
    @Metadata
    /* renamed from: qe.f$b */
    /* loaded from: classes8.dex */
    public static final class C39403b implements Iterator<String>, KMarkers {

        /* renamed from: b */
        private int f103618b;

        /* renamed from: c */
        final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor f103619c;

        C39403b(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
            this.f103619c = serialDescriptor;
            this.f103618b = serialDescriptor.mo12262e();
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: a */
        public String next() {
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = this.f103619c;
            int mo12262e = serialDescriptor.mo12262e();
            int i = this.f103618b;
            this.f103618b = i - 1;
            return serialDescriptor.mo12261f(mo12262e - i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f103618b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: Iterables.kt */
    @Metadata
    /* renamed from: qe.f$c */
    /* loaded from: classes8.dex */
    public static final class C39404c implements Iterable<kotlinx.serialization.descriptors.SerialDescriptor>, KMarkers {

        /* renamed from: b */
        final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor f103620b;

        public C39404c(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
            this.f103620b = serialDescriptor;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<kotlinx.serialization.descriptors.SerialDescriptor> iterator() {
            return new C39402a(this.f103620b);
        }
    }

    /* compiled from: Iterables.kt */
    @Metadata
    /* renamed from: qe.f$d */
    /* loaded from: classes8.dex */
    public static final class C39405d implements Iterable<String>, KMarkers {

        /* renamed from: b */
        final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor f103621b;

        public C39405d(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
            this.f103621b = serialDescriptor;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<String> iterator() {
            return new C39403b(this.f103621b);
        }
    }

    @NotNull
    /* renamed from: a */
    public static final Iterable<kotlinx.serialization.descriptors.SerialDescriptor> m12758a(@NotNull kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return new C39404c(serialDescriptor);
    }

    @NotNull
    /* renamed from: b */
    public static final Iterable<String> m12757b(@NotNull kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return new C39405d(serialDescriptor);
    }
}
