package de;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC37560s;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: de.a */
/* loaded from: classes7.dex */
public final class ProgressionIterators extends AbstractC37560s {

    /* renamed from: b */
    private final int f89588b;

    /* renamed from: c */
    private final int f89589c;

    /* renamed from: d */
    private boolean f89590d;

    /* renamed from: f */
    private int f89591f;

    public ProgressionIterators(char c, char c2, int i) {
        this.f89588b = i;
        this.f89589c = c2;
        boolean z = true;
        if (i <= 0 ? Intrinsics.m17071j(c, c2) < 0 : Intrinsics.m17071j(c, c2) > 0) {
            z = false;
        }
        this.f89590d = z;
        this.f89591f = z ? c : c2;
    }

    @Override // kotlin.collections.AbstractC37560s
    /* renamed from: a */
    public char mo17267a() {
        int i = this.f89591f;
        if (i == this.f89589c) {
            if (this.f89590d) {
                this.f89590d = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f89591f = this.f89588b + i;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89590d;
    }
}
