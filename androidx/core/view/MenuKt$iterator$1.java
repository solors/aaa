package androidx.core.view;

import ae.KMarkers;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Menu.kt */
@Metadata
/* loaded from: classes.dex */
public final class MenuKt$iterator$1 implements Iterator<MenuItem>, KMarkers {
    final /* synthetic */ Menu $this_iterator;
    private int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuKt$iterator$1(Menu menu) {
        this.$this_iterator = menu;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.$this_iterator.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        Unit unit;
        Menu menu = this.$this_iterator;
        int i = this.index - 1;
        this.index = i;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
            menu.removeItem(item.getItemId());
            unit = Unit.f99208a;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public MenuItem next() {
        Menu menu = this.$this_iterator;
        int i = this.index;
        this.index = i + 1;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }
}
