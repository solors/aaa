package se;

import kotlin.Metadata;

@Metadata
/* renamed from: se.l1 */
/* loaded from: classes8.dex */
public enum WriteMode {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');
    

    /* renamed from: b */
    public final char f111860b;

    /* renamed from: c */
    public final char f111861c;

    WriteMode(char c, char c2) {
        this.f111860b = c;
        this.f111861c = c2;
    }
}
