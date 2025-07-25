package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import p852qf.C39417b;
import p852qf.InterfaceC39416a;

/* renamed from: org.slf4j.helpers.d */
/* loaded from: classes10.dex */
abstract class NamedLoggerBase implements InterfaceC39416a, Serializable {

    /* renamed from: b */
    protected String f103057b;

    @Override // p852qf.InterfaceC39416a
    public String getName() {
        return this.f103057b;
    }

    protected Object readResolve() throws ObjectStreamException {
        return C39417b.m12739j(getName());
    }
}
