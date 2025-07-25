package org.slf4j.helpers;

/* renamed from: org.slf4j.helpers.a */
/* loaded from: classes10.dex */
public abstract class MarkerIgnoringBase extends NamedLoggerBase {
    @Override // org.slf4j.helpers.NamedLoggerBase, p852qf.InterfaceC39416a
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }
}
