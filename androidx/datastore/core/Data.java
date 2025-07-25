package androidx.datastore.core;

import kotlin.Metadata;

/* compiled from: SingleProcessDataStore.kt */
@Metadata
/* loaded from: classes.dex */
final class Data<T> extends State<T> {
    private final int hashCode;
    private final T value;

    public Data(T t, int i) {
        super(null);
        this.value = t;
        this.hashCode = i;
    }

    public final void checkHashCode() {
        int i;
        T t = this.value;
        boolean z = false;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        if (i == this.hashCode) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final T getValue() {
        return this.value;
    }
}
